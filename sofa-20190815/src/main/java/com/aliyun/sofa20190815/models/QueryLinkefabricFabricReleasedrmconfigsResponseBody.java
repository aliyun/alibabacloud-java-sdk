// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricReleasedrmconfigsResponseBody extends TeaModel {
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
    public QueryLinkefabricFabricReleasedrmconfigsResponseBodyData data;

    public static QueryLinkefabricFabricReleasedrmconfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricReleasedrmconfigsResponseBody self = new QueryLinkefabricFabricReleasedrmconfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricReleasedrmconfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricReleasedrmconfigsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricReleasedrmconfigsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricReleasedrmconfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricReleasedrmconfigsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricReleasedrmconfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricReleasedrmconfigsResponseBody setData(QueryLinkefabricFabricReleasedrmconfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkefabricFabricReleasedrmconfigsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricReleasedrmconfigsResponseBodyData extends TeaModel {
        @NameInMap("AppConfigMap")
        public String appConfigMap;

        @NameInMap("ReleaseId")
        public String releaseId;

        @NameInMap("AppList")
        public java.util.List<String> appList;

        public static QueryLinkefabricFabricReleasedrmconfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricReleasedrmconfigsResponseBodyData self = new QueryLinkefabricFabricReleasedrmconfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricReleasedrmconfigsResponseBodyData setAppConfigMap(String appConfigMap) {
            this.appConfigMap = appConfigMap;
            return this;
        }
        public String getAppConfigMap() {
            return this.appConfigMap;
        }

        public QueryLinkefabricFabricReleasedrmconfigsResponseBodyData setReleaseId(String releaseId) {
            this.releaseId = releaseId;
            return this;
        }
        public String getReleaseId() {
            return this.releaseId;
        }

        public QueryLinkefabricFabricReleasedrmconfigsResponseBodyData setAppList(java.util.List<String> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<String> getAppList() {
            return this.appList;
        }

    }

}
