// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetInstanceShutdownTimerResponseBody extends TeaModel {
    // 设定关机时间
    @NameInMap("DueTime")
    public String dueTime;

    // 创建时间
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 修改时间
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    // 实例Id
    @NameInMap("InstanceId")
    public String instanceId;

    // 剩余关机时间（ms）
    @NameInMap("RemainingTimeInMs")
    public Long remainingTimeInMs;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceShutdownTimerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceShutdownTimerResponseBody self = new GetInstanceShutdownTimerResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceShutdownTimerResponseBody setDueTime(String dueTime) {
        this.dueTime = dueTime;
        return this;
    }
    public String getDueTime() {
        return this.dueTime;
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

    public GetInstanceShutdownTimerResponseBody setRemainingTimeInMs(Long remainingTimeInMs) {
        this.remainingTimeInMs = remainingTimeInMs;
        return this;
    }
    public Long getRemainingTimeInMs() {
        return this.remainingTimeInMs;
    }

    public GetInstanceShutdownTimerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
