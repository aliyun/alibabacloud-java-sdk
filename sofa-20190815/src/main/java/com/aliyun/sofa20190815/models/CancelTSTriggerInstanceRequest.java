// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CancelTSTriggerInstanceRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobRequestId")
    public String jobRequestId;

    public static CancelTSTriggerInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelTSTriggerInstanceRequest self = new CancelTSTriggerInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CancelTSTriggerInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CancelTSTriggerInstanceRequest setJobRequestId(String jobRequestId) {
        this.jobRequestId = jobRequestId;
        return this;
    }
    public String getJobRequestId() {
        return this.jobRequestId;
    }

}
