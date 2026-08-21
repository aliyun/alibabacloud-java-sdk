// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetInspectionReportRequest extends TeaModel {
    @NameInMap("X-Debug-Id")
    public String xDebugId;

    /**
     * <p>The inspection report ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91bec4c5a168494e8128468e3995df87</p>
     */
    @NameInMap("reportId")
    public String reportId;

    @NameInMap("x-sysom-invoke-source")
    public String xSysomInvokeSource;

    public static GetInspectionReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInspectionReportRequest self = new GetInspectionReportRequest();
        return TeaModel.build(map, self);
    }

    public GetInspectionReportRequest setXDebugId(String xDebugId) {
        this.xDebugId = xDebugId;
        return this;
    }
    public String getXDebugId() {
        return this.xDebugId;
    }

    public GetInspectionReportRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public GetInspectionReportRequest setXSysomInvokeSource(String xSysomInvokeSource) {
        this.xSysomInvokeSource = xSysomInvokeSource;
        return this;
    }
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

}
