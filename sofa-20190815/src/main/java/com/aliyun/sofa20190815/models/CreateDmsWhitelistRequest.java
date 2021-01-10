// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDmsWhitelistRequest extends TeaModel {
    @NameInMap("Group")
    public String group;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Topic")
    public String topic;

    public static CreateDmsWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDmsWhitelistRequest self = new CreateDmsWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public CreateDmsWhitelistRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public CreateDmsWhitelistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDmsWhitelistRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
