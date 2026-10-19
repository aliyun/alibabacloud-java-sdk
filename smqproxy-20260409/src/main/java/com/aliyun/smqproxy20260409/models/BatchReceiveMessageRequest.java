// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smqproxy20260409.models;

import com.aliyun.tea.*;

public class BatchReceiveMessageRequest extends TeaModel {
    /**
     * <p>The maximum number of messages to receive in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("numOfMessages")
    public Integer numOfMessages;

    /**
     * <p>The maximum polling wait time for this request, in seconds. Set to 0 for an immediate return.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("waitseconds")
    public Integer waitseconds;

    public static BatchReceiveMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchReceiveMessageRequest self = new BatchReceiveMessageRequest();
        return TeaModel.build(map, self);
    }

    public BatchReceiveMessageRequest setNumOfMessages(Integer numOfMessages) {
        this.numOfMessages = numOfMessages;
        return this;
    }
    public Integer getNumOfMessages() {
        return this.numOfMessages;
    }

    public BatchReceiveMessageRequest setWaitseconds(Integer waitseconds) {
        this.waitseconds = waitseconds;
        return this;
    }
    public Integer getWaitseconds() {
        return this.waitseconds;
    }

}
