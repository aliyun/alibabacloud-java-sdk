// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeactiveTSJobItemRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobItemIds")
    public String jobItemIds;

    public static DeactiveTSJobItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DeactiveTSJobItemRequest self = new DeactiveTSJobItemRequest();
        return TeaModel.build(map, self);
    }

    public DeactiveTSJobItemRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeactiveTSJobItemRequest setJobItemIds(String jobItemIds) {
        this.jobItemIds = jobItemIds;
        return this;
    }
    public String getJobItemIds() {
        return this.jobItemIds;
    }

}
