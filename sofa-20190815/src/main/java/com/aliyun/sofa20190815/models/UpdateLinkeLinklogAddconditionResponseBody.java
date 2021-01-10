// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinklogAddconditionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResponseContentRange")
    public String responseContentRange;

    @NameInMap("ResponseContentType")
    public String responseContentType;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public UpdateLinkeLinklogAddconditionResponseBodyResult result;

    public static UpdateLinkeLinklogAddconditionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinklogAddconditionResponseBody self = new UpdateLinkeLinklogAddconditionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinklogAddconditionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeLinklogAddconditionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeLinklogAddconditionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeLinklogAddconditionResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public UpdateLinkeLinklogAddconditionResponseBody setResponseContentRange(String responseContentRange) {
        this.responseContentRange = responseContentRange;
        return this;
    }
    public String getResponseContentRange() {
        return this.responseContentRange;
    }

    public UpdateLinkeLinklogAddconditionResponseBody setResponseContentType(String responseContentType) {
        this.responseContentType = responseContentType;
        return this;
    }
    public String getResponseContentType() {
        return this.responseContentType;
    }

    public UpdateLinkeLinklogAddconditionResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeLinklogAddconditionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateLinkeLinklogAddconditionResponseBody setResult(UpdateLinkeLinklogAddconditionResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateLinkeLinklogAddconditionResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateLinkeLinklogAddconditionResponseBodyResult extends TeaModel {
        @NameInMap("Compiled")
        public String compiled;

        @NameInMap("ConditionId")
        public Long conditionId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IndicationId")
        public Long indicationId;

        @NameInMap("LogSample")
        public String logSample;

        @NameInMap("Pattern")
        public String pattern;

        public static UpdateLinkeLinklogAddconditionResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeLinklogAddconditionResponseBodyResult self = new UpdateLinkeLinklogAddconditionResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeLinklogAddconditionResponseBodyResult setCompiled(String compiled) {
            this.compiled = compiled;
            return this;
        }
        public String getCompiled() {
            return this.compiled;
        }

        public UpdateLinkeLinklogAddconditionResponseBodyResult setConditionId(Long conditionId) {
            this.conditionId = conditionId;
            return this;
        }
        public Long getConditionId() {
            return this.conditionId;
        }

        public UpdateLinkeLinklogAddconditionResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateLinkeLinklogAddconditionResponseBodyResult setIndicationId(Long indicationId) {
            this.indicationId = indicationId;
            return this;
        }
        public Long getIndicationId() {
            return this.indicationId;
        }

        public UpdateLinkeLinklogAddconditionResponseBodyResult setLogSample(String logSample) {
            this.logSample = logSample;
            return this;
        }
        public String getLogSample() {
            return this.logSample;
        }

        public UpdateLinkeLinklogAddconditionResponseBodyResult setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

    }

}
