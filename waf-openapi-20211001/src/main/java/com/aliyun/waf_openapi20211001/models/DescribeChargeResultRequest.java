// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeChargeResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Day</p>
     */
    @NameInMap("ChargeCycle")
    public String chargeCycle;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChargeModules")
    public java.util.List<DescribeChargeResultRequestChargeModules> chargeModules;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static DescribeChargeResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeChargeResultRequest self = new DescribeChargeResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeChargeResultRequest setChargeCycle(String chargeCycle) {
        this.chargeCycle = chargeCycle;
        return this;
    }
    public String getChargeCycle() {
        return this.chargeCycle;
    }

    public DescribeChargeResultRequest setChargeModules(java.util.List<DescribeChargeResultRequestChargeModules> chargeModules) {
        this.chargeModules = chargeModules;
        return this;
    }
    public java.util.List<DescribeChargeResultRequestChargeModules> getChargeModules() {
        return this.chargeModules;
    }

    public DescribeChargeResultRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeChargeResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeChargeResultRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public static class DescribeChargeResultRequestChargeModules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>domainCount</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Usage")
        public Long usage;

        public static DescribeChargeResultRequestChargeModules build(java.util.Map<String, ?> map) throws Exception {
            DescribeChargeResultRequestChargeModules self = new DescribeChargeResultRequestChargeModules();
            return TeaModel.build(map, self);
        }

        public DescribeChargeResultRequestChargeModules setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public DescribeChargeResultRequestChargeModules setUsage(Long usage) {
            this.usage = usage;
            return this;
        }
        public Long getUsage() {
            return this.usage;
        }

    }

}
