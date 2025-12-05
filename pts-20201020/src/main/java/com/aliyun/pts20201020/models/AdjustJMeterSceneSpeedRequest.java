// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class AdjustJMeterSceneSpeedRequest extends TeaModel {
    /**
     * <p>The ID of the report.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DYYPZIH</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The load to which you want to adjust.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
