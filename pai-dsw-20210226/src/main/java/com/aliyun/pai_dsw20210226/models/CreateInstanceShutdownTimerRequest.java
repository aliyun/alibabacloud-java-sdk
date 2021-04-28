// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class CreateInstanceShutdownTimerRequest extends TeaModel {
    // 定时关机时间(GMT)
    @NameInMap("ScheduleTime")
    public String scheduleTime;

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

}
