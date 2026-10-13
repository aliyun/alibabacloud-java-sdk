// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SubmitScriptPreReviewResultResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned by the API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The script information for which the pre-review result is submitted.</p>
     */
    @NameInMap("Script")
    public SubmitScriptPreReviewResultResponseBodyScript script;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitScriptPreReviewResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitScriptPreReviewResultResponseBody self = new SubmitScriptPreReviewResultResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitScriptPreReviewResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitScriptPreReviewResultResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitScriptPreReviewResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitScriptPreReviewResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitScriptPreReviewResultResponseBody setScript(SubmitScriptPreReviewResultResponseBodyScript script) {
        this.script = script;
        return this;
    }
    public SubmitScriptPreReviewResultResponseBodyScript getScript() {
        return this.script;
    }

    public SubmitScriptPreReviewResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitScriptPreReviewResultResponseBodyScript extends TeaModel {
        /**
         * <p>The script description.</p>
         * 
         * <strong>example:</strong>
         * <p>The script used for outbound calls to notify members of campaign information</p>
         */
        @NameInMap("ScriptDescription")
        public String scriptDescription;

        /**
         * <p>The script ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0f6b8f2c-3e14-4a89-9d5e-1f2a3b4c5d6e</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>The script name.</p>
         * 
         * <strong>example:</strong>
         * <p>Member notification script</p>
         */
        @NameInMap("ScriptName")
        public String scriptName;

        public static SubmitScriptPreReviewResultResponseBodyScript build(java.util.Map<String, ?> map) throws Exception {
            SubmitScriptPreReviewResultResponseBodyScript self = new SubmitScriptPreReviewResultResponseBodyScript();
            return TeaModel.build(map, self);
        }

        public SubmitScriptPreReviewResultResponseBodyScript setScriptDescription(String scriptDescription) {
            this.scriptDescription = scriptDescription;
            return this;
        }
        public String getScriptDescription() {
            return this.scriptDescription;
        }

        public SubmitScriptPreReviewResultResponseBodyScript setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public SubmitScriptPreReviewResultResponseBodyScript setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

    }

}
