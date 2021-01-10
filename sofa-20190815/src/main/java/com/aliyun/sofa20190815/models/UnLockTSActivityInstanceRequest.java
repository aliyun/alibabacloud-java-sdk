// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UnLockTSActivityInstanceRequest extends TeaModel {
    @NameInMap("ActivityId")
    public Long activityId;

    @NameInMap("CurSharding")
    public String curSharding;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobRequestId")
    public String jobRequestId;

    @NameInMap("ParentActivityInstanceId")
    public Long parentActivityInstanceId;

    public static UnLockTSActivityInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnLockTSActivityInstanceRequest self = new UnLockTSActivityInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UnLockTSActivityInstanceRequest setActivityId(Long activityId) {
        this.activityId = activityId;
        return this;
    }
    public Long getActivityId() {
        return this.activityId;
    }

    public UnLockTSActivityInstanceRequest setCurSharding(String curSharding) {
        this.curSharding = curSharding;
        return this;
    }
    public String getCurSharding() {
        return this.curSharding;
    }

    public UnLockTSActivityInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnLockTSActivityInstanceRequest setJobRequestId(String jobRequestId) {
        this.jobRequestId = jobRequestId;
        return this;
    }
    public String getJobRequestId() {
        return this.jobRequestId;
    }

    public UnLockTSActivityInstanceRequest setParentActivityInstanceId(Long parentActivityInstanceId) {
        this.parentActivityInstanceId = parentActivityInstanceId;
        return this;
    }
    public Long getParentActivityInstanceId() {
        return this.parentActivityInstanceId;
    }

}
