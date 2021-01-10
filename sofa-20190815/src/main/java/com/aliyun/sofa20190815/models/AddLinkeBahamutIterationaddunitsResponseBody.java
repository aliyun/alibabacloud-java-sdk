// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutIterationaddunitsResponseBody extends TeaModel {
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
    public java.util.List<AddLinkeBahamutIterationaddunitsResponseBodyResult> result;

    public static AddLinkeBahamutIterationaddunitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutIterationaddunitsResponseBody self = new AddLinkeBahamutIterationaddunitsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutIterationaddunitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeBahamutIterationaddunitsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddLinkeBahamutIterationaddunitsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeBahamutIterationaddunitsResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public AddLinkeBahamutIterationaddunitsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddLinkeBahamutIterationaddunitsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeBahamutIterationaddunitsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddLinkeBahamutIterationaddunitsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddLinkeBahamutIterationaddunitsResponseBody setResult(java.util.List<AddLinkeBahamutIterationaddunitsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<AddLinkeBahamutIterationaddunitsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class AddLinkeBahamutIterationaddunitsResponseBodyResult extends TeaModel {
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

        public static AddLinkeBahamutIterationaddunitsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeBahamutIterationaddunitsResponseBodyResult self = new AddLinkeBahamutIterationaddunitsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setProdVersion(String prodVersion) {
            this.prodVersion = prodVersion;
            return this;
        }
        public String getProdVersion() {
            return this.prodVersion;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setStages(java.util.List<String> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<String> getStages() {
            return this.stages;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setCurrentStage(String currentStage) {
            this.currentStage = currentStage;
            return this;
        }
        public String getCurrentStage() {
            return this.currentStage;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setAppMeta(String appMeta) {
            this.appMeta = appMeta;
            return this;
        }
        public String getAppMeta() {
            return this.appMeta;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setCurrentStageStep(String currentStageStep) {
            this.currentStageStep = currentStageStep;
            return this;
        }
        public String getCurrentStageStep() {
            return this.currentStageStep;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setSkipReleaseCheck(Boolean skipReleaseCheck) {
            this.skipReleaseCheck = skipReleaseCheck;
            return this;
        }
        public Boolean getSkipReleaseCheck() {
            return this.skipReleaseCheck;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setCompatible(Boolean compatible) {
            this.compatible = compatible;
            return this;
        }
        public Boolean getCompatible() {
            return this.compatible;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setCreateAfterUseLinkQ(Boolean createAfterUseLinkQ) {
            this.createAfterUseLinkQ = createAfterUseLinkQ;
            return this;
        }
        public Boolean getCreateAfterUseLinkQ() {
            return this.createAfterUseLinkQ;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setCreatedBy(java.util.List<String> createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public java.util.List<String> getCreatedBy() {
            return this.createdBy;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setBeforeSit(Boolean beforeSit) {
            this.beforeSit = beforeSit;
            return this;
        }
        public Boolean getBeforeSit() {
            return this.beforeSit;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setLastStage(String lastStage) {
            this.lastStage = lastStage;
            return this;
        }
        public String getLastStage() {
            return this.lastStage;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setJars(java.util.List<String> jars) {
            this.jars = jars;
            return this;
        }
        public java.util.List<String> getJars() {
            return this.jars;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setCreatorSysName(String creatorSysName) {
            this.creatorSysName = creatorSysName;
            return this;
        }
        public String getCreatorSysName() {
            return this.creatorSysName;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setDeletedByIteration(Boolean deletedByIteration) {
            this.deletedByIteration = deletedByIteration;
            return this;
        }
        public Boolean getDeletedByIteration() {
            return this.deletedByIteration;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult set_private(Boolean _private) {
            this._private = _private;
            return this;
        }
        public Boolean get_private() {
            return this._private;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setNextStage(String nextStage) {
            this.nextStage = nextStage;
            return this;
        }
        public String getNextStage() {
            return this.nextStage;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setIteration(String iteration) {
            this.iteration = iteration;
            return this;
        }
        public String getIteration() {
            return this.iteration;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setYunyDaily(Boolean yunyDaily) {
            this.yunyDaily = yunyDaily;
            return this;
        }
        public Boolean getYunyDaily() {
            return this.yunyDaily;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setBatchIndex(Long batchIndex) {
            this.batchIndex = batchIndex;
            return this;
        }
        public Long getBatchIndex() {
            return this.batchIndex;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setFromCommitId(String fromCommitId) {
            this.fromCommitId = fromCommitId;
            return this;
        }
        public String getFromCommitId() {
            return this.fromCommitId;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setJarHistrories(java.util.List<String> jarHistrories) {
            this.jarHistrories = jarHistrories;
            return this;
        }
        public java.util.List<String> getJarHistrories() {
            return this.jarHistrories;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public AddLinkeBahamutIterationaddunitsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
