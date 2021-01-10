// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResetTSTriggerInstanceStatusRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobRequestId")
    public String jobRequestId;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("Status")
    public String status;

    public static ResetTSTriggerInstanceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetTSTriggerInstanceStatusRequest self = new ResetTSTriggerInstanceStatusRequest();
        return TeaModel.build(map, self);
    }

    public ResetTSTriggerInstanceStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ResetTSTriggerInstanceStatusRequest setJobRequestId(String jobRequestId) {
        this.jobRequestId = jobRequestId;
        return this;
    }
    public String getJobRequestId() {
        return this.jobRequestId;
    }

    public ResetTSTriggerInstanceStatusRequest setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ResetTSTriggerInstanceStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
