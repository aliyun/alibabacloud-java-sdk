// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class ContinuouslyPushRequest extends TeaModel {
    @NameInMap("AppKey")
    public Long appKey;

    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("Target")
    public String target;

    @NameInMap("TargetValue")
    public String targetValue;

    public static ContinuouslyPushRequest build(java.util.Map<String, ?> map) throws Exception {
        ContinuouslyPushRequest self = new ContinuouslyPushRequest();
        return TeaModel.build(map, self);
    }

    public ContinuouslyPushRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public ContinuouslyPushRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public ContinuouslyPushRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public ContinuouslyPushRequest setTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }
    public String getTargetValue() {
        return this.targetValue;
    }

}
