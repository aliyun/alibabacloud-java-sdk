// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportCustomizeReportRequest extends TeaModel {
    /**
     * <p>The type of the security report that you want to export. Valid values:</p>
     * <ul>
     * <li><strong>HTML</strong></li>
     * <li><strong>PDF</strong></li>
     * </ul>
     * <blockquote>
     * <p> The default value is HTML. PDF is supported only for security reports in version 2.0.0.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HTML</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    /**
     * <p>The ID of the security report.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCustomizeReportList~~">DescribeCustomizeReportList</a> operation to query the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReportId")
    public Long reportId;

    public static ExportCustomizeReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportCustomizeReportRequest self = new ExportCustomizeReportRequest();
        return TeaModel.build(map, self);
    }

    public ExportCustomizeReportRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public ExportCustomizeReportRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

}
