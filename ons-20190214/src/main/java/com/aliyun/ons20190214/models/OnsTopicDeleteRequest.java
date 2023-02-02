// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicDeleteRequest extends TeaModel {
    /**
     * <p>The ID of the instance that contains the topic you want to delete.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the topic that you want to delete.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static OnsTopicDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicDeleteRequest self = new OnsTopicDeleteRequest();
        return TeaModel.build(map, self);
    }

    public OnsTopicDeleteRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsTopicDeleteRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
