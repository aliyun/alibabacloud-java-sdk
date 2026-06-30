// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetStandAloneReportsRequest extends TeaModel {
    /**
     * <p>The end of the query\&quot;s time range. The time must be in UTC and in the <code>YYYY-MM-DDTHH:mm:ssZ</code> format. If omitted, no end time filter is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-19T02:20:20Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of the page to return. The default value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page. Default: 20. Maximum: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ReportType")
    public String reportType;

    /**
     * <p>The start of the query\&quot;s time range. The time must be in UTC and in the <code>YYYY-MM-DDTHH:mm:ssZ</code> format. If omitted, no start time filter is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-03-11T02:09:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetStandAloneReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStandAloneReportsRequest self = new GetStandAloneReportsRequest();
        return TeaModel.build(map, self);
    }

    public GetStandAloneReportsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetStandAloneReportsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetStandAloneReportsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetStandAloneReportsRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

    public GetStandAloneReportsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
