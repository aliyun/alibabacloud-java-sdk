// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricSwconfigsResponseBody extends TeaModel {
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
    public QueryLinkefabricFabricSwconfigsResponseBodyData data;

    public static QueryLinkefabricFabricSwconfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricSwconfigsResponseBody self = new QueryLinkefabricFabricSwconfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricSwconfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricSwconfigsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricSwconfigsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricSwconfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricSwconfigsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricSwconfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricSwconfigsResponseBody setData(QueryLinkefabricFabricSwconfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkefabricFabricSwconfigsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricSwconfigsResponseBodyData extends TeaModel {
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

        public static QueryLinkefabricFabricSwconfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricSwconfigsResponseBodyData self = new QueryLinkefabricFabricSwconfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricSwconfigsResponseBodyData setDevStage(String devStage) {
            this.devStage = devStage;
            return this;
        }
        public String getDevStage() {
            return this.devStage;
        }

        public QueryLinkefabricFabricSwconfigsResponseBodyData setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public QueryLinkefabricFabricSwconfigsResponseBodyData setExtraParams(String extraParams) {
            this.extraParams = extraParams;
            return this;
        }
        public String getExtraParams() {
            return this.extraParams;
        }

        public QueryLinkefabricFabricSwconfigsResponseBodyData setConfigs(java.util.List<String> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<String> getConfigs() {
            return this.configs;
        }

        public QueryLinkefabricFabricSwconfigsResponseBodyData setProjectConfigs(java.util.List<String> projectConfigs) {
            this.projectConfigs = projectConfigs;
            return this;
        }
        public java.util.List<String> getProjectConfigs() {
            return this.projectConfigs;
        }

        public QueryLinkefabricFabricSwconfigsResponseBodyData setSameRepoAppList(java.util.List<String> sameRepoAppList) {
            this.sameRepoAppList = sameRepoAppList;
            return this;
        }
        public java.util.List<String> getSameRepoAppList() {
            return this.sameRepoAppList;
        }

    }

}
