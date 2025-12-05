// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListJMeterReportsRequest extends TeaModel {
    /**
     * <p>The beginning of the time range to query. Unit: ms.</p>
     * 
     * <strong>example:</strong>
     * <p>1637115303000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1637115306000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The report keyword.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of the report page to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of reports to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The report ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7R4RE352</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The ID of the scenario whose report you want to view.</p>
     * 
     * <strong>example:</strong>
     * <p>10YPA8H</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static ListJMeterReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJMeterReportsRequest self = new ListJMeterReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListJMeterReportsRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public ListJMeterReportsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListJMeterReportsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListJMeterReportsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListJMeterReportsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListJMeterReportsRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public ListJMeterReportsRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
