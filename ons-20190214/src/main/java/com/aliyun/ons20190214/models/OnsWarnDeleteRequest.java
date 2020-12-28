// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsWarnDeleteRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Topic")
    public String topic;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsWarnDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsWarnDeleteRequest self = new OnsWarnDeleteRequest();
        return TeaModel.build(map, self);
    }

    public OnsWarnDeleteRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsWarnDeleteRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public OnsWarnDeleteRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
