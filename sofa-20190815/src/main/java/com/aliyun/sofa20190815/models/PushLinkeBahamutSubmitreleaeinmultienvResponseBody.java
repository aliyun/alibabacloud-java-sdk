// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class PushLinkeBahamutSubmitreleaeinmultienvResponseBody extends TeaModel {
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
    public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult result;

    public static PushLinkeBahamutSubmitreleaeinmultienvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PushLinkeBahamutSubmitreleaeinmultienvResponseBody self = new PushLinkeBahamutSubmitreleaeinmultienvResponseBody();
        return TeaModel.build(map, self);
    }

    public PushLinkeBahamutSubmitreleaeinmultienvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PushLinkeBahamutSubmitreleaeinmultienvResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushLinkeBahamutSubmitreleaeinmultienvResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public PushLinkeBahamutSubmitreleaeinmultienvResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public PushLinkeBahamutSubmitreleaeinmultienvResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public PushLinkeBahamutSubmitreleaeinmultienvResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PushLinkeBahamutSubmitreleaeinmultienvResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public PushLinkeBahamutSubmitreleaeinmultienvResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PushLinkeBahamutSubmitreleaeinmultienvResponseBody setResult(PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult getResult() {
        return this.result;
    }

    public static class PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult extends TeaModel {
        @NameInMap("AfterFastDevDate")
        public Boolean afterFastDevDate;

        @NameInMap("AoneReleaseId")
        public String aoneReleaseId;

        @NameInMap("AppGroup")
        public String appGroup;

        @NameInMap("Attachable")
        public Boolean attachable;

        @NameInMap("BetaRelease")
        public Boolean betaRelease;

        @NameInMap("ContainPreInMultiEnv")
        public Boolean containPreInMultiEnv;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("DailyRelease")
        public Boolean dailyRelease;

        @NameInMap("Deadlines")
        public String deadlines;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Dependencies")
        public String dependencies;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("GreenChannelId")
        public String greenChannelId;

        @NameInMap("GreenChannelName")
        public String greenChannelName;

        @NameInMap("GreenChannelPortalUrl")
        public String greenChannelPortalUrl;

        @NameInMap("HasCreatedAppReleaseDetail")
        public Boolean hasCreatedAppReleaseDetail;

        @NameInMap("Id")
        public String id;

        @NameInMap("IterationType")
        public String iterationType;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Link")
        public String link;

        @NameInMap("MergeStartTime")
        public Long mergeStartTime;

        @NameInMap("MultiEnvProd")
        public Boolean multiEnvProd;

        @NameInMap("MultiEnvRelease")
        public Boolean multiEnvRelease;

        @NameInMap("Name")
        public String name;

        @NameInMap("ReleaseDate")
        public Long releaseDate;

        @NameInMap("Status")
        public String status;

        @NameInMap("TagAndMergeMasterWhenEmergency")
        public Boolean tagAndMergeMasterWhenEmergency;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Ticket")
        public String ticket;

        @NameInMap("Type")
        public String type;

        @NameInMap("WindowRelease")
        public Boolean windowRelease;

        @NameInMap("Apps")
        public java.util.List<String> apps;

        @NameInMap("DelAppMetaIds")
        public java.util.List<String> delAppMetaIds;

        @NameInMap("Iterations")
        public java.util.List<String> iterations;

        @NameInMap("Managers")
        public java.util.List<String> managers;

        @NameInMap("MultiEnvConfigs")
        public java.util.List<String> multiEnvConfigs;

        @NameInMap("Stages")
        public java.util.List<String> stages;

        @NameInMap("TenantReleaseInfos")
        public java.util.List<String> tenantReleaseInfos;

        public static PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult self = new PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setAfterFastDevDate(Boolean afterFastDevDate) {
            this.afterFastDevDate = afterFastDevDate;
            return this;
        }
        public Boolean getAfterFastDevDate() {
            return this.afterFastDevDate;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setAoneReleaseId(String aoneReleaseId) {
            this.aoneReleaseId = aoneReleaseId;
            return this;
        }
        public String getAoneReleaseId() {
            return this.aoneReleaseId;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setAppGroup(String appGroup) {
            this.appGroup = appGroup;
            return this;
        }
        public String getAppGroup() {
            return this.appGroup;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setAttachable(Boolean attachable) {
            this.attachable = attachable;
            return this;
        }
        public Boolean getAttachable() {
            return this.attachable;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setBetaRelease(Boolean betaRelease) {
            this.betaRelease = betaRelease;
            return this;
        }
        public Boolean getBetaRelease() {
            return this.betaRelease;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setContainPreInMultiEnv(Boolean containPreInMultiEnv) {
            this.containPreInMultiEnv = containPreInMultiEnv;
            return this;
        }
        public Boolean getContainPreInMultiEnv() {
            return this.containPreInMultiEnv;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setDailyRelease(Boolean dailyRelease) {
            this.dailyRelease = dailyRelease;
            return this;
        }
        public Boolean getDailyRelease() {
            return this.dailyRelease;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setDeadlines(String deadlines) {
            this.deadlines = deadlines;
            return this;
        }
        public String getDeadlines() {
            return this.deadlines;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setDependencies(String dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public String getDependencies() {
            return this.dependencies;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setGreenChannelId(String greenChannelId) {
            this.greenChannelId = greenChannelId;
            return this;
        }
        public String getGreenChannelId() {
            return this.greenChannelId;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setGreenChannelName(String greenChannelName) {
            this.greenChannelName = greenChannelName;
            return this;
        }
        public String getGreenChannelName() {
            return this.greenChannelName;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setGreenChannelPortalUrl(String greenChannelPortalUrl) {
            this.greenChannelPortalUrl = greenChannelPortalUrl;
            return this;
        }
        public String getGreenChannelPortalUrl() {
            return this.greenChannelPortalUrl;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setHasCreatedAppReleaseDetail(Boolean hasCreatedAppReleaseDetail) {
            this.hasCreatedAppReleaseDetail = hasCreatedAppReleaseDetail;
            return this;
        }
        public Boolean getHasCreatedAppReleaseDetail() {
            return this.hasCreatedAppReleaseDetail;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setIterationType(String iterationType) {
            this.iterationType = iterationType;
            return this;
        }
        public String getIterationType() {
            return this.iterationType;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setMergeStartTime(Long mergeStartTime) {
            this.mergeStartTime = mergeStartTime;
            return this;
        }
        public Long getMergeStartTime() {
            return this.mergeStartTime;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setMultiEnvProd(Boolean multiEnvProd) {
            this.multiEnvProd = multiEnvProd;
            return this;
        }
        public Boolean getMultiEnvProd() {
            return this.multiEnvProd;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setMultiEnvRelease(Boolean multiEnvRelease) {
            this.multiEnvRelease = multiEnvRelease;
            return this;
        }
        public Boolean getMultiEnvRelease() {
            return this.multiEnvRelease;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setReleaseDate(Long releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public Long getReleaseDate() {
            return this.releaseDate;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setTagAndMergeMasterWhenEmergency(Boolean tagAndMergeMasterWhenEmergency) {
            this.tagAndMergeMasterWhenEmergency = tagAndMergeMasterWhenEmergency;
            return this;
        }
        public Boolean getTagAndMergeMasterWhenEmergency() {
            return this.tagAndMergeMasterWhenEmergency;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setTicket(String ticket) {
            this.ticket = ticket;
            return this;
        }
        public String getTicket() {
            return this.ticket;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setWindowRelease(Boolean windowRelease) {
            this.windowRelease = windowRelease;
            return this;
        }
        public Boolean getWindowRelease() {
            return this.windowRelease;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setApps(java.util.List<String> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<String> getApps() {
            return this.apps;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setDelAppMetaIds(java.util.List<String> delAppMetaIds) {
            this.delAppMetaIds = delAppMetaIds;
            return this;
        }
        public java.util.List<String> getDelAppMetaIds() {
            return this.delAppMetaIds;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setIterations(java.util.List<String> iterations) {
            this.iterations = iterations;
            return this;
        }
        public java.util.List<String> getIterations() {
            return this.iterations;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setManagers(java.util.List<String> managers) {
            this.managers = managers;
            return this;
        }
        public java.util.List<String> getManagers() {
            return this.managers;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setMultiEnvConfigs(java.util.List<String> multiEnvConfigs) {
            this.multiEnvConfigs = multiEnvConfigs;
            return this;
        }
        public java.util.List<String> getMultiEnvConfigs() {
            return this.multiEnvConfigs;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setStages(java.util.List<String> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<String> getStages() {
            return this.stages;
        }

        public PushLinkeBahamutSubmitreleaeinmultienvResponseBodyResult setTenantReleaseInfos(java.util.List<String> tenantReleaseInfos) {
            this.tenantReleaseInfos = tenantReleaseInfos;
            return this;
        }
        public java.util.List<String> getTenantReleaseInfos() {
            return this.tenantReleaseInfos;
        }

    }

}
