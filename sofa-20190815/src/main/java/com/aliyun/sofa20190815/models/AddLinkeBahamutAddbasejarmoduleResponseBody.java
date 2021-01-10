// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAddbasejarmoduleResponseBody extends TeaModel {
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
    public AddLinkeBahamutAddbasejarmoduleResponseBodyResult result;

    public static AddLinkeBahamutAddbasejarmoduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAddbasejarmoduleResponseBody self = new AddLinkeBahamutAddbasejarmoduleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAddbasejarmoduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeBahamutAddbasejarmoduleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddLinkeBahamutAddbasejarmoduleResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeBahamutAddbasejarmoduleResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public AddLinkeBahamutAddbasejarmoduleResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddLinkeBahamutAddbasejarmoduleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeBahamutAddbasejarmoduleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddLinkeBahamutAddbasejarmoduleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddLinkeBahamutAddbasejarmoduleResponseBody setResult(AddLinkeBahamutAddbasejarmoduleResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddLinkeBahamutAddbasejarmoduleResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddLinkeBahamutAddbasejarmoduleResponseBodyResult extends TeaModel {
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

        public static AddLinkeBahamutAddbasejarmoduleResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeBahamutAddbasejarmoduleResponseBodyResult self = new AddLinkeBahamutAddbasejarmoduleResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setProdVersion(String prodVersion) {
            this.prodVersion = prodVersion;
            return this;
        }
        public String getProdVersion() {
            return this.prodVersion;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setMembers(java.util.List<String> members) {
            this.members = members;
            return this;
        }
        public java.util.List<String> getMembers() {
            return this.members;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setStages(java.util.List<String> stages) {
            this.stages = stages;
            return this;
        }
        public java.util.List<String> getStages() {
            return this.stages;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setCurrentStage(String currentStage) {
            this.currentStage = currentStage;
            return this;
        }
        public String getCurrentStage() {
            return this.currentStage;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setAppMeta(String appMeta) {
            this.appMeta = appMeta;
            return this;
        }
        public String getAppMeta() {
            return this.appMeta;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setCurrentStageStep(String currentStageStep) {
            this.currentStageStep = currentStageStep;
            return this;
        }
        public String getCurrentStageStep() {
            return this.currentStageStep;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setSkipReleaseCheck(Boolean skipReleaseCheck) {
            this.skipReleaseCheck = skipReleaseCheck;
            return this;
        }
        public Boolean getSkipReleaseCheck() {
            return this.skipReleaseCheck;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setCompatible(Boolean compatible) {
            this.compatible = compatible;
            return this;
        }
        public Boolean getCompatible() {
            return this.compatible;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setCreateAfterUseLinkQ(Boolean createAfterUseLinkQ) {
            this.createAfterUseLinkQ = createAfterUseLinkQ;
            return this;
        }
        public Boolean getCreateAfterUseLinkQ() {
            return this.createAfterUseLinkQ;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setCreatedBy(java.util.List<String> createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public java.util.List<String> getCreatedBy() {
            return this.createdBy;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setBeforeSit(Boolean beforeSit) {
            this.beforeSit = beforeSit;
            return this;
        }
        public Boolean getBeforeSit() {
            return this.beforeSit;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setDeleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public Boolean getDeleted() {
            return this.deleted;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setLastStage(String lastStage) {
            this.lastStage = lastStage;
            return this;
        }
        public String getLastStage() {
            return this.lastStage;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setJars(java.util.List<String> jars) {
            this.jars = jars;
            return this;
        }
        public java.util.List<String> getJars() {
            return this.jars;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setCreatorSysName(String creatorSysName) {
            this.creatorSysName = creatorSysName;
            return this;
        }
        public String getCreatorSysName() {
            return this.creatorSysName;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setFrom(String from) {
            this.from = from;
            return this;
        }
        public String getFrom() {
            return this.from;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setProdCode(String prodCode) {
            this.prodCode = prodCode;
            return this;
        }
        public String getProdCode() {
            return this.prodCode;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setDeletedByIteration(Boolean deletedByIteration) {
            this.deletedByIteration = deletedByIteration;
            return this;
        }
        public Boolean getDeletedByIteration() {
            return this.deletedByIteration;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult set_private(Boolean _private) {
            this._private = _private;
            return this;
        }
        public Boolean get_private() {
            return this._private;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setNextStage(String nextStage) {
            this.nextStage = nextStage;
            return this;
        }
        public String getNextStage() {
            return this.nextStage;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setIteration(String iteration) {
            this.iteration = iteration;
            return this;
        }
        public String getIteration() {
            return this.iteration;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setTenant(String tenant) {
            this.tenant = tenant;
            return this;
        }
        public String getTenant() {
            return this.tenant;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setYunyDaily(Boolean yunyDaily) {
            this.yunyDaily = yunyDaily;
            return this;
        }
        public Boolean getYunyDaily() {
            return this.yunyDaily;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setBatchIndex(Long batchIndex) {
            this.batchIndex = batchIndex;
            return this;
        }
        public Long getBatchIndex() {
            return this.batchIndex;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setFromCommitId(String fromCommitId) {
            this.fromCommitId = fromCommitId;
            return this;
        }
        public String getFromCommitId() {
            return this.fromCommitId;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setJarHistrories(java.util.List<String> jarHistrories) {
            this.jarHistrories = jarHistrories;
            return this;
        }
        public java.util.List<String> getJarHistrories() {
            return this.jarHistrories;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public AddLinkeBahamutAddbasejarmoduleResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
