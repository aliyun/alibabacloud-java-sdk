// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.partnerintl20181227.models;

import com.aliyun.tea.*;

public class QuerySupplierDetailBySupplierUidRequest extends TeaModel {
    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SupplierUids")
    public String supplierUids;

    public static QuerySupplierDetailBySupplierUidRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySupplierDetailBySupplierUidRequest self = new QuerySupplierDetailBySupplierUidRequest();
        return TeaModel.build(map, self);
    }

    public QuerySupplierDetailBySupplierUidRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public QuerySupplierDetailBySupplierUidRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QuerySupplierDetailBySupplierUidRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySupplierDetailBySupplierUidRequest setSupplierUids(String supplierUids) {
        this.supplierUids = supplierUids;
        return this;
    }
    public String getSupplierUids() {
        return this.supplierUids;
    }

}
