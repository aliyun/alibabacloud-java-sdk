// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class CalculateSavingsPlansRequest extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("Cycle")
    public String cycle;

    @NameInMap("FromAppCode")
    public String fromAppCode;

    @NameInMap("FromAppName")
    public String fromAppName;

    @NameInMap("Instance")
    public java.util.List<CalculateSavingsPlansRequestInstance> instance;

    @NameInMap("PayMode")
    public String payMode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SpecCode")
    public String specCode;

    @NameInMap("SpnType")
    public String spnType;

    @NameInMap("UserId")
    public String userId;

    public static CalculateSavingsPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        CalculateSavingsPlansRequest self = new CalculateSavingsPlansRequest();
        return TeaModel.build(map, self);
    }

    public CalculateSavingsPlansRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CalculateSavingsPlansRequest setCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }
    public String getCycle() {
        return this.cycle;
    }

    public CalculateSavingsPlansRequest setFromAppCode(String fromAppCode) {
        this.fromAppCode = fromAppCode;
        return this;
    }
    public String getFromAppCode() {
        return this.fromAppCode;
    }

    public CalculateSavingsPlansRequest setFromAppName(String fromAppName) {
        this.fromAppName = fromAppName;
        return this;
    }
    public String getFromAppName() {
        return this.fromAppName;
    }

    public CalculateSavingsPlansRequest setInstance(java.util.List<CalculateSavingsPlansRequestInstance> instance) {
        this.instance = instance;
        return this;
    }
    public java.util.List<CalculateSavingsPlansRequestInstance> getInstance() {
        return this.instance;
    }

    public CalculateSavingsPlansRequest setPayMode(String payMode) {
        this.payMode = payMode;
        return this;
    }
    public String getPayMode() {
        return this.payMode;
    }

    public CalculateSavingsPlansRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CalculateSavingsPlansRequest setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

    public CalculateSavingsPlansRequest setSpnType(String spnType) {
        this.spnType = spnType;
        return this;
    }
    public String getSpnType() {
        return this.spnType;
    }

    public CalculateSavingsPlansRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class CalculateSavingsPlansRequestInstanceModuleProperty extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Value")
        public String value;

        public static CalculateSavingsPlansRequestInstanceModuleProperty build(java.util.Map<String, ?> map) throws Exception {
            CalculateSavingsPlansRequestInstanceModuleProperty self = new CalculateSavingsPlansRequestInstanceModuleProperty();
            return TeaModel.build(map, self);
        }

        public CalculateSavingsPlansRequestInstanceModuleProperty setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CalculateSavingsPlansRequestInstanceModuleProperty setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CalculateSavingsPlansRequestInstanceModule extends TeaModel {
        @NameInMap("ComponentCode")
        public String componentCode;

        @NameInMap("Property")
        public java.util.List<CalculateSavingsPlansRequestInstanceModuleProperty> property;

        public static CalculateSavingsPlansRequestInstanceModule build(java.util.Map<String, ?> map) throws Exception {
            CalculateSavingsPlansRequestInstanceModule self = new CalculateSavingsPlansRequestInstanceModule();
            return TeaModel.build(map, self);
        }

        public CalculateSavingsPlansRequestInstanceModule setComponentCode(String componentCode) {
            this.componentCode = componentCode;
            return this;
        }
        public String getComponentCode() {
            return this.componentCode;
        }

        public CalculateSavingsPlansRequestInstanceModule setProperty(java.util.List<CalculateSavingsPlansRequestInstanceModuleProperty> property) {
            this.property = property;
            return this;
        }
        public java.util.List<CalculateSavingsPlansRequestInstanceModuleProperty> getProperty() {
            return this.property;
        }

    }

    public static class CalculateSavingsPlansRequestInstance extends TeaModel {
        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("Module")
        public java.util.List<CalculateSavingsPlansRequestInstanceModule> module;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("SpecCode")
        public String specCode;

        public static CalculateSavingsPlansRequestInstance build(java.util.Map<String, ?> map) throws Exception {
            CalculateSavingsPlansRequestInstance self = new CalculateSavingsPlansRequestInstance();
            return TeaModel.build(map, self);
        }

        public CalculateSavingsPlansRequestInstance setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public CalculateSavingsPlansRequestInstance setModule(java.util.List<CalculateSavingsPlansRequestInstanceModule> module) {
            this.module = module;
            return this;
        }
        public java.util.List<CalculateSavingsPlansRequestInstanceModule> getModule() {
            return this.module;
        }

        public CalculateSavingsPlansRequestInstance setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public CalculateSavingsPlansRequestInstance setSpecCode(String specCode) {
            this.specCode = specCode;
            return this;
        }
        public String getSpecCode() {
            return this.specCode;
        }

    }

}
