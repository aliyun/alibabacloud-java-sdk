// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SyncLinkeBahamutBasejarmodulesResponseBody extends TeaModel {
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
    public java.util.List<SyncLinkeBahamutBasejarmodulesResponseBodyResult> result;

    public static SyncLinkeBahamutBasejarmodulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncLinkeBahamutBasejarmodulesResponseBody self = new SyncLinkeBahamutBasejarmodulesResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncLinkeBahamutBasejarmodulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncLinkeBahamutBasejarmodulesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncLinkeBahamutBasejarmodulesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public SyncLinkeBahamutBasejarmodulesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SyncLinkeBahamutBasejarmodulesResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public SyncLinkeBahamutBasejarmodulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SyncLinkeBahamutBasejarmodulesResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public SyncLinkeBahamutBasejarmodulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SyncLinkeBahamutBasejarmodulesResponseBody setResult(java.util.List<SyncLinkeBahamutBasejarmodulesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<SyncLinkeBahamutBasejarmodulesResponseBodyResult> getResult() {
        return this.result;
    }

    public static class SyncLinkeBahamutBasejarmodulesResponseBodyResult extends TeaModel {
        @NameInMap("ArtifactId")
        public String artifactId;

        @NameInMap("Classifier")
        public String classifier;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("ModuleType")
        public String moduleType;

        public static SyncLinkeBahamutBasejarmodulesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SyncLinkeBahamutBasejarmodulesResponseBodyResult self = new SyncLinkeBahamutBasejarmodulesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SyncLinkeBahamutBasejarmodulesResponseBodyResult setArtifactId(String artifactId) {
            this.artifactId = artifactId;
            return this;
        }
        public String getArtifactId() {
            return this.artifactId;
        }

        public SyncLinkeBahamutBasejarmodulesResponseBodyResult setClassifier(String classifier) {
            this.classifier = classifier;
            return this;
        }
        public String getClassifier() {
            return this.classifier;
        }

        public SyncLinkeBahamutBasejarmodulesResponseBodyResult setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public SyncLinkeBahamutBasejarmodulesResponseBodyResult setModuleType(String moduleType) {
            this.moduleType = moduleType;
            return this;
        }
        public String getModuleType() {
            return this.moduleType;
        }

    }

}
