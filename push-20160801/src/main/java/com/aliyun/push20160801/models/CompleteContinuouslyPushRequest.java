// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CompleteContinuouslyPushRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

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
