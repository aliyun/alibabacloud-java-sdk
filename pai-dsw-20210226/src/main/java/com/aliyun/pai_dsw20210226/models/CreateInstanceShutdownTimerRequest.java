// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class CreateInstanceShutdownTimerRequest extends TeaModel {
    // 定时关机时间（GMT）
    @NameInMap("ScheduleTime")
    public String scheduleTime;

    // 多少毫秒后定时关机（如果设定可以覆盖ScheduleTime）
    @NameInMap("TtlInMillis")
    public Long ttlInMillis;

    public static CreateInstanceShutdownTimerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceShutdownTimerRequest self = new CreateInstanceShutdownTimerRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceShutdownTimerRequest setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public CreateInstanceShutdownTimerRequest setTtlInMillis(Long ttlInMillis) {
        this.ttlInMillis = ttlInMillis;
        return this;
    }
    public Long getTtlInMillis() {
        return this.ttlInMillis;
    }

}
