// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateTSTriggerInstanceLimitRateRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobRequestId")
    public String jobRequestId;

    @NameInMap("PermitsPerSecond")
    public Long permitsPerSecond;

    public static UpdateTSTriggerInstanceLimitRateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTSTriggerInstanceLimitRateRequest self = new UpdateTSTriggerInstanceLimitRateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTSTriggerInstanceLimitRateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateTSTriggerInstanceLimitRateRequest setJobRequestId(String jobRequestId) {
        this.jobRequestId = jobRequestId;
        return this;
    }
    public String getJobRequestId() {
        return this.jobRequestId;
    }

    public UpdateTSTriggerInstanceLimitRateRequest setPermitsPerSecond(Long permitsPerSecond) {
        this.permitsPerSecond = permitsPerSecond;
        return this;
    }
    public Long getPermitsPerSecond() {
        return this.permitsPerSecond;
    }

}
