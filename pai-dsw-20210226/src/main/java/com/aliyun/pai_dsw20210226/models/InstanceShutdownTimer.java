// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class InstanceShutdownTimer extends TeaModel {
    // 定时关机修改时间
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 定时关机创建时间
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 定时关机时间
    @NameInMap("ScheduleTime")
    public String scheduleTime;

    // 多少毫秒后定时关机（如果设定可以覆盖ScheduleTime）
    @NameInMap("TtlInMillis")
    public Long ttlInMillis;

    public static InstanceShutdownTimer build(java.util.Map<String, ?> map) throws Exception {
        InstanceShutdownTimer self = new InstanceShutdownTimer();
        return TeaModel.build(map, self);
    }

    public InstanceShutdownTimer setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public InstanceShutdownTimer setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public InstanceShutdownTimer setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceShutdownTimer setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public InstanceShutdownTimer setTtlInMillis(Long ttlInMillis) {
        this.ttlInMillis = ttlInMillis;
        return this;
    }
    public Long getTtlInMillis() {
        return this.ttlInMillis;
    }

}
