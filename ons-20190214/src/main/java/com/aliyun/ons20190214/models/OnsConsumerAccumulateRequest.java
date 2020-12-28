// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerAccumulateRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Detail")
    public Boolean detail;

    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsConsumerAccumulateRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerAccumulateRequest self = new OnsConsumerAccumulateRequest();
        return TeaModel.build(map, self);
    }

    public OnsConsumerAccumulateRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsConsumerAccumulateRequest setDetail(Boolean detail) {
        this.detail = detail;
        return this;
    }
    public Boolean getDetail() {
        return this.detail;
    }

    public OnsConsumerAccumulateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
