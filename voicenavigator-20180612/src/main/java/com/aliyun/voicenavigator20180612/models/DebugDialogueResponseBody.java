// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DebugDialogueResponseBody extends TeaModel {
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

    public DebugDialogueResponseBody setActionParams(String actionParams) {
        this.actionParams = actionParams;
        return this;
    }
    public String getActionParams() {
        return this.actionParams;
    }

    public DebugDialogueResponseBody setTextResponse(String textResponse) {
        this.textResponse = textResponse;
        return this;
    }
    public String getTextResponse() {
        return this.textResponse;
    }

}
