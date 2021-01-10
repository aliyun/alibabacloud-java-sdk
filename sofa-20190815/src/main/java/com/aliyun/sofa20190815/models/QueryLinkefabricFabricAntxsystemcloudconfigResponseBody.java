// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricAntxsystemcloudconfigResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkefabricFabricAntxsystemcloudconfigResponseBodyData> data;

    public static QueryLinkefabricFabricAntxsystemcloudconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricAntxsystemcloudconfigResponseBody self = new QueryLinkefabricFabricAntxsystemcloudconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricAntxsystemcloudconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkefabricFabricAntxsystemcloudconfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkefabricFabricAntxsystemcloudconfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkefabricFabricAntxsystemcloudconfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkefabricFabricAntxsystemcloudconfigResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkefabricFabricAntxsystemcloudconfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkefabricFabricAntxsystemcloudconfigResponseBody setData(java.util.List<QueryLinkefabricFabricAntxsystemcloudconfigResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkefabricFabricAntxsystemcloudconfigResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkefabricFabricAntxsystemcloudconfigResponseBodyData extends TeaModel {
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

        public static QueryLinkefabricFabricAntxsystemcloudconfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkefabricFabricAntxsystemcloudconfigResponseBodyData self = new QueryLinkefabricFabricAntxsystemcloudconfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkefabricFabricAntxsystemcloudconfigResponseBodyData setCommonConfig(String commonConfig) {
            this.commonConfig = commonConfig;
            return this;
        }
        public String getCommonConfig() {
            return this.commonConfig;
        }

        public QueryLinkefabricFabricAntxsystemcloudconfigResponseBodyData setDevStage(String devStage) {
            this.devStage = devStage;
            return this;
        }
        public String getDevStage() {
            return this.devStage;
        }

        public QueryLinkefabricFabricAntxsystemcloudconfigResponseBodyData setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public QueryLinkefabricFabricAntxsystemcloudconfigResponseBodyData setEnvDisplayName(String envDisplayName) {
            this.envDisplayName = envDisplayName;
            return this;
        }
        public String getEnvDisplayName() {
            return this.envDisplayName;
        }

        public QueryLinkefabricFabricAntxsystemcloudconfigResponseBodyData setEnvId(Long envId) {
            this.envId = envId;
            return this;
        }
        public Long getEnvId() {
            return this.envId;
        }

        public QueryLinkefabricFabricAntxsystemcloudconfigResponseBodyData setOrders(Long orders) {
            this.orders = orders;
            return this;
        }
        public Long getOrders() {
            return this.orders;
        }

        public QueryLinkefabricFabricAntxsystemcloudconfigResponseBodyData setSysConfigType(String sysConfigType) {
            this.sysConfigType = sysConfigType;
            return this;
        }
        public String getSysConfigType() {
            return this.sysConfigType;
        }

        public QueryLinkefabricFabricAntxsystemcloudconfigResponseBodyData setTenangId(Long tenangId) {
            this.tenangId = tenangId;
            return this;
        }
        public Long getTenangId() {
            return this.tenangId;
        }

        public QueryLinkefabricFabricAntxsystemcloudconfigResponseBodyData setUniqueConfig(String uniqueConfig) {
            this.uniqueConfig = uniqueConfig;
            return this;
        }
        public String getUniqueConfig() {
            return this.uniqueConfig;
        }

    }

}
