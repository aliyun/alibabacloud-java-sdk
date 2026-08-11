// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>The billing method of the instance. Valid values: PREPAY: subscription. If you select this billing method, make sure that your account supports balance payment or credit payment. Otherwise, the InvalidPayMethod error is returned. You must also specify the paymentInfo parameter. POSTPAY: pay-as-you-go (currently not supported).</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("chargeType")
    public String chargeType;

    /**
     * <p>The list of specification information related to the instance.</p>
     */
    @NameInMap("components")
    public java.util.List<CreateInstanceRequestComponents> components;

    /**
     * <p>The payment information.</p>
     */
    @NameInMap("order")
    public CreateInstanceRequestOrder order;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("tags")
    public java.util.List<CreateInstanceRequestTags> tags;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateInstanceRequest setComponents(java.util.List<CreateInstanceRequestComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<CreateInstanceRequestComponents> getComponents() {
        return this.components;
    }

    public CreateInstanceRequest setOrder(CreateInstanceRequestOrder order) {
        this.order = order;
        return this;
    }
    public CreateInstanceRequestOrder getOrder() {
        return this.order;
    }

    public CreateInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateInstanceRequest setTags(java.util.List<CreateInstanceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateInstanceRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateInstanceRequestComponents extends TeaModel {
        /**
         * <p>The specification code, which is consistent with the sales parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>searcherdocsize</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The data entered in the control.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateInstanceRequestComponents build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestComponents self = new CreateInstanceRequestComponents();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestComponents setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateInstanceRequestComponents setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateInstanceRequestOrder extends TeaModel {
        /**
         * <p>Specifies whether to enable auto-renewal. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoRenew")
        public Boolean autoRenew;

        /**
         * <p>The billing cycle. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, and 12.</p>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>The unit of the billing cycle. Valid values: Month and Year.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("pricingCycle")
        public String pricingCycle;

        public static CreateInstanceRequestOrder build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestOrder self = new CreateInstanceRequestOrder();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestOrder setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public CreateInstanceRequestOrder setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public CreateInstanceRequestOrder setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

    }

    public static class CreateInstanceRequestTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static CreateInstanceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestTags self = new CreateInstanceRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateInstanceRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
