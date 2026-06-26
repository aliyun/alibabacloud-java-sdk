// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class SilenceTimeoutResponseBody extends TeaModel {
    /**
     * <p>The system\&quot;s next action.</p>
     * 
     * <strong>example:</strong>
     * <p>TransferToAgent</p>
     */
    @NameInMap("Action")
    public String action;

    /**
     * <p>Parameters for the action defined in the Action parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;skillGroupId&quot;: &quot;ABC&quot;}</p>
     */
    @NameInMap("ActionParams")
    public String actionParams;

    /**
     * <p>Indicates whether the action is interruptible.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Interruptible")
    public Boolean interruptible;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The text response to play to the user.</p>
     * 
     * <strong>example:</strong>
     * <p>正在为你转接人工坐席</p>
     */
    @NameInMap("TextResponse")
    public String textResponse;

    public static SilenceTimeoutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SilenceTimeoutResponseBody self = new SilenceTimeoutResponseBody();
        return TeaModel.build(map, self);
    }

    public SilenceTimeoutResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SilenceTimeoutResponseBody setActionParams(String actionParams) {
        this.actionParams = actionParams;
        return this;
    }
    public String getActionParams() {
        return this.actionParams;
    }

    public SilenceTimeoutResponseBody setInterruptible(Boolean interruptible) {
        this.interruptible = interruptible;
        return this;
    }
    public Boolean getInterruptible() {
        return this.interruptible;
    }

    public SilenceTimeoutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SilenceTimeoutResponseBody setTextResponse(String textResponse) {
        this.textResponse = textResponse;
        return this;
    }
    public String getTextResponse() {
        return this.textResponse;
    }

}
