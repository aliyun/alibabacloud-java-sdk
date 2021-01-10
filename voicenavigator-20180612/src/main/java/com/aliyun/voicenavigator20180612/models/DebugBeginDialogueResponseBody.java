// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DebugBeginDialogueResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Interruptible")
    public Boolean interruptible;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ActionParams")
    public String actionParams;

    @NameInMap("TextResponse")
    public String textResponse;

    public static DebugBeginDialogueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DebugBeginDialogueResponseBody self = new DebugBeginDialogueResponseBody();
        return TeaModel.build(map, self);
    }

    public DebugBeginDialogueResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public DebugBeginDialogueResponseBody setInterruptible(Boolean interruptible) {
        this.interruptible = interruptible;
        return this;
    }
    public Boolean getInterruptible() {
        return this.interruptible;
    }

    public DebugBeginDialogueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DebugBeginDialogueResponseBody setActionParams(String actionParams) {
        this.actionParams = actionParams;
        return this;
    }
    public String getActionParams() {
        return this.actionParams;
    }

    public DebugBeginDialogueResponseBody setTextResponse(String textResponse) {
        this.textResponse = textResponse;
        return this;
    }
    public String getTextResponse() {
        return this.textResponse;
    }

}
