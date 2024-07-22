// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DebugDialogueResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Broadcast</p>
     */
    @NameInMap("Action")
    public String action;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
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
     * <p>d74d6290-7cbe-4436-b5d7-014ebb0f4060</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>80d11be3-faad-4101-b4b0-59dbea28aaf0</p>
     */
    @NameInMap("TextResponse")
    public String textResponse;

    public static DebugDialogueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DebugDialogueResponseBody self = new DebugDialogueResponseBody();
        return TeaModel.build(map, self);
    }

    public DebugDialogueResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public DebugDialogueResponseBody setActionParams(String actionParams) {
        this.actionParams = actionParams;
        return this;
    }
    public String getActionParams() {
        return this.actionParams;
    }

    public DebugDialogueResponseBody setInterruptible(Boolean interruptible) {
        this.interruptible = interruptible;
        return this;
    }
    public Boolean getInterruptible() {
        return this.interruptible;
    }

    public DebugDialogueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DebugDialogueResponseBody setTextResponse(String textResponse) {
        this.textResponse = textResponse;
        return this;
    }
    public String getTextResponse() {
        return this.textResponse;
    }

}
