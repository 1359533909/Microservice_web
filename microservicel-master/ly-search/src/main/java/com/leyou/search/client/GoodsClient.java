package com.leyou.search.client;

import com.leyou.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author moxiaolin
 * @date 2018/9/22
 */
@FeignClient(value = "item-service")
public interface GoodsClient extends GoodsApi {
}
