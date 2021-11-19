// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListJMeterReportsRequest extends TeaModel {
    // 报告的起始时间，单位为ms
    @NameInMap("BeginTime")
    public Long beginTime;

    // 报告的结束时间
    @NameInMap("EndTime")
    public Long endTime;

    // 报告关键字
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 报告ID
    @NameInMap("ReportId")
    public String reportId;

    // 要查看的报告的场景id
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
