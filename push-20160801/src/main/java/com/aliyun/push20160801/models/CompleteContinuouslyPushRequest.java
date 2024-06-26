// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class CompleteContinuouslyPushRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4010290149170430</p>
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
