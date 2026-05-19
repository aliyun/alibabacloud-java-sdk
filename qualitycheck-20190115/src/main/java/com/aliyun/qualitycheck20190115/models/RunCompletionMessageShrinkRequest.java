// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RunCompletionMessageShrinkRequest extends TeaModel {
    @NameInMap("Messages")
    public String messagesShrink;

    /**
     * <strong>example:</strong>
     * <p>TYXM_PLUS</p>
     */
    @NameInMap("ModelCode")
    public String modelCode;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Stream")
    public Boolean stream;

    public static RunCompletionMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCompletionMessageShrinkRequest self = new RunCompletionMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunCompletionMessageShrinkRequest setMessagesShrink(String messagesShrink) {
        this.messagesShrink = messagesShrink;
        return this;
    }
    public String getMessagesShrink() {
        return this.messagesShrink;
    }

    public RunCompletionMessageShrinkRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public RunCompletionMessageShrinkRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

}
