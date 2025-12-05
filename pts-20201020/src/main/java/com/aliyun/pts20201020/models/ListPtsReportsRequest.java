// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListPtsReportsRequest extends TeaModel {
    /**
     * <p>The timestamp when the stress testing starts. Unit: ms.</p>
     * 
     * <strong>example:</strong>
     * <p>1637115303000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The timestamp when the stress testing ends. Unit: ms.</p>
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
     * <p>The number of the page to return. The page number starts from 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of reports to return per page.</p>
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
     * <p>7RLPM3Y2</p>
     */
    @NameInMap("ReportId")
    public String reportId;

    /**
     * <p>The ID of the scenario whose report you want to view.</p>
     * 
     * <strong>example:</strong>
     * <p>1PDAL8H</p>
     */
    @NameInMap("SceneId")
    public String sceneId;

    public static ListPtsReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPtsReportsRequest self = new ListPtsReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListPtsReportsRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public ListPtsReportsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListPtsReportsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListPtsReportsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPtsReportsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPtsReportsRequest setReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }
    public String getReportId() {
        return this.reportId;
    }

    public ListPtsReportsRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
