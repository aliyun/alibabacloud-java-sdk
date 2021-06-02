// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class StatisQueryByTypeRequest extends TeaModel {
    // 开始时间
    @NameInMap("StartTime")
    public Long startTime;

    // 结束时间
    @NameInMap("EndTime")
    public Long endTime;

    public static StatisQueryByTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        StatisQueryByTypeRequest self = new StatisQueryByTypeRequest();
        return TeaModel.build(map, self);
    }

    public StatisQueryByTypeRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public StatisQueryByTypeRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
