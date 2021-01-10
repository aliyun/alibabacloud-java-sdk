// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutGlobalappResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<QueryLinkeBahamutGlobalappResponseBodyResult> result;

    @NameInMap("Paginator")
    public QueryLinkeBahamutGlobalappResponseBodyPaginator paginator;

    public static QueryLinkeBahamutGlobalappResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutGlobalappResponseBody self = new QueryLinkeBahamutGlobalappResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutGlobalappResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutGlobalappResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutGlobalappResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutGlobalappResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutGlobalappResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutGlobalappResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutGlobalappResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutGlobalappResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutGlobalappResponseBody setResult(java.util.List<QueryLinkeBahamutGlobalappResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<QueryLinkeBahamutGlobalappResponseBodyResult> getResult() {
        return this.result;
    }

    public QueryLinkeBahamutGlobalappResponseBody setPaginator(QueryLinkeBahamutGlobalappResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public QueryLinkeBahamutGlobalappResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public static class QueryLinkeBahamutGlobalappResponseBodyResult extends TeaModel {
        @NameInMap("AppGroup")
        public String appGroup;

        @NameInMap("AppType")
        public String appType;

        @NameInMap("ArchDomainExternalId")
        public String archDomainExternalId;

        @NameInMap("ArchDomainName")
        public String archDomainName;

        @NameInMap("AutoBetaSitDeploy")
        public Boolean autoBetaSitDeploy;

        @NameInMap("BaseJarInfo")
        public String baseJarInfo;

        @NameInMap("BetterQuality")
        public Boolean betterQuality;

        @NameInMap("CommonRiskPointInspection")
        public Boolean commonRiskPointInspection;

        @NameInMap("CoverageBaseline")
        public String coverageBaseline;

        @NameInMap("CoverageFromThirdPlatform")
        public Boolean coverageFromThirdPlatform;

        @NameInMap("CrucialApp")
        public Boolean crucialApp;

        @NameInMap("DevLang")
        public String devLang;

        @NameInMap("DevServerDeployment")
        public Boolean devServerDeployment;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("GitLabGroupName")
        public String gitLabGroupName;

        @NameInMap("GitLabHttpUrl")
        public String gitLabHttpUrl;

        @NameInMap("GitLabRepoName")
        public String gitLabRepoName;

        @NameInMap("GitLabSshUrl")
        public String gitLabSshUrl;

        @NameInMap("GreyEmergencyRelease")
        public Boolean greyEmergencyRelease;

        @NameInMap("GreyRelease")
        public Boolean greyRelease;

        @NameInMap("LegacyConflict")
        public String legacyConflict;

        @NameInMap("Level")
        public String level;

        @NameInMap("LockBranch")
        public Boolean lockBranch;

        @NameInMap("Name")
        public String name;

        @NameInMap("NetRelease")
        public Boolean netRelease;

        @NameInMap("OptionList")
        public String optionList;

        @NameInMap("ParentArchDomainExternalId")
        public String parentArchDomainExternalId;

        @NameInMap("ParentArchDomainName")
        public String parentArchDomainName;

        @NameInMap("PriPubOwner")
        public String priPubOwner;

        @NameInMap("ReleaseDomainName")
        public String releaseDomainName;

        @NameInMap("ReleaseType")
        public String releaseType;

        @NameInMap("RiskAssessNeeded")
        public Boolean riskAssessNeeded;

        @NameInMap("ServerDeployment")
        public Boolean serverDeployment;

        @NameInMap("SitServerDeployment")
        public Boolean sitServerDeployment;

        @NameInMap("Status")
        public String status;

        @NameInMap("TcCenterPassRate")
        public Boolean tcCenterPassRate;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TrunkMrNeedDefectOrReq")
        public Boolean trunkMrNeedDefectOrReq;

        @NameInMap("UseTenantQualityRule")
        public Boolean useTenantQualityRule;

        @NameInMap("Vcs")
        public String vcs;

        @NameInMap("ZoneMode")
        public String zoneMode;

        @NameInMap("CustomQualityDisplay")
        public java.util.List<String> customQualityDisplay;

        @NameInMap("DevOwners")
        public java.util.List<String> devOwners;

        @NameInMap("DevOwnerUsers")
        public java.util.List<String> devOwnerUsers;

        @NameInMap("Members")
        public java.util.List<String> members;

        @NameInMap("MemberNames")
        public java.util.List<String> memberNames;

        @NameInMap("Modules")
        public java.util.List<String> modules;

        @NameInMap("Pes")
        public java.util.List<String> pes;

        @NameInMap("ProductOwners")
        public java.util.List<String> productOwners;

        @NameInMap("ProductTestOwners")
        public java.util.List<String> productTestOwners;

        @NameInMap("PubOwners")
        public java.util.List<String> pubOwners;

        @NameInMap("QualityRules")
        public java.util.List<String> qualityRules;

        @NameInMap("TestOwners")
        public java.util.List<String> testOwners;

        public static QueryLinkeBahamutGlobalappResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutGlobalappResponseBodyResult self = new QueryLinkeBahamutGlobalappResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setAppGroup(String appGroup) {
            this.appGroup = appGroup;
            return this;
        }
        public String getAppGroup() {
            return this.appGroup;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setAppType(String appType) {
            this.appType = appType;
            return this;
        }
        public String getAppType() {
            return this.appType;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setArchDomainExternalId(String archDomainExternalId) {
            this.archDomainExternalId = archDomainExternalId;
            return this;
        }
        public String getArchDomainExternalId() {
            return this.archDomainExternalId;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setArchDomainName(String archDomainName) {
            this.archDomainName = archDomainName;
            return this;
        }
        public String getArchDomainName() {
            return this.archDomainName;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setAutoBetaSitDeploy(Boolean autoBetaSitDeploy) {
            this.autoBetaSitDeploy = autoBetaSitDeploy;
            return this;
        }
        public Boolean getAutoBetaSitDeploy() {
            return this.autoBetaSitDeploy;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setBaseJarInfo(String baseJarInfo) {
            this.baseJarInfo = baseJarInfo;
            return this;
        }
        public String getBaseJarInfo() {
            return this.baseJarInfo;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setBetterQuality(Boolean betterQuality) {
            this.betterQuality = betterQuality;
            return this;
        }
        public Boolean getBetterQuality() {
            return this.betterQuality;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setCommonRiskPointInspection(Boolean commonRiskPointInspection) {
            this.commonRiskPointInspection = commonRiskPointInspection;
            return this;
        }
        public Boolean getCommonRiskPointInspection() {
            return this.commonRiskPointInspection;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setCoverageBaseline(String coverageBaseline) {
            this.coverageBaseline = coverageBaseline;
            return this;
        }
        public String getCoverageBaseline() {
            return this.coverageBaseline;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setCoverageFromThirdPlatform(Boolean coverageFromThirdPlatform) {
            this.coverageFromThirdPlatform = coverageFromThirdPlatform;
            return this;
        }
        public Boolean getCoverageFromThirdPlatform() {
            return this.coverageFromThirdPlatform;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setCrucialApp(Boolean crucialApp) {
            this.crucialApp = crucialApp;
            return this;
        }
        public Boolean getCrucialApp() {
            return this.crucialApp;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setDevLang(String devLang) {
            this.devLang = devLang;
            return this;
        }
        public String getDevLang() {
            return this.devLang;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setDevServerDeployment(Boolean devServerDeployment) {
            this.devServerDeployment = devServerDeployment;
            return this;
        }
        public Boolean getDevServerDeployment() {
            return this.devServerDeployment;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setGitLabGroupName(String gitLabGroupName) {
            this.gitLabGroupName = gitLabGroupName;
            return this;
        }
        public String getGitLabGroupName() {
            return this.gitLabGroupName;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setGitLabHttpUrl(String gitLabHttpUrl) {
            this.gitLabHttpUrl = gitLabHttpUrl;
            return this;
        }
        public String getGitLabHttpUrl() {
            return this.gitLabHttpUrl;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setGitLabRepoName(String gitLabRepoName) {
            this.gitLabRepoName = gitLabRepoName;
            return this;
        }
        public String getGitLabRepoName() {
            return this.gitLabRepoName;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setGitLabSshUrl(String gitLabSshUrl) {
            this.gitLabSshUrl = gitLabSshUrl;
            return this;
        }
        public String getGitLabSshUrl() {
            return this.gitLabSshUrl;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setGreyEmergencyRelease(Boolean greyEmergencyRelease) {
            this.greyEmergencyRelease = greyEmergencyRelease;
            return this;
        }
        public Boolean getGreyEmergencyRelease() {
            return this.greyEmergencyRelease;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setGreyRelease(Boolean greyRelease) {
            this.greyRelease = greyRelease;
            return this;
        }
        public Boolean getGreyRelease() {
            return this.greyRelease;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setLegacyConflict(String legacyConflict) {
            this.legacyConflict = legacyConflict;
            return this;
        }
        public String getLegacyConflict() {
            return this.legacyConflict;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setLockBranch(Boolean lockBranch) {
            this.lockBranch = lockBranch;
            return this;
        }
        public Boolean getLockBranch() {
            return this.lockBranch;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setNetRelease(Boolean netRelease) {
            this.netRelease = netRelease;
            return this;
        }
        public Boolean getNetRelease() {
            return this.netRelease;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setOptionList(String optionList) {
            this.optionList = optionList;
            return this;
        }
        public String getOptionList() {
            return this.optionList;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setParentArchDomainExternalId(String parentArchDomainExternalId) {
            this.parentArchDomainExternalId = parentArchDomainExternalId;
            return this;
        }
        public String getParentArchDomainExternalId() {
            return this.parentArchDomainExternalId;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setParentArchDomainName(String parentArchDomainName) {
            this.parentArchDomainName = parentArchDomainName;
            return this;
        }
        public String getParentArchDomainName() {
            return this.parentArchDomainName;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setPriPubOwner(String priPubOwner) {
            this.priPubOwner = priPubOwner;
            return this;
        }
        public String getPriPubOwner() {
            return this.priPubOwner;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setReleaseDomainName(String releaseDomainName) {
            this.releaseDomainName = releaseDomainName;
            return this;
        }
        public String getReleaseDomainName() {
            return this.releaseDomainName;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setReleaseType(String releaseType) {
            this.releaseType = releaseType;
            return this;
        }
        public String getReleaseType() {
            return this.releaseType;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setRiskAssessNeeded(Boolean riskAssessNeeded) {
            this.riskAssessNeeded = riskAssessNeeded;
            return this;
        }
        public Boolean getRiskAssessNeeded() {
            return this.riskAssessNeeded;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setServerDeployment(Boolean serverDeployment) {
            this.serverDeployment = serverDeployment;
            return this;
        }
        public Boolean getServerDeployment() {
            return this.serverDeployment;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setSitServerDeployment(Boolean sitServerDeployment) {
            this.sitServerDeployment = sitServerDeployment;
            return this;
        }
        public Boolean getSitServerDeployment() {
            return this.sitServerDeployment;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setTcCenterPassRate(Boolean tcCenterPassRate) {
            this.tcCenterPassRate = tcCenterPassRate;
            return this;
        }
        public Boolean getTcCenterPassRate() {
            return this.tcCenterPassRate;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setTrunkMrNeedDefectOrReq(Boolean trunkMrNeedDefectOrReq) {
            this.trunkMrNeedDefectOrReq = trunkMrNeedDefectOrReq;
            return this;
        }
        public Boolean getTrunkMrNeedDefectOrReq() {
            return this.trunkMrNeedDefectOrReq;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setUseTenantQualityRule(Boolean useTenantQualityRule) {
            this.useTenantQualityRule = useTenantQualityRule;
            return this;
        }
        public Boolean getUseTenantQualityRule() {
            return this.useTenantQualityRule;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setVcs(String vcs) {
            this.vcs = vcs;
            return this;
        }
        public String getVcs() {
            return this.vcs;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setZoneMode(String zoneMode) {
            this.zoneMode = zoneMode;
            return this;
        }
        public String getZoneMode() {
            return this.zoneMode;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setCustomQualityDisplay(java.util.List<String> customQualityDisplay) {
            this.customQualityDisplay = customQualityDisplay;
            return this;
        }
        public java.util.List<String> getCustomQualityDisplay() {
            return this.customQualityDisplay;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setDevOwners(java.util.List<String> devOwners) {
            this.devOwners = devOwners;
            return this;
        }
        public java.util.List<String> getDevOwners() {
            return this.devOwners;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setDevOwnerUsers(java.util.List<String> devOwnerUsers) {
            this.devOwnerUsers = devOwnerUsers;
            return this;
        }
        public java.util.List<String> getDevOwnerUsers() {
            return this.devOwnerUsers;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setMemberNames(java.util.List<String> memberNames) {
            this.memberNames = memberNames;
            return this;
        }
        public java.util.List<String> getMemberNames() {
            return this.memberNames;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setModules(java.util.List<String> modules) {
            this.modules = modules;
            return this;
        }
        public java.util.List<String> getModules() {
            return this.modules;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setPes(java.util.List<String> pes) {
            this.pes = pes;
            return this;
        }
        public java.util.List<String> getPes() {
            return this.pes;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setProductOwners(java.util.List<String> productOwners) {
            this.productOwners = productOwners;
            return this;
        }
        public java.util.List<String> getProductOwners() {
            return this.productOwners;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setProductTestOwners(java.util.List<String> productTestOwners) {
            this.productTestOwners = productTestOwners;
            return this;
        }
        public java.util.List<String> getProductTestOwners() {
            return this.productTestOwners;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setPubOwners(java.util.List<String> pubOwners) {
            this.pubOwners = pubOwners;
            return this;
        }
        public java.util.List<String> getPubOwners() {
            return this.pubOwners;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setQualityRules(java.util.List<String> qualityRules) {
            this.qualityRules = qualityRules;
            return this;
        }
        public java.util.List<String> getQualityRules() {
            return this.qualityRules;
        }

        public QueryLinkeBahamutGlobalappResponseBodyResult setTestOwners(java.util.List<String> testOwners) {
            this.testOwners = testOwners;
            return this;
        }
        public java.util.List<String> getTestOwners() {
            return this.testOwners;
        }

    }

    public static class QueryLinkeBahamutGlobalappResponseBodyPaginator extends TeaModel {
        @NameInMap("ItemCount")
        public Long itemCount;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        public static QueryLinkeBahamutGlobalappResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutGlobalappResponseBodyPaginator self = new QueryLinkeBahamutGlobalappResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutGlobalappResponseBodyPaginator setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public QueryLinkeBahamutGlobalappResponseBodyPaginator setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public QueryLinkeBahamutGlobalappResponseBodyPaginator setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public QueryLinkeBahamutGlobalappResponseBodyPaginator setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
