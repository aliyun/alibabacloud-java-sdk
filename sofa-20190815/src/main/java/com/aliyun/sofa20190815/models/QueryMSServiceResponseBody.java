// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryMSServiceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("Services")
    public java.util.List<QueryMSServiceResponseBodyServices> services;

    public static QueryMSServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMSServiceResponseBody self = new QueryMSServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMSServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMSServiceResponseBody setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryMSServiceResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryMSServiceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryMSServiceResponseBody setServices(java.util.List<QueryMSServiceResponseBodyServices> services) {
        this.services = services;
        return this;
    }
    public java.util.List<QueryMSServiceResponseBodyServices> getServices() {
        return this.services;
    }

    public static class QueryMSServiceResponseBodyServices extends TeaModel {
        @NameInMap("DataId")
        public String dataId;

        public static QueryMSServiceResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            QueryMSServiceResponseBodyServices self = new QueryMSServiceResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public QueryMSServiceResponseBodyServices setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

    }

}
