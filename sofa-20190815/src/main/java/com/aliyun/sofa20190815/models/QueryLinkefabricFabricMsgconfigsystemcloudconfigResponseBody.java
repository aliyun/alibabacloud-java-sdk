// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBodyData> data;

    public static QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBody self = new QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBody setData(java.util.List<QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBodyData extends TeaModel {
        @NameInMap("CommonConfig")
        public String commonConfig;

        @NameInMap("DevStage")
        public String devStage;

        @NameInMap("Env")
        public String env;

        @NameInMap("EnvDisplayName")
        public String envDisplayName;

        @NameInMap("EnvId")
        public Long envId;

        @NameInMap("Orders")
        public Long orders;

        @NameInMap("SysConfigType")
        public String sysConfigType;

        @NameInMap("TenangId")
        public Long tenangId;

        @NameInMap("UniqueConfig")
        public String uniqueConfig;

        public static QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBodyData self = new QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBodyData setCommonConfig(String commonConfig) {
            this.commonConfig = commonConfig;
            return this;
        }
        public String getCommonConfig() {
            return this.commonConfig;
        }

        public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBodyData setDevStage(String devStage) {
            this.devStage = devStage;
            return this;
        }
        public String getDevStage() {
            return this.devStage;
        }

        public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBodyData setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBodyData setEnvDisplayName(String envDisplayName) {
            this.envDisplayName = envDisplayName;
            return this;
        }
        public String getEnvDisplayName() {
            return this.envDisplayName;
        }

        public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBodyData setEnvId(Long envId) {
            this.envId = envId;
            return this;
        }
        public Long getEnvId() {
            return this.envId;
        }

        public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBodyData setOrders(Long orders) {
            this.orders = orders;
            return this;
        }
        public Long getOrders() {
            return this.orders;
        }

        public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBodyData setSysConfigType(String sysConfigType) {
            this.sysConfigType = sysConfigType;
            return this;
        }
        public String getSysConfigType() {
            return this.sysConfigType;
        }

        public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBodyData setTenangId(Long tenangId) {
            this.tenangId = tenangId;
            return this;
        }
        public Long getTenangId() {
            return this.tenangId;
        }

        public QueryLinkefabricFabricMsgconfigsystemcloudconfigResponseBodyData setUniqueConfig(String uniqueConfig) {
            this.uniqueConfig = uniqueConfig;
            return this;
        }
        public String getUniqueConfig() {
            return this.uniqueConfig;
        }

    }

}
