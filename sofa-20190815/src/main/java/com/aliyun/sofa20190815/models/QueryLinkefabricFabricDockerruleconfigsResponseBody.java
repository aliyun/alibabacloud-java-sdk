// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricDockerruleconfigsResponseBody extends TeaModel {
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
    public QueryLinkefabricFabricDockerruleconfigsResponseBodyData data;

    public static QueryLinkefabricFabricDockerruleconfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricDockerruleconfigsResponseBody self = new QueryLinkefabricFabricDockerruleconfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricDockerruleconfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricDockerruleconfigsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricDockerruleconfigsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricDockerruleconfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricDockerruleconfigsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricDockerruleconfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricDockerruleconfigsResponseBody setData(QueryLinkefabricFabricDockerruleconfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkefabricFabricDockerruleconfigsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricDockerruleconfigsResponseBodyData extends TeaModel {
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

        public static QueryLinkefabricFabricDockerruleconfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricDockerruleconfigsResponseBodyData self = new QueryLinkefabricFabricDockerruleconfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricDockerruleconfigsResponseBodyData setDevStage(String devStage) {
            this.devStage = devStage;
            return this;
        }
        public String getDevStage() {
            return this.devStage;
        }

        public QueryLinkefabricFabricDockerruleconfigsResponseBodyData setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public QueryLinkefabricFabricDockerruleconfigsResponseBodyData setExtraParams(String extraParams) {
            this.extraParams = extraParams;
            return this;
        }
        public String getExtraParams() {
            return this.extraParams;
        }

        public QueryLinkefabricFabricDockerruleconfigsResponseBodyData setConfigs(java.util.List<String> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<String> getConfigs() {
            return this.configs;
        }

        public QueryLinkefabricFabricDockerruleconfigsResponseBodyData setProjectConfigs(java.util.List<String> projectConfigs) {
            this.projectConfigs = projectConfigs;
            return this;
        }
        public java.util.List<String> getProjectConfigs() {
            return this.projectConfigs;
        }

        public QueryLinkefabricFabricDockerruleconfigsResponseBodyData setSameRepoAppList(java.util.List<String> sameRepoAppList) {
            this.sameRepoAppList = sameRepoAppList;
            return this;
        }
        public java.util.List<String> getSameRepoAppList() {
            return this.sameRepoAppList;
        }

    }

}
