// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DialogueResponseBody extends TeaModel {
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

    public DialogueResponseBody setActionParams(String actionParams) {
        this.actionParams = actionParams;
        return this;
    }
    public String getActionParams() {
        return this.actionParams;
    }

    public DialogueResponseBody setTextResponse(String textResponse) {
        this.textResponse = textResponse;
        return this;
    }
    public String getTextResponse() {
        return this.textResponse;
    }

}
