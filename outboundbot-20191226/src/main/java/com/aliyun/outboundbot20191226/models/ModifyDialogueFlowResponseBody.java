// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyDialogueFlowResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The dialog flow data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;transitions&quot;:[{&quot;id&quot;:&quot;a91c4023&quot;,&quot;index&quot;:1,&quot;source&quot;:&quot;cc31e02b&quot;,&quot;sourceAnchor&quot;:0,&quot;target&quot;:&quot;946045be&quot;,&quot;targetAnchor&quot;:0}],&quot;nodes&quot;:[{&quot;collectedNumberEnabled&quot;:false,&quot;content&quot;:{&quot;branches&quot;:[{&quot;branchId&quot;:&quot;f5450420-09ab-11ea-b107-e9059c6a79d8&quot;,&quot;branchName&quot;:&quot;Initiate conversation&quot;}]},&quot;coordinates&quot;:{&quot;x&quot;:180,&quot;y&quot;:134},&quot;id&quot;:&quot;cc31e02b&quot;,&quot;index&quot;:0,&quot;interruptible&quot;:false,&quot;nodeIndex&quot;:0,&quot;shape&quot;:&quot;start-html&quot;,&quot;size&quot;:&quot;170<em>34&quot;,&quot;type&quot;:&quot;start&quot;,&quot;x&quot;:180,&quot;y&quot;:134},{&quot;collectedNumberEnabled&quot;:false,&quot;content&quot;:{&quot;actionParams&quot;:&quot;&quot;,&quot;action&quot;:&quot;Hangup&quot;},&quot;coordinates&quot;:{&quot;x&quot;:487.65625,&quot;y&quot;:155},&quot;id&quot;:&quot;946045be&quot;,&quot;index&quot;:2,&quot;interruptible&quot;:false,&quot;labels&quot;:[],&quot;name&quot;:&quot;Function node&quot;,&quot;nodeIndex&quot;:1,&quot;questions&quot;:[&quot;OK, we have noted your situation. We will arrange a senior consultant to provide you with a more detailed study abroad assessment and academic guidance. Please stay available for the call.&quot;],&quot;script&quot;:&quot;OK, we have noted your situation. We will arrange a senior consultant to provide you with a more detailed study abroad assessment and academic guidance. Please stay available for the call.&quot;,&quot;shape&quot;:&quot;function-html&quot;,&quot;size&quot;:&quot;170</em>34&quot;,&quot;type&quot;:&quot;transfer&quot;,&quot;x&quot;:500,&quot;y&quot;:182}]}</p>
     */
    @NameInMap("DialogueFlowDefinition")
    public String dialogueFlowDefinition;

    /**
     * <p>The dialog flow ID.</p>
     * 
     * <strong>example:</strong>
     * <p>390515b5-6115-4ccf-83e2-52d5bfaf2ddf</p>
     */
    @NameInMap("DialogueFlowId")
    public String dialogueFlowId;

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
     * <p>Succcess</p>
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
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ModifyDialogueFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDialogueFlowResponseBody self = new ModifyDialogueFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDialogueFlowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyDialogueFlowResponseBody setDialogueFlowDefinition(String dialogueFlowDefinition) {
        this.dialogueFlowDefinition = dialogueFlowDefinition;
        return this;
    }
    public String getDialogueFlowDefinition() {
        return this.dialogueFlowDefinition;
    }

    public ModifyDialogueFlowResponseBody setDialogueFlowId(String dialogueFlowId) {
        this.dialogueFlowId = dialogueFlowId;
        return this;
    }
    public String getDialogueFlowId() {
        return this.dialogueFlowId;
    }

    public ModifyDialogueFlowResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyDialogueFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyDialogueFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDialogueFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
