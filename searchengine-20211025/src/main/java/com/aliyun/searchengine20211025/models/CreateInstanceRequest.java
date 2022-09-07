// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
    @NameInMap("chargeType")
    public String chargeType;

    @NameInMap("components")
    public java.util.List<CreateInstanceRequestComponents> components;

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
        @NameInMap("code")
        public String code;

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
        @NameInMap("autoRenew")
        public Boolean autoRenew;

        @NameInMap("duration")
        public Long duration;

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
