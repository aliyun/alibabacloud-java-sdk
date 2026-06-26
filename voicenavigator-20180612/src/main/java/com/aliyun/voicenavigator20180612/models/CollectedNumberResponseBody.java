// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class CollectedNumberResponseBody extends TeaModel {
    /**
     * <p>Specifies the next action to perform.</p>
     * 
     * <strong>example:</strong>
     * <p>Broadcast</p>
     */
    @NameInMap("Action")
    public String action;

    /**
     * <p>The parameters for the action.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;duration\&quot;:31340,\&quot;endTime\&quot;:1638243934786,\&quot;hangUpDirection\&quot;:\&quot;ivr\&quot;,\&quot;startTime\&quot;:1638243903446}</p>
     */
    @NameInMap("ActionParams")
    public String actionParams;

    /**
     * <p>Indicates whether the IVR playback can be interrupted.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Interruptible")
    public Boolean interruptible;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>da37319b-6c83-4268-9f19-814aed62e401</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The text to play back to the user.</p>
     * 
     * <strong>example:</strong>
     * <p>收号内容是123</p>
     */
    @NameInMap("TextResponse")
    public String textResponse;

    public static CollectedNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CollectedNumberResponseBody self = new CollectedNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public CollectedNumberResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public CollectedNumberResponseBody setActionParams(String actionParams) {
        this.actionParams = actionParams;
        return this;
    }
    public String getActionParams() {
        return this.actionParams;
    }

    public CollectedNumberResponseBody setInterruptible(Boolean interruptible) {
        this.interruptible = interruptible;
        return this;
    }
    public Boolean getInterruptible() {
        return this.interruptible;
    }

    public CollectedNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CollectedNumberResponseBody setTextResponse(String textResponse) {
        this.textResponse = textResponse;
        return this;
    }
    public String getTextResponse() {
        return this.textResponse;
    }

}
