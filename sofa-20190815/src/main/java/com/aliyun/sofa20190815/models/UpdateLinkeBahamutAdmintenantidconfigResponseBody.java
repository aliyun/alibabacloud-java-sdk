// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAdmintenantidconfigResponseBody extends TeaModel {
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
    public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult result;

    public static UpdateLinkeBahamutAdmintenantidconfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAdmintenantidconfigResponseBody self = new UpdateLinkeBahamutAdmintenantidconfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAdmintenantidconfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeBahamutAdmintenantidconfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeBahamutAdmintenantidconfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeBahamutAdmintenantidconfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateLinkeBahamutAdmintenantidconfigResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public UpdateLinkeBahamutAdmintenantidconfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLinkeBahamutAdmintenantidconfigResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeBahamutAdmintenantidconfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateLinkeBahamutAdmintenantidconfigResponseBody setResult(UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult extends TeaModel {
        @NameInMap("AntflowEnabled")
        public Boolean antflowEnabled;

        @NameInMap("AppChangeNeedNotice")
        public String appChangeNeedNotice;

        @NameInMap("AppInitMeta")
        public String appInitMeta;

        @NameInMap("AutoAppReleaseStatus")
        public Boolean autoAppReleaseStatus;

        @NameInMap("AutoReleaseMachine")
        public Boolean autoReleaseMachine;

        @NameInMap("AutoUnbindMachine")
        public Boolean autoUnbindMachine;

        @NameInMap("BaseJarInfo")
        public String baseJarInfo;

        @NameInMap("CheckAntWatchRiskControl")
        public Boolean checkAntWatchRiskControl;

        @NameInMap("CheckRunningPreBuildTask")
        public Boolean checkRunningPreBuildTask;

        @NameInMap("Created")
        public Long created;

        @NameInMap("CreateMrWhenMergeConflicts")
        public Boolean createMrWhenMergeConflicts;

        @NameInMap("CreateOrImportAppNeedApproval")
        public Boolean createOrImportAppNeedApproval;

        @NameInMap("CrossCloud")
        public Boolean crossCloud;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("GetSecretFromLinku")
        public Boolean getSecretFromLinku;

        @NameInMap("GitLabAccount")
        public String gitLabAccount;

        @NameInMap("GitLabPrivateToken")
        public String gitLabPrivateToken;

        @NameInMap("GitLabSite")
        public String gitLabSite;

        @NameInMap("GitLabUser")
        public String gitLabUser;

        @NameInMap("HighAvailabilityEnabled")
        public Boolean highAvailabilityEnabled;

        @NameInMap("Id")
        public String id;

        @NameInMap("JarEnabled")
        public Boolean jarEnabled;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("LinkcApiHost")
        public String linkcApiHost;

        @NameInMap("LinkcFrontHost")
        public String linkcFrontHost;

        @NameInMap("LinksEnable")
        public Boolean linksEnable;

        @NameInMap("LinktFrontHost")
        public String linktFrontHost;

        @NameInMap("MergeRequestEnabled")
        public Boolean mergeRequestEnabled;

        @NameInMap("MvnJarInfo")
        public String mvnJarInfo;

        @NameInMap("MyCodeCenterHost")
        public String myCodeCenterHost;

        @NameInMap("OnexMode")
        public Boolean onexMode;

        @NameInMap("OriginOSSConfig")
        public String originOSSConfig;

        @NameInMap("OssConfig")
        public String ossConfig;

        @NameInMap("PreConfirmArchDomainMap")
        public String preConfirmArchDomainMap;

        @NameInMap("QualityIndices")
        public String qualityIndices;

        @NameInMap("RealGitLabSite")
        public String realGitLabSite;

        @NameInMap("ReleaseControlEnabled")
        public Boolean releaseControlEnabled;

        @NameInMap("SettingsFile")
        public String settingsFile;

        @NameInMap("SkipPreCheck")
        public Boolean skipPreCheck;

        @NameInMap("StartAccCallback")
        public Boolean startAccCallback;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Tokens")
        public String tokens;

        @NameInMap("UpdateAppMetaWhenSync")
        public Boolean updateAppMetaWhenSync;

        @NameInMap("UseAppReleaseView")
        public Boolean useAppReleaseView;

        @NameInMap("UseBaselineToRelease")
        public Boolean useBaselineToRelease;

        @NameInMap("UseCustomOss")
        public Boolean useCustomOss;

        @NameInMap("UseNewCloudAppImportView")
        public Boolean useNewCloudAppImportView;

        @NameInMap("UseNewPrePubEnvIdList")
        public Boolean useNewPrePubEnvIdList;

        @NameInMap("UseNewThirdPartyWay")
        public Boolean useNewThirdPartyWay;

        @NameInMap("UseOldFabricPreCheck")
        public Boolean useOldFabricPreCheck;

        @NameInMap("UseShareMiddleware")
        public Boolean useShareMiddleware;

        @NameInMap("WebHookUrl")
        public String webHookUrl;

        @NameInMap("DefaultQualityRules")
        public java.util.List<String> defaultQualityRules;

        @NameInMap("GitlabSitePrefixs")
        public java.util.List<String> gitlabSitePrefixs;

        public static UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult self = new UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setAntflowEnabled(Boolean antflowEnabled) {
            this.antflowEnabled = antflowEnabled;
            return this;
        }
        public Boolean getAntflowEnabled() {
            return this.antflowEnabled;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setAppChangeNeedNotice(String appChangeNeedNotice) {
            this.appChangeNeedNotice = appChangeNeedNotice;
            return this;
        }
        public String getAppChangeNeedNotice() {
            return this.appChangeNeedNotice;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setAppInitMeta(String appInitMeta) {
            this.appInitMeta = appInitMeta;
            return this;
        }
        public String getAppInitMeta() {
            return this.appInitMeta;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setAutoAppReleaseStatus(Boolean autoAppReleaseStatus) {
            this.autoAppReleaseStatus = autoAppReleaseStatus;
            return this;
        }
        public Boolean getAutoAppReleaseStatus() {
            return this.autoAppReleaseStatus;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setAutoReleaseMachine(Boolean autoReleaseMachine) {
            this.autoReleaseMachine = autoReleaseMachine;
            return this;
        }
        public Boolean getAutoReleaseMachine() {
            return this.autoReleaseMachine;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setAutoUnbindMachine(Boolean autoUnbindMachine) {
            this.autoUnbindMachine = autoUnbindMachine;
            return this;
        }
        public Boolean getAutoUnbindMachine() {
            return this.autoUnbindMachine;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setBaseJarInfo(String baseJarInfo) {
            this.baseJarInfo = baseJarInfo;
            return this;
        }
        public String getBaseJarInfo() {
            return this.baseJarInfo;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setCheckAntWatchRiskControl(Boolean checkAntWatchRiskControl) {
            this.checkAntWatchRiskControl = checkAntWatchRiskControl;
            return this;
        }
        public Boolean getCheckAntWatchRiskControl() {
            return this.checkAntWatchRiskControl;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setCheckRunningPreBuildTask(Boolean checkRunningPreBuildTask) {
            this.checkRunningPreBuildTask = checkRunningPreBuildTask;
            return this;
        }
        public Boolean getCheckRunningPreBuildTask() {
            return this.checkRunningPreBuildTask;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setCreateMrWhenMergeConflicts(Boolean createMrWhenMergeConflicts) {
            this.createMrWhenMergeConflicts = createMrWhenMergeConflicts;
            return this;
        }
        public Boolean getCreateMrWhenMergeConflicts() {
            return this.createMrWhenMergeConflicts;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setCreateOrImportAppNeedApproval(Boolean createOrImportAppNeedApproval) {
            this.createOrImportAppNeedApproval = createOrImportAppNeedApproval;
            return this;
        }
        public Boolean getCreateOrImportAppNeedApproval() {
            return this.createOrImportAppNeedApproval;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setCrossCloud(Boolean crossCloud) {
            this.crossCloud = crossCloud;
            return this;
        }
        public Boolean getCrossCloud() {
            return this.crossCloud;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setGetSecretFromLinku(Boolean getSecretFromLinku) {
            this.getSecretFromLinku = getSecretFromLinku;
            return this;
        }
        public Boolean getGetSecretFromLinku() {
            return this.getSecretFromLinku;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setGitLabAccount(String gitLabAccount) {
            this.gitLabAccount = gitLabAccount;
            return this;
        }
        public String getGitLabAccount() {
            return this.gitLabAccount;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setGitLabPrivateToken(String gitLabPrivateToken) {
            this.gitLabPrivateToken = gitLabPrivateToken;
            return this;
        }
        public String getGitLabPrivateToken() {
            return this.gitLabPrivateToken;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setGitLabSite(String gitLabSite) {
            this.gitLabSite = gitLabSite;
            return this;
        }
        public String getGitLabSite() {
            return this.gitLabSite;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setGitLabUser(String gitLabUser) {
            this.gitLabUser = gitLabUser;
            return this;
        }
        public String getGitLabUser() {
            return this.gitLabUser;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setHighAvailabilityEnabled(Boolean highAvailabilityEnabled) {
            this.highAvailabilityEnabled = highAvailabilityEnabled;
            return this;
        }
        public Boolean getHighAvailabilityEnabled() {
            return this.highAvailabilityEnabled;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setJarEnabled(Boolean jarEnabled) {
            this.jarEnabled = jarEnabled;
            return this;
        }
        public Boolean getJarEnabled() {
            return this.jarEnabled;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setLinkcApiHost(String linkcApiHost) {
            this.linkcApiHost = linkcApiHost;
            return this;
        }
        public String getLinkcApiHost() {
            return this.linkcApiHost;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setLinkcFrontHost(String linkcFrontHost) {
            this.linkcFrontHost = linkcFrontHost;
            return this;
        }
        public String getLinkcFrontHost() {
            return this.linkcFrontHost;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setLinksEnable(Boolean linksEnable) {
            this.linksEnable = linksEnable;
            return this;
        }
        public Boolean getLinksEnable() {
            return this.linksEnable;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setLinktFrontHost(String linktFrontHost) {
            this.linktFrontHost = linktFrontHost;
            return this;
        }
        public String getLinktFrontHost() {
            return this.linktFrontHost;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setMergeRequestEnabled(Boolean mergeRequestEnabled) {
            this.mergeRequestEnabled = mergeRequestEnabled;
            return this;
        }
        public Boolean getMergeRequestEnabled() {
            return this.mergeRequestEnabled;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setMvnJarInfo(String mvnJarInfo) {
            this.mvnJarInfo = mvnJarInfo;
            return this;
        }
        public String getMvnJarInfo() {
            return this.mvnJarInfo;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setMyCodeCenterHost(String myCodeCenterHost) {
            this.myCodeCenterHost = myCodeCenterHost;
            return this;
        }
        public String getMyCodeCenterHost() {
            return this.myCodeCenterHost;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setOnexMode(Boolean onexMode) {
            this.onexMode = onexMode;
            return this;
        }
        public Boolean getOnexMode() {
            return this.onexMode;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setOriginOSSConfig(String originOSSConfig) {
            this.originOSSConfig = originOSSConfig;
            return this;
        }
        public String getOriginOSSConfig() {
            return this.originOSSConfig;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setOssConfig(String ossConfig) {
            this.ossConfig = ossConfig;
            return this;
        }
        public String getOssConfig() {
            return this.ossConfig;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setPreConfirmArchDomainMap(String preConfirmArchDomainMap) {
            this.preConfirmArchDomainMap = preConfirmArchDomainMap;
            return this;
        }
        public String getPreConfirmArchDomainMap() {
            return this.preConfirmArchDomainMap;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setQualityIndices(String qualityIndices) {
            this.qualityIndices = qualityIndices;
            return this;
        }
        public String getQualityIndices() {
            return this.qualityIndices;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setRealGitLabSite(String realGitLabSite) {
            this.realGitLabSite = realGitLabSite;
            return this;
        }
        public String getRealGitLabSite() {
            return this.realGitLabSite;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setReleaseControlEnabled(Boolean releaseControlEnabled) {
            this.releaseControlEnabled = releaseControlEnabled;
            return this;
        }
        public Boolean getReleaseControlEnabled() {
            return this.releaseControlEnabled;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setSettingsFile(String settingsFile) {
            this.settingsFile = settingsFile;
            return this;
        }
        public String getSettingsFile() {
            return this.settingsFile;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setSkipPreCheck(Boolean skipPreCheck) {
            this.skipPreCheck = skipPreCheck;
            return this;
        }
        public Boolean getSkipPreCheck() {
            return this.skipPreCheck;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setStartAccCallback(Boolean startAccCallback) {
            this.startAccCallback = startAccCallback;
            return this;
        }
        public Boolean getStartAccCallback() {
            return this.startAccCallback;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setTokens(String tokens) {
            this.tokens = tokens;
            return this;
        }
        public String getTokens() {
            return this.tokens;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setUpdateAppMetaWhenSync(Boolean updateAppMetaWhenSync) {
            this.updateAppMetaWhenSync = updateAppMetaWhenSync;
            return this;
        }
        public Boolean getUpdateAppMetaWhenSync() {
            return this.updateAppMetaWhenSync;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setUseAppReleaseView(Boolean useAppReleaseView) {
            this.useAppReleaseView = useAppReleaseView;
            return this;
        }
        public Boolean getUseAppReleaseView() {
            return this.useAppReleaseView;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setUseBaselineToRelease(Boolean useBaselineToRelease) {
            this.useBaselineToRelease = useBaselineToRelease;
            return this;
        }
        public Boolean getUseBaselineToRelease() {
            return this.useBaselineToRelease;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setUseCustomOss(Boolean useCustomOss) {
            this.useCustomOss = useCustomOss;
            return this;
        }
        public Boolean getUseCustomOss() {
            return this.useCustomOss;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setUseNewCloudAppImportView(Boolean useNewCloudAppImportView) {
            this.useNewCloudAppImportView = useNewCloudAppImportView;
            return this;
        }
        public Boolean getUseNewCloudAppImportView() {
            return this.useNewCloudAppImportView;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setUseNewPrePubEnvIdList(Boolean useNewPrePubEnvIdList) {
            this.useNewPrePubEnvIdList = useNewPrePubEnvIdList;
            return this;
        }
        public Boolean getUseNewPrePubEnvIdList() {
            return this.useNewPrePubEnvIdList;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setUseNewThirdPartyWay(Boolean useNewThirdPartyWay) {
            this.useNewThirdPartyWay = useNewThirdPartyWay;
            return this;
        }
        public Boolean getUseNewThirdPartyWay() {
            return this.useNewThirdPartyWay;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setUseOldFabricPreCheck(Boolean useOldFabricPreCheck) {
            this.useOldFabricPreCheck = useOldFabricPreCheck;
            return this;
        }
        public Boolean getUseOldFabricPreCheck() {
            return this.useOldFabricPreCheck;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setUseShareMiddleware(Boolean useShareMiddleware) {
            this.useShareMiddleware = useShareMiddleware;
            return this;
        }
        public Boolean getUseShareMiddleware() {
            return this.useShareMiddleware;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setWebHookUrl(String webHookUrl) {
            this.webHookUrl = webHookUrl;
            return this;
        }
        public String getWebHookUrl() {
            return this.webHookUrl;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setDefaultQualityRules(java.util.List<String> defaultQualityRules) {
            this.defaultQualityRules = defaultQualityRules;
            return this;
        }
        public java.util.List<String> getDefaultQualityRules() {
            return this.defaultQualityRules;
        }

        public UpdateLinkeBahamutAdmintenantidconfigResponseBodyResult setGitlabSitePrefixs(java.util.List<String> gitlabSitePrefixs) {
            this.gitlabSitePrefixs = gitlabSitePrefixs;
            return this;
        }
        public java.util.List<String> getGitlabSitePrefixs() {
            return this.gitlabSitePrefixs;
        }

    }

}
