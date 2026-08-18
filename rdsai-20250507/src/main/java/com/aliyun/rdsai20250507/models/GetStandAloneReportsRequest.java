// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetStandAloneReportsRequest extends TeaModel {
    /**
     * <p>The end time filter in the format of YYYY-MM-DDTHH:mm:ssZ. If this parameter is not specified, no end time filter is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-19T02:20:20Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ReportType")
    public String reportType;

    /**
     * <p>The start time filter in the format of YYYY-MM-DDTHH:mm:ssZ. If this parameter is not specified, no start time filter is applied.</p>
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
