// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    /**
     * <p>The instance details.</p>
     */
    @NameInMap("Details")
    public DescribeInstanceResponseBodyDetails details;

    /**
     * <p>The WAF edition.</p>
     * 
     * <strong>example:</strong>
     * <p>default_version</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The time when the instance expires. The value is a UNIX timestamp. Unit: milliseconds. Format: ms.</p>
     * 
     * <strong>example:</strong>
     * <p>4809859200000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Indicates whether the current instance has an overdue payment. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InDebt")
    public String inDebt;

    /**
     * <p>The WAF instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The instance execution status. Valid values:</p>
     * <ul>
     * <li><p><strong>commodity_converting</strong>: The commodity is being converted.</p>
     * </li>
     * <li><p><strong>commodity_convert_check_failed</strong>: The commodity conversion check failed.</p>
     * </li>
     * <li><p><strong>commodity_convert_process_failed</strong>: The commodity conversion failed.</p>
     * </li>
     * <li><p><strong>order_create_failed</strong>: The order failed to be created.</p>
     * </li>
     * <li><p><strong>order_pending_payment</strong>: The order is pending payment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>order_pending_payment</p>
     */
    @NameInMap("ProcessStatus")
    public String processStatus;

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
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>66A98669-CC6E-4F3E-80A6-3014697B11AE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The purchase time. The value is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1668496310000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The current status of the instance. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Normal.</li>
     * <li><strong>2</strong>: Expired.</li>
     * <li><strong>3</strong>: Released.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResponseBody self = new DescribeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceResponseBody setDetails(DescribeInstanceResponseBodyDetails details) {
        this.details = details;
        return this;
    }
    public DescribeInstanceResponseBodyDetails getDetails() {
        return this.details;
    }

    public DescribeInstanceResponseBody setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public DescribeInstanceResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public DescribeInstanceResponseBody setInDebt(String inDebt) {
        this.inDebt = inDebt;
        return this;
    }
    public String getInDebt() {
        return this.inDebt;
    }

    public DescribeInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceResponseBody setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public DescribeInstanceResponseBody setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }
    public String getProcessStatus() {
        return this.processStatus;
    }

    public DescribeInstanceResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public DescribeInstanceResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public static class DescribeInstanceResponseBodyDetails extends TeaModel {
        /**
         * <p>The maximum number of IP addresses that can be added to the match content. For more information about match content, refer to <a href="https://help.aliyun.com/document_detail/374354.html">Match condition description</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AclRuleMaxIpCount")
        public Long aclRuleMaxIpCount;

        /**
         * <p>Indicates whether Agentic API security is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AgenticApisec")
        public Boolean agenticApisec;

        /**
         * <p>Specifies whether scan protection is supported. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AntiScan")
        public Boolean antiScan;

        /**
         * <p>The maximum number of scan protection templates that can be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("AntiScanTemplateMaxCount")
        public Long antiScanTemplateMaxCount;

        /**
         * <p>Indicates whether API security is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Apisec")
        public Boolean apisec;

        /**
         * <p>The maximum number of back-to-origin IP addresses that can be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("BackendMaxCount")
        public Long backendMaxCount;

        /**
         * <p>Specifies whether basic protection rules are supported. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Supported.</p>
         * </li>
         * <li><p><strong>false</strong>: Not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BaseWafGroup")
        public Boolean baseWafGroup;

        /**
         * <p>The maximum number of protection rules that can be included in a single basic protection rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("BaseWafGroupRuleInTemplateMaxCount")
        public Long baseWafGroupRuleInTemplateMaxCount;

        /**
         * <p>The maximum number of basic protection rule templates that can be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("BaseWafGroupRuleTemplateMaxCount")
        public Long baseWafGroupRuleTemplateMaxCount;

        /**
         * <p>Specifies whether bot management is supported. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Bot")
        public Boolean bot;

        /**
         * <p>Indicates whether scenario-specific protection against app crawlers is supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Supported.</li>
         * <li><strong>false</strong>: Not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BotApp")
        public String botApp;

        /**
         * <p>The maximum number of bot management protection templates that can be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("BotTemplateMaxCount")
        public Long botTemplateMaxCount;

        /**
         * <p>Specifies whether scenario-specific protection against web crawlers is supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Supported.</li>
         * <li><strong>false</strong>: Not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BotWeb")
        public String botWeb;

        /**
         * <p>The maximum number of CNAMEs that can be added.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("CnameResourceMaxCount")
        public Long cnameResourceMaxCount;

        /**
         * <p>Indicates whether custom responses are supported. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Supported.</p>
         * </li>
         * <li><p><strong>false</strong>: Not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CustomResponse")
        public Boolean customResponse;

        /**
         * <p>The maximum number of protection rules that a single custom response template can contain.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CustomResponseRuleInTemplateMaxCount")
        public Long customResponseRuleInTemplateMaxCount;

        /**
         * <p>The maximum number of custom response templates that can be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("CustomResponseTemplateMaxCount")
        public Long customResponseTemplateMaxCount;

        /**
         * <p>Specifies whether custom rules are supported. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Supported.</p>
         * </li>
         * <li><p><strong>false</strong>: Not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CustomRule")
        public Boolean customRule;

        /**
         * <p>The strings included in custom rules.</p>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("CustomRuleAction")
        public String customRuleAction;

        /**
         * <p>The match conditions for custom rules. For more information, refer to the parameter description of <strong>custom rule (custom_acl) conditions</strong> in <a href="https://help.aliyun.com/document_detail/461421.html">CreateDefenseRule</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("CustomRuleCondition")
        public String customRuleCondition;

        /**
         * <p>The maximum number of protection rules that a single custom rule template can contain.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CustomRuleInTemplateMaxCount")
        public Long customRuleInTemplateMaxCount;

        /**
         * <p>The rate limiting object for custom rules.</p>
         * 
         * <strong>example:</strong>
         * <p>header</p>
         */
        @NameInMap("CustomRuleRatelimitor")
        public String customRuleRatelimitor;

        /**
         * <p>The maximum number of custom rule templates that can be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("CustomRuleTemplateMaxCount")
        public Long customRuleTemplateMaxCount;

        /**
         * <p>The maximum number of protection groups that can be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DefenseGroupMaxCount")
        public Long defenseGroupMaxCount;

        /**
         * <p>The maximum number of protection objects that a protection group can contain.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DefenseObjectInGroupMaxCount")
        public Long defenseObjectInGroupMaxCount;

        /**
         * <p>The maximum number of protection objects that can be associated with a single template.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DefenseObjectInTemplateMaxCount")
        public Long defenseObjectInTemplateMaxCount;

        /**
         * <p>The maximum number of protection objects that can be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("DefenseObjectMaxCount")
        public Long defenseObjectMaxCount;

        /**
         * <p>Specifies whether data leak prevention is supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Supported.</li>
         * <li><strong>false</strong>: Not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Dlp")
        public Boolean dlp;

        /**
         * <p>The maximum number of protection rules that a single information leak prevention template can contain.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("DlpRuleInTemplateMaxCount")
        public Long dlpRuleInTemplateMaxCount;

        /**
         * <p>The maximum number of information leak prevention templates that can be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("DlpTemplateMaxCount")
        public Long dlpTemplateMaxCount;

        /**
         * <p>The burstable QPS value for the subscription instance with pay-as-you-go billing for burstable capacity. For more information, see <a href="https://help.aliyun.com/document_detail/441231.html">WAF 3.0 editions</a>.</p>
         * <blockquote>
         * <p>This parameter has no practical meaning for <strong>pay-as-you-go</strong> instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("ElasticQps")
        public Integer elasticQps;

        /**
         * <p>Specifies whether exclusive IP addresses are supported. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExclusiveIp")
        public Boolean exclusiveIp;

        /**
         * <p>The extended QPS value of the subscription instance. For more information, see <a href="https://help.aliyun.com/document_detail/441231.html">WAF 3.0 editions</a>.</p>
         * <blockquote>
         * <p>This parameter is not applicable to <strong>pay-as-you-go</strong> instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("ExtendQps")
        public Integer extendQps;

        /**
         * <p>The free QPS value included in the subscription plan. For more information, see <a href="https://help.aliyun.com/document_detail/441231.html">WAF 3.0 editions</a>.</p>
         * <blockquote>
         * <p>This parameter has no practical meaning for <strong>pay-as-you-go</strong> instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("FreeQps")
        public Integer freeQps;

        /**
         * <p>Specifies whether Global Server Load Balancing (GSLB) is supported. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Gslb")
        public Boolean gslb;

        /**
         * <p>The available HTTP port range. For more information, refer to <a href="https://help.aliyun.com/document_detail/385578.html">Ports supported by WAF</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("HttpPorts")
        public String httpPorts;

        /**
         * <p>The available HTTPS port range. For more information, refer to <a href="https://help.aliyun.com/document_detail/385578.html">Ports supported by WAF</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("HttpsPorts")
        public String httpsPorts;

        /**
         * <p>Indicates whether hybrid cloud is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HybridCloud")
        public Boolean hybridCloud;

        /**
         * <p>The number of hybrid cloud extended nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("HybridCloudNodeExtend")
        public Integer hybridCloudNodeExtend;

        /**
         * <p>Indicates whether the IP blacklist is supported. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Supported.</p>
         * </li>
         * <li><p><strong>false</strong>: Not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IpBlacklist")
        public Boolean ipBlacklist;

        /**
         * <p>The maximum number of IP addresses that can be added to a blacklist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("IpBlacklistIpInRuleMaxCount")
        public Long ipBlacklistIpInRuleMaxCount;

        /**
         * <p>The maximum number of protection rules that a single blacklist template can contain.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("IpBlacklistRuleInTemplateMaxCount")
        public Long ipBlacklistRuleInTemplateMaxCount;

        /**
         * <p>The maximum number of blacklist templates that can be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("IpBlacklistTemplateMaxCount")
        public Long ipBlacklistTemplateMaxCount;

        /**
         * <p>Specifies whether IPv6 is supported. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Ipv6")
        public Boolean ipv6;

        /**
         * <p>Specifies whether the log service is supported. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LogService")
        public Boolean logService;

        /**
         * <p>Specifies whether critical event protection is supported. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Supported.</p>
         * </li>
         * <li><p><strong>false</strong>: Not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MajorProtection")
        public Boolean majorProtection;

        /**
         * <p>The maximum number of critical event protection templates that can be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MajorProtectionTemplateMaxCount")
        public Long majorProtectionTemplateMaxCount;

        /**
         * <p>The QPS billing protection threshold for the pay-as-you-go edition. For more information, see <a href="https://help.aliyun.com/document_detail/2249021.html">Traffic billing protection</a> for pay-as-you-go.</p>
         * <blockquote>
         * <p>This parameter has no practical meaning for <strong>subscription</strong> instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("QpsBillingCap")
        public Integer qpsBillingCap;

        /**
         * <p>Indicates whether the multi-account management feature is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ResourceDirectory")
        public Boolean resourceDirectory;

        /**
         * <p>Specifies whether web tamper proofing is supported. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Tamperproof")
        public Boolean tamperproof;

        /**
         * <p>The maximum number of protection rules that a single web tamper proofing template can contain.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("TamperproofRuleInTemplateMaxCount")
        public Long tamperproofRuleInTemplateMaxCount;

        /**
         * <p>The maximum number of web tamper proofing protection templates that can be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("TamperproofTemplateMaxCount")
        public Long tamperproofTemplateMaxCount;

        /**
         * <p>The maximum number of IP addresses that can be imported to the IP blacklist in a single bulk import.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("VastIpBlacklistInFileMaxCount")
        public Long vastIpBlacklistInFileMaxCount;

        /**
         * <p>The maximum number of IP addresses that can be added to the IP blacklist in a single page operation.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("VastIpBlacklistInOperationMaxCount")
        public Long vastIpBlacklistInOperationMaxCount;

        /**
         * <p>The maximum number of IP blacklist entries that a single user can configure.</p>
         * 
         * <strong>example:</strong>
         * <p>50000</p>
         */
        @NameInMap("VastIpBlacklistMaxCount")
        public Long vastIpBlacklistMaxCount;

        /**
         * <p>Specifies whether the IP whitelist is supported. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Supported.</p>
         * </li>
         * <li><p><strong>false</strong>: Not supported.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Whitelist")
        public Boolean whitelist;

        /**
         * <p>The logical operators for whitelist rules. For more information, refer to the parameter description of <strong>whitelist rule (whitelist) conditions</strong> in <a href="https://help.aliyun.com/document_detail/461421.html">CreateDefenseRule</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>contain</p>
         */
        @NameInMap("WhitelistLogical")
        public String whitelistLogical;

        /**
         * <p>The match fields for whitelist rules. For more information, refer to the parameter description of <strong>whitelist rule (whitelist) conditions</strong> in <a href="https://help.aliyun.com/document_detail/461421.html">CreateDefenseRule</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("WhitelistRuleCondition")
        public String whitelistRuleCondition;

        /**
         * <p>The maximum number of protection rules that a single whitelist template can contain.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("WhitelistRuleInTemplateMaxCount")
        public Long whitelistRuleInTemplateMaxCount;

        /**
         * <p>The maximum number of whitelist templates that can be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("WhitelistTemplateMaxCount")
        public Long whitelistTemplateMaxCount;

        public static DescribeInstanceResponseBodyDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyDetails self = new DescribeInstanceResponseBodyDetails();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyDetails setAclRuleMaxIpCount(Long aclRuleMaxIpCount) {
            this.aclRuleMaxIpCount = aclRuleMaxIpCount;
            return this;
        }
        public Long getAclRuleMaxIpCount() {
            return this.aclRuleMaxIpCount;
        }

        public DescribeInstanceResponseBodyDetails setAgenticApisec(Boolean agenticApisec) {
            this.agenticApisec = agenticApisec;
            return this;
        }
        public Boolean getAgenticApisec() {
            return this.agenticApisec;
        }

        public DescribeInstanceResponseBodyDetails setAntiScan(Boolean antiScan) {
            this.antiScan = antiScan;
            return this;
        }
        public Boolean getAntiScan() {
            return this.antiScan;
        }

        public DescribeInstanceResponseBodyDetails setAntiScanTemplateMaxCount(Long antiScanTemplateMaxCount) {
            this.antiScanTemplateMaxCount = antiScanTemplateMaxCount;
            return this;
        }
        public Long getAntiScanTemplateMaxCount() {
            return this.antiScanTemplateMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setApisec(Boolean apisec) {
            this.apisec = apisec;
            return this;
        }
        public Boolean getApisec() {
            return this.apisec;
        }

        public DescribeInstanceResponseBodyDetails setBackendMaxCount(Long backendMaxCount) {
            this.backendMaxCount = backendMaxCount;
            return this;
        }
        public Long getBackendMaxCount() {
            return this.backendMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setBaseWafGroup(Boolean baseWafGroup) {
            this.baseWafGroup = baseWafGroup;
            return this;
        }
        public Boolean getBaseWafGroup() {
            return this.baseWafGroup;
        }

        public DescribeInstanceResponseBodyDetails setBaseWafGroupRuleInTemplateMaxCount(Long baseWafGroupRuleInTemplateMaxCount) {
            this.baseWafGroupRuleInTemplateMaxCount = baseWafGroupRuleInTemplateMaxCount;
            return this;
        }
        public Long getBaseWafGroupRuleInTemplateMaxCount() {
            return this.baseWafGroupRuleInTemplateMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setBaseWafGroupRuleTemplateMaxCount(Long baseWafGroupRuleTemplateMaxCount) {
            this.baseWafGroupRuleTemplateMaxCount = baseWafGroupRuleTemplateMaxCount;
            return this;
        }
        public Long getBaseWafGroupRuleTemplateMaxCount() {
            return this.baseWafGroupRuleTemplateMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setBot(Boolean bot) {
            this.bot = bot;
            return this;
        }
        public Boolean getBot() {
            return this.bot;
        }

        public DescribeInstanceResponseBodyDetails setBotApp(String botApp) {
            this.botApp = botApp;
            return this;
        }
        public String getBotApp() {
            return this.botApp;
        }

        public DescribeInstanceResponseBodyDetails setBotTemplateMaxCount(Long botTemplateMaxCount) {
            this.botTemplateMaxCount = botTemplateMaxCount;
            return this;
        }
        public Long getBotTemplateMaxCount() {
            return this.botTemplateMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setBotWeb(String botWeb) {
            this.botWeb = botWeb;
            return this;
        }
        public String getBotWeb() {
            return this.botWeb;
        }

        public DescribeInstanceResponseBodyDetails setCnameResourceMaxCount(Long cnameResourceMaxCount) {
            this.cnameResourceMaxCount = cnameResourceMaxCount;
            return this;
        }
        public Long getCnameResourceMaxCount() {
            return this.cnameResourceMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setCustomResponse(Boolean customResponse) {
            this.customResponse = customResponse;
            return this;
        }
        public Boolean getCustomResponse() {
            return this.customResponse;
        }

        public DescribeInstanceResponseBodyDetails setCustomResponseRuleInTemplateMaxCount(Long customResponseRuleInTemplateMaxCount) {
            this.customResponseRuleInTemplateMaxCount = customResponseRuleInTemplateMaxCount;
            return this;
        }
        public Long getCustomResponseRuleInTemplateMaxCount() {
            return this.customResponseRuleInTemplateMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setCustomResponseTemplateMaxCount(Long customResponseTemplateMaxCount) {
            this.customResponseTemplateMaxCount = customResponseTemplateMaxCount;
            return this;
        }
        public Long getCustomResponseTemplateMaxCount() {
            return this.customResponseTemplateMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setCustomRule(Boolean customRule) {
            this.customRule = customRule;
            return this;
        }
        public Boolean getCustomRule() {
            return this.customRule;
        }

        public DescribeInstanceResponseBodyDetails setCustomRuleAction(String customRuleAction) {
            this.customRuleAction = customRuleAction;
            return this;
        }
        public String getCustomRuleAction() {
            return this.customRuleAction;
        }

        public DescribeInstanceResponseBodyDetails setCustomRuleCondition(String customRuleCondition) {
            this.customRuleCondition = customRuleCondition;
            return this;
        }
        public String getCustomRuleCondition() {
            return this.customRuleCondition;
        }

        public DescribeInstanceResponseBodyDetails setCustomRuleInTemplateMaxCount(Long customRuleInTemplateMaxCount) {
            this.customRuleInTemplateMaxCount = customRuleInTemplateMaxCount;
            return this;
        }
        public Long getCustomRuleInTemplateMaxCount() {
            return this.customRuleInTemplateMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setCustomRuleRatelimitor(String customRuleRatelimitor) {
            this.customRuleRatelimitor = customRuleRatelimitor;
            return this;
        }
        public String getCustomRuleRatelimitor() {
            return this.customRuleRatelimitor;
        }

        public DescribeInstanceResponseBodyDetails setCustomRuleTemplateMaxCount(Long customRuleTemplateMaxCount) {
            this.customRuleTemplateMaxCount = customRuleTemplateMaxCount;
            return this;
        }
        public Long getCustomRuleTemplateMaxCount() {
            return this.customRuleTemplateMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setDefenseGroupMaxCount(Long defenseGroupMaxCount) {
            this.defenseGroupMaxCount = defenseGroupMaxCount;
            return this;
        }
        public Long getDefenseGroupMaxCount() {
            return this.defenseGroupMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setDefenseObjectInGroupMaxCount(Long defenseObjectInGroupMaxCount) {
            this.defenseObjectInGroupMaxCount = defenseObjectInGroupMaxCount;
            return this;
        }
        public Long getDefenseObjectInGroupMaxCount() {
            return this.defenseObjectInGroupMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setDefenseObjectInTemplateMaxCount(Long defenseObjectInTemplateMaxCount) {
            this.defenseObjectInTemplateMaxCount = defenseObjectInTemplateMaxCount;
            return this;
        }
        public Long getDefenseObjectInTemplateMaxCount() {
            return this.defenseObjectInTemplateMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setDefenseObjectMaxCount(Long defenseObjectMaxCount) {
            this.defenseObjectMaxCount = defenseObjectMaxCount;
            return this;
        }
        public Long getDefenseObjectMaxCount() {
            return this.defenseObjectMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setDlp(Boolean dlp) {
            this.dlp = dlp;
            return this;
        }
        public Boolean getDlp() {
            return this.dlp;
        }

        public DescribeInstanceResponseBodyDetails setDlpRuleInTemplateMaxCount(Long dlpRuleInTemplateMaxCount) {
            this.dlpRuleInTemplateMaxCount = dlpRuleInTemplateMaxCount;
            return this;
        }
        public Long getDlpRuleInTemplateMaxCount() {
            return this.dlpRuleInTemplateMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setDlpTemplateMaxCount(Long dlpTemplateMaxCount) {
            this.dlpTemplateMaxCount = dlpTemplateMaxCount;
            return this;
        }
        public Long getDlpTemplateMaxCount() {
            return this.dlpTemplateMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setElasticQps(Integer elasticQps) {
            this.elasticQps = elasticQps;
            return this;
        }
        public Integer getElasticQps() {
            return this.elasticQps;
        }

        public DescribeInstanceResponseBodyDetails setExclusiveIp(Boolean exclusiveIp) {
            this.exclusiveIp = exclusiveIp;
            return this;
        }
        public Boolean getExclusiveIp() {
            return this.exclusiveIp;
        }

        public DescribeInstanceResponseBodyDetails setExtendQps(Integer extendQps) {
            this.extendQps = extendQps;
            return this;
        }
        public Integer getExtendQps() {
            return this.extendQps;
        }

        public DescribeInstanceResponseBodyDetails setFreeQps(Integer freeQps) {
            this.freeQps = freeQps;
            return this;
        }
        public Integer getFreeQps() {
            return this.freeQps;
        }

        public DescribeInstanceResponseBodyDetails setGslb(Boolean gslb) {
            this.gslb = gslb;
            return this;
        }
        public Boolean getGslb() {
            return this.gslb;
        }

        public DescribeInstanceResponseBodyDetails setHttpPorts(String httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }
        public String getHttpPorts() {
            return this.httpPorts;
        }

        public DescribeInstanceResponseBodyDetails setHttpsPorts(String httpsPorts) {
            this.httpsPorts = httpsPorts;
            return this;
        }
        public String getHttpsPorts() {
            return this.httpsPorts;
        }

        public DescribeInstanceResponseBodyDetails setHybridCloud(Boolean hybridCloud) {
            this.hybridCloud = hybridCloud;
            return this;
        }
        public Boolean getHybridCloud() {
            return this.hybridCloud;
        }

        public DescribeInstanceResponseBodyDetails setHybridCloudNodeExtend(Integer hybridCloudNodeExtend) {
            this.hybridCloudNodeExtend = hybridCloudNodeExtend;
            return this;
        }
        public Integer getHybridCloudNodeExtend() {
            return this.hybridCloudNodeExtend;
        }

        public DescribeInstanceResponseBodyDetails setIpBlacklist(Boolean ipBlacklist) {
            this.ipBlacklist = ipBlacklist;
            return this;
        }
        public Boolean getIpBlacklist() {
            return this.ipBlacklist;
        }

        public DescribeInstanceResponseBodyDetails setIpBlacklistIpInRuleMaxCount(Long ipBlacklistIpInRuleMaxCount) {
            this.ipBlacklistIpInRuleMaxCount = ipBlacklistIpInRuleMaxCount;
            return this;
        }
        public Long getIpBlacklistIpInRuleMaxCount() {
            return this.ipBlacklistIpInRuleMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setIpBlacklistRuleInTemplateMaxCount(Long ipBlacklistRuleInTemplateMaxCount) {
            this.ipBlacklistRuleInTemplateMaxCount = ipBlacklistRuleInTemplateMaxCount;
            return this;
        }
        public Long getIpBlacklistRuleInTemplateMaxCount() {
            return this.ipBlacklistRuleInTemplateMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setIpBlacklistTemplateMaxCount(Long ipBlacklistTemplateMaxCount) {
            this.ipBlacklistTemplateMaxCount = ipBlacklistTemplateMaxCount;
            return this;
        }
        public Long getIpBlacklistTemplateMaxCount() {
            return this.ipBlacklistTemplateMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setIpv6(Boolean ipv6) {
            this.ipv6 = ipv6;
            return this;
        }
        public Boolean getIpv6() {
            return this.ipv6;
        }

        public DescribeInstanceResponseBodyDetails setLogService(Boolean logService) {
            this.logService = logService;
            return this;
        }
        public Boolean getLogService() {
            return this.logService;
        }

        public DescribeInstanceResponseBodyDetails setMajorProtection(Boolean majorProtection) {
            this.majorProtection = majorProtection;
            return this;
        }
        public Boolean getMajorProtection() {
            return this.majorProtection;
        }

        public DescribeInstanceResponseBodyDetails setMajorProtectionTemplateMaxCount(Long majorProtectionTemplateMaxCount) {
            this.majorProtectionTemplateMaxCount = majorProtectionTemplateMaxCount;
            return this;
        }
        public Long getMajorProtectionTemplateMaxCount() {
            return this.majorProtectionTemplateMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setQpsBillingCap(Integer qpsBillingCap) {
            this.qpsBillingCap = qpsBillingCap;
            return this;
        }
        public Integer getQpsBillingCap() {
            return this.qpsBillingCap;
        }

        public DescribeInstanceResponseBodyDetails setResourceDirectory(Boolean resourceDirectory) {
            this.resourceDirectory = resourceDirectory;
            return this;
        }
        public Boolean getResourceDirectory() {
            return this.resourceDirectory;
        }

        public DescribeInstanceResponseBodyDetails setTamperproof(Boolean tamperproof) {
            this.tamperproof = tamperproof;
            return this;
        }
        public Boolean getTamperproof() {
            return this.tamperproof;
        }

        public DescribeInstanceResponseBodyDetails setTamperproofRuleInTemplateMaxCount(Long tamperproofRuleInTemplateMaxCount) {
            this.tamperproofRuleInTemplateMaxCount = tamperproofRuleInTemplateMaxCount;
            return this;
        }
        public Long getTamperproofRuleInTemplateMaxCount() {
            return this.tamperproofRuleInTemplateMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setTamperproofTemplateMaxCount(Long tamperproofTemplateMaxCount) {
            this.tamperproofTemplateMaxCount = tamperproofTemplateMaxCount;
            return this;
        }
        public Long getTamperproofTemplateMaxCount() {
            return this.tamperproofTemplateMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setVastIpBlacklistInFileMaxCount(Long vastIpBlacklistInFileMaxCount) {
            this.vastIpBlacklistInFileMaxCount = vastIpBlacklistInFileMaxCount;
            return this;
        }
        public Long getVastIpBlacklistInFileMaxCount() {
            return this.vastIpBlacklistInFileMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setVastIpBlacklistInOperationMaxCount(Long vastIpBlacklistInOperationMaxCount) {
            this.vastIpBlacklistInOperationMaxCount = vastIpBlacklistInOperationMaxCount;
            return this;
        }
        public Long getVastIpBlacklistInOperationMaxCount() {
            return this.vastIpBlacklistInOperationMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setVastIpBlacklistMaxCount(Long vastIpBlacklistMaxCount) {
            this.vastIpBlacklistMaxCount = vastIpBlacklistMaxCount;
            return this;
        }
        public Long getVastIpBlacklistMaxCount() {
            return this.vastIpBlacklistMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setWhitelist(Boolean whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public Boolean getWhitelist() {
            return this.whitelist;
        }

        public DescribeInstanceResponseBodyDetails setWhitelistLogical(String whitelistLogical) {
            this.whitelistLogical = whitelistLogical;
            return this;
        }
        public String getWhitelistLogical() {
            return this.whitelistLogical;
        }

        public DescribeInstanceResponseBodyDetails setWhitelistRuleCondition(String whitelistRuleCondition) {
            this.whitelistRuleCondition = whitelistRuleCondition;
            return this;
        }
        public String getWhitelistRuleCondition() {
            return this.whitelistRuleCondition;
        }

        public DescribeInstanceResponseBodyDetails setWhitelistRuleInTemplateMaxCount(Long whitelistRuleInTemplateMaxCount) {
            this.whitelistRuleInTemplateMaxCount = whitelistRuleInTemplateMaxCount;
            return this;
        }
        public Long getWhitelistRuleInTemplateMaxCount() {
            return this.whitelistRuleInTemplateMaxCount;
        }

        public DescribeInstanceResponseBodyDetails setWhitelistTemplateMaxCount(Long whitelistTemplateMaxCount) {
            this.whitelistTemplateMaxCount = whitelistTemplateMaxCount;
            return this;
        }
        public Long getWhitelistTemplateMaxCount() {
            return this.whitelistTemplateMaxCount;
        }

    }

}
