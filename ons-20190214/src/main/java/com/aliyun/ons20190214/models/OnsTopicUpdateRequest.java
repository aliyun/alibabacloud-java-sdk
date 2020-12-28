// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicUpdateRequest extends TeaModel {
    @NameInMap("Topic")
    public String topic;

    @NameInMap("Perm")
    public Integer perm;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsTopicUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicUpdateRequest self = new OnsTopicUpdateRequest();
        return TeaModel.build(map, self);
    }

    public OnsTopicUpdateRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public OnsTopicUpdateRequest setPerm(Integer perm) {
        this.perm = perm;
        return this;
    }
    public Integer getPerm() {
        return this.perm;
    }

    public OnsTopicUpdateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
