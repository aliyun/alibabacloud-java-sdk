// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutReleaseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public CreateLinkeBahamutReleaseResponseBodyResult result;

    public static CreateLinkeBahamutReleaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutReleaseResponseBody self = new CreateLinkeBahamutReleaseResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutReleaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkeBahamutReleaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateLinkeBahamutReleaseResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CreateLinkeBahamutReleaseResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public CreateLinkeBahamutReleaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateLinkeBahamutReleaseResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CreateLinkeBahamutReleaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateLinkeBahamutReleaseResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLinkeBahamutReleaseResponseBody setResult(CreateLinkeBahamutReleaseResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateLinkeBahamutReleaseResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateLinkeBahamutReleaseResponseBodyResult extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public String status;

        @NameInMap("Stages")
        public java.util.List<String> stages;

        @NameInMap("Iterations")
        public java.util.List<String> iterations;

        @NameInMap("GreenChannelId")
        public String greenChannelId;

        @NameInMap("DailyRelease")
        public Boolean dailyRelease;

        @NameInMap("AfterFastDevDate")
        public Boolean afterFastDevDate;

        @NameInMap("BetaRelease")
        public Boolean betaRelease;

        @NameInMap("Deadlines")
        public String deadlines;

        @NameInMap("TenantReleaseInfos")
        public java.util.List<String> tenantReleaseInfos;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("WindowRelease")
        public Boolean windowRelease;

        @NameInMap("IterationType")
        public String iterationType;

        @NameInMap("Dependencies")
        public String dependencies;

        @NameInMap("ContainPreInMultiEnv")
        public Boolean containPreInMultiEnv;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Name")
        public String name;

        @NameInMap("GreenChannelPortalUrl")
        public String greenChannelPortalUrl;

        @NameInMap("Link")
        public String link;

        @NameInMap("TagAndMergeMasterWhenEmergency")
        public Boolean tagAndMergeMasterWhenEmergency;

        @NameInMap("Apps")
        public java.util.List<String> apps;

        @NameInMap("HasCreatedAppReleaseDetail")
        public Boolean hasCreatedAppReleaseDetail;

        @NameInMap("AoneReleaseId")
        public String aoneReleaseId;

        @NameInMap("MultiEnvRelease")
        public Boolean multiEnvRelease;

        @NameInMap("MultiEnvConfigs")
        public java.util.List<String> multiEnvConfigs;

        @NameInMap("Managers")
        public java.util.List<String> managers;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("AppGroup")
        public String appGroup;

        @NameInMap("Ticket")
        public String ticket;

        @NameInMap("Attachable")
        public Boolean attachable;

        @NameInMap("DelAppMetaIds")
        public java.util.List<String> delAppMetaIds;

        @NameInMap("MultiEnvProd")
        public Boolean multiEnvProd;

        @NameInMap("ReleaseDate")
        public Long releaseDate;

        @NameInMap("GreenChannelName")
        public String greenChannelName;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Id")
        public String id;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("MergeStartTime")
        public Long mergeStartTime;

        public static CreateLinkeBahamutReleaseResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkeBahamutReleaseResponseBodyResult self = new CreateLinkeBahamutReleaseResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setStages(java.util.List<String> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<String> getStages() {
            return this.stages;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setIterations(java.util.List<String> iterations) {
            this.iterations = iterations;
            return this;
        }
        public java.util.List<String> getIterations() {
            return this.iterations;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setGreenChannelId(String greenChannelId) {
            this.greenChannelId = greenChannelId;
            return this;
        }
        public String getGreenChannelId() {
            return this.greenChannelId;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setDailyRelease(Boolean dailyRelease) {
            this.dailyRelease = dailyRelease;
            return this;
        }
        public Boolean getDailyRelease() {
            return this.dailyRelease;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setAfterFastDevDate(Boolean afterFastDevDate) {
            this.afterFastDevDate = afterFastDevDate;
            return this;
        }
        public Boolean getAfterFastDevDate() {
            return this.afterFastDevDate;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setBetaRelease(Boolean betaRelease) {
            this.betaRelease = betaRelease;
            return this;
        }
        public Boolean getBetaRelease() {
            return this.betaRelease;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setDeadlines(String deadlines) {
            this.deadlines = deadlines;
            return this;
        }
        public String getDeadlines() {
            return this.deadlines;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setTenantReleaseInfos(java.util.List<String> tenantReleaseInfos) {
            this.tenantReleaseInfos = tenantReleaseInfos;
            return this;
        }
        public java.util.List<String> getTenantReleaseInfos() {
            return this.tenantReleaseInfos;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setWindowRelease(Boolean windowRelease) {
            this.windowRelease = windowRelease;
            return this;
        }
        public Boolean getWindowRelease() {
            return this.windowRelease;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setIterationType(String iterationType) {
            this.iterationType = iterationType;
            return this;
        }
        public String getIterationType() {
            return this.iterationType;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setDependencies(String dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public String getDependencies() {
            return this.dependencies;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setContainPreInMultiEnv(Boolean containPreInMultiEnv) {
            this.containPreInMultiEnv = containPreInMultiEnv;
            return this;
        }
        public Boolean getContainPreInMultiEnv() {
            return this.containPreInMultiEnv;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setGreenChannelPortalUrl(String greenChannelPortalUrl) {
            this.greenChannelPortalUrl = greenChannelPortalUrl;
            return this;
        }
        public String getGreenChannelPortalUrl() {
            return this.greenChannelPortalUrl;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setTagAndMergeMasterWhenEmergency(Boolean tagAndMergeMasterWhenEmergency) {
            this.tagAndMergeMasterWhenEmergency = tagAndMergeMasterWhenEmergency;
            return this;
        }
        public Boolean getTagAndMergeMasterWhenEmergency() {
            return this.tagAndMergeMasterWhenEmergency;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setApps(java.util.List<String> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<String> getApps() {
            return this.apps;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setHasCreatedAppReleaseDetail(Boolean hasCreatedAppReleaseDetail) {
            this.hasCreatedAppReleaseDetail = hasCreatedAppReleaseDetail;
            return this;
        }
        public Boolean getHasCreatedAppReleaseDetail() {
            return this.hasCreatedAppReleaseDetail;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setAoneReleaseId(String aoneReleaseId) {
            this.aoneReleaseId = aoneReleaseId;
            return this;
        }
        public String getAoneReleaseId() {
            return this.aoneReleaseId;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setMultiEnvRelease(Boolean multiEnvRelease) {
            this.multiEnvRelease = multiEnvRelease;
            return this;
        }
        public Boolean getMultiEnvRelease() {
            return this.multiEnvRelease;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setMultiEnvConfigs(java.util.List<String> multiEnvConfigs) {
            this.multiEnvConfigs = multiEnvConfigs;
            return this;
        }
        public java.util.List<String> getMultiEnvConfigs() {
            return this.multiEnvConfigs;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setManagers(java.util.List<String> managers) {
            this.managers = managers;
            return this;
        }
        public java.util.List<String> getManagers() {
            return this.managers;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setAppGroup(String appGroup) {
            this.appGroup = appGroup;
            return this;
        }
        public String getAppGroup() {
            return this.appGroup;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setTicket(String ticket) {
            this.ticket = ticket;
            return this;
        }
        public String getTicket() {
            return this.ticket;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setAttachable(Boolean attachable) {
            this.attachable = attachable;
            return this;
        }
        public Boolean getAttachable() {
            return this.attachable;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setDelAppMetaIds(java.util.List<String> delAppMetaIds) {
            this.delAppMetaIds = delAppMetaIds;
            return this;
        }
        public java.util.List<String> getDelAppMetaIds() {
            return this.delAppMetaIds;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setMultiEnvProd(Boolean multiEnvProd) {
            this.multiEnvProd = multiEnvProd;
            return this;
        }
        public Boolean getMultiEnvProd() {
            return this.multiEnvProd;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setReleaseDate(Long releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }
        public Long getReleaseDate() {
            return this.releaseDate;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setGreenChannelName(String greenChannelName) {
            this.greenChannelName = greenChannelName;
            return this;
        }
        public String getGreenChannelName() {
            return this.greenChannelName;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public CreateLinkeBahamutReleaseResponseBodyResult setMergeStartTime(Long mergeStartTime) {
            this.mergeStartTime = mergeStartTime;
            return this;
        }
        public Long getMergeStartTime() {
            return this.mergeStartTime;
        }

    }

}
