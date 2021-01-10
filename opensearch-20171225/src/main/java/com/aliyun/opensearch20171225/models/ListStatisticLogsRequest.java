// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListStatisticLogsRequest extends TeaModel {
    @NameInMap("startTime")
    public Integer startTime;

    @NameInMap("stopTime")
    public Integer stopTime;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("query")
    public String query;

    @NameInMap("sortBy")
    public String sortBy;

    @NameInMap("distinct")
    public Boolean distinct;

    @NameInMap("columns")
    public String columns;

    public static ListStatisticLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStatisticLogsRequest self = new ListStatisticLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListStatisticLogsRequest setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public ListStatisticLogsRequest setStopTime(Integer stopTime) {
        this.stopTime = stopTime;
        return this;
    }
    public Integer getStopTime() {
        return this.stopTime;
    }

    public ListStatisticLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListStatisticLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListStatisticLogsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListStatisticLogsRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListStatisticLogsRequest setDistinct(Boolean distinct) {
        this.distinct = distinct;
        return this;
    }
    public Boolean getDistinct() {
        return this.distinct;
    }

    public ListStatisticLogsRequest setColumns(String columns) {
        this.columns = columns;
        return this;
    }
    public String getColumns() {
        return this.columns;
    }

}
