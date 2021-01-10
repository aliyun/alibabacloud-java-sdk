// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBody extends TeaModel {
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
    public java.util.List<QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBodyData> data;

    public static QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBody self = new QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBody setData(java.util.List<QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBodyData extends TeaModel {
        @NameInMap("AppServiceId")
        public Long appServiceId;

        @NameInMap("Config")
        public String config;

        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("ConfigStatus")
        public String configStatus;

        @NameInMap("ConfigVersion")
        public String configVersion;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("ImageVersion")
        public String imageVersion;

        @NameInMap("Operator")
        public String operator;

        public static QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBodyData self = new QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBodyData setAppServiceId(Long appServiceId) {
            this.appServiceId = appServiceId;
            return this;
        }
        public Long getAppServiceId() {
            return this.appServiceId;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBodyData setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBodyData setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBodyData setConfigStatus(String configStatus) {
            this.configStatus = configStatus;
            return this;
        }
        public String getConfigStatus() {
            return this.configStatus;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBodyData setConfigVersion(String configVersion) {
            this.configVersion = configVersion;
            return this;
        }
        public String getConfigVersion() {
            return this.configVersion;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBodyData setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public QueryLinkedeploycoreDeploycoreAppservicequeryconfigversionappserviceidResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

}
