// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListFunctionTasksRequest extends TeaModel {
    /**
     * <p>The end time is less than the specified time. Specify the time in the UNIX timestamp format. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1582646399</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The start time is greater than the specified time. Specify the time in the UNIX timestamp format. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1582214400</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>The status of the task. Valid values:</p>
     * <ul>
     * <li>success</li>
     * <li>failed</li>
     * <li>running</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("status")
    public String status;

    public static ListFunctionTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionTasksRequest self = new ListFunctionTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListFunctionTasksRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListFunctionTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFunctionTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFunctionTasksRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListFunctionTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
