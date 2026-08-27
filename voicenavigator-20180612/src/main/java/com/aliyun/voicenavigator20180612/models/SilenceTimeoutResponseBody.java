// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class SilenceTimeoutResponseBody extends TeaModel {
    /**
     * <p>The action.</p>
     * 
     * <strong>example:</strong>
     * <p>TransferToAgent</p>
     */
    @NameInMap("Action")
    public String action;

    /**
     * <p>The action parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;skillGroupId&quot;: &quot;ABC&quot;}</p>
     */
    @NameInMap("ActionParams")
    public String actionParams;

    /**
     * <p>Indicates whether the action can be interrupted.</p>
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
     * <p>The text response.</p>
     * 
     * <strong>example:</strong>
     * <p>Transferring you to a human agent</p>
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
