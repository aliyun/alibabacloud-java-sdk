// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DebugCollectedNumberResponseBody extends TeaModel {
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

    public DebugCollectedNumberResponseBody setActionParams(String actionParams) {
        this.actionParams = actionParams;
        return this;
    }
    public String getActionParams() {
        return this.actionParams;
    }

    public DebugCollectedNumberResponseBody setTextResponse(String textResponse) {
        this.textResponse = textResponse;
        return this;
    }
    public String getTextResponse() {
        return this.textResponse;
    }

}
