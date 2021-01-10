// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBody extends TeaModel {
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
    public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBodyResult result;

    public static RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBody self = new RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBody setResult(RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBodyResult extends TeaModel {
        @NameInMap("Auto")
        public Boolean auto;

        @NameInMap("Context")
        public String context;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("InVisible")
        public Boolean inVisible;

        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Pipeline")
        public String pipeline;

        @NameInMap("PipelineInstanceId")
        public Long pipelineInstanceId;

        @NameInMap("PipelineTemplateId")
        public Long pipelineTemplateId;

        @NameInMap("PipelineTrigger")
        public String pipelineTrigger;

        public static RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBodyResult self = new RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBodyResult setAuto(Boolean auto) {
            this.auto = auto;
            return this;
        }
        public Boolean getAuto() {
            return this.auto;
        }

        public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBodyResult setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBodyResult setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBodyResult setInVisible(Boolean inVisible) {
            this.inVisible = inVisible;
            return this;
        }
        public Boolean getInVisible() {
            return this.inVisible;
        }

        public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBodyResult setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBodyResult setPipeline(String pipeline) {
            this.pipeline = pipeline;
            return this;
        }
        public String getPipeline() {
            return this.pipeline;
        }

        public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBodyResult setPipelineInstanceId(Long pipelineInstanceId) {
            this.pipelineInstanceId = pipelineInstanceId;
            return this;
        }
        public Long getPipelineInstanceId() {
            return this.pipelineInstanceId;
        }

        public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBodyResult setPipelineTemplateId(Long pipelineTemplateId) {
            this.pipelineTemplateId = pipelineTemplateId;
            return this;
        }
        public Long getPipelineTemplateId() {
            return this.pipelineTemplateId;
        }

        public RetryrollbackLinkeBahamutWebapirecoveryinitinstanceResponseBodyResult setPipelineTrigger(String pipelineTrigger) {
            this.pipelineTrigger = pipelineTrigger;
            return this;
        }
        public String getPipelineTrigger() {
            return this.pipelineTrigger;
        }

    }

}
