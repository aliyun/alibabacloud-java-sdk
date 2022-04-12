// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class AdjustJMeterSceneSpeedRequest extends TeaModel {
    // 报告id
    @NameInMap("ReportId")
    public String reportId;

    // 要调整到的压力值
    @NameInMap("Speed")
    public Integer speed;

    public static AdjustJMeterSceneSpeedRequest build(java.util.Map<String, ?> map) throws Exception {
        AdjustJMeterSceneSpeedRequest self = new AdjustJMeterSceneSpeedRequest();
        return TeaModel.build(map, self);
    }

    public AdjustJMeterSceneSpeedRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public AdjustJMeterSceneSpeedRequest setSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }
    public Integer getSpeed() {
        return this.speed;
    }

}
