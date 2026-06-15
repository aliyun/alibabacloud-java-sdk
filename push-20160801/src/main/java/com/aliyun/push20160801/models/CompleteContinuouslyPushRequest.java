// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CompleteContinuouslyPushRequest extends TeaModel {
    /**
     * <p>The AppKey value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>The message ID.</p>
     * <p>This ID is returned after you call the Push operation and set Target to TBD. It identifies a message saved in the push system.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>500131</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    public static CompleteContinuouslyPushRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteContinuouslyPushRequest self = new CompleteContinuouslyPushRequest();
        return TeaModel.build(map, self);
    }

    public CompleteContinuouslyPushRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public CompleteContinuouslyPushRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

}
