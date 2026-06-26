// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DebugCollectedNumberResponseBody extends TeaModel {
    /**
     * <p>The next action that Voice Navigator performs.</p>
     * 
     * <strong>example:</strong>
     * <p>Broadcast</p>
     */
    @NameInMap("Action")
    public String action;

    /**
     * <p>The parameters for the next action.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ActionParams")
    public String actionParams;

    /**
     * <p>Indicates whether the voice response can be interrupted.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Interruptible")
    public Boolean interruptible;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>abb4aa26-3a8e-43dd-82f8-0c3898c9c67f</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The text that Voice Navigator plays to the user.</p>
     * 
     * <strong>example:</strong>
     * <p>您好，欢迎致电智能助手</p>
     */
    @NameInMap("TextResponse")
    public String textResponse;

    public static DebugCollectedNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DebugCollectedNumberResponseBody self = new DebugCollectedNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public DebugCollectedNumberResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public DebugCollectedNumberResponseBody setActionParams(String actionParams) {
        this.actionParams = actionParams;
        return this;
    }
    public String getActionParams() {
        return this.actionParams;
    }

    public DebugCollectedNumberResponseBody setInterruptible(Boolean interruptible) {
        this.interruptible = interruptible;
        return this;
    }
    public Boolean getInterruptible() {
        return this.interruptible;
    }

    public DebugCollectedNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DebugCollectedNumberResponseBody setTextResponse(String textResponse) {
        this.textResponse = textResponse;
        return this;
    }
    public String getTextResponse() {
        return this.textResponse;
    }

}
