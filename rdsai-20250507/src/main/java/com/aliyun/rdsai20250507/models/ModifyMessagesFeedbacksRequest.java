// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyMessagesFeedbacksRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>yy9rkn6q-js75-0dka-0cc2-6b5o86uj****</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <strong>example:</strong>
     * <p>like</p>
     */
    @NameInMap("Rating")
    public String rating;

    public static ModifyMessagesFeedbacksRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMessagesFeedbacksRequest self = new ModifyMessagesFeedbacksRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMessagesFeedbacksRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ModifyMessagesFeedbacksRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public ModifyMessagesFeedbacksRequest setRating(String rating) {
        this.rating = rating;
        return this;
    }
    public String getRating() {
        return this.rating;
    }

}
