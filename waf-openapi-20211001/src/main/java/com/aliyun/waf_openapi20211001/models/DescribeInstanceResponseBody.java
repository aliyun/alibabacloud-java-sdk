// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    @NameInMap("Details")
    public DescribeInstanceResponseBodyDetails details;

    @NameInMap("Edition")
    public String edition;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InDebt")
    public String inDebt;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartTime")
    public Long startTime;

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
        @NameInMap("AclRuleMaxIpCount")
        public Long aclRuleMaxIpCount;

        @NameInMap("AntiScan")
        public Boolean antiScan;

        @NameInMap("AntiScanTemplateMaxCount")
        public Long antiScanTemplateMaxCount;

        @NameInMap("BackendMaxCount")
        public Long backendMaxCount;

        @NameInMap("BaseWafGroup")
        public Boolean baseWafGroup;

        @NameInMap("BaseWafGroupRuleInTemplateMaxCount")
        public Long baseWafGroupRuleInTemplateMaxCount;

        @NameInMap("BaseWafGroupRuleTemplateMaxCount")
        public Long baseWafGroupRuleTemplateMaxCount;

        @NameInMap("Bot")
        public Boolean bot;

        @NameInMap("BotApp")
        public String botApp;

        @NameInMap("BotTemplateMaxCount")
        public Long botTemplateMaxCount;

        @NameInMap("BotWeb")
        public String botWeb;

        @NameInMap("CnameResourceMaxCount")
        public Long cnameResourceMaxCount;

        @NameInMap("CustomResponse")
        public Boolean customResponse;

        @NameInMap("CustomResponseRuleInTemplateMaxCount")
        public Long customResponseRuleInTemplateMaxCount;

        @NameInMap("CustomResponseTemplateMaxCount")
        public Long customResponseTemplateMaxCount;

        @NameInMap("CustomRule")
        public Boolean customRule;

        @NameInMap("CustomRuleAction")
        public String customRuleAction;

        @NameInMap("CustomRuleCondition")
        public String customRuleCondition;

        @NameInMap("CustomRuleInTemplateMaxCount")
        public Long customRuleInTemplateMaxCount;

        @NameInMap("CustomRuleRatelimitor")
        public String customRuleRatelimitor;

        @NameInMap("CustomRuleTemplateMaxCount")
        public Long customRuleTemplateMaxCount;

        @NameInMap("DefenseGroupMaxCount")
        public Long defenseGroupMaxCount;

        @NameInMap("DefenseObjectInGroupMaxCount")
        public Long defenseObjectInGroupMaxCount;

        @NameInMap("DefenseObjectInTemplateMaxCount")
        public Long defenseObjectInTemplateMaxCount;

        @NameInMap("DefenseObjectMaxCount")
        public Long defenseObjectMaxCount;

        @NameInMap("Dlp")
        public Boolean dlp;

        @NameInMap("DlpRuleInTemplateMaxCount")
        public Long dlpRuleInTemplateMaxCount;

        @NameInMap("DlpTemplateMaxCount")
        public Long dlpTemplateMaxCount;

        @NameInMap("ExclusiveIp")
        public Boolean exclusiveIp;

        @NameInMap("Gslb")
        public Boolean gslb;

        @NameInMap("HttpPorts")
        public String httpPorts;

        @NameInMap("HttpsPorts")
        public String httpsPorts;

        @NameInMap("IpBlacklist")
        public Boolean ipBlacklist;

        @NameInMap("IpBlacklistIpInRuleMaxCount")
        public Long ipBlacklistIpInRuleMaxCount;

        @NameInMap("IpBlacklistRuleInTemplateMaxCount")
        public Long ipBlacklistRuleInTemplateMaxCount;

        @NameInMap("IpBlacklistTemplateMaxCount")
        public Long ipBlacklistTemplateMaxCount;

        @NameInMap("Ipv6")
        public Boolean ipv6;

        @NameInMap("LogService")
        public Boolean logService;

        @NameInMap("MajorProtection")
        public Boolean majorProtection;

        @NameInMap("MajorProtectionTemplateMaxCount")
        public Long majorProtectionTemplateMaxCount;

        @NameInMap("Tamperproof")
        public Boolean tamperproof;

        @NameInMap("TamperproofRuleInTemplateMaxCount")
        public Long tamperproofRuleInTemplateMaxCount;

        @NameInMap("TamperproofTemplateMaxCount")
        public Long tamperproofTemplateMaxCount;

        @NameInMap("VastIpBlacklistInFileMaxCount")
        public Long vastIpBlacklistInFileMaxCount;

        @NameInMap("VastIpBlacklistInOperationMaxCount")
        public Long vastIpBlacklistInOperationMaxCount;

        @NameInMap("VastIpBlacklistMaxCount")
        public Long vastIpBlacklistMaxCount;

        @NameInMap("Whitelist")
        public Boolean whitelist;

        @NameInMap("WhitelistLogical")
        public String whitelistLogical;

        @NameInMap("WhitelistRuleCondition")
        public String whitelistRuleCondition;

        @NameInMap("WhitelistRuleInTemplateMaxCount")
        public Long whitelistRuleInTemplateMaxCount;

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
