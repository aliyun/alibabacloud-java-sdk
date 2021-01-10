// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricSchedulerconfigsResponseBody extends TeaModel {
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
    public QueryLinkefabricFabricSchedulerconfigsResponseBodyData data;

    public static QueryLinkefabricFabricSchedulerconfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricSchedulerconfigsResponseBody self = new QueryLinkefabricFabricSchedulerconfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricSchedulerconfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricSchedulerconfigsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricSchedulerconfigsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricSchedulerconfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricSchedulerconfigsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricSchedulerconfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricSchedulerconfigsResponseBody setData(QueryLinkefabricFabricSchedulerconfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkefabricFabricSchedulerconfigsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricSchedulerconfigsResponseBodyData extends TeaModel {
        @NameInMap("AppConfigMap")
        public String appConfigMap;

        @NameInMap("ReleaseId")
        public String releaseId;

        @NameInMap("AppList")
        public java.util.List<String> appList;

        public static QueryLinkefabricFabricSchedulerconfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricSchedulerconfigsResponseBodyData self = new QueryLinkefabricFabricSchedulerconfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricSchedulerconfigsResponseBodyData setAppConfigMap(String appConfigMap) {
            this.appConfigMap = appConfigMap;
            return this;
        }
        public String getAppConfigMap() {
            return this.appConfigMap;
        }

        public QueryLinkefabricFabricSchedulerconfigsResponseBodyData setReleaseId(String releaseId) {
            this.releaseId = releaseId;
            return this;
        }
        public String getReleaseId() {
            return this.releaseId;
        }

        public QueryLinkefabricFabricSchedulerconfigsResponseBodyData setAppList(java.util.List<String> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<String> getAppList() {
            return this.appList;
        }

    }

}
