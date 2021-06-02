// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class StatisQueryByDayRequest extends TeaModel {
    // 开始时间
    @NameInMap("StartTime")
    public Long startTime;

    // 结束时间
    @NameInMap("EndTime")
    public Long endTime;

    public static StatisQueryByDayRequest build(java.util.Map<String, ?> map) throws Exception {
        StatisQueryByDayRequest self = new StatisQueryByDayRequest();
        return TeaModel.build(map, self);
    }

    public StatisQueryByDayRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public StatisQueryByDayRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
