// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.partnerintl20181227.models;

import com.aliyun.tea.*;

public class QueryCommodityByServiceIdRequest extends TeaModel {
    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceIds")
    public String serviceIds;

    public static QueryCommodityByServiceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCommodityByServiceIdRequest self = new QueryCommodityByServiceIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryCommodityByServiceIdRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public QueryCommodityByServiceIdRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryCommodityByServiceIdRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCommodityByServiceIdRequest setServiceIds(String serviceIds) {
        this.serviceIds = serviceIds;
        return this;
    }
    public String getServiceIds() {
        return this.serviceIds;
    }

}
