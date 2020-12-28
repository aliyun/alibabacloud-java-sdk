// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDiagnosticReportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ReportId")
    public String reportId;

    public static CreateDiagnosticReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosticReportResponseBody self = new CreateDiagnosticReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDiagnosticReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDiagnosticReportResponseBody setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

}
