// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190522.models;

import com.aliyun.tea.*;

public class GetAliwareReportRequest extends TeaModel {
    @NameInMap("ReportId")
    public Long reportId;

    public static GetAliwareReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAliwareReportRequest self = new GetAliwareReportRequest();
        return TeaModel.build(map, self);
    }

    public GetAliwareReportRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

}
