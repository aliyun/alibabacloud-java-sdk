// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    /**
     * <p>The details of the WAF instance.</p>
     */
    @NameInMap("Details")
    public DescribeInstanceResponseBodyDetails details;

    /**
     * <p>The edition of the WAF instance.</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The expiration time of the WAF instance.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Indicates whether the WAF instance has overdue payments. Valid values:</p>
     * <br>
     * <p>*   **0:** The WAF instance has overdue payments.</p>
     * <p>*   **1:** The WAF instance does not have overdue payments.</p>
     * <br>
     * <p>>  This parameter is returned only when the value of the **PayType** parameter is **POSTPAY**.</p>
     */
    @NameInMap("InDebt")
    public String inDebt;

    /**
     * <p>The ID of the WAF instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The billing method of the WAF instance. Valid values:</p>
     * <br>
     * <p>*   **POSTPAY:** The WAF instance uses the pay-as-you-go billing method.</p>
     * <p>*   **PREPAY:** The WAF instance uses the subscription billing method.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou:** the Chinese mainland</p>
     * <p>*   **ap-southeast-1:** outside the Chinese mainland.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The purchase time of the WAF instance. The time is in the UNIX timestamp format. The time is displayed in UTC. Unit: milliseconds.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The status of the WAF instance. Valid values:</p>
     * <br>
     * <p>*   **1:** The WAF instance is in a normal state.</p>
     * <p>*   **2:** The WAF instance has expired.</p>
     * <p>*   **3:** The WAF instance has been released.</p>
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
         * <p>The maximum number of IP addresses that can be added to the match content of a match condition. For more information, see [Match conditions](~~374354~~).</p>
         */
        @NameInMap("AclRuleMaxIpCount")
        public Long aclRuleMaxIpCount;

        /**
         * <p>Indicates whether the scan protection module is supported. Valid values:</p>
         * <br>
         * <p>*   **true:** The scan protection module is supported.</p>
         * <p>*   **false:** The scan protection module is not supported.</p>
         */
        @NameInMap("AntiScan")
        public Boolean antiScan;

        /**
         * <p>The maximum number of scan protection rule templates that can be configured.</p>
         */
        @NameInMap("AntiScanTemplateMaxCount")
        public Long antiScanTemplateMaxCount;

        /**
         * <p>The maximum number of back-to-origin IP addresses that can be configured.</p>
         */
        @NameInMap("BackendMaxCount")
        public Long backendMaxCount;

        /**
         * <p>Indicates whether the basic protection rule module is supported. Valid values:</p>
         * <br>
         * <p>*   **true:** The basic protection rule module is supported.</p>
         * <p>*   **false:** The basic protection rule module is not supported.</p>
         */
        @NameInMap("BaseWafGroup")
        public Boolean baseWafGroup;

        /**
         * <p>The maximum number of protection rules that can be included in a basic protection rule template.</p>
         */
        @NameInMap("BaseWafGroupRuleInTemplateMaxCount")
        public Long baseWafGroupRuleInTemplateMaxCount;

        /**
         * <p>The maximum number of basic protection rule templates that can be configured.</p>
         */
        @NameInMap("BaseWafGroupRuleTemplateMaxCount")
        public Long baseWafGroupRuleTemplateMaxCount;

        /**
         * <p>Indicates whether the bot management module is supported. Valid values:</p>
         * <br>
         * <p>*   **true:** The bot management module is supported.</p>
         * <p>*   **false:** The bot management module is not supported.</p>
         */
        @NameInMap("Bot")
        public Boolean bot;

        /**
         * <p>Indicates whether bot management for app protection is supported. Valid values:</p>
         * <br>
         * <p>*   **true:** Bot management for app protection is supported.</p>
         * <p>*   **false:** Bot management for app protection is not supported.</p>
         */
        @NameInMap("BotApp")
        public String botApp;

        /**
         * <p>The maximum number of bot management rule templates that can be configured.</p>
         */
        @NameInMap("BotTemplateMaxCount")
        public Long botTemplateMaxCount;

        /**
         * <p>Indicates whether bot management for website protection is supported. Valid values:</p>
         * <br>
         * <p>*   **true:** Bot management for website protection is supported.</p>
         * <p>*   **false:** Bot management for website protection is not supported.</p>
         */
        @NameInMap("BotWeb")
        public String botWeb;

        /**
         * <p>The maximum number of CNAMEs that can be added.</p>
         */
        @NameInMap("CnameResourceMaxCount")
        public Long cnameResourceMaxCount;

        /**
         * <p>Indicates whether the custom response module is supported. Valid values:</p>
         * <br>
         * <p>*   **true:** The custom response module is supported.</p>
         * <p>*   **false:** The custom response module is not supported.</p>
         */
        @NameInMap("CustomResponse")
        public Boolean customResponse;

        /**
         * <p>The maximum number of rules that can be included in a custom response rule template.</p>
         */
        @NameInMap("CustomResponseRuleInTemplateMaxCount")
        public Long customResponseRuleInTemplateMaxCount;

        /**
         * <p>The maximum number of custom response rule templates that can be configured.</p>
         */
        @NameInMap("CustomResponseTemplateMaxCount")
        public Long customResponseTemplateMaxCount;

        /**
         * <p>Indicates whether the custom rule module is supported. Valid values:</p>
         * <br>
         * <p>*   **true:** The custom rule module is supported.</p>
         * <p>*   **false:** The custom rule module is not supported.</p>
         */
        @NameInMap("CustomRule")
        public Boolean customRule;

        /**
         * <p>The action that can be included in a custom rule.</p>
         */
        @NameInMap("CustomRuleAction")
        public String customRuleAction;

        /**
         * <p>The match conditions that can be used in a custom rule. For more information, see **Match condition parameters** in the "**Parameters of custom rules (custom_acl)**" section in the [CreateDefenseRule](~~CreateDefenseRule~~) topic.</p>
         */
        @NameInMap("CustomRuleCondition")
        public String customRuleCondition;

        /**
         * <p>The maximum number of rules that can be included in a custom rule template.</p>
         */
        @NameInMap("CustomRuleInTemplateMaxCount")
        public Long customRuleInTemplateMaxCount;

        /**
         * <p>The statistical object for rate limiting in a custom rule.</p>
         */
        @NameInMap("CustomRuleRatelimitor")
        public String customRuleRatelimitor;

        /**
         * <p>The maximum number of custom rule templates that can be configured.</p>
         */
        @NameInMap("CustomRuleTemplateMaxCount")
        public Long customRuleTemplateMaxCount;

        /**
         * <p>The maximum number of protected object groups that can be configured.</p>
         */
        @NameInMap("DefenseGroupMaxCount")
        public Long defenseGroupMaxCount;

        /**
         * <p>The maximum number of protected objects that can be included in a protected object group.</p>
         */
        @NameInMap("DefenseObjectInGroupMaxCount")
        public Long defenseObjectInGroupMaxCount;

        /**
         * <p>The maximum number of protected objects to which a protection rule template can be applied.</p>
         */
        @NameInMap("DefenseObjectInTemplateMaxCount")
        public Long defenseObjectInTemplateMaxCount;

        /**
         * <p>The maximum number of protected objects that can be configured.</p>
         */
        @NameInMap("DefenseObjectMaxCount")
        public Long defenseObjectMaxCount;

        /**
         * <p>Indicates whether the data leakage prevention module is supported. Valid values:</p>
         * <br>
         * <p>*   **true:** The data leakage prevention module is supported.</p>
         * <p>*   **false:** The data leakage prevention module is not supported.</p>
         */
        @NameInMap("Dlp")
        public Boolean dlp;

        /**
         * <p>The maximum number of rules that can be included in a data leakage prevention rule template.</p>
         */
        @NameInMap("DlpRuleInTemplateMaxCount")
        public Long dlpRuleInTemplateMaxCount;

        /**
         * <p>The maximum number of data leakage prevention rule templates that can be configured.</p>
         */
        @NameInMap("DlpTemplateMaxCount")
        public Long dlpTemplateMaxCount;

        /**
         * <p>Indicates whether exclusive IP addresses are supported. Valid values:</p>
         * <br>
         * <p>*   **true:** Exclusive IP addresses are supported.</p>
         * <p>*   **false:** Exclusive IP addresses are not supported.</p>
         */
        @NameInMap("ExclusiveIp")
        public Boolean exclusiveIp;

        /**
         * <p>Indicates whether global server load balancing (GSLB) is supported. Valid values:</p>
         * <br>
         * <p>*   **true:** GSLB is supported.</p>
         * <p>*   **false:** GSLB is not supported.</p>
         */
        @NameInMap("Gslb")
        public Boolean gslb;

        /**
         * <p>The HTTP port range that is supported. For more information, see [View supported ports](~~385578~~).</p>
         */
        @NameInMap("HttpPorts")
        public String httpPorts;

        /**
         * <p>The HTTPS port range that is supported. For more information, see [View supported ports](~~385578~~).</p>
         */
        @NameInMap("HttpsPorts")
        public String httpsPorts;

        /**
         * <p>Indicates whether the IP address blacklist module is supported. Valid values:</p>
         * <br>
         * <p>*   **true:** The IP address blacklist module is supported.</p>
         * <p>*   **false:** The IP address blacklist module is not supported.</p>
         */
        @NameInMap("IpBlacklist")
        public Boolean ipBlacklist;

        /**
         * <p>The maximum number of IP addresses that can be added to an IP address blacklist rule.</p>
         */
        @NameInMap("IpBlacklistIpInRuleMaxCount")
        public Long ipBlacklistIpInRuleMaxCount;

        /**
         * <p>The maximum number of rules that can be included in an IP address blacklist rule template.</p>
         */
        @NameInMap("IpBlacklistRuleInTemplateMaxCount")
        public Long ipBlacklistRuleInTemplateMaxCount;

        /**
         * <p>The maximum number of IP address blacklist rule templates that can be configured.</p>
         */
        @NameInMap("IpBlacklistTemplateMaxCount")
        public Long ipBlacklistTemplateMaxCount;

        /**
         * <p>Indicates whether IPv6 is supported. Valid values:</p>
         * <br>
         * <p>*   **true:** IPv6 is supported.</p>
         * <p>*   **false:** IPv6 is not supported.</p>
         */
        @NameInMap("Ipv6")
        public Boolean ipv6;

        /**
         * <p>Indicates whether the log collection feature is supported. Valid values:</p>
         * <br>
         * <p>*   **true:** The log collection feature is supported.</p>
         * <p>*   **false:** The log collection feature is not supported.</p>
         */
        @NameInMap("LogService")
        public Boolean logService;

        /**
         * <p>Indicates whether major event protection is supported. Valid values:</p>
         * <br>
         * <p>*   **true:** Major event protection is supported.</p>
         * <p>*   **false:** Major event protection is not supported.</p>
         */
        @NameInMap("MajorProtection")
        public Boolean majorProtection;

        /**
         * <p>The maximum number of major event protection rule templates that can be configured.</p>
         */
        @NameInMap("MajorProtectionTemplateMaxCount")
        public Long majorProtectionTemplateMaxCount;

        /**
         * <p>Indicates whether the website tamper-proofing module is supported. Valid values:</p>
         * <br>
         * <p>*   **true:** The website tamper-proofing module is supported.</p>
         * <p>*   **false:** The website tamper-proofing module is not supported.</p>
         */
        @NameInMap("Tamperproof")
        public Boolean tamperproof;

        /**
         * <p>The maximum number of rules that can be included in a website tamper-proofing rule template.</p>
         */
        @NameInMap("TamperproofRuleInTemplateMaxCount")
        public Long tamperproofRuleInTemplateMaxCount;

        /**
         * <p>The maximum number of website tamper-proofing rule templates that can be configured.</p>
         */
        @NameInMap("TamperproofTemplateMaxCount")
        public Long tamperproofTemplateMaxCount;

        /**
         * <p>The maximum number of IP addresses or CIDR blocks that can be added to an IP address blacklist in a batch.</p>
         */
        @NameInMap("VastIpBlacklistInFileMaxCount")
        public Long vastIpBlacklistInFileMaxCount;

        /**
         * <p>The maximum number of IP addresses or CIDR blocks that can be added to an IP address blacklist on a page.</p>
         */
        @NameInMap("VastIpBlacklistInOperationMaxCount")
        public Long vastIpBlacklistInOperationMaxCount;

        /**
         * <p>The maximum number of IP addresses or CIDR blocks that can be added to an IP address blacklist per Alibaba Cloud account.</p>
         */
        @NameInMap("VastIpBlacklistMaxCount")
        public Long vastIpBlacklistMaxCount;

        /**
         * <p>Indicates whether the whitelist module is supported. Valid values:</p>
         * <br>
         * <p>*   **true:** The whitelist module is supported.</p>
         * <p>*   **false:** The whitelist module is not supported.</p>
         */
        @NameInMap("Whitelist")
        public Boolean whitelist;

        /**
         * <p>The logical operators that can be used in a whitelist rule. For more information, see **Match condition parameters** in the "**Parameters of whitelist rules (whitelist)**" section in the [CreateDefenseRule](~~CreateDefenseRule~~) topic.</p>
         */
        @NameInMap("WhitelistLogical")
        public String whitelistLogical;

        /**
         * <p>The match fields that can be used in a whitelist rule. For more information, see **Match condition parameters** in the "**Parameters of whitelist rules (whitelist)**" section in the [CreateDefenseRule](~~CreateDefenseRule~~) topic.</p>
         */
        @NameInMap("WhitelistRuleCondition")
        public String whitelistRuleCondition;

        /**
         * <p>The maximum number of rules that can be included in a whitelist rule template.</p>
         */
        @NameInMap("WhitelistRuleInTemplateMaxCount")
        public Long whitelistRuleInTemplateMaxCount;

        /**
         * <p>The maximum number of whitelist rule templates that can be configured.</p>
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

        public DescribeInstanceResponseBodyDetails setExclusiveIp(Boolean exclusiveIp) {
            this.exclusiveIp = exclusiveIp;
            return this;
        }
        public Boolean getExclusiveIp() {
            return this.exclusiveIp;
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
