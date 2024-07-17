// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListLogsRequest extends TeaModel {
    /**
     * <p>The end tim. The value is a timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1710432000</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>The number of entries per num. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNum")
    public String pageNum;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>The query statement</p>
     * 
     * <strong>example:</strong>
     * <p>status: 200 AND totalTime &gt; 0.01</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The start time. The value is a timestamp in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1706340600</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>-push   -select</p>
     * 
     * <strong>example:</strong>
     * <p>push</p>
     */
    @NameInMap("type")
    public String type;

    public static ListLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLogsRequest self = new ListLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListLogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListLogsRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public ListLogsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListLogsRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListLogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ListLogsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
