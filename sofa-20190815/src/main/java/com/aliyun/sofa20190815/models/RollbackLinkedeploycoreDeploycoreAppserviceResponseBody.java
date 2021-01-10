// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RollbackLinkedeploycoreDeploycoreAppserviceResponseBody extends TeaModel {
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
    public RollbackLinkedeploycoreDeploycoreAppserviceResponseBodyData data;

    public static RollbackLinkedeploycoreDeploycoreAppserviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RollbackLinkedeploycoreDeploycoreAppserviceResponseBody self = new RollbackLinkedeploycoreDeploycoreAppserviceResponseBody();
        return TeaModel.build(map, self);
    }

    public RollbackLinkedeploycoreDeploycoreAppserviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RollbackLinkedeploycoreDeploycoreAppserviceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RollbackLinkedeploycoreDeploycoreAppserviceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public RollbackLinkedeploycoreDeploycoreAppserviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RollbackLinkedeploycoreDeploycoreAppserviceResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public RollbackLinkedeploycoreDeploycoreAppserviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RollbackLinkedeploycoreDeploycoreAppserviceResponseBody setData(RollbackLinkedeploycoreDeploycoreAppserviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RollbackLinkedeploycoreDeploycoreAppserviceResponseBodyData getData() {
        return this.data;
    }

    public static class RollbackLinkedeploycoreDeploycoreAppserviceResponseBodyData extends TeaModel {
        @NameInMap("ActionId")
        public Long actionId;

        @NameInMap("AppServiceId")
        public Long appServiceId;

        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("OrderUrl")
        public String orderUrl;

        public static RollbackLinkedeploycoreDeploycoreAppserviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RollbackLinkedeploycoreDeploycoreAppserviceResponseBodyData self = new RollbackLinkedeploycoreDeploycoreAppserviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RollbackLinkedeploycoreDeploycoreAppserviceResponseBodyData setActionId(Long actionId) {
            this.actionId = actionId;
            return this;
        }
        public Long getActionId() {
            return this.actionId;
        }

        public RollbackLinkedeploycoreDeploycoreAppserviceResponseBodyData setAppServiceId(Long appServiceId) {
            this.appServiceId = appServiceId;
            return this;
        }
        public Long getAppServiceId() {
            return this.appServiceId;
        }

        public RollbackLinkedeploycoreDeploycoreAppserviceResponseBodyData setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public RollbackLinkedeploycoreDeploycoreAppserviceResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public RollbackLinkedeploycoreDeploycoreAppserviceResponseBodyData setOrderUrl(String orderUrl) {
            this.orderUrl = orderUrl;
            return this;
        }
        public String getOrderUrl() {
            return this.orderUrl;
        }

    }

}
