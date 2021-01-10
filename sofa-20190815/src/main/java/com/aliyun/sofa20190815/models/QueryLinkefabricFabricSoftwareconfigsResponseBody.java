// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricSoftwareconfigsResponseBody extends TeaModel {
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
    public QueryLinkefabricFabricSoftwareconfigsResponseBodyData data;

    public static QueryLinkefabricFabricSoftwareconfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricSoftwareconfigsResponseBody self = new QueryLinkefabricFabricSoftwareconfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricSoftwareconfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricSoftwareconfigsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricSoftwareconfigsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricSoftwareconfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricSoftwareconfigsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricSoftwareconfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricSoftwareconfigsResponseBody setData(QueryLinkefabricFabricSoftwareconfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkefabricFabricSoftwareconfigsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricSoftwareconfigsResponseBodyData extends TeaModel {
        @NameInMap("AppConfigMap")
        public String appConfigMap;

        @NameInMap("ReleaseId")
        public String releaseId;

        @NameInMap("AppList")
        public java.util.List<String> appList;

        public static QueryLinkefabricFabricSoftwareconfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricSoftwareconfigsResponseBodyData self = new QueryLinkefabricFabricSoftwareconfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricSoftwareconfigsResponseBodyData setAppConfigMap(String appConfigMap) {
            this.appConfigMap = appConfigMap;
            return this;
        }
        public String getAppConfigMap() {
            return this.appConfigMap;
        }

        public QueryLinkefabricFabricSoftwareconfigsResponseBodyData setReleaseId(String releaseId) {
            this.releaseId = releaseId;
            return this;
        }
        public String getReleaseId() {
            return this.releaseId;
        }

        public QueryLinkefabricFabricSoftwareconfigsResponseBodyData setAppList(java.util.List<String> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<String> getAppList() {
            return this.appList;
        }

    }

}
