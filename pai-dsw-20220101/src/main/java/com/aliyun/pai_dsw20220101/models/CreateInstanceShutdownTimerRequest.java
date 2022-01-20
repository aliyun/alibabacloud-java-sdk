// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateInstanceShutdownTimerRequest extends TeaModel {
    // 定时关机设定时间
    @NameInMap("DueTime")
    public String dueTime;

    // 距离定时关机时间段
    @NameInMap("RemainingTimeInMs")
    public Long remainingTimeInMs;

    public static CreateInstanceShutdownTimerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceShutdownTimerRequest self = new CreateInstanceShutdownTimerRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceShutdownTimerRequest setDueTime(String dueTime) {
        this.dueTime = dueTime;
        return this;
    }
    public String getDueTime() {
        return this.dueTime;
    }

    public CreateInstanceShutdownTimerRequest setRemainingTimeInMs(Long remainingTimeInMs) {
        this.remainingTimeInMs = remainingTimeInMs;
        return this;
    }
    public Long getRemainingTimeInMs() {
        return this.remainingTimeInMs;
    }

}
