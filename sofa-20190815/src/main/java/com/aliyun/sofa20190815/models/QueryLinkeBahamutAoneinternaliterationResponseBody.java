// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAoneinternaliterationResponseBody extends TeaModel {
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
    public QueryLinkeBahamutAoneinternaliterationResponseBodyResult result;

    public static QueryLinkeBahamutAoneinternaliterationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAoneinternaliterationResponseBody self = new QueryLinkeBahamutAoneinternaliterationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAoneinternaliterationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutAoneinternaliterationResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutAoneinternaliterationResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutAoneinternaliterationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutAoneinternaliterationResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutAoneinternaliterationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutAoneinternaliterationResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutAoneinternaliterationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutAoneinternaliterationResponseBody setResult(QueryLinkeBahamutAoneinternaliterationResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeBahamutAoneinternaliterationResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutAoneinternaliterationResponseBodyResult extends TeaModel {
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

        public static QueryLinkeBahamutAoneinternaliterationResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutAoneinternaliterationResponseBodyResult self = new QueryLinkeBahamutAoneinternaliterationResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setAoneCodeChangeId(String aoneCodeChangeId) {
            this.aoneCodeChangeId = aoneCodeChangeId;
            return this;
        }
        public String getAoneCodeChangeId() {
            return this.aoneCodeChangeId;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setBranchRelease(Boolean branchRelease) {
            this.branchRelease = branchRelease;
            return this;
        }
        public Boolean getBranchRelease() {
            return this.branchRelease;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setCompatible(Boolean compatible) {
            this.compatible = compatible;
            return this;
        }
        public Boolean getCompatible() {
            return this.compatible;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setCreatorSysName(String creatorSysName) {
            this.creatorSysName = creatorSysName;
            return this;
        }
        public String getCreatorSysName() {
            return this.creatorSysName;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setEmergency(Boolean emergency) {
            this.emergency = emergency;
            return this;
        }
        public Boolean getEmergency() {
            return this.emergency;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setFabricBizType(String fabricBizType) {
            this.fabricBizType = fabricBizType;
            return this;
        }
        public String getFabricBizType() {
            return this.fabricBizType;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setGreyRelease(String greyRelease) {
            this.greyRelease = greyRelease;
            return this;
        }
        public String getGreyRelease() {
            return this.greyRelease;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setIndependentComplete(Boolean independentComplete) {
            this.independentComplete = independentComplete;
            return this;
        }
        public Boolean getIndependentComplete() {
            return this.independentComplete;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setIterationManager(String iterationManager) {
            this.iterationManager = iterationManager;
            return this;
        }
        public String getIterationManager() {
            return this.iterationManager;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setIterationTemplate(String iterationTemplate) {
            this.iterationTemplate = iterationTemplate;
            return this;
        }
        public String getIterationTemplate() {
            return this.iterationTemplate;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setOriginalRelease(String originalRelease) {
            this.originalRelease = originalRelease;
            return this;
        }
        public String getOriginalRelease() {
            return this.originalRelease;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setOverdueApplyModifyReleaseId(String overdueApplyModifyReleaseId) {
            this.overdueApplyModifyReleaseId = overdueApplyModifyReleaseId;
            return this;
        }
        public String getOverdueApplyModifyReleaseId() {
            return this.overdueApplyModifyReleaseId;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setPrePubOwner(String prePubOwner) {
            this.prePubOwner = prePubOwner;
            return this;
        }
        public String getPrePubOwner() {
            return this.prePubOwner;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setPrivateAppGroup(String privateAppGroup) {
            this.privateAppGroup = privateAppGroup;
            return this;
        }
        public String getPrivateAppGroup() {
            return this.privateAppGroup;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setProdVersion(String prodVersion) {
            this.prodVersion = prodVersion;
            return this;
        }
        public String getProdVersion() {
            return this.prodVersion;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setRelease(String release) {
            this.release = release;
            return this;
        }
        public String getRelease() {
            return this.release;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setStageStep(String stageStep) {
            this.stageStep = stageStep;
            return this;
        }
        public String getStageStep() {
            return this.stageStep;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setTagAndMergeMasterWhenEmergency(Boolean tagAndMergeMasterWhenEmergency) {
            this.tagAndMergeMasterWhenEmergency = tagAndMergeMasterWhenEmergency;
            return this;
        }
        public Boolean getTagAndMergeMasterWhenEmergency() {
            return this.tagAndMergeMasterWhenEmergency;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setTecRiskOwner(String tecRiskOwner) {
            this.tecRiskOwner = tecRiskOwner;
            return this;
        }
        public String getTecRiskOwner() {
            return this.tecRiskOwner;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setTestOwner(String testOwner) {
            this.testOwner = testOwner;
            return this;
        }
        public String getTestOwner() {
            return this.testOwner;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setUseBaselineToRelease(Boolean useBaselineToRelease) {
            this.useBaselineToRelease = useBaselineToRelease;
            return this;
        }
        public Boolean getUseBaselineToRelease() {
            return this.useBaselineToRelease;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setXflushCheckEnable(Boolean xflushCheckEnable) {
            this.xflushCheckEnable = xflushCheckEnable;
            return this;
        }
        public Boolean getXflushCheckEnable() {
            return this.xflushCheckEnable;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setAppMetaIds(java.util.List<String> appMetaIds) {
            this.appMetaIds = appMetaIds;
            return this;
        }
        public java.util.List<String> getAppMetaIds() {
            return this.appMetaIds;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setAppMetaNames(java.util.List<String> appMetaNames) {
            this.appMetaNames = appMetaNames;
            return this;
        }
        public java.util.List<String> getAppMetaNames() {
            return this.appMetaNames;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setAuditProds(java.util.List<String> auditProds) {
            this.auditProds = auditProds;
            return this;
        }
        public java.util.List<String> getAuditProds() {
            return this.auditProds;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setDefects(java.util.List<String> defects) {
            this.defects = defects;
            return this;
        }
        public java.util.List<String> getDefects() {
            return this.defects;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setPaasApplyIds(java.util.List<String> paasApplyIds) {
            this.paasApplyIds = paasApplyIds;
            return this;
        }
        public java.util.List<String> getPaasApplyIds() {
            return this.paasApplyIds;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setRequirements(java.util.List<String> requirements) {
            this.requirements = requirements;
            return this;
        }
        public java.util.List<String> getRequirements() {
            return this.requirements;
        }

        public QueryLinkeBahamutAoneinternaliterationResponseBodyResult setTasks(java.util.List<String> tasks) {
            this.tasks = tasks;
            return this;
        }
        public java.util.List<String> getTasks() {
            return this.tasks;
        }

    }

}
