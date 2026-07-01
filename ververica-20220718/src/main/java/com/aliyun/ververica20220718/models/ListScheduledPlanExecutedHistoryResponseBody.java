// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListScheduledPlanExecutedHistoryResponseBody extends TeaModel {
    /**
     * <p>The list of jobs that meet the filter criteria. This parameter is returned only when the request is successful.</p>
     */
    @NameInMap("data")
    public java.util.List<ScheduledPlanExecutedInfo> data;

    /**
     * <p>The error code that is returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message that is returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code. The value is always 200. Use the \<code>success\\</code> parameter to determine whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageIndex")
    public Integer pageIndex;

    /**
     * <p>The number of entries on the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of entries that meet the filter criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("totalSize")
    public Integer totalSize;

    public static ListScheduledPlanExecutedHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledPlanExecutedHistoryResponseBody self = new ListScheduledPlanExecutedHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListScheduledPlanExecutedHistoryResponseBody setData(java.util.List<ScheduledPlanExecutedInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ScheduledPlanExecutedInfo> getData() {
        return this.data;
    }

    public ListScheduledPlanExecutedHistoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListScheduledPlanExecutedHistoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListScheduledPlanExecutedHistoryResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListScheduledPlanExecutedHistoryResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListScheduledPlanExecutedHistoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListScheduledPlanExecutedHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListScheduledPlanExecutedHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListScheduledPlanExecutedHistoryResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

}
