// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutIterationsdocreateRequest extends TeaModel {
    @NameInMap("AoneCodeChangeId")
    public String aoneCodeChangeId;

    @NameInMap("AppMembers")
    public String appMembers;

    @NameInMap("BranchMap")
    public String branchMap;

    @NameInMap("BranchPostfixMap")
    public String branchPostfixMap;

    @NameInMap("Compatible")
    public Boolean compatible;

    @NameInMap("CreatorSysName")
    public String creatorSysName;

    @NameInMap("DeliverId")
    public String deliverId;

    @NameInMap("GreenChannel")
    public String greenChannel;

    @NameInMap("IsBranchRelease")
    public Boolean isBranchRelease;

    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("IterationManager")
    public String iterationManager;

    @NameInMap("IterationTemplateId")
    public String iterationTemplateId;

    @NameInMap("Name")
    public String name;

    @NameInMap("PrePubOwner")
    public String prePubOwner;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ProdVersion")
    public String prodVersion;

    @NameInMap("Project")
    public String project;

    @NameInMap("TagAndMergeMasterWhenEmergency")
    public Boolean tagAndMergeMasterWhenEmergency;

    @NameInMap("TagMap")
    public String tagMap;

    @NameInMap("TecRiskOwner")
    public String tecRiskOwner;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("TestOwner")
    public String testOwner;

    @NameInMap("UserAccount")
    public String userAccount;

    @NameInMap("AppNamesRepeatList")
    public java.util.List<String> appNamesRepeatList;

    @NameInMap("AuditProdsRepeatList")
    public java.util.List<String> auditProdsRepeatList;

    @NameInMap("IterationMembersRepeatList")
    public java.util.List<String> iterationMembersRepeatList;

    @NameInMap("PubOwnersRepeatList")
    public java.util.List<String> pubOwnersRepeatList;

    @NameInMap("VersionsRepeatList")
    public java.util.List<String> versionsRepeatList;

    @NameInMap("WorkItemsRepeatList")
    public java.util.List<String> workItemsRepeatList;

    public static CreateLinkeBahamutIterationsdocreateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutIterationsdocreateRequest self = new CreateLinkeBahamutIterationsdocreateRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutIterationsdocreateRequest setAoneCodeChangeId(String aoneCodeChangeId) {
        this.aoneCodeChangeId = aoneCodeChangeId;
        return this;
    }
    public String getAoneCodeChangeId() {
        return this.aoneCodeChangeId;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setAppMembers(String appMembers) {
        this.appMembers = appMembers;
        return this;
    }
    public String getAppMembers() {
        return this.appMembers;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setBranchMap(String branchMap) {
        this.branchMap = branchMap;
        return this;
    }
    public String getBranchMap() {
        return this.branchMap;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setBranchPostfixMap(String branchPostfixMap) {
        this.branchPostfixMap = branchPostfixMap;
        return this;
    }
    public String getBranchPostfixMap() {
        return this.branchPostfixMap;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setCompatible(Boolean compatible) {
        this.compatible = compatible;
        return this;
    }
    public Boolean getCompatible() {
        return this.compatible;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setCreatorSysName(String creatorSysName) {
        this.creatorSysName = creatorSysName;
        return this;
    }
    public String getCreatorSysName() {
        return this.creatorSysName;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setDeliverId(String deliverId) {
        this.deliverId = deliverId;
        return this;
    }
    public String getDeliverId() {
        return this.deliverId;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setGreenChannel(String greenChannel) {
        this.greenChannel = greenChannel;
        return this;
    }
    public String getGreenChannel() {
        return this.greenChannel;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setIsBranchRelease(Boolean isBranchRelease) {
        this.isBranchRelease = isBranchRelease;
        return this;
    }
    public Boolean getIsBranchRelease() {
        return this.isBranchRelease;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setIterationManager(String iterationManager) {
        this.iterationManager = iterationManager;
        return this;
    }
    public String getIterationManager() {
        return this.iterationManager;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setIterationTemplateId(String iterationTemplateId) {
        this.iterationTemplateId = iterationTemplateId;
        return this;
    }
    public String getIterationTemplateId() {
        return this.iterationTemplateId;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setPrePubOwner(String prePubOwner) {
        this.prePubOwner = prePubOwner;
        return this;
    }
    public String getPrePubOwner() {
        return this.prePubOwner;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setProdVersion(String prodVersion) {
        this.prodVersion = prodVersion;
        return this;
    }
    public String getProdVersion() {
        return this.prodVersion;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setTagAndMergeMasterWhenEmergency(Boolean tagAndMergeMasterWhenEmergency) {
        this.tagAndMergeMasterWhenEmergency = tagAndMergeMasterWhenEmergency;
        return this;
    }
    public Boolean getTagAndMergeMasterWhenEmergency() {
        return this.tagAndMergeMasterWhenEmergency;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setTagMap(String tagMap) {
        this.tagMap = tagMap;
        return this;
    }
    public String getTagMap() {
        return this.tagMap;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setTecRiskOwner(String tecRiskOwner) {
        this.tecRiskOwner = tecRiskOwner;
        return this;
    }
    public String getTecRiskOwner() {
        return this.tecRiskOwner;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setTestOwner(String testOwner) {
        this.testOwner = testOwner;
        return this;
    }
    public String getTestOwner() {
        return this.testOwner;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setAppNamesRepeatList(java.util.List<String> appNamesRepeatList) {
        this.appNamesRepeatList = appNamesRepeatList;
        return this;
    }
    public java.util.List<String> getAppNamesRepeatList() {
        return this.appNamesRepeatList;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setAuditProdsRepeatList(java.util.List<String> auditProdsRepeatList) {
        this.auditProdsRepeatList = auditProdsRepeatList;
        return this;
    }
    public java.util.List<String> getAuditProdsRepeatList() {
        return this.auditProdsRepeatList;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setIterationMembersRepeatList(java.util.List<String> iterationMembersRepeatList) {
        this.iterationMembersRepeatList = iterationMembersRepeatList;
        return this;
    }
    public java.util.List<String> getIterationMembersRepeatList() {
        return this.iterationMembersRepeatList;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setPubOwnersRepeatList(java.util.List<String> pubOwnersRepeatList) {
        this.pubOwnersRepeatList = pubOwnersRepeatList;
        return this;
    }
    public java.util.List<String> getPubOwnersRepeatList() {
        return this.pubOwnersRepeatList;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setVersionsRepeatList(java.util.List<String> versionsRepeatList) {
        this.versionsRepeatList = versionsRepeatList;
        return this;
    }
    public java.util.List<String> getVersionsRepeatList() {
        return this.versionsRepeatList;
    }

    public CreateLinkeBahamutIterationsdocreateRequest setWorkItemsRepeatList(java.util.List<String> workItemsRepeatList) {
        this.workItemsRepeatList = workItemsRepeatList;
        return this;
    }
    public java.util.List<String> getWorkItemsRepeatList() {
        return this.workItemsRepeatList;
    }

}
