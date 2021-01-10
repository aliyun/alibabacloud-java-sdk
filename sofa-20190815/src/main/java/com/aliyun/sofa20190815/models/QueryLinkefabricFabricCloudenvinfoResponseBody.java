// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricCloudenvinfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public QueryLinkefabricFabricCloudenvinfoResponseBodyData data;

    public static QueryLinkefabricFabricCloudenvinfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricCloudenvinfoResponseBody self = new QueryLinkefabricFabricCloudenvinfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricCloudenvinfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricCloudenvinfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricCloudenvinfoResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricCloudenvinfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricCloudenvinfoResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricCloudenvinfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricCloudenvinfoResponseBody setData(QueryLinkefabricFabricCloudenvinfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkefabricFabricCloudenvinfoResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricCloudenvinfoResponseBodyData extends TeaModel {
        @NameInMap("Ldc")
        public Boolean ldc;

        @NameInMap("ShareOpenAPI")
        public Boolean shareOpenAPI;

        public static QueryLinkefabricFabricCloudenvinfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricCloudenvinfoResponseBodyData self = new QueryLinkefabricFabricCloudenvinfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricCloudenvinfoResponseBodyData setLdc(Boolean ldc) {
            this.ldc = ldc;
            return this;
        }
        public Boolean getLdc() {
            return this.ldc;
        }

        public QueryLinkefabricFabricCloudenvinfoResponseBodyData setShareOpenAPI(Boolean shareOpenAPI) {
            this.shareOpenAPI = shareOpenAPI;
            return this;
        }
        public Boolean getShareOpenAPI() {
            return this.shareOpenAPI;
        }

    }

}
