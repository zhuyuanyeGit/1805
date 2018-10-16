package cn.tedu.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="provider-user")//跟提供者联系起来
public interface EuerkaServiceFegin {
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name);

}
