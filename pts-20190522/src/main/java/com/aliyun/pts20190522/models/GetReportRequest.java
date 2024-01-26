// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190522.models;

import com.aliyun.tea.*;

public class GetReportRequest extends TeaModel {
    @NameInMap("ReportId")
    public Long reportId;

    public static GetReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetReportRequest self = new GetReportRequest();
        return TeaModel.build(map, self);
    }

    public GetReportRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

}
