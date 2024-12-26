// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class VerifySendMessageRequest extends TeaModel {
    /**
     * <p>The message body.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The message key.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("messageKey")
    public String messageKey;

    /**
     * <p>The message tag.</p>
     * 
     * <strong>example:</strong>
     * <p>xx</p>
     */
    @NameInMap("messageTag")
    public String messageTag;

    public static VerifySendMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifySendMessageRequest self = new VerifySendMessageRequest();
        return TeaModel.build(map, self);
    }

    public VerifySendMessageRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifySendMessageRequest setMessageKey(String messageKey) {
        this.messageKey = messageKey;
        return this;
    }
    public String getMessageKey() {
        return this.messageKey;
    }

    public VerifySendMessageRequest setMessageTag(String messageTag) {
        this.messageTag = messageTag;
        return this;
    }
    public String getMessageTag() {
        return this.messageTag;
    }

}
