// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetPatrolReportDetailRequest extends TeaModel {
    /**
     * <p>The report date in ISO format such as 2026-08-13, or a special value such as today or yesterday. Specify either this parameter or reportId. This parameter is used to retrieve the latest report for the specified date.</p>
     * 
     * <strong>example:</strong>
     * <p>20260416</p>
     */
    @NameInMap("date")
    public String date;

    /**
     * <p>The report ID. Specify either this parameter or date. The reportId parameter takes priority over the date parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>d72edfd9f3ef475ca310456ecdb09fe8</p>
     */
    @NameInMap("reportId")
    public String reportId;

    /**
     * <p>The time zone. Used together with the date parameter. Default value: UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>UTC</p>
     */
    @NameInMap("timezone")
    public String timezone;

    public static GetPatrolReportDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPatrolReportDetailRequest self = new GetPatrolReportDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetPatrolReportDetailRequest setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public GetPatrolReportDetailRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public GetPatrolReportDetailRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

}
