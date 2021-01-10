// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutReleasebyappgroupResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutReleasebyappgroupResponseBodyResult> result;

    public static GetLinkeBahamutReleasebyappgroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutReleasebyappgroupResponseBody self = new GetLinkeBahamutReleasebyappgroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutReleasebyappgroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutReleasebyappgroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutReleasebyappgroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutReleasebyappgroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutReleasebyappgroupResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutReleasebyappgroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutReleasebyappgroupResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutReleasebyappgroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutReleasebyappgroupResponseBody setResult(java.util.List<GetLinkeBahamutReleasebyappgroupResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutReleasebyappgroupResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutReleasebyappgroupResponseBodyResult extends TeaModel {
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

        public static GetLinkeBahamutReleasebyappgroupResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutReleasebyappgroupResponseBodyResult self = new GetLinkeBahamutReleasebyappgroupResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setAfterFastDevDate(Boolean afterFastDevDate) {
            this.afterFastDevDate = afterFastDevDate;
            return this;
        }
        public Boolean getAfterFastDevDate() {
            return this.afterFastDevDate;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setAoneReleaseId(String aoneReleaseId) {
            this.aoneReleaseId = aoneReleaseId;
            return this;
        }
        public String getAoneReleaseId() {
            return this.aoneReleaseId;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setAppGroup(String appGroup) {
            this.appGroup = appGroup;
            return this;
        }
        public String getAppGroup() {
            return this.appGroup;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setAttachable(Boolean attachable) {
            this.attachable = attachable;
            return this;
        }
        public Boolean getAttachable() {
            return this.attachable;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setBetaRelease(Boolean betaRelease) {
            this.betaRelease = betaRelease;
            return this;
        }
        public Boolean getBetaRelease() {
            return this.betaRelease;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setContainPreInMultiEnv(Boolean containPreInMultiEnv) {
            this.containPreInMultiEnv = containPreInMultiEnv;
            return this;
        }
        public Boolean getContainPreInMultiEnv() {
            return this.containPreInMultiEnv;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setDailyRelease(Boolean dailyRelease) {
            this.dailyRelease = dailyRelease;
            return this;
        }
        public Boolean getDailyRelease() {
            return this.dailyRelease;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setDeadlines(String deadlines) {
            this.deadlines = deadlines;
            return this;
        }
        public String getDeadlines() {
            return this.deadlines;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setDependencies(String dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public String getDependencies() {
            return this.dependencies;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setGreenChannelId(String greenChannelId) {
            this.greenChannelId = greenChannelId;
            return this;
        }
        public String getGreenChannelId() {
            return this.greenChannelId;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setGreenChannelName(String greenChannelName) {
            this.greenChannelName = greenChannelName;
            return this;
        }
        public String getGreenChannelName() {
            return this.greenChannelName;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setGreenChannelPortalUrl(String greenChannelPortalUrl) {
            this.greenChannelPortalUrl = greenChannelPortalUrl;
            return this;
        }
        public String getGreenChannelPortalUrl() {
            return this.greenChannelPortalUrl;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setHasCreatedAppReleaseDetail(Boolean hasCreatedAppReleaseDetail) {
            this.hasCreatedAppReleaseDetail = hasCreatedAppReleaseDetail;
            return this;
        }
        public Boolean getHasCreatedAppReleaseDetail() {
            return this.hasCreatedAppReleaseDetail;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setIterationType(String iterationType) {
            this.iterationType = iterationType;
            return this;
        }
        public String getIterationType() {
            return this.iterationType;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setMergeStartTime(Long mergeStartTime) {
            this.mergeStartTime = mergeStartTime;
            return this;
        }
        public Long getMergeStartTime() {
            return this.mergeStartTime;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setMultiEnvProd(Boolean multiEnvProd) {
            this.multiEnvProd = multiEnvProd;
            return this;
        }
        public Boolean getMultiEnvProd() {
            return this.multiEnvProd;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setMultiEnvRelease(Boolean multiEnvRelease) {
            this.multiEnvRelease = multiEnvRelease;
            return this;
        }
        public Boolean getMultiEnvRelease() {
            return this.multiEnvRelease;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setReleaseDate(Long releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public Long getReleaseDate() {
            return this.releaseDate;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setTagAndMergeMasterWhenEmergency(Boolean tagAndMergeMasterWhenEmergency) {
            this.tagAndMergeMasterWhenEmergency = tagAndMergeMasterWhenEmergency;
            return this;
        }
        public Boolean getTagAndMergeMasterWhenEmergency() {
            return this.tagAndMergeMasterWhenEmergency;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setTicket(String ticket) {
            this.ticket = ticket;
            return this;
        }
        public String getTicket() {
            return this.ticket;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setWindowRelease(Boolean windowRelease) {
            this.windowRelease = windowRelease;
            return this;
        }
        public Boolean getWindowRelease() {
            return this.windowRelease;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setApps(java.util.List<String> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<String> getApps() {
            return this.apps;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setDelAppMetaIds(java.util.List<String> delAppMetaIds) {
            this.delAppMetaIds = delAppMetaIds;
            return this;
        }
        public java.util.List<String> getDelAppMetaIds() {
            return this.delAppMetaIds;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setIterations(java.util.List<String> iterations) {
            this.iterations = iterations;
            return this;
        }
        public java.util.List<String> getIterations() {
            return this.iterations;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setManagers(java.util.List<String> managers) {
            this.managers = managers;
            return this;
        }
        public java.util.List<String> getManagers() {
            return this.managers;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setMultiEnvConfigs(java.util.List<String> multiEnvConfigs) {
            this.multiEnvConfigs = multiEnvConfigs;
            return this;
        }
        public java.util.List<String> getMultiEnvConfigs() {
            return this.multiEnvConfigs;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setStages(java.util.List<String> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<String> getStages() {
            return this.stages;
        }

        public GetLinkeBahamutReleasebyappgroupResponseBodyResult setTenantReleaseInfos(java.util.List<String> tenantReleaseInfos) {
            this.tenantReleaseInfos = tenantReleaseInfos;
            return this;
        }
        public java.util.List<String> getTenantReleaseInfos() {
            return this.tenantReleaseInfos;
        }

    }

}
