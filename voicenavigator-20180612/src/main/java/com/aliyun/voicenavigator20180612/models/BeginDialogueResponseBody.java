// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class BeginDialogueResponseBody extends TeaModel {
    /**
     * <p>The action to perform.</p>
     * 
     * <strong>example:</strong>
     * <p>Broadcast</p>
     */
    @NameInMap("Action")
    public String action;

    /**
     * <p>The action parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;duration\&quot;:31340,\&quot;endTime\&quot;:1638243934786,\&quot;hangUpDirection\&quot;:\&quot;ivr\&quot;,\&quot;startTime\&quot;:1638243903446}</p>
     */
    @NameInMap("ActionParams")
    public String actionParams;

    /**
     * <p>Specifies whether the IVR playback can be interrupted.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Interruptible")
    public Boolean interruptible;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14C39896-AE6D-4643-9C9A-E0566B2C2DDD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The text response.</p>
     * 
     * <strong>example:</strong>
     * <p>您好，欢迎致电智能助手</p>
     */
    @NameInMap("TextResponse")
    public String textResponse;

    public static BeginDialogueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BeginDialogueResponseBody self = new BeginDialogueResponseBody();
        return TeaModel.build(map, self);
    }

    public BeginDialogueResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public BeginDialogueResponseBody setActionParams(String actionParams) {
        this.actionParams = actionParams;
        return this;
    }
    public String getActionParams() {
        return this.actionParams;
    }

    public BeginDialogueResponseBody setInterruptible(Boolean interruptible) {
        this.interruptible = interruptible;
        return this;
    }
    public Boolean getInterruptible() {
        return this.interruptible;
    }

    public BeginDialogueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BeginDialogueResponseBody setTextResponse(String textResponse) {
        this.textResponse = textResponse;
        return this;
    }
    public String getTextResponse() {
        return this.textResponse;
    }

}
