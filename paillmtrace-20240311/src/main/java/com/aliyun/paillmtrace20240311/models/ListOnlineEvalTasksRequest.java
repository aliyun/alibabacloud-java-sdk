// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class ListOnlineEvalTasksRequest extends TeaModel {
    /**
     * <p>Search keyword. It will match on fields such as task name, application name (appName), task description, and evaluation metric name.</p>
     * 
     * <strong>example:</strong>
     * <p>foo</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The UTC end time of the search time range</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-07 13:24:25
     * 2025-04-07</p>
     */
    @NameInMap("MaxTime")
    public String maxTime;

    /**
     * <p>The UTC start time of the search time range</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-05 13:24:25
     * 2025-04-05</p>
     */
    @NameInMap("MinTime")
    public String minTime;

    /**
     * <p>The current page number. Value range: integers greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, default is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    @NameInMap("SortOrder")
    public String sortOrder;

    public static ListOnlineEvalTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOnlineEvalTasksRequest self = new ListOnlineEvalTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListOnlineEvalTasksRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListOnlineEvalTasksRequest setMaxTime(String maxTime) {
        this.maxTime = maxTime;
        return this;
    }
    public String getMaxTime() {
        return this.maxTime;
    }

    public ListOnlineEvalTasksRequest setMinTime(String minTime) {
        this.minTime = minTime;
        return this;
    }
    public String getMinTime() {
        return this.minTime;
    }

    public ListOnlineEvalTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOnlineEvalTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOnlineEvalTasksRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListOnlineEvalTasksRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

}
