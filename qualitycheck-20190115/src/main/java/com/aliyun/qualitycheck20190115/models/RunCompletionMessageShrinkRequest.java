// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class RunCompletionMessageShrinkRequest extends TeaModel {
    /**
     * <p>A list of messages that form the conversation history and the current prompt.</p>
     */
    @NameInMap("Messages")
    public String messagesShrink;

    /**
     * <p>The model specification to use. Valid values: <code>TYXM_PLUS</code> and <code>TYXM_TURBO</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>TYXM_PLUS</p>
     */
    @NameInMap("ModelCode")
    public String modelCode;

    /**
     * <p>Specifies whether to stream the response using Server-Sent Events (SSE). If <code>true</code>, the response is streamed. Defaults to <code>false</code>.</p>
     * 
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
