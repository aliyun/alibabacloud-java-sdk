// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class GetScheduledReportsRequest extends TeaModel {
    /**
     * <p>The task end time based on which the reports are filtered. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. If you leave this parameter unspecified, all reports are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-25T02:02:00Z</p>
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
     * <p>The number of reports returned on each page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The inspection task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>847268a4-196f-416b-aa12-bfe0c115****</p>
     */
    @NameInMap("ScheduledId")
    public String scheduledId;

    /**
     * <p>The task start time based on which the reports are filtered. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format. If you leave this parameter unspecified, all reports are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-25T01:02:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static GetScheduledReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScheduledReportsRequest self = new GetScheduledReportsRequest();
        return TeaModel.build(map, self);
    }

    public GetScheduledReportsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetScheduledReportsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetScheduledReportsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetScheduledReportsRequest setScheduledId(String scheduledId) {
        this.scheduledId = scheduledId;
        return this;
    }
    public String getScheduledId() {
        return this.scheduledId;
    }

    public GetScheduledReportsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
