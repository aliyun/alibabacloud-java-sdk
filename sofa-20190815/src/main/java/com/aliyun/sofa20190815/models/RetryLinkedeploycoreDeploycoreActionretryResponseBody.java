// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryLinkedeploycoreDeploycoreActionretryResponseBody extends TeaModel {
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
    public RetryLinkedeploycoreDeploycoreActionretryResponseBodyData data;

    public static RetryLinkedeploycoreDeploycoreActionretryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryLinkedeploycoreDeploycoreActionretryResponseBody self = new RetryLinkedeploycoreDeploycoreActionretryResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryLinkedeploycoreDeploycoreActionretryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetryLinkedeploycoreDeploycoreActionretryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RetryLinkedeploycoreDeploycoreActionretryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public RetryLinkedeploycoreDeploycoreActionretryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RetryLinkedeploycoreDeploycoreActionretryResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public RetryLinkedeploycoreDeploycoreActionretryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RetryLinkedeploycoreDeploycoreActionretryResponseBody setData(RetryLinkedeploycoreDeploycoreActionretryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RetryLinkedeploycoreDeploycoreActionretryResponseBodyData getData() {
        return this.data;
    }

    public static class RetryLinkedeploycoreDeploycoreActionretryResponseBodyData extends TeaModel {
        @NameInMap("ActionId")
        public Long actionId;

        @NameInMap("AppServiceId")
        public Long appServiceId;

        @NameInMap("Message")
        public String message;

        @NameInMap("OrderId")
        public Long orderId;

        @NameInMap("OrderUrl")
        public String orderUrl;

        @NameInMap("Success")
        public Boolean success;

        public static RetryLinkedeploycoreDeploycoreActionretryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RetryLinkedeploycoreDeploycoreActionretryResponseBodyData self = new RetryLinkedeploycoreDeploycoreActionretryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RetryLinkedeploycoreDeploycoreActionretryResponseBodyData setActionId(Long actionId) {
            this.actionId = actionId;
            return this;
        }
        public Long getActionId() {
            return this.actionId;
        }

        public RetryLinkedeploycoreDeploycoreActionretryResponseBodyData setAppServiceId(Long appServiceId) {
            this.appServiceId = appServiceId;
            return this;
        }
        public Long getAppServiceId() {
            return this.appServiceId;
        }

        public RetryLinkedeploycoreDeploycoreActionretryResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RetryLinkedeploycoreDeploycoreActionretryResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public RetryLinkedeploycoreDeploycoreActionretryResponseBodyData setOrderUrl(String orderUrl) {
            this.orderUrl = orderUrl;
            return this;
        }
        public String getOrderUrl() {
            return this.orderUrl;
        }

        public RetryLinkedeploycoreDeploycoreActionretryResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
