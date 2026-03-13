// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai20240521.models;

import com.aliyun.tea.*;

public class ListDataCacheServicesRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("QuotaId")
    public String quotaId;

    public static ListDataCacheServicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataCacheServicesRequest self = new ListDataCacheServicesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataCacheServicesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDataCacheServicesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDataCacheServicesRequest setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

}
