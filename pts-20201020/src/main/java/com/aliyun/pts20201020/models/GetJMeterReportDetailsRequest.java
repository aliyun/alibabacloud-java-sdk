// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetJMeterReportDetailsRequest extends TeaModel {
    @NameInMap("ReportId")
    public String reportId;

    public static GetJMeterReportDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJMeterReportDetailsRequest self = new GetJMeterReportDetailsRequest();
        return TeaModel.build(map, self);
    }

    public GetJMeterReportDetailsRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

}
