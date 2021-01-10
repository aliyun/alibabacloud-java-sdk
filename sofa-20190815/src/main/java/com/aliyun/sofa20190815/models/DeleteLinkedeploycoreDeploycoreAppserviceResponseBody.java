// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkedeploycoreDeploycoreAppserviceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public DeleteLinkedeploycoreDeploycoreAppserviceResponseBodyData data;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DeleteLinkedeploycoreDeploycoreAppserviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkedeploycoreDeploycoreAppserviceResponseBody self = new DeleteLinkedeploycoreDeploycoreAppserviceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLinkedeploycoreDeploycoreAppserviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLinkedeploycoreDeploycoreAppserviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteLinkedeploycoreDeploycoreAppserviceResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public DeleteLinkedeploycoreDeploycoreAppserviceResponseBody setData(DeleteLinkedeploycoreDeploycoreAppserviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteLinkedeploycoreDeploycoreAppserviceResponseBodyData getData() {
        return this.data;
    }

    public DeleteLinkedeploycoreDeploycoreAppserviceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DeleteLinkedeploycoreDeploycoreAppserviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteLinkedeploycoreDeploycoreAppserviceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class DeleteLinkedeploycoreDeploycoreAppserviceResponseBodyData extends TeaModel {
        @NameInMap("ConfigId")
        public Long configId;

        @NameInMap("AppServiceId")
        public Long appServiceId;

        @NameInMap("ActionId")
        public Long actionId;

        @NameInMap("OrderUrl")
        public String orderUrl;

        @NameInMap("OrderId")
        public Long orderId;

        public static DeleteLinkedeploycoreDeploycoreAppserviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteLinkedeploycoreDeploycoreAppserviceResponseBodyData self = new DeleteLinkedeploycoreDeploycoreAppserviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteLinkedeploycoreDeploycoreAppserviceResponseBodyData setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public DeleteLinkedeploycoreDeploycoreAppserviceResponseBodyData setAppServiceId(Long appServiceId) {
            this.appServiceId = appServiceId;
            return this;
        }
        public Long getAppServiceId() {
            return this.appServiceId;
        }

        public DeleteLinkedeploycoreDeploycoreAppserviceResponseBodyData setActionId(Long actionId) {
            this.actionId = actionId;
            return this;
        }
        public Long getActionId() {
            return this.actionId;
        }

        public DeleteLinkedeploycoreDeploycoreAppserviceResponseBodyData setOrderUrl(String orderUrl) {
            this.orderUrl = orderUrl;
            return this;
        }
        public String getOrderUrl() {
            return this.orderUrl;
        }

        public DeleteLinkedeploycoreDeploycoreAppserviceResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
