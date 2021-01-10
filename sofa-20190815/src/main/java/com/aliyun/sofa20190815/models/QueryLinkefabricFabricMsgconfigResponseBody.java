// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricMsgconfigResponseBody extends TeaModel {
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
    public QueryLinkefabricFabricMsgconfigResponseBodyData data;

    public static QueryLinkefabricFabricMsgconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricMsgconfigResponseBody self = new QueryLinkefabricFabricMsgconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricMsgconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricMsgconfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricMsgconfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricMsgconfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricMsgconfigResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricMsgconfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricMsgconfigResponseBody setData(QueryLinkefabricFabricMsgconfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkefabricFabricMsgconfigResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricMsgconfigResponseBodyData extends TeaModel {
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

        public static QueryLinkefabricFabricMsgconfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricMsgconfigResponseBodyData self = new QueryLinkefabricFabricMsgconfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricMsgconfigResponseBodyData setDevStage(String devStage) {
            this.devStage = devStage;
            return this;
        }
        public String getDevStage() {
            return this.devStage;
        }

        public QueryLinkefabricFabricMsgconfigResponseBodyData setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public QueryLinkefabricFabricMsgconfigResponseBodyData setExtraParams(String extraParams) {
            this.extraParams = extraParams;
            return this;
        }
        public String getExtraParams() {
            return this.extraParams;
        }

        public QueryLinkefabricFabricMsgconfigResponseBodyData setConfigs(java.util.List<String> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<String> getConfigs() {
            return this.configs;
        }

        public QueryLinkefabricFabricMsgconfigResponseBodyData setProjectConfigs(java.util.List<String> projectConfigs) {
            this.projectConfigs = projectConfigs;
            return this;
        }
        public java.util.List<String> getProjectConfigs() {
            return this.projectConfigs;
        }

        public QueryLinkefabricFabricMsgconfigResponseBodyData setSameRepoAppList(java.util.List<String> sameRepoAppList) {
            this.sameRepoAppList = sameRepoAppList;
            return this;
        }
        public java.util.List<String> getSameRepoAppList() {
            return this.sameRepoAppList;
        }

    }

}
