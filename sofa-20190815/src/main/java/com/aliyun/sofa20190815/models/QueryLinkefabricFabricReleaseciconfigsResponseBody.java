// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricReleaseciconfigsResponseBody extends TeaModel {
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
    public QueryLinkefabricFabricReleaseciconfigsResponseBodyData data;

    public static QueryLinkefabricFabricReleaseciconfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricReleaseciconfigsResponseBody self = new QueryLinkefabricFabricReleaseciconfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricReleaseciconfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricReleaseciconfigsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricReleaseciconfigsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricReleaseciconfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricReleaseciconfigsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricReleaseciconfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricReleaseciconfigsResponseBody setData(QueryLinkefabricFabricReleaseciconfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkefabricFabricReleaseciconfigsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricReleaseciconfigsResponseBodyData extends TeaModel {
        @NameInMap("AppConfigMap")
        public String appConfigMap;

        @NameInMap("ReleaseId")
        public String releaseId;

        @NameInMap("AppList")
        public java.util.List<String> appList;

        public static QueryLinkefabricFabricReleaseciconfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricReleaseciconfigsResponseBodyData self = new QueryLinkefabricFabricReleaseciconfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricReleaseciconfigsResponseBodyData setAppConfigMap(String appConfigMap) {
            this.appConfigMap = appConfigMap;
            return this;
        }
        public String getAppConfigMap() {
            return this.appConfigMap;
        }

        public QueryLinkefabricFabricReleaseciconfigsResponseBodyData setReleaseId(String releaseId) {
            this.releaseId = releaseId;
            return this;
        }
        public String getReleaseId() {
            return this.releaseId;
        }

        public QueryLinkefabricFabricReleaseciconfigsResponseBodyData setAppList(java.util.List<String> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<String> getAppList() {
            return this.appList;
        }

    }

}
