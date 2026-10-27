// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListHistoricalInstanceReportShrinkRequest extends TeaModel {
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
    public String instanceIdsShrink;

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

    public static ListHistoricalInstanceReportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHistoricalInstanceReportShrinkRequest self = new ListHistoricalInstanceReportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListHistoricalInstanceReportShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListHistoricalInstanceReportShrinkRequest setInstanceIdsShrink(String instanceIdsShrink) {
        this.instanceIdsShrink = instanceIdsShrink;
        return this;
    }
    public String getInstanceIdsShrink() {
        return this.instanceIdsShrink;
    }

    public ListHistoricalInstanceReportShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHistoricalInstanceReportShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHistoricalInstanceReportShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
