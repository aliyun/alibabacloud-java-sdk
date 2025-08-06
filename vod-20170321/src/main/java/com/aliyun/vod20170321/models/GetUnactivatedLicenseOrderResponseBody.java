// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetUnactivatedLicenseOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetUnactivatedLicenseOrderResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetUnactivatedLicenseOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUnactivatedLicenseOrderResponseBody self = new GetUnactivatedLicenseOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUnactivatedLicenseOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUnactivatedLicenseOrderResponseBody setData(java.util.List<GetUnactivatedLicenseOrderResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetUnactivatedLicenseOrderResponseBodyData> getData() {
        return this.data;
    }

    public GetUnactivatedLicenseOrderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUnactivatedLicenseOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUnactivatedLicenseOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUnactivatedLicenseOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetUnactivatedLicenseOrderResponseBodyDataLicenseConfigs extends TeaModel {
        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("FeatureIds")
        public String featureIds;

        @NameInMap("IsTrial")
        public Boolean isTrial;

        @NameInMap("SdkId")
        public String sdkId;

        @NameInMap("SdkName")
        public String sdkName;

        @NameInMap("Subscription")
        public String subscription;

        @NameInMap("SubscriptionImp")
        public String subscriptionImp;

        @NameInMap("SubscriptionPkg")
        public String subscriptionPkg;

        public static GetUnactivatedLicenseOrderResponseBodyDataLicenseConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetUnactivatedLicenseOrderResponseBodyDataLicenseConfigs self = new GetUnactivatedLicenseOrderResponseBodyDataLicenseConfigs();
            return TeaModel.build(map, self);
        }

        public GetUnactivatedLicenseOrderResponseBodyDataLicenseConfigs setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public GetUnactivatedLicenseOrderResponseBodyDataLicenseConfigs setFeatureIds(String featureIds) {
            this.featureIds = featureIds;
            return this;
        }
        public String getFeatureIds() {
            return this.featureIds;
        }

        public GetUnactivatedLicenseOrderResponseBodyDataLicenseConfigs setIsTrial(Boolean isTrial) {
            this.isTrial = isTrial;
            return this;
        }
        public Boolean getIsTrial() {
            return this.isTrial;
        }

        public GetUnactivatedLicenseOrderResponseBodyDataLicenseConfigs setSdkId(String sdkId) {
            this.sdkId = sdkId;
            return this;
        }
        public String getSdkId() {
            return this.sdkId;
        }

        public GetUnactivatedLicenseOrderResponseBodyDataLicenseConfigs setSdkName(String sdkName) {
            this.sdkName = sdkName;
            return this;
        }
        public String getSdkName() {
            return this.sdkName;
        }

        public GetUnactivatedLicenseOrderResponseBodyDataLicenseConfigs setSubscription(String subscription) {
            this.subscription = subscription;
            return this;
        }
        public String getSubscription() {
            return this.subscription;
        }

        public GetUnactivatedLicenseOrderResponseBodyDataLicenseConfigs setSubscriptionImp(String subscriptionImp) {
            this.subscriptionImp = subscriptionImp;
            return this;
        }
        public String getSubscriptionImp() {
            return this.subscriptionImp;
        }

        public GetUnactivatedLicenseOrderResponseBodyDataLicenseConfigs setSubscriptionPkg(String subscriptionPkg) {
            this.subscriptionPkg = subscriptionPkg;
            return this;
        }
        public String getSubscriptionPkg() {
            return this.subscriptionPkg;
        }

    }

    public static class GetUnactivatedLicenseOrderResponseBodyData extends TeaModel {
        @NameInMap("BeginOn")
        public String beginOn;

        @NameInMap("ContractNo")
        public String contractNo;

        @NameInMap("ExpiredOn")
        public String expiredOn;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LicenseConfigs")
        public java.util.List<GetUnactivatedLicenseOrderResponseBodyDataLicenseConfigs> licenseConfigs;

        @NameInMap("OrderType")
        public String orderType;

        public static GetUnactivatedLicenseOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUnactivatedLicenseOrderResponseBodyData self = new GetUnactivatedLicenseOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUnactivatedLicenseOrderResponseBodyData setBeginOn(String beginOn) {
            this.beginOn = beginOn;
            return this;
        }
        public String getBeginOn() {
            return this.beginOn;
        }

        public GetUnactivatedLicenseOrderResponseBodyData setContractNo(String contractNo) {
            this.contractNo = contractNo;
            return this;
        }
        public String getContractNo() {
            return this.contractNo;
        }

        public GetUnactivatedLicenseOrderResponseBodyData setExpiredOn(String expiredOn) {
            this.expiredOn = expiredOn;
            return this;
        }
        public String getExpiredOn() {
            return this.expiredOn;
        }

        public GetUnactivatedLicenseOrderResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetUnactivatedLicenseOrderResponseBodyData setLicenseConfigs(java.util.List<GetUnactivatedLicenseOrderResponseBodyDataLicenseConfigs> licenseConfigs) {
            this.licenseConfigs = licenseConfigs;
            return this;
        }
        public java.util.List<GetUnactivatedLicenseOrderResponseBodyDataLicenseConfigs> getLicenseConfigs() {
            return this.licenseConfigs;
        }

        public GetUnactivatedLicenseOrderResponseBodyData setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

    }

}
