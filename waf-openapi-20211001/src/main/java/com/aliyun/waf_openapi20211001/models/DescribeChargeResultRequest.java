// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeChargeResultRequest extends TeaModel {
    /**
     * <p>The billing cycle. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: calculates the billing result for one year</li>
     * <li><strong>Month</strong>: calculates the billing result for one month</li>
     * <li><strong>Day</strong>: calculates the billing result for one day</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Day</p>
     */
    @NameInMap("ChargeCycle")
    public String chargeCycle;

    /**
     * <p>The list of billing modules to be calculated.</p>
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
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>POSTPAY</strong>: pay-as-you-go WAF instances</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region of the WAF instance. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland</p>
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
         * <p>The billing module code.</p>
         * 
         * <strong>example:</strong>
         * <p>domainCount</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>The usage of the billing module.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Usage")
        public Long usage;

        /**
         * <p>The usage of the billing module, which supports integers and decimals. If the billing module is log storage capacity, the usage supports up to one decimal place, such as 10.5. This parameter is optional and has no default value. If this parameter is specified, it takes precedence even if the value is 0. If this parameter is not specified, Usage is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10.5</p>
         */
        @NameInMap("UsageDecimal")
        public Double usageDecimal;

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

        public DescribeChargeResultRequestChargeModules setUsageDecimal(Double usageDecimal) {
            this.usageDecimal = usageDecimal;
            return this;
        }
        public Double getUsageDecimal() {
            return this.usageDecimal;
        }

    }

}
