// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai20240521.models;

import com.aliyun.tea.*;

public class ListDataCacheServicesResponseBody extends TeaModel {
    @NameInMap("CacheServices")
    public java.util.List<CacheService> cacheServices;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDataCacheServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataCacheServicesResponseBody self = new ListDataCacheServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataCacheServicesResponseBody setCacheServices(java.util.List<CacheService> cacheServices) {
        this.cacheServices = cacheServices;
        return this;
    }
    public java.util.List<CacheService> getCacheServices() {
        return this.cacheServices;
    }

    public ListDataCacheServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataCacheServicesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
