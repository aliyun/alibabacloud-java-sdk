// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricConfigenvconfigResponseBody extends TeaModel {
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
    public QueryLinkefabricFabricConfigenvconfigResponseBodyData data;

    public static QueryLinkefabricFabricConfigenvconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricConfigenvconfigResponseBody self = new QueryLinkefabricFabricConfigenvconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricConfigenvconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricConfigenvconfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricConfigenvconfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricConfigenvconfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricConfigenvconfigResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricConfigenvconfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricConfigenvconfigResponseBody setData(QueryLinkefabricFabricConfigenvconfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryLinkefabricFabricConfigenvconfigResponseBodyData getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricConfigenvconfigResponseBodyData extends TeaModel {
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

        public static QueryLinkefabricFabricConfigenvconfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricConfigenvconfigResponseBodyData self = new QueryLinkefabricFabricConfigenvconfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricConfigenvconfigResponseBodyData setDevStage(String devStage) {
            this.devStage = devStage;
            return this;
        }
        public String getDevStage() {
            return this.devStage;
        }

        public QueryLinkefabricFabricConfigenvconfigResponseBodyData setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public QueryLinkefabricFabricConfigenvconfigResponseBodyData setExtraParams(String extraParams) {
            this.extraParams = extraParams;
            return this;
        }
        public String getExtraParams() {
            return this.extraParams;
        }

        public QueryLinkefabricFabricConfigenvconfigResponseBodyData setConfigs(java.util.List<String> configs) {
            this.configs = configs;
            return this;
        }
        public java.util.List<String> getConfigs() {
            return this.configs;
        }

        public QueryLinkefabricFabricConfigenvconfigResponseBodyData setProjectConfigs(java.util.List<String> projectConfigs) {
            this.projectConfigs = projectConfigs;
            return this;
        }
        public java.util.List<String> getProjectConfigs() {
            return this.projectConfigs;
        }

        public QueryLinkefabricFabricConfigenvconfigResponseBodyData setSameRepoAppList(java.util.List<String> sameRepoAppList) {
            this.sameRepoAppList = sameRepoAppList;
            return this;
        }
        public java.util.List<String> getSameRepoAppList() {
            return this.sameRepoAppList;
        }

    }

}
