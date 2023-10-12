// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetDiagnosticRequest extends TeaModel {
    @NameInMap("ReportId")
    public String reportId;

    public static GetDiagnosticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDiagnosticRequest self = new GetDiagnosticRequest();
        return TeaModel.build(map, self);
    }

    public GetDiagnosticRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

}
