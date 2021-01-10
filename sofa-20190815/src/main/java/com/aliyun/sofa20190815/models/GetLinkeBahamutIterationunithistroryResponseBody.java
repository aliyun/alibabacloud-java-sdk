// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationunithistroryResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutIterationunithistroryResponseBodyResult> result;

    public static GetLinkeBahamutIterationunithistroryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationunithistroryResponseBody self = new GetLinkeBahamutIterationunithistroryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationunithistroryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutIterationunithistroryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutIterationunithistroryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutIterationunithistroryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutIterationunithistroryResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutIterationunithistroryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutIterationunithistroryResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutIterationunithistroryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutIterationunithistroryResponseBody setResult(java.util.List<GetLinkeBahamutIterationunithistroryResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutIterationunithistroryResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutIterationunithistroryResponseBodyResult extends TeaModel {
        @NameInMap("Applicant")
        public String applicant;

        @NameInMap("ArtifactId")
        public String artifactId;

        @NameInMap("Branch")
        public String branch;

        @NameInMap("Commit")
        public String commit;

        @NameInMap("ComponentExecutionId")
        public String componentExecutionId;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Incompatible")
        public Boolean incompatible;

        @NameInMap("IterationUnitHistoryTypeEnum")
        public String iterationUnitHistoryTypeEnum;

        @NameInMap("Key")
        public String key;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("PipelineExecutionId")
        public Long pipelineExecutionId;

        @NameInMap("PipelineInstanceId")
        public Long pipelineInstanceId;

        @NameInMap("PublishJarEnv")
        public String publishJarEnv;

        @NameInMap("ReleaseTime")
        public Long releaseTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("UnitId")
        public String unitId;

        @NameInMap("UnitStageId")
        public String unitStageId;

        @NameInMap("Value")
        public String value;

        @NameInMap("Version")
        public String version;

        @NameInMap("MvnRepo")
        public java.util.List<String> mvnRepo;

        public static GetLinkeBahamutIterationunithistroryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutIterationunithistroryResponseBodyResult self = new GetLinkeBahamutIterationunithistroryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setApplicant(String applicant) {
            this.applicant = applicant;
            return this;
        }
        public String getApplicant() {
            return this.applicant;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setArtifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }
        public String getArtifactId() {
            return this.artifactId;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setBranch(String branch) {
            this.branch = branch;
            return this;
        }
        public String getBranch() {
            return this.branch;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setCommit(String commit) {
            this.commit = commit;
            return this;
        }
        public String getCommit() {
            return this.commit;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setComponentExecutionId(String componentExecutionId) {
            this.componentExecutionId = componentExecutionId;
            return this;
        }
        public String getComponentExecutionId() {
            return this.componentExecutionId;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setIncompatible(Boolean incompatible) {
            this.incompatible = incompatible;
            return this;
        }
        public Boolean getIncompatible() {
            return this.incompatible;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setIterationUnitHistoryTypeEnum(String iterationUnitHistoryTypeEnum) {
            this.iterationUnitHistoryTypeEnum = iterationUnitHistoryTypeEnum;
            return this;
        }
        public String getIterationUnitHistoryTypeEnum() {
            return this.iterationUnitHistoryTypeEnum;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setPipelineExecutionId(Long pipelineExecutionId) {
            this.pipelineExecutionId = pipelineExecutionId;
            return this;
        }
        public Long getPipelineExecutionId() {
            return this.pipelineExecutionId;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setPipelineInstanceId(Long pipelineInstanceId) {
            this.pipelineInstanceId = pipelineInstanceId;
            return this;
        }
        public Long getPipelineInstanceId() {
            return this.pipelineInstanceId;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setPublishJarEnv(String publishJarEnv) {
            this.publishJarEnv = publishJarEnv;
            return this;
        }
        public String getPublishJarEnv() {
            return this.publishJarEnv;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setReleaseTime(Long releaseTime) {
            this.releaseTime = releaseTime;
            return this;
        }
        public Long getReleaseTime() {
            return this.releaseTime;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setUnitId(String unitId) {
            this.unitId = unitId;
            return this;
        }
        public String getUnitId() {
            return this.unitId;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setUnitStageId(String unitStageId) {
            this.unitStageId = unitStageId;
            return this;
        }
        public String getUnitStageId() {
            return this.unitStageId;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetLinkeBahamutIterationunithistroryResponseBodyResult setMvnRepo(java.util.List<String> mvnRepo) {
            this.mvnRepo = mvnRepo;
            return this;
        }
        public java.util.List<String> getMvnRepo() {
            return this.mvnRepo;
        }

    }

}
