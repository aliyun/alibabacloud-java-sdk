// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class CreateInstanceShutdownTimerV2Request extends TeaModel {
    // 定时关机设定时间
    @NameInMap("DueTime")
    public String dueTime;

    // 距离定时关机时间段
    @NameInMap("RemainingTimeInMs")
    public Long remainingTimeInMs;

    public static CreateInstanceShutdownTimerV2Request build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceShutdownTimerV2Request self = new CreateInstanceShutdownTimerV2Request();
        return TeaModel.build(map, self);
    }

    public CreateInstanceShutdownTimerV2Request setDueTime(String dueTime) {
        this.dueTime = dueTime;
        return this;
    }
    public String getDueTime() {
        return this.dueTime;
    }

    public CreateInstanceShutdownTimerV2Request setRemainingTimeInMs(Long remainingTimeInMs) {
        this.remainingTimeInMs = remainingTimeInMs;
        return this;
    }
    public Long getRemainingTimeInMs() {
        return this.remainingTimeInMs;
    }

}
