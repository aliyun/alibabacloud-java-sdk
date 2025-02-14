// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOperationProcessDetailRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end of the time range to query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1731555850000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The beginning of the time range to query. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1731469330000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The subtask status codes.</p>
     */
    @NameInMap("StatusCodes")
    public java.util.List<Integer> statusCodes;

    /**
     * <p>The IDs of operation tasks.</p>
     */
    @NameInMap("TaskIds")
    public java.util.List<String> taskIds;

    public static ListOperationProcessDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationProcessDetailRequest self = new ListOperationProcessDetailRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationProcessDetailRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOperationProcessDetailRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListOperationProcessDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListOperationProcessDetailRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOperationProcessDetailRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListOperationProcessDetailRequest setStatusCodes(java.util.List<Integer> statusCodes) {
        this.statusCodes = statusCodes;
        return this;
    }
    public java.util.List<Integer> getStatusCodes() {
        return this.statusCodes;
    }

    public ListOperationProcessDetailRequest setTaskIds(java.util.List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

}
