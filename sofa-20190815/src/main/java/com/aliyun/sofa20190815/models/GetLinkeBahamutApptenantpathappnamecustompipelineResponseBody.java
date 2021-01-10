// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutApptenantpathappnamecustompipelineResponseBody extends TeaModel {
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
    public java.util.List<GetLinkeBahamutApptenantpathappnamecustompipelineResponseBodyResult> result;

    public static GetLinkeBahamutApptenantpathappnamecustompipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutApptenantpathappnamecustompipelineResponseBody self = new GetLinkeBahamutApptenantpathappnamecustompipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBody setResult(java.util.List<GetLinkeBahamutApptenantpathappnamecustompipelineResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutApptenantpathappnamecustompipelineResponseBodyResult> getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutApptenantpathappnamecustompipelineResponseBodyResult extends TeaModel {
        @NameInMap("Context")
        public String context;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Id")
        public String id;

        @NameInMap("IterationTemplateId")
        public String iterationTemplateId;

        @NameInMap("IterationTemplateName")
        public String iterationTemplateName;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Pipeline")
        public String pipeline;

        @NameInMap("PipelineName")
        public String pipelineName;

        @NameInMap("StageTemplateId")
        public String stageTemplateId;

        @NameInMap("StageTemplateName")
        public String stageTemplateName;

        @NameInMap("Trigger")
        public String trigger;

        public static GetLinkeBahamutApptenantpathappnamecustompipelineResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutApptenantpathappnamecustompipelineResponseBodyResult self = new GetLinkeBahamutApptenantpathappnamecustompipelineResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBodyResult setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBodyResult setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBodyResult setIterationTemplateId(String iterationTemplateId) {
            this.iterationTemplateId = iterationTemplateId;
            return this;
        }
        public String getIterationTemplateId() {
            return this.iterationTemplateId;
        }

        public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBodyResult setIterationTemplateName(String iterationTemplateName) {
            this.iterationTemplateName = iterationTemplateName;
            return this;
        }
        public String getIterationTemplateName() {
            return this.iterationTemplateName;
        }

        public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBodyResult setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBodyResult setPipeline(String pipeline) {
            this.pipeline = pipeline;
            return this;
        }
        public String getPipeline() {
            return this.pipeline;
        }

        public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBodyResult setPipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public String getPipelineName() {
            return this.pipelineName;
        }

        public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBodyResult setStageTemplateId(String stageTemplateId) {
            this.stageTemplateId = stageTemplateId;
            return this;
        }
        public String getStageTemplateId() {
            return this.stageTemplateId;
        }

        public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBodyResult setStageTemplateName(String stageTemplateName) {
            this.stageTemplateName = stageTemplateName;
            return this;
        }
        public String getStageTemplateName() {
            return this.stageTemplateName;
        }

        public GetLinkeBahamutApptenantpathappnamecustompipelineResponseBodyResult setTrigger(String trigger) {
            this.trigger = trigger;
            return this;
        }
        public String getTrigger() {
            return this.trigger;
        }

    }

}
