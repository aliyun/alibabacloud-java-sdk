// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCustomizeReportRequest extends TeaModel {
    /**
     * <p>The ID of the report.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCustomizeReportList~~">DescribeCustomizeReportList</a> operation to query the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ReportId")
    public Long reportId;

    public static DeleteCustomizeReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizeReportRequest self = new DeleteCustomizeReportRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizeReportRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

}
