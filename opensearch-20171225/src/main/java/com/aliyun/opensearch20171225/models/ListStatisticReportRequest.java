// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListStatisticReportRequest extends TeaModel {
    /**
     * <p>pv,uv</p>
     */
    @NameInMap("columns")
    public String columns;

    /**
     * <p>1582646399</p>
     */
    @NameInMap("endTime")
    public Integer endTime;

    /**
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>bizType:test,sceneTag:myTag</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>1582214400</p>
     */
    @NameInMap("startTime")
    public Integer startTime;

    public static ListStatisticReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStatisticReportRequest self = new ListStatisticReportRequest();
        return TeaModel.build(map, self);
    }

    public ListStatisticReportRequest setColumns(String columns) {
        this.columns = columns;
        return this;
    }
    public String getColumns() {
        return this.columns;
    }

    public ListStatisticReportRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public ListStatisticReportRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStatisticReportRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStatisticReportRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListStatisticReportRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

}
