// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListHistoricalInstanceReportRequest extends TeaModel {
    /**
     * <p>The end time for the query. The server rounds this value up to the next hour.</p>
     * 
     * <strong>example:</strong>
     * <p>1775131200000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>A JSON array of instance IDs. The array can contain up to 100 IDs.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The number of the page to return. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. The maximum value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time for the query. The server rounds this value up to the next hour.</p>
     * 
     * <strong>example:</strong>
     * <p>1775044800000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListHistoricalInstanceReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHistoricalInstanceReportRequest self = new ListHistoricalInstanceReportRequest();
        return TeaModel.build(map, self);
    }

    public ListHistoricalInstanceReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListHistoricalInstanceReportRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public ListHistoricalInstanceReportRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHistoricalInstanceReportRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHistoricalInstanceReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
