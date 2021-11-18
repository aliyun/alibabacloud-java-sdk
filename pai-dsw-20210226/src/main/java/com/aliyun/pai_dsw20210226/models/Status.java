// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class Status extends TeaModel {
    // 累计运行时间（分钟）
    @NameInMap("AccumulativeRunningTimeInMinutes")
    public Long accumulativeRunningTimeInMinutes;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceShutdownTimer")
    public InstanceShutdownTimer instanceShutdownTimer;

    // 实例状态
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    // 实例消息
    @NameInMap("Msg")
    public String msg;

    // 实例类型
    @NameInMap("Type")
    public String type;

    public static Status build(java.util.Map<String, ?> map) throws Exception {
        Status self = new Status();
        return TeaModel.build(map, self);
    }

    public Status setAccumulativeRunningTimeInMinutes(Long accumulativeRunningTimeInMinutes) {
        this.accumulativeRunningTimeInMinutes = accumulativeRunningTimeInMinutes;
        return this;
    }
    public Long getAccumulativeRunningTimeInMinutes() {
        return this.accumulativeRunningTimeInMinutes;
    }

    public Status setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public Status setInstanceShutdownTimer(InstanceShutdownTimer instanceShutdownTimer) {
        this.instanceShutdownTimer = instanceShutdownTimer;
        return this;
    }
    public InstanceShutdownTimer getInstanceShutdownTimer() {
        return this.instanceShutdownTimer;
    }

    public Status setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public Status setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public Status setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
