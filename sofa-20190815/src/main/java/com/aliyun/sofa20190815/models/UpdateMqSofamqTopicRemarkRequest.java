// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMqSofamqTopicRemarkRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("Topic")
    public String topic;

    public static UpdateMqSofamqTopicRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMqSofamqTopicRemarkRequest self = new UpdateMqSofamqTopicRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMqSofamqTopicRemarkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateMqSofamqTopicRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateMqSofamqTopicRemarkRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
