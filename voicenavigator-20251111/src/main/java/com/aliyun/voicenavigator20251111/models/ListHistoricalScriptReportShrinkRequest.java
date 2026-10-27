// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListHistoricalScriptReportShrinkRequest extends TeaModel {
    /**
     * <p>The end of the query time range, which is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1582103299434</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The ID of the Voice Bot instance.</p>
     * 
     * <strong>example:</strong>
     * <p>12f407b22cbe4890ac595f09985848d5</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number to retrieve.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>A list of up to 100 script IDs.</p>
     */
    @NameInMap("ScriptIds")
    public String scriptIdsShrink;

    /**
     * <p>The start of the query time range, which is a UNIX timestamp in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1582267398628</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListHistoricalScriptReportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHistoricalScriptReportShrinkRequest self = new ListHistoricalScriptReportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListHistoricalScriptReportShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListHistoricalScriptReportShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListHistoricalScriptReportShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHistoricalScriptReportShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHistoricalScriptReportShrinkRequest setScriptIdsShrink(String scriptIdsShrink) {
        this.scriptIdsShrink = scriptIdsShrink;
        return this;
    }
    public String getScriptIdsShrink() {
        return this.scriptIdsShrink;
    }

    public ListHistoricalScriptReportShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
