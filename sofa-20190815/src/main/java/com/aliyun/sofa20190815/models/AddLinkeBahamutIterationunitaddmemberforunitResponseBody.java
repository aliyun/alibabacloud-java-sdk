// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutIterationunitaddmemberforunitResponseBody extends TeaModel {
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
    public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult result;

    public static AddLinkeBahamutIterationunitaddmemberforunitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutIterationunitaddmemberforunitResponseBody self = new AddLinkeBahamutIterationunitaddmemberforunitResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutIterationunitaddmemberforunitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeBahamutIterationunitaddmemberforunitResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddLinkeBahamutIterationunitaddmemberforunitResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeBahamutIterationunitaddmemberforunitResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public AddLinkeBahamutIterationunitaddmemberforunitResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddLinkeBahamutIterationunitaddmemberforunitResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeBahamutIterationunitaddmemberforunitResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddLinkeBahamutIterationunitaddmemberforunitResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddLinkeBahamutIterationunitaddmemberforunitResponseBody setResult(AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult extends TeaModel {
        @NameInMap("ProdVersion")
        public String prodVersion;

        @NameInMap("Members")
        public java.util.List<String> members;

        @NameInMap("Stages")
        public java.util.List<String> stages;

        @NameInMap("CurrentStage")
        public String currentStage;

        @NameInMap("AppMeta")
        public String appMeta;

        @NameInMap("CurrentStageStep")
        public String currentStageStep;

        @NameInMap("SkipReleaseCheck")
        public Boolean skipReleaseCheck;

        @NameInMap("Compatible")
        public Boolean compatible;

        @NameInMap("CreateAfterUseLinkQ")
        public Boolean createAfterUseLinkQ;

        @NameInMap("Version")
        public String version;

        @NameInMap("CreatedBy")
        public java.util.List<String> createdBy;

        @NameInMap("BeforeSit")
        public Boolean beforeSit;

        @NameInMap("Deleted")
        public Boolean deleted;

        @NameInMap("LastStage")
        public String lastStage;

        @NameInMap("Jars")
        public java.util.List<String> jars;

        @NameInMap("CreatorSysName")
        public String creatorSysName;

        @NameInMap("From")
        public String from;

        @NameInMap("ProdCode")
        public String prodCode;

        @NameInMap("DeletedByIteration")
        public Boolean deletedByIteration;

        @NameInMap("Private")
        public Boolean _private;

        @NameInMap("NextStage")
        public String nextStage;

        @NameInMap("Iteration")
        public String iteration;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Tenant")
        public String tenant;

        @NameInMap("YunyDaily")
        public Boolean yunyDaily;

        @NameInMap("TagName")
        public String tagName;

        @NameInMap("BatchIndex")
        public Long batchIndex;

        @NameInMap("FromCommitId")
        public String fromCommitId;

        @NameInMap("JarHistrories")
        public java.util.List<String> jarHistrories;

        @NameInMap("Created")
        public Long created;

        @NameInMap("Finished")
        public Boolean finished;

        @NameInMap("Id")
        public String id;

        public static AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult self = new AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setProdVersion(String prodVersion) {
            this.prodVersion = prodVersion;
            return this;
        }
        public String getProdVersion() {
            return this.prodVersion;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setStages(java.util.List<String> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<String> getStages() {
            return this.stages;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setCurrentStage(String currentStage) {
            this.currentStage = currentStage;
            return this;
        }
        public String getCurrentStage() {
            return this.currentStage;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setAppMeta(String appMeta) {
            this.appMeta = appMeta;
            return this;
        }
        public String getAppMeta() {
            return this.appMeta;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setCurrentStageStep(String currentStageStep) {
            this.currentStageStep = currentStageStep;
            return this;
        }
        public String getCurrentStageStep() {
            return this.currentStageStep;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setSkipReleaseCheck(Boolean skipReleaseCheck) {
            this.skipReleaseCheck = skipReleaseCheck;
            return this;
        }
        public Boolean getSkipReleaseCheck() {
            return this.skipReleaseCheck;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setCompatible(Boolean compatible) {
            this.compatible = compatible;
            return this;
        }
        public Boolean getCompatible() {
            return this.compatible;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setCreateAfterUseLinkQ(Boolean createAfterUseLinkQ) {
            this.createAfterUseLinkQ = createAfterUseLinkQ;
            return this;
        }
        public Boolean getCreateAfterUseLinkQ() {
            return this.createAfterUseLinkQ;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setCreatedBy(java.util.List<String> createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public java.util.List<String> getCreatedBy() {
            return this.createdBy;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setBeforeSit(Boolean beforeSit) {
            this.beforeSit = beforeSit;
            return this;
        }
        public Boolean getBeforeSit() {
            return this.beforeSit;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setLastStage(String lastStage) {
            this.lastStage = lastStage;
            return this;
        }
        public String getLastStage() {
            return this.lastStage;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setJars(java.util.List<String> jars) {
            this.jars = jars;
            return this;
        }
        public java.util.List<String> getJars() {
            return this.jars;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setCreatorSysName(String creatorSysName) {
            this.creatorSysName = creatorSysName;
            return this;
        }
        public String getCreatorSysName() {
            return this.creatorSysName;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setDeletedByIteration(Boolean deletedByIteration) {
            this.deletedByIteration = deletedByIteration;
            return this;
        }
        public Boolean getDeletedByIteration() {
            return this.deletedByIteration;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult set_private(Boolean _private) {
            this._private = _private;
            return this;
        }
        public Boolean get_private() {
            return this._private;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setNextStage(String nextStage) {
            this.nextStage = nextStage;
            return this;
        }
        public String getNextStage() {
            return this.nextStage;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setIteration(String iteration) {
            this.iteration = iteration;
            return this;
        }
        public String getIteration() {
            return this.iteration;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setYunyDaily(Boolean yunyDaily) {
            this.yunyDaily = yunyDaily;
            return this;
        }
        public Boolean getYunyDaily() {
            return this.yunyDaily;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setBatchIndex(Long batchIndex) {
            this.batchIndex = batchIndex;
            return this;
        }
        public Long getBatchIndex() {
            return this.batchIndex;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setFromCommitId(String fromCommitId) {
            this.fromCommitId = fromCommitId;
            return this;
        }
        public String getFromCommitId() {
            return this.fromCommitId;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setJarHistrories(java.util.List<String> jarHistrories) {
            this.jarHistrories = jarHistrories;
            return this;
        }
        public java.util.List<String> getJarHistrories() {
            return this.jarHistrories;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public AddLinkeBahamutIterationunitaddmemberforunitResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
