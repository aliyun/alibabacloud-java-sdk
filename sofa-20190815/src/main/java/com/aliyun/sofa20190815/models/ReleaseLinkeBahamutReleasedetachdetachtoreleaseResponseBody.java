// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBody extends TeaModel {
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
    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult result;

    public static ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBody self = new ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBody setResult(ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult getResult() {
        return this.result;
    }

    public static class ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult extends TeaModel {
        @NameInMap("AoneCodeChangeId")
        public String aoneCodeChangeId;

        @NameInMap("BranchRelease")
        public Boolean branchRelease;

        @NameInMap("Compatible")
        public Boolean compatible;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("CreatorSysName")
        public String creatorSysName;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Emergency")
        public Boolean emergency;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("FabricBizType")
        public String fabricBizType;

        @NameInMap("Finished")
        public Boolean finished;

        @NameInMap("GreyRelease")
        public String greyRelease;

        @NameInMap("Id")
        public String id;

        @NameInMap("IndependentComplete")
        public Boolean independentComplete;

        @NameInMap("IterationManager")
        public String iterationManager;

        @NameInMap("IterationTemplate")
        public String iterationTemplate;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("OriginalRelease")
        public String originalRelease;

        @NameInMap("OverdueApplyModifyReleaseId")
        public String overdueApplyModifyReleaseId;

        @NameInMap("PrePubOwner")
        public String prePubOwner;

        @NameInMap("PrivateAppGroup")
        public String privateAppGroup;

        @NameInMap("ProdCode")
        public String prodCode;

        @NameInMap("ProdVersion")
        public String prodVersion;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("Release")
        public String release;

        @NameInMap("StageStep")
        public String stageStep;

        @NameInMap("TagAndMergeMasterWhenEmergency")
        public Boolean tagAndMergeMasterWhenEmergency;

        @NameInMap("TecRiskOwner")
        public String tecRiskOwner;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("TestOwner")
        public String testOwner;

        @NameInMap("Type")
        public String type;

        @NameInMap("UseBaselineToRelease")
        public Boolean useBaselineToRelease;

        @NameInMap("XflushCheckEnable")
        public Boolean xflushCheckEnable;

        @NameInMap("AppMetaIds")
        public java.util.List<String> appMetaIds;

        @NameInMap("AppMetaNames")
        public java.util.List<String> appMetaNames;

        @NameInMap("AuditProds")
        public java.util.List<String> auditProds;

        @NameInMap("Defects")
        public java.util.List<String> defects;

        @NameInMap("Members")
        public java.util.List<String> members;

        @NameInMap("PaasApplyIds")
        public java.util.List<String> paasApplyIds;

        @NameInMap("Requirements")
        public java.util.List<String> requirements;

        @NameInMap("Tasks")
        public java.util.List<String> tasks;

        public static ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult self = new ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setAoneCodeChangeId(String aoneCodeChangeId) {
            this.aoneCodeChangeId = aoneCodeChangeId;
            return this;
        }
        public String getAoneCodeChangeId() {
            return this.aoneCodeChangeId;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setBranchRelease(Boolean branchRelease) {
            this.branchRelease = branchRelease;
            return this;
        }
        public Boolean getBranchRelease() {
            return this.branchRelease;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setCompatible(Boolean compatible) {
            this.compatible = compatible;
            return this;
        }
        public Boolean getCompatible() {
            return this.compatible;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setCreatorSysName(String creatorSysName) {
            this.creatorSysName = creatorSysName;
            return this;
        }
        public String getCreatorSysName() {
            return this.creatorSysName;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setEmergency(Boolean emergency) {
            this.emergency = emergency;
            return this;
        }
        public Boolean getEmergency() {
            return this.emergency;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setFabricBizType(String fabricBizType) {
            this.fabricBizType = fabricBizType;
            return this;
        }
        public String getFabricBizType() {
            return this.fabricBizType;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setGreyRelease(String greyRelease) {
            this.greyRelease = greyRelease;
            return this;
        }
        public String getGreyRelease() {
            return this.greyRelease;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setIndependentComplete(Boolean independentComplete) {
            this.independentComplete = independentComplete;
            return this;
        }
        public Boolean getIndependentComplete() {
            return this.independentComplete;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setIterationManager(String iterationManager) {
            this.iterationManager = iterationManager;
            return this;
        }
        public String getIterationManager() {
            return this.iterationManager;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setIterationTemplate(String iterationTemplate) {
            this.iterationTemplate = iterationTemplate;
            return this;
        }
        public String getIterationTemplate() {
            return this.iterationTemplate;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setOriginalRelease(String originalRelease) {
            this.originalRelease = originalRelease;
            return this;
        }
        public String getOriginalRelease() {
            return this.originalRelease;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setOverdueApplyModifyReleaseId(String overdueApplyModifyReleaseId) {
            this.overdueApplyModifyReleaseId = overdueApplyModifyReleaseId;
            return this;
        }
        public String getOverdueApplyModifyReleaseId() {
            return this.overdueApplyModifyReleaseId;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setPrePubOwner(String prePubOwner) {
            this.prePubOwner = prePubOwner;
            return this;
        }
        public String getPrePubOwner() {
            return this.prePubOwner;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setPrivateAppGroup(String privateAppGroup) {
            this.privateAppGroup = privateAppGroup;
            return this;
        }
        public String getPrivateAppGroup() {
            return this.privateAppGroup;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setProdVersion(String prodVersion) {
            this.prodVersion = prodVersion;
            return this;
        }
        public String getProdVersion() {
            return this.prodVersion;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setRelease(String release) {
            this.release = release;
            return this;
        }
        public String getRelease() {
            return this.release;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setStageStep(String stageStep) {
            this.stageStep = stageStep;
            return this;
        }
        public String getStageStep() {
            return this.stageStep;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setTagAndMergeMasterWhenEmergency(Boolean tagAndMergeMasterWhenEmergency) {
            this.tagAndMergeMasterWhenEmergency = tagAndMergeMasterWhenEmergency;
            return this;
        }
        public Boolean getTagAndMergeMasterWhenEmergency() {
            return this.tagAndMergeMasterWhenEmergency;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setTecRiskOwner(String tecRiskOwner) {
            this.tecRiskOwner = tecRiskOwner;
            return this;
        }
        public String getTecRiskOwner() {
            return this.tecRiskOwner;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setTestOwner(String testOwner) {
            this.testOwner = testOwner;
            return this;
        }
        public String getTestOwner() {
            return this.testOwner;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setUseBaselineToRelease(Boolean useBaselineToRelease) {
            this.useBaselineToRelease = useBaselineToRelease;
            return this;
        }
        public Boolean getUseBaselineToRelease() {
            return this.useBaselineToRelease;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setXflushCheckEnable(Boolean xflushCheckEnable) {
            this.xflushCheckEnable = xflushCheckEnable;
            return this;
        }
        public Boolean getXflushCheckEnable() {
            return this.xflushCheckEnable;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setAppMetaIds(java.util.List<String> appMetaIds) {
            this.appMetaIds = appMetaIds;
            return this;
        }
        public java.util.List<String> getAppMetaIds() {
            return this.appMetaIds;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setAppMetaNames(java.util.List<String> appMetaNames) {
            this.appMetaNames = appMetaNames;
            return this;
        }
        public java.util.List<String> getAppMetaNames() {
            return this.appMetaNames;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setAuditProds(java.util.List<String> auditProds) {
            this.auditProds = auditProds;
            return this;
        }
        public java.util.List<String> getAuditProds() {
            return this.auditProds;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setDefects(java.util.List<String> defects) {
            this.defects = defects;
            return this;
        }
        public java.util.List<String> getDefects() {
            return this.defects;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setPaasApplyIds(java.util.List<String> paasApplyIds) {
            this.paasApplyIds = paasApplyIds;
            return this;
        }
        public java.util.List<String> getPaasApplyIds() {
            return this.paasApplyIds;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setRequirements(java.util.List<String> requirements) {
            this.requirements = requirements;
            return this;
        }
        public java.util.List<String> getRequirements() {
            return this.requirements;
        }

        public ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponseBodyResult setTasks(java.util.List<String> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<String> getTasks() {
            return this.tasks;
        }

    }

}
