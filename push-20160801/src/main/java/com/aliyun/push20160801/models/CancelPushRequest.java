// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CancelPushRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("MessageId")
    public Long messageId;

    public static CancelPushRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelPushRequest self = new CancelPushRequest();
        return TeaModel.build(map, self);
    }

    public CancelPushRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public CancelPushRequest setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }
    public Long getMessageId() {
        return this.messageId;
    }

}
