// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListStatisticLogsRequest extends TeaModel {
    /**
     * <p>The fields to query. Example: columns=wordsTopPv.</p>
     * <br>
     * <p>For more information, see [Metrics in statistical reports](https://www.alibabacloud.com/help/en/opensearch/latest/statistical-report).</p>
     */
    @NameInMap("columns")
    public String columns;

    /**
     * <p>The content of the query clause.</p>
     */
    @NameInMap("distinct")
    public Boolean distinct;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The content of the query clause.</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The content of the sort clause.</p>
     */
    @NameInMap("sortBy")
    public String sortBy;

    /**
     * <p>The beginning of the time range to query. The default value is the timestamp of 00:00:00 on the current day.</p>
     */
    @NameInMap("startTime")
    public Integer startTime;

    /**
     * <p>The end of the time range to query. The default value is the timestamp of 24:00:00 on the current day.</p>
     */
    @NameInMap("stopTime")
    public Integer stopTime;

    public static ListStatisticLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListStatisticLogsRequest self = new ListStatisticLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListStatisticLogsRequest setColumns(String columns) {
        this.columns = columns;
        return this;
    }
    public String getColumns() {
        return this.columns;
    }

    public ListStatisticLogsRequest setDistinct(Boolean distinct) {
        this.distinct = distinct;
        return this;
    }
    public Boolean getDistinct() {
        return this.distinct;
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

}
