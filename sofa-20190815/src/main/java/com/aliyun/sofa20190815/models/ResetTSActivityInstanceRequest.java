// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResetTSActivityInstanceRequest extends TeaModel {
    @NameInMap("ActivityInstanceId")
    public Long activityInstanceId;

    @NameInMap("Comment")
    public String comment;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobRequestId")
    public String jobRequestId;

    @NameInMap("Zone")
    public String zone;

    public static ResetTSActivityInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetTSActivityInstanceRequest self = new ResetTSActivityInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ResetTSActivityInstanceRequest setActivityInstanceId(Long activityInstanceId) {
        this.activityInstanceId = activityInstanceId;
        return this;
    }
    public Long getActivityInstanceId() {
        return this.activityInstanceId;
    }

    public ResetTSActivityInstanceRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public ResetTSActivityInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResetTSActivityInstanceRequest setJobRequestId(String jobRequestId) {
        this.jobRequestId = jobRequestId;
        return this;
    }
    public String getJobRequestId() {
        return this.jobRequestId;
    }

    public ResetTSActivityInstanceRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
