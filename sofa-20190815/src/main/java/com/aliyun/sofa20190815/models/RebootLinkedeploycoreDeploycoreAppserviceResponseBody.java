// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RebootLinkedeploycoreDeploycoreAppserviceResponseBody extends TeaModel {
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
    public RebootLinkedeploycoreDeploycoreAppserviceResponseBodyData data;

    public static RebootLinkedeploycoreDeploycoreAppserviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebootLinkedeploycoreDeploycoreAppserviceResponseBody self = new RebootLinkedeploycoreDeploycoreAppserviceResponseBody();
        return TeaModel.build(map, self);
    }

    public RebootLinkedeploycoreDeploycoreAppserviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RebootLinkedeploycoreDeploycoreAppserviceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RebootLinkedeploycoreDeploycoreAppserviceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public RebootLinkedeploycoreDeploycoreAppserviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RebootLinkedeploycoreDeploycoreAppserviceResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public RebootLinkedeploycoreDeploycoreAppserviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RebootLinkedeploycoreDeploycoreAppserviceResponseBody setData(RebootLinkedeploycoreDeploycoreAppserviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RebootLinkedeploycoreDeploycoreAppserviceResponseBodyData getData() {
        return this.data;
    }

    public static class RebootLinkedeploycoreDeploycoreAppserviceResponseBodyData extends TeaModel {
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

        public static RebootLinkedeploycoreDeploycoreAppserviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RebootLinkedeploycoreDeploycoreAppserviceResponseBodyData self = new RebootLinkedeploycoreDeploycoreAppserviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RebootLinkedeploycoreDeploycoreAppserviceResponseBodyData setActionId(Long actionId) {
            this.actionId = actionId;
            return this;
        }
        public Long getActionId() {
            return this.actionId;
        }

        public RebootLinkedeploycoreDeploycoreAppserviceResponseBodyData setAppServiceId(Long appServiceId) {
            this.appServiceId = appServiceId;
            return this;
        }
        public Long getAppServiceId() {
            return this.appServiceId;
        }

        public RebootLinkedeploycoreDeploycoreAppserviceResponseBodyData setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public RebootLinkedeploycoreDeploycoreAppserviceResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public RebootLinkedeploycoreDeploycoreAppserviceResponseBodyData setOrderUrl(String orderUrl) {
            this.orderUrl = orderUrl;
            return this;
        }
        public String getOrderUrl() {
            return this.orderUrl;
        }

    }

}
