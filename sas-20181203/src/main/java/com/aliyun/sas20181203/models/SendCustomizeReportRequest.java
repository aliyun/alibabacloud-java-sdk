// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SendCustomizeReportRequest extends TeaModel {
    /**
     * <p>The report ID.</p>
     * <blockquote>
     * <p>Call <a href="~~DescribeCustomizeReportList~~">DescribeCustomizeReportList</a> to obtain this parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ReportId")
    public Long reportId;

    public static SendCustomizeReportRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCustomizeReportRequest self = new SendCustomizeReportRequest();
        return TeaModel.build(map, self);
    }

    public SendCustomizeReportRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

}
