// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricCibranchconfigsResponseBody extends TeaModel {
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
    public QueryLinkefabricFabricCibranchconfigsResponseBodyData data;

    public static QueryLinkefabricFabricCibranchconfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricCibranchconfigsResponseBody self = new QueryLinkefabricFabricCibranchconfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricCibranchconfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricCibranchconfigsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricCibranchconfigsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricCibranchconfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricCibranchconfigsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricCibranchconfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricCibranchconfigsResponseBody setData(QueryLinkefabricFabricCibranchconfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkefabricFabricCibranchconfigsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricCibranchconfigsResponseBodyData extends TeaModel {
        @NameInMap("DevStage")
        public String devStage;

        @NameInMap("Env")
        public String env;

        @NameInMap("ExtraParams")
        public String extraParams;

        @NameInMap("Configs")
        public java.util.List<String> configs;

        @NameInMap("ProjectConfigs")
        public java.util.List<String> projectConfigs;

        @NameInMap("SameRepoAppList")
        public java.util.List<String> sameRepoAppList;

        public static QueryLinkefabricFabricCibranchconfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricCibranchconfigsResponseBodyData self = new QueryLinkefabricFabricCibranchconfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricCibranchconfigsResponseBodyData setDevStage(String devStage) {
            this.devStage = devStage;
            return this;
        }
        public String getDevStage() {
            return this.devStage;
        }

        public QueryLinkefabricFabricCibranchconfigsResponseBodyData setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public QueryLinkefabricFabricCibranchconfigsResponseBodyData setExtraParams(String extraParams) {
            this.extraParams = extraParams;
            return this;
        }
        public String getExtraParams() {
            return this.extraParams;
        }

        public QueryLinkefabricFabricCibranchconfigsResponseBodyData setConfigs(java.util.List<String> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<String> getConfigs() {
            return this.configs;
        }

        public QueryLinkefabricFabricCibranchconfigsResponseBodyData setProjectConfigs(java.util.List<String> projectConfigs) {
            this.projectConfigs = projectConfigs;
            return this;
        }
        public java.util.List<String> getProjectConfigs() {
            return this.projectConfigs;
        }

        public QueryLinkefabricFabricCibranchconfigsResponseBodyData setSameRepoAppList(java.util.List<String> sameRepoAppList) {
            this.sameRepoAppList = sameRepoAppList;
            return this;
        }
        public java.util.List<String> getSameRepoAppList() {
            return this.sameRepoAppList;
        }

    }

}
