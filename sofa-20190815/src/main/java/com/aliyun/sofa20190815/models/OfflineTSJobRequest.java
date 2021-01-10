// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OfflineTSJobRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobItemIds")
    public java.util.List<Long> jobItemIds;

    public static OfflineTSJobRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineTSJobRequest self = new OfflineTSJobRequest();
        return TeaModel.build(map, self);
    }

    public OfflineTSJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OfflineTSJobRequest setJobItemIds(java.util.List<Long> jobItemIds) {
        this.jobItemIds = jobItemIds;
        return this;
    }
    public java.util.List<Long> getJobItemIds() {
        return this.jobItemIds;
    }

}
