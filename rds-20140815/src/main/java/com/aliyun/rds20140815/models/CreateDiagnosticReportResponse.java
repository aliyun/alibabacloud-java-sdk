// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDiagnosticReportResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ReportId")
    @Validation(required = true)
    public String reportId;

    public static CreateDiagnosticReportResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDiagnosticReportResponse self = new CreateDiagnosticReportResponse();
        return TeaModel.build(map, self);
    }

}
