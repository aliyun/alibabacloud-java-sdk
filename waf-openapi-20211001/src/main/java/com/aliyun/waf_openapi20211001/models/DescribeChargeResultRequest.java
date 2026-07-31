// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeChargeResultRequest extends TeaModel {
    /**
     * <p>The billing cycle for the calculation. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: Calculates the billing result for one year.</li>
     * <li><strong>Month</strong>: Calculates the billing result for one month.</li>
     * <li><strong>Day</strong>: Calculates the billing result for one day.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Day</p>
     */
    @NameInMap("ChargeCycle")
    public String chargeCycle;

    /**
     * <p>The list of billing modules to calculate.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChargeModules")
    public java.util.List<DescribeChargeResultRequestChargeModules> chargeModules;

    /**
     * <p>The metering unit.</p>
     * 
     * <strong>example:</strong>
     * <p>SeCU</p>
     */
    @NameInMap("ChargeUnit")
    public String chargeUnit;

    /**
     * <p>The billing type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>POSTPAY</strong>: pay-as-you-go WAF instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The Alibaba Cloud resource group ID.</p>
     * 
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

    public DescribeChargeResultRequest setChargeUnit(String chargeUnit) {
        this.chargeUnit = chargeUnit;
        return this;
    }
    public String getChargeUnit() {
        return this.chargeUnit;
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
         * <p>The pricing module identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>domainCount</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>The usage of the pricing module.</p>
         * 
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
