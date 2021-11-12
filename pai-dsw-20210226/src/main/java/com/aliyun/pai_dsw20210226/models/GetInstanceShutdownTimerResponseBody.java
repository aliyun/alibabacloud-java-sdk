// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetInstanceShutdownTimerResponseBody extends TeaModel {
    // 任务创建时间(GMT)
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 任务修改时间(GMT)
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 定时关机时间(GMT)
    @NameInMap("ScheduleTime")
    public String scheduleTime;

    public static GetInstanceShutdownTimerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceShutdownTimerResponseBody self = new GetInstanceShutdownTimerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceShutdownTimerResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetInstanceShutdownTimerResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetInstanceShutdownTimerResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceShutdownTimerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInstanceShutdownTimerResponseBody setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public String getScheduleTime() {
        return this.scheduleTime;
    }

}
