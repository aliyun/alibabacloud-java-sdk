// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeBahamutAdminiterationtemplateeditstageResponseBody extends TeaModel {
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
    public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult result;

    public static SaveLinkeBahamutAdminiterationtemplateeditstageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeBahamutAdminiterationtemplateeditstageResponseBody self = new SaveLinkeBahamutAdminiterationtemplateeditstageResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBody setResult(SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult getResult() {
        return this.result;
    }

    public static class SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult extends TeaModel {
        @NameInMap("AutoComplete")
        public Boolean autoComplete;

        @NameInMap("Branch")
        public String branch;

        @NameInMap("CheckQuality")
        public Boolean checkQuality;

        @NameInMap("CheckStc")
        public Boolean checkStc;

        @NameInMap("CloudWorkspaceId")
        public String cloudWorkspaceId;

        @NameInMap("ConfigItemCheck")
        public Boolean configItemCheck;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("DockerImageCheck")
        public Boolean dockerImageCheck;

        @NameInMap("FabricStage")
        public String fabricStage;

        @NameInMap("GreyRelease")
        public Boolean greyRelease;

        @NameInMap("Id")
        public String id;

        @NameInMap("Joint")
        public Boolean joint;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("MavenRepo")
        public String mavenRepo;

        @NameInMap("MergeRequestAllowed")
        public Boolean mergeRequestAllowed;

        @NameInMap("MutualCheck")
        public Boolean mutualCheck;

        @NameInMap("MvnCheck")
        public Boolean mvnCheck;

        @NameInMap("Name")
        public String name;

        @NameInMap("PreCheck")
        public Boolean preCheck;

        @NameInMap("PreSetId")
        public String preSetId;

        @NameInMap("SerialCheck")
        public Boolean serialCheck;

        @NameInMap("ShowRelease")
        public Boolean showRelease;

        @NameInMap("SkipApprovalTasks")
        public Boolean skipApprovalTasks;

        @NameInMap("SkipCodeChangeCheck")
        public Boolean skipCodeChangeCheck;

        @NameInMap("TemplateGroup")
        public String templateGroup;

        @NameInMap("Type")
        public String type;

        @NameInMap("Workspace")
        public String workspace;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("MultiEnvConfigs")
        public java.util.List<String> multiEnvConfigs;

        @NameInMap("Pipelines")
        public java.util.List<String> pipelines;

        @NameInMap("PostGuards")
        public java.util.List<String> postGuards;

        @NameInMap("PostTasks")
        public java.util.List<String> postTasks;

        @NameInMap("PreGuards")
        public java.util.List<String> preGuards;

        @NameInMap("PreSetPipelineTemplateIds")
        public java.util.List<String> preSetPipelineTemplateIds;

        @NameInMap("PreTasks")
        public java.util.List<String> preTasks;

        @NameInMap("RevertTasks")
        public java.util.List<String> revertTasks;

        public static SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult self = new SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setAutoComplete(Boolean autoComplete) {
            this.autoComplete = autoComplete;
            return this;
        }
        public Boolean getAutoComplete() {
            return this.autoComplete;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setCheckQuality(Boolean checkQuality) {
            this.checkQuality = checkQuality;
            return this;
        }
        public Boolean getCheckQuality() {
            return this.checkQuality;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setCheckStc(Boolean checkStc) {
            this.checkStc = checkStc;
            return this;
        }
        public Boolean getCheckStc() {
            return this.checkStc;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setCloudWorkspaceId(String cloudWorkspaceId) {
            this.cloudWorkspaceId = cloudWorkspaceId;
            return this;
        }
        public String getCloudWorkspaceId() {
            return this.cloudWorkspaceId;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setConfigItemCheck(Boolean configItemCheck) {
            this.configItemCheck = configItemCheck;
            return this;
        }
        public Boolean getConfigItemCheck() {
            return this.configItemCheck;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setDockerImageCheck(Boolean dockerImageCheck) {
            this.dockerImageCheck = dockerImageCheck;
            return this;
        }
        public Boolean getDockerImageCheck() {
            return this.dockerImageCheck;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setFabricStage(String fabricStage) {
            this.fabricStage = fabricStage;
            return this;
        }
        public String getFabricStage() {
            return this.fabricStage;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setGreyRelease(Boolean greyRelease) {
            this.greyRelease = greyRelease;
            return this;
        }
        public Boolean getGreyRelease() {
            return this.greyRelease;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setJoint(Boolean joint) {
            this.joint = joint;
            return this;
        }
        public Boolean getJoint() {
            return this.joint;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setMavenRepo(String mavenRepo) {
            this.mavenRepo = mavenRepo;
            return this;
        }
        public String getMavenRepo() {
            return this.mavenRepo;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setMergeRequestAllowed(Boolean mergeRequestAllowed) {
            this.mergeRequestAllowed = mergeRequestAllowed;
            return this;
        }
        public Boolean getMergeRequestAllowed() {
            return this.mergeRequestAllowed;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setMutualCheck(Boolean mutualCheck) {
            this.mutualCheck = mutualCheck;
            return this;
        }
        public Boolean getMutualCheck() {
            return this.mutualCheck;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setMvnCheck(Boolean mvnCheck) {
            this.mvnCheck = mvnCheck;
            return this;
        }
        public Boolean getMvnCheck() {
            return this.mvnCheck;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setPreCheck(Boolean preCheck) {
            this.preCheck = preCheck;
            return this;
        }
        public Boolean getPreCheck() {
            return this.preCheck;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setPreSetId(String preSetId) {
            this.preSetId = preSetId;
            return this;
        }
        public String getPreSetId() {
            return this.preSetId;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setSerialCheck(Boolean serialCheck) {
            this.serialCheck = serialCheck;
            return this;
        }
        public Boolean getSerialCheck() {
            return this.serialCheck;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setShowRelease(Boolean showRelease) {
            this.showRelease = showRelease;
            return this;
        }
        public Boolean getShowRelease() {
            return this.showRelease;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setSkipApprovalTasks(Boolean skipApprovalTasks) {
            this.skipApprovalTasks = skipApprovalTasks;
            return this;
        }
        public Boolean getSkipApprovalTasks() {
            return this.skipApprovalTasks;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setSkipCodeChangeCheck(Boolean skipCodeChangeCheck) {
            this.skipCodeChangeCheck = skipCodeChangeCheck;
            return this;
        }
        public Boolean getSkipCodeChangeCheck() {
            return this.skipCodeChangeCheck;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setTemplateGroup(String templateGroup) {
            this.templateGroup = templateGroup;
            return this;
        }
        public String getTemplateGroup() {
            return this.templateGroup;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setMultiEnvConfigs(java.util.List<String> multiEnvConfigs) {
            this.multiEnvConfigs = multiEnvConfigs;
            return this;
        }
        public java.util.List<String> getMultiEnvConfigs() {
            return this.multiEnvConfigs;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setPipelines(java.util.List<String> pipelines) {
            this.pipelines = pipelines;
            return this;
        }
        public java.util.List<String> getPipelines() {
            return this.pipelines;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setPostGuards(java.util.List<String> postGuards) {
            this.postGuards = postGuards;
            return this;
        }
        public java.util.List<String> getPostGuards() {
            return this.postGuards;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setPostTasks(java.util.List<String> postTasks) {
            this.postTasks = postTasks;
            return this;
        }
        public java.util.List<String> getPostTasks() {
            return this.postTasks;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setPreGuards(java.util.List<String> preGuards) {
            this.preGuards = preGuards;
            return this;
        }
        public java.util.List<String> getPreGuards() {
            return this.preGuards;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setPreSetPipelineTemplateIds(java.util.List<String> preSetPipelineTemplateIds) {
            this.preSetPipelineTemplateIds = preSetPipelineTemplateIds;
            return this;
        }
        public java.util.List<String> getPreSetPipelineTemplateIds() {
            return this.preSetPipelineTemplateIds;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setPreTasks(java.util.List<String> preTasks) {
            this.preTasks = preTasks;
            return this;
        }
        public java.util.List<String> getPreTasks() {
            return this.preTasks;
        }

        public SaveLinkeBahamutAdminiterationtemplateeditstageResponseBodyResult setRevertTasks(java.util.List<String> revertTasks) {
            this.revertTasks = revertTasks;
            return this;
        }
        public java.util.List<String> getRevertTasks() {
            return this.revertTasks;
        }

    }

}
