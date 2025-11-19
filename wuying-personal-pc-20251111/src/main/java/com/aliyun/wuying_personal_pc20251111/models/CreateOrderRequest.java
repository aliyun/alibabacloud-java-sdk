// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class CreateOrderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DynamicProductParams")
    public java.util.List<CreateOrderRequestDynamicProductParams> dynamicProductParams;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("OrderFrom")
    public String orderFrom;

    @NameInMap("SessionId")
    public String sessionId;

    public static CreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderRequest self = new CreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateOrderRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateOrderRequest setDynamicProductParams(java.util.List<CreateOrderRequestDynamicProductParams> dynamicProductParams) {
        this.dynamicProductParams = dynamicProductParams;
        return this;
    }
    public java.util.List<CreateOrderRequestDynamicProductParams> getDynamicProductParams() {
        return this.dynamicProductParams;
    }

    public CreateOrderRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public CreateOrderRequest setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
        return this;
    }
    public String getOrderFrom() {
        return this.orderFrom;
    }

    public CreateOrderRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public static class CreateOrderRequestDynamicProductParamsInputActivateConfig extends TeaModel {
        @NameInMap("CityName")
        public String cityName;

        @NameInMap("DesktopName")
        public String desktopName;

        @NameInMap("ImageId")
        public String imageId;

        public static CreateOrderRequestDynamicProductParamsInputActivateConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderRequestDynamicProductParamsInputActivateConfig self = new CreateOrderRequestDynamicProductParamsInputActivateConfig();
            return TeaModel.build(map, self);
        }

        public CreateOrderRequestDynamicProductParamsInputActivateConfig setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public CreateOrderRequestDynamicProductParamsInputActivateConfig setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public CreateOrderRequestDynamicProductParamsInputActivateConfig setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

    }

    public static class CreateOrderRequestDynamicProductParams extends TeaModel {
        @NameInMap("Amount")
        public Integer amount;

        @NameInMap("DeliveryAddress")
        public String deliveryAddress;

        @NameInMap("DynamicAttributes")
        public java.util.Map<String, String> dynamicAttributes;

        @NameInMap("InputActivateConfig")
        public CreateOrderRequestDynamicProductParamsInputActivateConfig inputActivateConfig;

        @NameInMap("InstanceIdList")
        public java.util.List<String> instanceIdList;

        @NameInMap("LinkedResourceId")
        public String linkedResourceId;

        @NameInMap("PackageCode")
        public String packageCode;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductSkuCode")
        public String productSkuCode;

        @NameInMap("ResourceId")
        public String resourceId;

        public static CreateOrderRequestDynamicProductParams build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderRequestDynamicProductParams self = new CreateOrderRequestDynamicProductParams();
            return TeaModel.build(map, self);
        }

        public CreateOrderRequestDynamicProductParams setAmount(Integer amount) {
            this.amount = amount;
            return this;
        }
        public Integer getAmount() {
            return this.amount;
        }

        public CreateOrderRequestDynamicProductParams setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }
        public String getDeliveryAddress() {
            return this.deliveryAddress;
        }

        public CreateOrderRequestDynamicProductParams setDynamicAttributes(java.util.Map<String, String> dynamicAttributes) {
            this.dynamicAttributes = dynamicAttributes;
            return this;
        }
        public java.util.Map<String, String> getDynamicAttributes() {
            return this.dynamicAttributes;
        }

        public CreateOrderRequestDynamicProductParams setInputActivateConfig(CreateOrderRequestDynamicProductParamsInputActivateConfig inputActivateConfig) {
            this.inputActivateConfig = inputActivateConfig;
            return this;
        }
        public CreateOrderRequestDynamicProductParamsInputActivateConfig getInputActivateConfig() {
            return this.inputActivateConfig;
        }

        public CreateOrderRequestDynamicProductParams setInstanceIdList(java.util.List<String> instanceIdList) {
            this.instanceIdList = instanceIdList;
            return this;
        }
        public java.util.List<String> getInstanceIdList() {
            return this.instanceIdList;
        }

        public CreateOrderRequestDynamicProductParams setLinkedResourceId(String linkedResourceId) {
            this.linkedResourceId = linkedResourceId;
            return this;
        }
        public String getLinkedResourceId() {
            return this.linkedResourceId;
        }

        public CreateOrderRequestDynamicProductParams setPackageCode(String packageCode) {
            this.packageCode = packageCode;
            return this;
        }
        public String getPackageCode() {
            return this.packageCode;
        }

        public CreateOrderRequestDynamicProductParams setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public CreateOrderRequestDynamicProductParams setProductSkuCode(String productSkuCode) {
            this.productSkuCode = productSkuCode;
            return this;
        }
        public String getProductSkuCode() {
            return this.productSkuCode;
        }

        public CreateOrderRequestDynamicProductParams setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

    }

}
