// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListDialogueFlowsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A list of dialogue flows.</p>
     */
    @NameInMap("DialogueFlows")
    public java.util.List<ListDialogueFlowsResponseBodyDialogueFlows> dialogueFlows;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
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
     * <p>Indicates whether the request succeeded.</p>
     * <ul>
     * <li><p><strong>true</strong>: The request succeeded.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
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
        /**
         * <p>The dialogue flow data, formatted as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;transitions&quot;:[{&quot;source&quot;:&quot;cc31e02b&quot;,&quot;sourceAnchor&quot;:0,&quot;target&quot;:&quot;345700de&quot;,&quot;targetAnchor&quot;:0,&quot;id&quot;:&quot;16d37c6e&quot;,&quot;index&quot;:1}],&quot;nodes&quot;:[{&quot;shape&quot;:&quot;start-html&quot;,&quot;type&quot;:&quot;start&quot;,&quot;size&quot;:&quot;170<em>34&quot;,&quot;x&quot;:180,&quot;y&quot;:134,&quot;id&quot;:&quot;cc31e02b&quot;,&quot;index&quot;:0,&quot;nodeIndex&quot;:0,&quot;content&quot;:{&quot;branches&quot;:[{&quot;branchName&quot;:&quot;发起对话&quot;,&quot;branchId&quot;:&quot;3c50a880-a7bc-11e9-80fc-5917e4f31864&quot;}]},&quot;coordinates&quot;:{&quot;x&quot;:180,&quot;y&quot;:134}},{&quot;shape&quot;:&quot;function-html&quot;,&quot;type&quot;:&quot;transfer&quot;,&quot;size&quot;:&quot;170</em>34&quot;,&quot;x&quot;:606,&quot;y&quot;:134,&quot;id&quot;:&quot;345700de&quot;,&quot;nodeIndex&quot;:1,&quot;name&quot;:&quot;功能节点&quot;,&quot;script&quot;:&quot;你是 @name ma&quot;,&quot;content&quot;:{&quot;action&quot;:&quot;Hangup&quot;,&quot;actionParams&quot;:&quot;&quot;,&quot;label&quot;:[&quot;test1&quot;,&quot;test2&quot;,&quot;test3&quot;,&quot;test4&quot;,&quot;test5&quot;]},&quot;coordinates&quot;:{&quot;x&quot;:606,&quot;y&quot;:134},&quot;index&quot;:2,&quot;questions&quot;:[&quot;你是 @联系人姓名 ma&quot;]}]}</p>
         */
        @NameInMap("DialogueFlowDefinition")
        public String dialogueFlowDefinition;

        /**
         * <p>The dialogue flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dae01529-3c3e-458e-b07a-97643d09ebb9</p>
         */
        @NameInMap("DialogueFlowId")
        public String dialogueFlowId;

        /**
         * <p>The dialogue flow name.</p>
         * 
         * <strong>example:</strong>
         * <p>主流程</p>
         */
        @NameInMap("DialogueFlowName")
        public String dialogueFlowName;

        /**
         * <p>The flow type.</p>
         * <ul>
         * <li><p><code>SubFlow</code>: The subflow.</p>
         * </li>
         * <li><p><code>MainFlow</code>: The main flow.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MainFlow</p>
         */
        @NameInMap("DialogueFlowType")
        public String dialogueFlowType;

        /**
         * <p>The outbound script ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2d5aa451-661f-4f08-b0c4-28eec78decc4</p>
         */
        @NameInMap("ScriptId")
        public String scriptId;

        /**
         * <p>The script version.</p>
         * 
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
