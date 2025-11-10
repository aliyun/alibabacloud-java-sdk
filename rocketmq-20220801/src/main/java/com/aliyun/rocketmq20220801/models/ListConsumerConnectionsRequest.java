// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class ListConsumerConnectionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("liteTopicName")
    public String liteTopicName;

    /**
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("topicName")
    public String topicName;

    public static ListConsumerConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConsumerConnectionsRequest self = new ListConsumerConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListConsumerConnectionsRequest setLiteTopicName(String liteTopicName) {
        this.liteTopicName = liteTopicName;
        return this;
    }
    public String getLiteTopicName() {
        return this.liteTopicName;
    }

    public ListConsumerConnectionsRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
