// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    /**
     * <p>The billing method of the instance. Valid values: PREPAY and POSTPAY. PREPAY indicates the instance is a subscription instance. When you set this parameter to PREPAY, make sure that your Alibaba Cloud account supports balance payment or credit card payment. Otherwise, the system returns the InvalidPayMethod error message. If you set this parameter to PREPAY, you must also specify the paymentInfo parameter. POSTPAY indicates that the instance is a pay-as-you-go instance. This billing method is not supported.</p>
     */
    @NameInMap("chargeType")
    public String chargeType;

    /**
     * <p>A list of instance-related specifications.</p>
     */
    @NameInMap("components")
    public java.util.List<CreateInstanceRequestComponents> components;

    /**
     * <p>The billing information.</p>
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
         * <p>The specification code, which must be consistent with values of the corresponding module parameters.</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>Values that you specify for the corresponding module components on the buy page.</p>
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
         * <p>The billing duration. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, and 12.</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>The unit of the billing duration. Valid values: Month and Year.</p>
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
