// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class DeleteDiagnosticRequest extends TeaModel {
    /**
     * <p>The report ID. You can troubleshoot issues based on the report.</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    public static DeleteDiagnosticRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiagnosticRequest self = new DeleteDiagnosticRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDiagnosticRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

}
