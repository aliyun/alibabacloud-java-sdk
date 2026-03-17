// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetStandAloneReportsRequest extends TeaModel {
    /**
     * <p>The task end time based on which the reports are filtered. If you do not specify this parameter, all reports are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-19T02:20:20Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. Pages start from 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of records on each page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ReportType")
    public String reportType;

    /**
     * <p>The task start time based on which the reports are filtered. If you do not specify this parameter, all reports are returned.</p>
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
