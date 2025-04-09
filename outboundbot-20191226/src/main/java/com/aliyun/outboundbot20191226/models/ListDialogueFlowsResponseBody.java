// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListDialogueFlowsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("DialogueFlows")
    public java.util.List<ListDialogueFlowsResponseBodyDialogueFlows> dialogueFlows;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDialogueFlowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDialogueFlowsResponseBody self = new ListDialogueFlowsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDialogueFlowsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDialogueFlowsResponseBody setDialogueFlows(java.util.List<ListDialogueFlowsResponseBodyDialogueFlows> dialogueFlows) {
        this.dialogueFlows = dialogueFlows;
        return this;
    }
    public java.util.List<ListDialogueFlowsResponseBodyDialogueFlows> getDialogueFlows() {
        return this.dialogueFlows;
    }

    public ListDialogueFlowsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListDialogueFlowsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDialogueFlowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDialogueFlowsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDialogueFlowsResponseBodyDialogueFlows extends TeaModel {
        @NameInMap("DialogueFlowDefinition")
        public String dialogueFlowDefinition;

        /**
         * <strong>example:</strong>
         * <p>dae01529-3c3e-458e-b07a-97643d09ebb9</p>
         */
        @NameInMap("DialogueFlowId")
        public String dialogueFlowId;

        @NameInMap("DialogueFlowName")
        public String dialogueFlowName;

        /**
         * <strong>example:</strong>
         * <p>MainFlow</p>
         */
        @NameInMap("DialogueFlowType")
        public String dialogueFlowType;

        /**
         * <strong>example:</strong>
         * <p>2d5aa451-661f-4f08-b0c4-28eec78decc4</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <strong>example:</strong>
         * <p>1569220563549</p>
         */
        @NameInMap("ScriptVersion")
        public String scriptVersion;

        public static ListDialogueFlowsResponseBodyDialogueFlows build(java.util.Map<String, ?> map) throws Exception {
            ListDialogueFlowsResponseBodyDialogueFlows self = new ListDialogueFlowsResponseBodyDialogueFlows();
            return TeaModel.build(map, self);
        }

        public ListDialogueFlowsResponseBodyDialogueFlows setDialogueFlowDefinition(String dialogueFlowDefinition) {
            this.dialogueFlowDefinition = dialogueFlowDefinition;
            return this;
        }
        public String getDialogueFlowDefinition() {
            return this.dialogueFlowDefinition;
        }

        public ListDialogueFlowsResponseBodyDialogueFlows setDialogueFlowId(String dialogueFlowId) {
            this.dialogueFlowId = dialogueFlowId;
            return this;
        }
        public String getDialogueFlowId() {
            return this.dialogueFlowId;
        }

        public ListDialogueFlowsResponseBodyDialogueFlows setDialogueFlowName(String dialogueFlowName) {
            this.dialogueFlowName = dialogueFlowName;
            return this;
        }
        public String getDialogueFlowName() {
            return this.dialogueFlowName;
        }

        public ListDialogueFlowsResponseBodyDialogueFlows setDialogueFlowType(String dialogueFlowType) {
            this.dialogueFlowType = dialogueFlowType;
            return this;
        }
        public String getDialogueFlowType() {
            return this.dialogueFlowType;
        }

        public ListDialogueFlowsResponseBodyDialogueFlows setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ListDialogueFlowsResponseBodyDialogueFlows setScriptVersion(String scriptVersion) {
            this.scriptVersion = scriptVersion;
            return this;
        }
        public String getScriptVersion() {
            return this.scriptVersion;
        }

    }

}
