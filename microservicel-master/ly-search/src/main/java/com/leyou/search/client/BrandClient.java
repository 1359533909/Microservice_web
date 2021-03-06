package com.leyou.search.client;

import com.leyou.item.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author moxiaolin
 * @date 2018/9/22
 */
@FeignClient("item-service")
public interface BrandClient extends BrandApi {
}
