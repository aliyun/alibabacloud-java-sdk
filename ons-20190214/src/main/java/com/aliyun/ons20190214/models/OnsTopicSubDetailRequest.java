// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicSubDetailRequest extends TeaModel {
    /**
     * <p>The ID of the instance that contains the topic you want to query.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the topic that you want to query.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static OnsTopicSubDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicSubDetailRequest self = new OnsTopicSubDetailRequest();
        return TeaModel.build(map, self);
    }

    public OnsTopicSubDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsTopicSubDetailRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
