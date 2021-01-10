// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutAddaddinstanceResponseBody extends TeaModel {
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
    public AddLinkeBahamutAddaddinstanceResponseBodyResult result;

    public static AddLinkeBahamutAddaddinstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutAddaddinstanceResponseBody self = new AddLinkeBahamutAddaddinstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutAddaddinstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLinkeBahamutAddaddinstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddLinkeBahamutAddaddinstanceResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public AddLinkeBahamutAddaddinstanceResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public AddLinkeBahamutAddaddinstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddLinkeBahamutAddaddinstanceResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddLinkeBahamutAddaddinstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddLinkeBahamutAddaddinstanceResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddLinkeBahamutAddaddinstanceResponseBody setResult(AddLinkeBahamutAddaddinstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddLinkeBahamutAddaddinstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class AddLinkeBahamutAddaddinstanceResponseBodyResult extends TeaModel {
        @NameInMap("LastModified")
        public Long lastModified;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Context")
        public String context;

        @NameInMap("InVisible")
        public Boolean inVisible;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("PipelineInstanceId")
        public Long pipelineInstanceId;

        @NameInMap("Pipeline")
        public String pipeline;

        @NameInMap("PipelineTemplateId")
        public Long pipelineTemplateId;

        @NameInMap("PipelineTrigger")
        public String pipelineTrigger;

        @NameInMap("Auto")
        public Boolean auto;

        public static AddLinkeBahamutAddaddinstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddLinkeBahamutAddaddinstanceResponseBodyResult self = new AddLinkeBahamutAddaddinstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddLinkeBahamutAddaddinstanceResponseBodyResult setLastModified(Long lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public Long getLastModified() {
            return this.lastModified;
        }

        public AddLinkeBahamutAddaddinstanceResponseBodyResult setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public AddLinkeBahamutAddaddinstanceResponseBodyResult setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public AddLinkeBahamutAddaddinstanceResponseBodyResult setInVisible(Boolean inVisible) {
            this.inVisible = inVisible;
            return this;
        }
        public Boolean getInVisible() {
            return this.inVisible;
        }

        public AddLinkeBahamutAddaddinstanceResponseBodyResult setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public AddLinkeBahamutAddaddinstanceResponseBodyResult setPipelineInstanceId(Long pipelineInstanceId) {
            this.pipelineInstanceId = pipelineInstanceId;
            return this;
        }
        public Long getPipelineInstanceId() {
            return this.pipelineInstanceId;
        }

        public AddLinkeBahamutAddaddinstanceResponseBodyResult setPipeline(String pipeline) {
            this.pipeline = pipeline;
            return this;
        }
        public String getPipeline() {
            return this.pipeline;
        }

        public AddLinkeBahamutAddaddinstanceResponseBodyResult setPipelineTemplateId(Long pipelineTemplateId) {
            this.pipelineTemplateId = pipelineTemplateId;
            return this;
        }
        public Long getPipelineTemplateId() {
            return this.pipelineTemplateId;
        }

        public AddLinkeBahamutAddaddinstanceResponseBodyResult setPipelineTrigger(String pipelineTrigger) {
            this.pipelineTrigger = pipelineTrigger;
            return this;
        }
        public String getPipelineTrigger() {
            return this.pipelineTrigger;
        }

        public AddLinkeBahamutAddaddinstanceResponseBodyResult setAuto(Boolean auto) {
            this.auto = auto;
            return this;
        }
        public Boolean getAuto() {
            return this.auto;
        }

    }

}
