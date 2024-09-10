// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateCustomizeReportStatusRequest extends TeaModel {
    /**
     * <p>The time when the report is pinned. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1717430400000</p>
     */
    @NameInMap("PinnedTime")
    public Long pinnedTime;

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

    /**
     * <p>The status of the report. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: disabled.</li>
     * <li><strong>1</strong>: enabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReportStatus")
    public Integer reportStatus;

    public static UpdateCustomizeReportStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomizeReportStatusRequest self = new UpdateCustomizeReportStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomizeReportStatusRequest setPinnedTime(Long pinnedTime) {
        this.pinnedTime = pinnedTime;
        return this;
    }
    public Long getPinnedTime() {
        return this.pinnedTime;
    }

    public UpdateCustomizeReportStatusRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

    public UpdateCustomizeReportStatusRequest setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
        return this;
    }
    public Integer getReportStatus() {
        return this.reportStatus;
    }

}
