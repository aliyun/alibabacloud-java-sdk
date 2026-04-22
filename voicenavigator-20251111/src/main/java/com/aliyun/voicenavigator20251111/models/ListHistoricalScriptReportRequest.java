// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListHistoricalScriptReportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1582103299434</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>12f407b22cbe4890ac595f09985848d5</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ScriptIds")
    public java.util.List<String> scriptIds;

    /**
     * <strong>example:</strong>
     * <p>1582267398628</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListHistoricalScriptReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHistoricalScriptReportRequest self = new ListHistoricalScriptReportRequest();
        return TeaModel.build(map, self);
    }

    public ListHistoricalScriptReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListHistoricalScriptReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListHistoricalScriptReportRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHistoricalScriptReportRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHistoricalScriptReportRequest setScriptIds(java.util.List<String> scriptIds) {
        this.scriptIds = scriptIds;
        return this;
    }
    public java.util.List<String> getScriptIds() {
        return this.scriptIds;
    }

    public ListHistoricalScriptReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
