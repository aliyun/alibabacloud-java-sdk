// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutReleasemanagerRequest extends TeaModel {
    @NameInMap("AfterFastDevDate")
    public Boolean afterFastDevDate;

    @NameInMap("AoneReleaseId")
    public String aoneReleaseId;

    @NameInMap("AppsRepeatList")
    public java.util.List<String> appsRepeatList;

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

    @NameInMap("DelAppMetaIdsRepeatList")
    public java.util.List<String> delAppMetaIdsRepeatList;

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

    @NameInMap("IterationsRepeatList")
    public java.util.List<String> iterationsRepeatList;

    @NameInMap("IterationType")
    public String iterationType;

    @NameInMap("LastModified")
    public Long lastModified;

    @NameInMap("Link")
    public String link;

    @NameInMap("ManagersRepeatList")
    public java.util.List<String> managersRepeatList;

    @NameInMap("MergeStartTime")
    public Long mergeStartTime;

    @NameInMap("MultiEnvConfigsRepeatList")
    public java.util.List<String> multiEnvConfigsRepeatList;

    @NameInMap("MultiEnvProd")
    public Boolean multiEnvProd;

    @NameInMap("MultiEnvRelease")
    public Boolean multiEnvRelease;

    @NameInMap("Name")
    public String name;

    @NameInMap("ReleaseDate")
    public Long releaseDate;

    @NameInMap("StagesRepeatList")
    public java.util.List<String> stagesRepeatList;

    @NameInMap("Status")
    public String status;

    @NameInMap("TagAndMergeMasterWhenEmergency")
    public Boolean tagAndMergeMasterWhenEmergency;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("TenantReleaseInfosRepeatList")
    public java.util.List<String> tenantReleaseInfosRepeatList;

    @NameInMap("Ticket")
    public String ticket;

    @NameInMap("Type")
    public String type;

    @NameInMap("WindowRelease")
    public Boolean windowRelease;

    public static UpdateLinkeBahamutReleasemanagerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutReleasemanagerRequest self = new UpdateLinkeBahamutReleasemanagerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutReleasemanagerRequest setAfterFastDevDate(Boolean afterFastDevDate) {
        this.afterFastDevDate = afterFastDevDate;
        return this;
    }
    public Boolean getAfterFastDevDate() {
        return this.afterFastDevDate;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setAoneReleaseId(String aoneReleaseId) {
        this.aoneReleaseId = aoneReleaseId;
        return this;
    }
    public String getAoneReleaseId() {
        return this.aoneReleaseId;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setAppsRepeatList(java.util.List<String> appsRepeatList) {
        this.appsRepeatList = appsRepeatList;
        return this;
    }
    public java.util.List<String> getAppsRepeatList() {
        return this.appsRepeatList;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setAppGroup(String appGroup) {
        this.appGroup = appGroup;
        return this;
    }
    public String getAppGroup() {
        return this.appGroup;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setAttachable(Boolean attachable) {
        this.attachable = attachable;
        return this;
    }
    public Boolean getAttachable() {
        return this.attachable;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setBetaRelease(Boolean betaRelease) {
        this.betaRelease = betaRelease;
        return this;
    }
    public Boolean getBetaRelease() {
        return this.betaRelease;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setContainPreInMultiEnv(Boolean containPreInMultiEnv) {
        this.containPreInMultiEnv = containPreInMultiEnv;
        return this;
    }
    public Boolean getContainPreInMultiEnv() {
        return this.containPreInMultiEnv;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setCreated(Long created) {
        this.created = created;
        return this;
    }
    public Long getCreated() {
        return this.created;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setDailyRelease(Boolean dailyRelease) {
        this.dailyRelease = dailyRelease;
        return this;
    }
    public Boolean getDailyRelease() {
        return this.dailyRelease;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setDeadlines(String deadlines) {
        this.deadlines = deadlines;
        return this;
    }
    public String getDeadlines() {
        return this.deadlines;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setDelAppMetaIdsRepeatList(java.util.List<String> delAppMetaIdsRepeatList) {
        this.delAppMetaIdsRepeatList = delAppMetaIdsRepeatList;
        return this;
    }
    public java.util.List<String> getDelAppMetaIdsRepeatList() {
        return this.delAppMetaIdsRepeatList;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setDependencies(String dependencies) {
        this.dependencies = dependencies;
        return this;
    }
    public String getDependencies() {
        return this.dependencies;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setGreenChannelId(String greenChannelId) {
        this.greenChannelId = greenChannelId;
        return this;
    }
    public String getGreenChannelId() {
        return this.greenChannelId;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setGreenChannelName(String greenChannelName) {
        this.greenChannelName = greenChannelName;
        return this;
    }
    public String getGreenChannelName() {
        return this.greenChannelName;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setGreenChannelPortalUrl(String greenChannelPortalUrl) {
        this.greenChannelPortalUrl = greenChannelPortalUrl;
        return this;
    }
    public String getGreenChannelPortalUrl() {
        return this.greenChannelPortalUrl;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setHasCreatedAppReleaseDetail(Boolean hasCreatedAppReleaseDetail) {
        this.hasCreatedAppReleaseDetail = hasCreatedAppReleaseDetail;
        return this;
    }
    public Boolean getHasCreatedAppReleaseDetail() {
        return this.hasCreatedAppReleaseDetail;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setIterationsRepeatList(java.util.List<String> iterationsRepeatList) {
        this.iterationsRepeatList = iterationsRepeatList;
        return this;
    }
    public java.util.List<String> getIterationsRepeatList() {
        return this.iterationsRepeatList;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setIterationType(String iterationType) {
        this.iterationType = iterationType;
        return this;
    }
    public String getIterationType() {
        return this.iterationType;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setLastModified(Long lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public Long getLastModified() {
        return this.lastModified;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setManagersRepeatList(java.util.List<String> managersRepeatList) {
        this.managersRepeatList = managersRepeatList;
        return this;
    }
    public java.util.List<String> getManagersRepeatList() {
        return this.managersRepeatList;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setMergeStartTime(Long mergeStartTime) {
        this.mergeStartTime = mergeStartTime;
        return this;
    }
    public Long getMergeStartTime() {
        return this.mergeStartTime;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setMultiEnvConfigsRepeatList(java.util.List<String> multiEnvConfigsRepeatList) {
        this.multiEnvConfigsRepeatList = multiEnvConfigsRepeatList;
        return this;
    }
    public java.util.List<String> getMultiEnvConfigsRepeatList() {
        return this.multiEnvConfigsRepeatList;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setMultiEnvProd(Boolean multiEnvProd) {
        this.multiEnvProd = multiEnvProd;
        return this;
    }
    public Boolean getMultiEnvProd() {
        return this.multiEnvProd;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setMultiEnvRelease(Boolean multiEnvRelease) {
        this.multiEnvRelease = multiEnvRelease;
        return this;
    }
    public Boolean getMultiEnvRelease() {
        return this.multiEnvRelease;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setReleaseDate(Long releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }
    public Long getReleaseDate() {
        return this.releaseDate;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setStagesRepeatList(java.util.List<String> stagesRepeatList) {
        this.stagesRepeatList = stagesRepeatList;
        return this;
    }
    public java.util.List<String> getStagesRepeatList() {
        return this.stagesRepeatList;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setTagAndMergeMasterWhenEmergency(Boolean tagAndMergeMasterWhenEmergency) {
        this.tagAndMergeMasterWhenEmergency = tagAndMergeMasterWhenEmergency;
        return this;
    }
    public Boolean getTagAndMergeMasterWhenEmergency() {
        return this.tagAndMergeMasterWhenEmergency;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setTenantReleaseInfosRepeatList(java.util.List<String> tenantReleaseInfosRepeatList) {
        this.tenantReleaseInfosRepeatList = tenantReleaseInfosRepeatList;
        return this;
    }
    public java.util.List<String> getTenantReleaseInfosRepeatList() {
        return this.tenantReleaseInfosRepeatList;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateLinkeBahamutReleasemanagerRequest setWindowRelease(Boolean windowRelease) {
        this.windowRelease = windowRelease;
        return this;
    }
    public Boolean getWindowRelease() {
        return this.windowRelease;
    }

}
