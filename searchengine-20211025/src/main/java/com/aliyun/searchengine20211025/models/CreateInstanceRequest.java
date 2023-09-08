// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>The billing method of the instance. Valid values: PREPAY and POSTPAY. PREPAY: subscription. If you set this parameter to PREPAY, make sure that your Alibaba Cloud account supports balance payment or credit payment. Otherwise, the system returns the InvalidPayMethod error message. In addition, you must specify the paymentInfo parameter. POSTPAY: pay-as-you-go. This billing method is not supported.</p>
     */
    @NameInMap("chargeType")
    public String chargeType;

    /**
     * <p>The specifications of the instance.</p>
     */
    @NameInMap("components")
    public java.util.List<CreateInstanceRequestComponents> components;

    /**
     * <p>The information about billing.</p>
     */
    @NameInMap("order")
    public CreateInstanceRequestOrder order;

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

    public static class CreateInstanceRequestComponents extends TeaModel {
        /**
         * <p>The name of the specification. The value must be the same as the name of a parameter on the buy page.</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The value of the specification.</p>
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
         */
        @NameInMap("autoRenew")
        public Boolean autoRenew;

        /**
         * <p>The billing cycle. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, and 12.</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>The unit of the billing cycle. Valid values: Month and Year.</p>
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

}
