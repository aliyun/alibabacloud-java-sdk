// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.partnerintl20181227.models;

import com.aliyun.tea.*;

public class QueryCommodityBySupplierUidRequest extends TeaModel {
    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SupplierUid")
    public String supplierUid;

    public static QueryCommodityBySupplierUidRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCommodityBySupplierUidRequest self = new QueryCommodityBySupplierUidRequest();
        return TeaModel.build(map, self);
    }

    public QueryCommodityBySupplierUidRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public QueryCommodityBySupplierUidRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryCommodityBySupplierUidRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCommodityBySupplierUidRequest setSupplierUid(String supplierUid) {
        this.supplierUid = supplierUid;
        return this;
    }
    public String getSupplierUid() {
        return this.supplierUid;
    }

}
