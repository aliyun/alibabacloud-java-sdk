// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPEnvironmentMiddlewareTenantResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public QueryODPEnvironmentMiddlewareTenantResponseBodyData data;

    public static QueryODPEnvironmentMiddlewareTenantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryODPEnvironmentMiddlewareTenantResponseBody self = new QueryODPEnvironmentMiddlewareTenantResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryODPEnvironmentMiddlewareTenantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryODPEnvironmentMiddlewareTenantResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryODPEnvironmentMiddlewareTenantResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryODPEnvironmentMiddlewareTenantResponseBody setData(QueryODPEnvironmentMiddlewareTenantResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryODPEnvironmentMiddlewareTenantResponseBodyData getData() {
        return this.data;
    }

    public static class QueryODPEnvironmentMiddlewareTenantResponseBodyData extends TeaModel {
        @NameInMap("Middleware")
        public Boolean middleware;

        @NameInMap("TenantList")
        public java.util.List<String> tenantList;

        public static QueryODPEnvironmentMiddlewareTenantResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryODPEnvironmentMiddlewareTenantResponseBodyData self = new QueryODPEnvironmentMiddlewareTenantResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryODPEnvironmentMiddlewareTenantResponseBodyData setMiddleware(Boolean middleware) {
            this.middleware = middleware;
            return this;
        }
        public Boolean getMiddleware() {
            return this.middleware;
        }

        public QueryODPEnvironmentMiddlewareTenantResponseBodyData setTenantList(java.util.List<String> tenantList) {
            this.tenantList = tenantList;
            return this;
        }
        public java.util.List<String> getTenantList() {
            return this.tenantList;
        }

    }

}
