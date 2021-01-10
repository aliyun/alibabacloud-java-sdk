// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBody extends TeaModel {
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
    public java.util.List<MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBodyData> data;

    public static MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBody self = new MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBody();
        return TeaModel.build(map, self);
    }

    public MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBody setData(java.util.List<MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBodyData> getData() {
        return this.data;
    }

    public static class MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBodyData extends TeaModel {
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

        public static MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBodyData self = new MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBodyData setActionId(Long actionId) {
            this.actionId = actionId;
            return this;
        }
        public Long getActionId() {
            return this.actionId;
        }

        public MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBodyData setAppServiceId(Long appServiceId) {
            this.appServiceId = appServiceId;
            return this;
        }
        public Long getAppServiceId() {
            return this.appServiceId;
        }

        public MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBodyData setConfigId(Long configId) {
            this.configId = configId;
            return this;
        }
        public Long getConfigId() {
            return this.configId;
        }

        public MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public MountLinkedeploycoreDeploycoreAppservicebatchapplyResponseBodyData setOrderUrl(String orderUrl) {
            this.orderUrl = orderUrl;
            return this;
        }
        public String getOrderUrl() {
            return this.orderUrl;
        }

    }

}
