// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetInspectionReportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>91bec4c5a168494e8128468e3995df87</p>
     */
    @NameInMap("reportId")
    public String reportId;

    public static GetInspectionReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInspectionReportRequest self = new GetInspectionReportRequest();
        return TeaModel.build(map, self);
    }

    public GetInspectionReportRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

}
