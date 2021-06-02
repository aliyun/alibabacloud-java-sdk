// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class StatisExportSceneInfoRequest extends TeaModel {
    // 开始时间
    @NameInMap("StartTime")
    public Long startTime;

    // 结束时间
    @NameInMap("EndTime")
    public Long endTime;

    public static StatisExportSceneInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        StatisExportSceneInfoRequest self = new StatisExportSceneInfoRequest();
        return TeaModel.build(map, self);
    }

    public StatisExportSceneInfoRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public StatisExportSceneInfoRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

}
