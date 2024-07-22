// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DialogueResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Broadcast</p>
     */
    @NameInMap("Action")
    public String action;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;duration\&quot;:2420,\&quot;endTime\&quot;:1651717326805,\&quot;hangUpDirection\&quot;:\&quot;client\&quot;,\&quot;hasLastPlaybackCompleted\&quot;:true,\&quot;startTime\&quot;:1651717324385}</p>
     */
    @NameInMap("ActionParams")
    public String actionParams;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Interruptible")
    public Boolean interruptible;

    /**
     * <strong>example:</strong>
     * <p>9DB8BA95-4513-54B9-9C67-A28909CFB4AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TextResponse")
    public String textResponse;

    public static DialogueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DialogueResponseBody self = new DialogueResponseBody();
        return TeaModel.build(map, self);
    }

    public DialogueResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public DialogueResponseBody setActionParams(String actionParams) {
        this.actionParams = actionParams;
        return this;
    }
    public String getActionParams() {
        return this.actionParams;
    }

    public DialogueResponseBody setInterruptible(Boolean interruptible) {
        this.interruptible = interruptible;
        return this;
    }
    public Boolean getInterruptible() {
        return this.interruptible;
    }

    public DialogueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DialogueResponseBody setTextResponse(String textResponse) {
        this.textResponse = textResponse;
        return this;
    }
    public String getTextResponse() {
        return this.textResponse;
    }

}
