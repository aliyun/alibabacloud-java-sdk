// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListDialogueFlowsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DialogueFlows")
    public java.util.List<ListDialogueFlowsResponseBodyDialogueFlows> dialogueFlows;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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

        @NameInMap("DialogueFlowId")
        public String dialogueFlowId;

        @NameInMap("DialogueFlowName")
        public String dialogueFlowName;

        @NameInMap("DialogueFlowType")
        public String dialogueFlowType;

        @NameInMap("ScriptId")
        public String scriptId;

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
