// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class BatchPeekMessageRequest extends TeaModel {
    /**
     * <p>The maximum number of messages to peek at in this BatchPeekMessage request.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("numOfMessages")
    public Integer numOfMessages;

    /**
     * <p>Indicates that this request only peeks at messages at the top of the queue without changing the message status. Fixed value: true.</p>
     */
    @NameInMap("peekonly")
    public Boolean peekonly;

    public static BatchPeekMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchPeekMessageRequest self = new BatchPeekMessageRequest();
        return TeaModel.build(map, self);
    }

    public BatchPeekMessageRequest setNumOfMessages(Integer numOfMessages) {
        this.numOfMessages = numOfMessages;
        return this;
    }
    public Integer getNumOfMessages() {
        return this.numOfMessages;
    }

    public BatchPeekMessageRequest setPeekonly(Boolean peekonly) {
        this.peekonly = peekonly;
        return this;
    }
    public Boolean getPeekonly() {
        return this.peekonly;
    }

}
