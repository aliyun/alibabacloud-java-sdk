// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class MountLinkedeploycoreDeploycoreAppserviceapplyResponseBody extends TeaModel {
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
    public java.util.List<MountLinkedeploycoreDeploycoreAppserviceapplyResponseBodyData> data;

    public static MountLinkedeploycoreDeploycoreAppserviceapplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MountLinkedeploycoreDeploycoreAppserviceapplyResponseBody self = new MountLinkedeploycoreDeploycoreAppserviceapplyResponseBody();
        return TeaModel.build(map, self);
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MountLinkedeploycoreDeploycoreAppserviceapplyResponseBody setData(java.util.List<MountLinkedeploycoreDeploycoreAppserviceapplyResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MountLinkedeploycoreDeploycoreAppserviceapplyResponseBodyData> getData() {
        return this.data;
    }

    public static class MountLinkedeploycoreDeploycoreAppserviceapplyResponseBodyData extends TeaModel {
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

        public static MountLinkedeploycoreDeploycoreAppserviceapplyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MountLinkedeploycoreDeploycoreAppserviceapplyResponseBodyData self = new MountLinkedeploycoreDeploycoreAppserviceapplyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MountLinkedeploycoreDeploycoreAppserviceapplyResponseBodyData setActionId(Long actionId) {
            this.actionId = actionId;
            return this;
        }
        public Long getActionId() {
            return this.actionId;
        }

        public MountLinkedeploycoreDeploycoreAppserviceapplyResponseBodyData setAppServiceId(Long appServiceId) {
            this.appServiceId = appServiceId;
            return this;
        }
        public Long getAppServiceId() {
            return this.appServiceId;
        }

        public MountLinkedeploycoreDeploycoreAppserviceapplyResponseBodyData setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public MountLinkedeploycoreDeploycoreAppserviceapplyResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public MountLinkedeploycoreDeploycoreAppserviceapplyResponseBodyData setOrderUrl(String orderUrl) {
            this.orderUrl = orderUrl;
            return this;
        }
        public String getOrderUrl() {
            return this.orderUrl;
        }

    }

}
