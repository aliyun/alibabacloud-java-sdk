// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListAutopilotTuningHistoriesResponseBody extends TeaModel {
    /**
     * <p>The tuning history list result.</p>
     */
    @NameInMap("data")
    public ListAutopilotTuningHistoriesResponseBodyData data;

    /**
     * <p>When success is false, this value is not empty and indicates the business error code. When success is true, this value is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>When success is false, this value is not empty and indicates the business error message. When success is true, this value is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The business status code, which is always 200. Use success to determine whether the business request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the business request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListAutopilotTuningHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutopilotTuningHistoriesResponseBody self = new ListAutopilotTuningHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutopilotTuningHistoriesResponseBody setData(ListAutopilotTuningHistoriesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAutopilotTuningHistoriesResponseBodyData getData() {
        return this.data;
    }

    public ListAutopilotTuningHistoriesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAutopilotTuningHistoriesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListAutopilotTuningHistoriesResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public ListAutopilotTuningHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAutopilotTuningHistoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAutopilotTuningHistoriesResponseBodyData extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        /**
         * <p>The list of tuning history records.</p>
         */
        @NameInMap("tuningHistories")
        public java.util.List<TuningHistory> tuningHistories;

        public static ListAutopilotTuningHistoriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAutopilotTuningHistoriesResponseBodyData self = new ListAutopilotTuningHistoriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAutopilotTuningHistoriesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListAutopilotTuningHistoriesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAutopilotTuningHistoriesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListAutopilotTuningHistoriesResponseBodyData setTuningHistories(java.util.List<TuningHistory> tuningHistories) {
            this.tuningHistories = tuningHistories;
            return this;
        }
        public java.util.List<TuningHistory> getTuningHistories() {
            return this.tuningHistories;
        }

    }

}
