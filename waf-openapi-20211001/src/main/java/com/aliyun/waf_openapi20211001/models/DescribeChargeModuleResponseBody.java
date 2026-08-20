// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeChargeModuleResponseBody extends TeaModel {
    /**
     * <p>The list of WAF pricing module information.</p>
     */
    @NameInMap("ChargeModules")
    public java.util.List<DescribeChargeModuleResponseBodyChargeModules> chargeModules;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeChargeModuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChargeModuleResponseBody self = new DescribeChargeModuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChargeModuleResponseBody setChargeModules(java.util.List<DescribeChargeModuleResponseBodyChargeModules> chargeModules) {
        this.chargeModules = chargeModules;
        return this;
    }
    public java.util.List<DescribeChargeModuleResponseBodyChargeModules> getChargeModules() {
        return this.chargeModules;
    }

    public DescribeChargeModuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeChargeModuleResponseBodyChargeModules extends TeaModel {
        /**
         * <p>The pricing mode of the pricing module. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL_PRICE</strong>: standard pricing.</li>
         * <li><strong>STEP_ACCUMULATION</strong>: tiered pricing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL_PRICE</p>
         */
        @NameInMap("ChargeMode")
        public String chargeMode;

        /**
         * <p>The pricing details of the pricing module.</p>
         */
        @NameInMap("ChargeModeDetails")
        public java.util.List<String> chargeModeDetails;

        /**
         * <p>The pricing unit.</p>
         * 
         * <strong>example:</strong>
         * <p>SeCU</p>
         */
        @NameInMap("ChargeUnit")
        public String chargeUnit;

        /**
         * <p>The pricing module identity. Valid values:</p>
         * <ul>
         * <li><strong>domainCount</strong>: the number of CNAME-connected domain names.</li>
         * <li><strong>qps</strong>: the peak QPS.</li>
         * <li><strong>request</strong>: the basic traffic fee.</li>
         * <li><strong>ipBlacklistRuleCount</strong>: the number of IP blacklist rules.</li>
         * <li><strong>customAclBaseRuleCount</strong>: the number of Basic Policies in custom rules.</li>
         * <li><strong>customAclAdvanceRuleCount</strong>: the number of advanced rules in custom rules.</li>
         * <li><strong>antiScanRuleCount</strong>: the number of scan protection rules.</li>
         * <li><strong>customResponseRuleCount</strong>: the number of custom response rules.</li>
         * <li><strong>ipv6</strong>: IPv6.</li>
         * <li><strong>gslb</strong>: intelligent load balancing.</li>
         * <li><strong>exclusiveIpCount</strong>: the number of exclusive IP addresses.</li>
         * <li><strong>ccRuleCount</strong>: the number of HTTP flood mitigation rules.</li>
         * <li><strong>regionBlockRuleCount</strong>: the number of Location Blacklist rules.</li>
         * <li><strong>tamperproofRuleCount</strong>: the number of web tamper proofing rules.</li>
         * <li><strong>dlpRuleCount</strong>: the number of information leak prevention rules.</li>
         * <li><strong>botTraffic</strong>: the Bot management traffic fee.</li>
         * <li><strong>aiWhiteListTemplateCount</strong>: the number of intelligent whitelist templates.</li>
         * <li><strong>apisecResourceCount</strong>: the number of protected objects with API security enabled.</li>
         * <li><strong>apisecTraffic</strong>: the API security traffic fee.</li>
         * <li><strong>compliance</strong>: the number of protocol compliance templates.</li>
         * <li><strong>riskTraffic</strong>: the number of risk identification hits in Bot management.</li>
         * <li><strong>assetStatus</strong>: the asset center.</li>
         * <li><strong>nonPort</strong>: non-standard ports.</li>
         * <li><strong>customAclCaptcha</strong>: the number of custom rule slider verification attempts.</li>
         * <li><strong>wafBaseTemplateCount</strong>: the number of web core protection rules.</li>
         * <li><strong>instanceFee</strong>: the WAF instance fee.</li>
         * <li><strong>spikeThrottleRuleCount</strong>: the number of peak traffic throttling rules.</li>
         * <li><strong>botWebTemplateCount</strong>: the number of web protection templates in Bot management.</li>
         * <li><strong>botAppTemplateCount</strong>: the number of app protection templates in Bot management.</li>
         * <li><strong>customAclBotRuleCount</strong>: the number of advanced custom rules in Bot management.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domainCount</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>The billing period type of the pricing module. Valid values:</p>
         * <ul>
         * <li><strong>Hour</strong>: hourly billing.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Hour</p>
         */
        @NameInMap("PeriodType")
        public String periodType;

        /**
         * <p>The usage type of the pricing module. Valid values:</p>
         * <ul>
         * <li><strong>template</strong>: template.</li>
         * <li><strong>qps</strong>: QPS.</li>
         * <li><strong>domain</strong>: domain name.</li>
         * <li><strong>rule</strong>: rule.</li>
         * <li><strong>ip</strong>: IP address.</li>
         * <li><strong>resource</strong>: protected object.</li>
         * <li><strong>reqest</strong>: request.</li>
         * <li><strong>function</strong>: feature enablement.</li>
         * <li><strong>time</strong>: number of times.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("UsageType")
        public String usageType;

        /**
         * <p>The billing unit factor of the pricing module.</p>
         * <blockquote>
         * <p>The billing unit factor <strong>UsageUnitFactor</strong> multiplied by the usage type <strong>UsageType</strong> forms the billing unit of the module.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsageUnitFactor")
        public Integer usageUnitFactor;

        public static DescribeChargeModuleResponseBodyChargeModules build(java.util.Map<String, ?> map) throws Exception {
            DescribeChargeModuleResponseBodyChargeModules self = new DescribeChargeModuleResponseBodyChargeModules();
            return TeaModel.build(map, self);
        }

        public DescribeChargeModuleResponseBodyChargeModules setChargeMode(String chargeMode) {
            this.chargeMode = chargeMode;
            return this;
        }
        public String getChargeMode() {
            return this.chargeMode;
        }

        public DescribeChargeModuleResponseBodyChargeModules setChargeModeDetails(java.util.List<String> chargeModeDetails) {
            this.chargeModeDetails = chargeModeDetails;
            return this;
        }
        public java.util.List<String> getChargeModeDetails() {
            return this.chargeModeDetails;
        }

        public DescribeChargeModuleResponseBodyChargeModules setChargeUnit(String chargeUnit) {
            this.chargeUnit = chargeUnit;
            return this;
        }
        public String getChargeUnit() {
            return this.chargeUnit;
        }

        public DescribeChargeModuleResponseBodyChargeModules setModuleCode(String moduleCode) {
            this.moduleCode = moduleCode;
            return this;
        }
        public String getModuleCode() {
            return this.moduleCode;
        }

        public DescribeChargeModuleResponseBodyChargeModules setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public DescribeChargeModuleResponseBodyChargeModules setUsageType(String usageType) {
            this.usageType = usageType;
            return this;
        }
        public String getUsageType() {
            return this.usageType;
        }

        public DescribeChargeModuleResponseBodyChargeModules setUsageUnitFactor(Integer usageUnitFactor) {
            this.usageUnitFactor = usageUnitFactor;
            return this;
        }
        public Integer getUsageUnitFactor() {
            return this.usageUnitFactor;
        }

    }

}
