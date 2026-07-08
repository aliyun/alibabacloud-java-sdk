// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeChargeModuleResponseBody extends TeaModel {
    /**
     * <p>A list of billing modules for WAF.</p>
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
         * <p>The pricing model of the billing module. Valid values:</p>
         * <ul>
         * <li><p><strong>NORMAL_PRICE</strong>: tiered pricing.</p>
         * </li>
         * <li><p><strong>STEP_ACCUMULATION</strong>: tiered pricing.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL_PRICE</p>
         */
        @NameInMap("ChargeMode")
        public String chargeMode;

        /**
         * <p>The detailed pricing information for the billing module.</p>
         */
        @NameInMap("ChargeModeDetails")
        public java.util.List<String> chargeModeDetails;

        /**
         * <p>The code of the billing module. Valid values:</p>
         * <ul>
         * <li><p><strong>domainCount</strong>: the number of domain names added to WAF in CNAME record mode.</p>
         * </li>
         * <li><p><strong>qps</strong>: the peak queries per second (QPS).</p>
         * </li>
         * <li><p><strong>request</strong>: the basic traffic fee.</p>
         * </li>
         * <li><p><strong>ipBlacklistRuleCount</strong>: the number of IP blacklist rules.</p>
         * </li>
         * <li><p><strong>customAclBaseRuleCount</strong>: the number of basic rules in custom protection rules.</p>
         * </li>
         * <li><p><strong>customAclAdvanceRuleCount</strong>: the number of advanced rules in custom protection rules.</p>
         * </li>
         * <li><p><strong>antiScanRuleCount</strong>: the number of scan protection rules.</p>
         * </li>
         * <li><p><strong>customResponseRuleCount</strong>: the number of custom response rules.</p>
         * </li>
         * <li><p><strong>ipv6</strong>: IPv6 protection.</p>
         * </li>
         * <li><p><strong>gslb</strong>: intelligent load balancing.</p>
         * </li>
         * <li><p><strong>exclusiveIpCount</strong>: the number of exclusive IP addresses.</p>
         * </li>
         * <li><p><strong>ccRuleCount</strong>: the number of HTTP flood protection rules.</p>
         * </li>
         * <li><p><strong>regionBlockRuleCount</strong>: the number of rules in the region blacklist.</p>
         * </li>
         * <li><p><strong>tamperproofRuleCount</strong>: the number of web tamper-proofing rules.</p>
         * </li>
         * <li><p><strong>dlpRuleCount</strong>: the number of data leakage prevention rules.</p>
         * </li>
         * <li><p><strong>botTraffic</strong>: the traffic fee for bot management.</p>
         * </li>
         * <li><p><strong>aiWhiteListTemplateCount</strong>: the number of intelligent whitelist templates.</p>
         * </li>
         * <li><p><strong>apisecResourceCount</strong>: the number of protected objects for which API security is enabled.</p>
         * </li>
         * <li><p><strong>apisecTraffic</strong>: the traffic fee for API security.</p>
         * </li>
         * <li><p><strong>compliance</strong>: the number of protocol compliance templates.</p>
         * </li>
         * <li><p><strong>riskTraffic</strong>: the number of times that risk identification in bot management is matched.</p>
         * </li>
         * <li><p><strong>assetStatus</strong>: asset center.</p>
         * </li>
         * <li><p><strong>nonPort</strong>: custom ports protection.</p>
         * </li>
         * <li><p><strong>customAclCaptcha</strong>: the number of times that sliders are used for custom protection rules.</p>
         * </li>
         * <li><p><strong>wafBaseTemplateCount</strong>: the number of core web protection rules.</p>
         * </li>
         * <li><p><strong>instanceFee</strong>: the WAF instance fee.</p>
         * </li>
         * <li><p><strong>spikeThrottleRuleCount</strong>: the number of peak traffic throttling rules.</p>
         * </li>
         * <li><p><strong>botWebTemplateCount</strong>: the number of web protection templates in bot management.</p>
         * </li>
         * <li><p><strong>botAppTemplateCount</strong>: the number of app protection templates in bot management.</p>
         * </li>
         * <li><p><strong>customAclBotRuleCount</strong>: the number of advanced custom rules in bot management.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domainCount</p>
         */
        @NameInMap("ModuleCode")
        public String moduleCode;

        /**
         * <p>The billing cycle of the billing module. Valid values:</p>
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
         * <p>The usage type of the billing module. Valid values:</p>
         * <ul>
         * <li><p><strong>template</strong>: template.</p>
         * </li>
         * <li><p><strong>qps</strong>: QPS.</p>
         * </li>
         * <li><p><strong>domain</strong>: domain name.</p>
         * </li>
         * <li><p><strong>rule</strong>: rule.</p>
         * </li>
         * <li><p><strong>ip</strong>: IP address.</p>
         * </li>
         * <li><p><strong>resource</strong>: protected object.</p>
         * </li>
         * <li><p><strong>request</strong>: request.</p>
         * </li>
         * <li><p><strong>function</strong>: feature enablement.</p>
         * </li>
         * <li><p><strong>time</strong>: number of times.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("UsageType")
        public String usageType;

        /**
         * <p>The billing unit coefficient of the billing module.</p>
         * <blockquote>
         * <p>The usage unit for the module is determined by multiplying the <strong>UsageUnitFactor</strong> by the <strong>UsageType</strong>.</p>
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
