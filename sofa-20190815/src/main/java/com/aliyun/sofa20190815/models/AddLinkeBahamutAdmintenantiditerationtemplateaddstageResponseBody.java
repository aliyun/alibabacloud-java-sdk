// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBody extends TeaModel {
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
    public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult result;

    public static AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBody self = new AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBody setResult(AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("DockerImageCheck")
        public Boolean dockerImageCheck;

        @NameInMap("Workspace")
        public String workspace;

        @NameInMap("TemplateGroup")
        public String templateGroup;

        @NameInMap("MvnCheck")
        public Boolean mvnCheck;

        @NameInMap("Branch")
        public String branch;

        @NameInMap("PostGuards")
        public java.util.List<String> postGuards;

        @NameInMap("CheckQuality")
        public Boolean checkQuality;

        @NameInMap("Joint")
        public Boolean joint;

        @NameInMap("ShowRelease")
        public Boolean showRelease;

        @NameInMap("Description")
        public String description;

        @NameInMap("PreCheck")
        public Boolean preCheck;

        @NameInMap("MavenRepo")
        public String mavenRepo;

        @NameInMap("SkipApprovalTasks")
        public Boolean skipApprovalTasks;

        @NameInMap("PreSetPipelineTemplateIds")
        public java.util.List<String> preSetPipelineTemplateIds;

        @NameInMap("PreTasks")
        public java.util.List<String> preTasks;

        @NameInMap("PreSetId")
        public String preSetId;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("MergeRequestAllowed")
        public Boolean mergeRequestAllowed;

        @NameInMap("FabricStage")
        public String fabricStage;

        @NameInMap("ConfigItemCheck")
        public Boolean configItemCheck;

        @NameInMap("RevertTasks")
        public java.util.List<String> revertTasks;

        @NameInMap("Name")
        public String name;

        @NameInMap("PostTasks")
        public java.util.List<String> postTasks;

        @NameInMap("PreGuards")
        public java.util.List<String> preGuards;

        @NameInMap("SerialCheck")
        public Boolean serialCheck;

        @NameInMap("MultiEnvConfigs")
        public java.util.List<String> multiEnvConfigs;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("WorkspaceId")
        public String workspaceId;

        @NameInMap("CheckStc")
        public Boolean checkStc;

        @NameInMap("GreyRelease")
        public Boolean greyRelease;

        @NameInMap("SkipCodeChangeCheck")
        public Boolean skipCodeChangeCheck;

        @NameInMap("MutualCheck")
        public Boolean mutualCheck;

        @NameInMap("AutoComplete")
        public Boolean autoComplete;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Pipelines")
        public java.util.List<String> pipelines;

        @NameInMap("Id")
        public String id;

        @NameInMap("CloudWorkspaceId")
        public String cloudWorkspaceId;

        public static AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult self = new AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setDockerImageCheck(Boolean dockerImageCheck) {
            this.dockerImageCheck = dockerImageCheck;
            return this;
        }
        public Boolean getDockerImageCheck() {
            return this.dockerImageCheck;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setWorkspace(String workspace) {
            this.workspace = workspace;
            return this;
        }
        public String getWorkspace() {
            return this.workspace;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setTemplateGroup(String templateGroup) {
            this.templateGroup = templateGroup;
            return this;
        }
        public String getTemplateGroup() {
            return this.templateGroup;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setMvnCheck(Boolean mvnCheck) {
            this.mvnCheck = mvnCheck;
            return this;
        }
        public Boolean getMvnCheck() {
            return this.mvnCheck;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setPostGuards(java.util.List<String> postGuards) {
            this.postGuards = postGuards;
            return this;
        }
        public java.util.List<String> getPostGuards() {
            return this.postGuards;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setCheckQuality(Boolean checkQuality) {
            this.checkQuality = checkQuality;
            return this;
        }
        public Boolean getCheckQuality() {
            return this.checkQuality;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setJoint(Boolean joint) {
            this.joint = joint;
            return this;
        }
        public Boolean getJoint() {
            return this.joint;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setShowRelease(Boolean showRelease) {
            this.showRelease = showRelease;
            return this;
        }
        public Boolean getShowRelease() {
            return this.showRelease;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setPreCheck(Boolean preCheck) {
            this.preCheck = preCheck;
            return this;
        }
        public Boolean getPreCheck() {
            return this.preCheck;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setMavenRepo(String mavenRepo) {
            this.mavenRepo = mavenRepo;
            return this;
        }
        public String getMavenRepo() {
            return this.mavenRepo;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setSkipApprovalTasks(Boolean skipApprovalTasks) {
            this.skipApprovalTasks = skipApprovalTasks;
            return this;
        }
        public Boolean getSkipApprovalTasks() {
            return this.skipApprovalTasks;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setPreSetPipelineTemplateIds(java.util.List<String> preSetPipelineTemplateIds) {
            this.preSetPipelineTemplateIds = preSetPipelineTemplateIds;
            return this;
        }
        public java.util.List<String> getPreSetPipelineTemplateIds() {
            return this.preSetPipelineTemplateIds;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setPreTasks(java.util.List<String> preTasks) {
            this.preTasks = preTasks;
            return this;
        }
        public java.util.List<String> getPreTasks() {
            return this.preTasks;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setPreSetId(String preSetId) {
            this.preSetId = preSetId;
            return this;
        }
        public String getPreSetId() {
            return this.preSetId;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setMergeRequestAllowed(Boolean mergeRequestAllowed) {
            this.mergeRequestAllowed = mergeRequestAllowed;
            return this;
        }
        public Boolean getMergeRequestAllowed() {
            return this.mergeRequestAllowed;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setFabricStage(String fabricStage) {
            this.fabricStage = fabricStage;
            return this;
        }
        public String getFabricStage() {
            return this.fabricStage;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setConfigItemCheck(Boolean configItemCheck) {
            this.configItemCheck = configItemCheck;
            return this;
        }
        public Boolean getConfigItemCheck() {
            return this.configItemCheck;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setRevertTasks(java.util.List<String> revertTasks) {
            this.revertTasks = revertTasks;
            return this;
        }
        public java.util.List<String> getRevertTasks() {
            return this.revertTasks;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setPostTasks(java.util.List<String> postTasks) {
            this.postTasks = postTasks;
            return this;
        }
        public java.util.List<String> getPostTasks() {
            return this.postTasks;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setPreGuards(java.util.List<String> preGuards) {
            this.preGuards = preGuards;
            return this;
        }
        public java.util.List<String> getPreGuards() {
            return this.preGuards;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setSerialCheck(Boolean serialCheck) {
            this.serialCheck = serialCheck;
            return this;
        }
        public Boolean getSerialCheck() {
            return this.serialCheck;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setMultiEnvConfigs(java.util.List<String> multiEnvConfigs) {
            this.multiEnvConfigs = multiEnvConfigs;
            return this;
        }
        public java.util.List<String> getMultiEnvConfigs() {
            return this.multiEnvConfigs;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setCheckStc(Boolean checkStc) {
            this.checkStc = checkStc;
            return this;
        }
        public Boolean getCheckStc() {
            return this.checkStc;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setGreyRelease(Boolean greyRelease) {
            this.greyRelease = greyRelease;
            return this;
        }
        public Boolean getGreyRelease() {
            return this.greyRelease;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setSkipCodeChangeCheck(Boolean skipCodeChangeCheck) {
            this.skipCodeChangeCheck = skipCodeChangeCheck;
            return this;
        }
        public Boolean getSkipCodeChangeCheck() {
            return this.skipCodeChangeCheck;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setMutualCheck(Boolean mutualCheck) {
            this.mutualCheck = mutualCheck;
            return this;
        }
        public Boolean getMutualCheck() {
            return this.mutualCheck;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setAutoComplete(Boolean autoComplete) {
            this.autoComplete = autoComplete;
            return this;
        }
        public Boolean getAutoComplete() {
            return this.autoComplete;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setPipelines(java.util.List<String> pipelines) {
            this.pipelines = pipelines;
            return this;
        }
        public java.util.List<String> getPipelines() {
            return this.pipelines;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddLinkeBahamutAdmintenantiditerationtemplateaddstageResponseBodyResult setCloudWorkspaceId(String cloudWorkspaceId) {
            this.cloudWorkspaceId = cloudWorkspaceId;
            return this;
        }
        public String getCloudWorkspaceId() {
            return this.cloudWorkspaceId;
        }

    }

}
