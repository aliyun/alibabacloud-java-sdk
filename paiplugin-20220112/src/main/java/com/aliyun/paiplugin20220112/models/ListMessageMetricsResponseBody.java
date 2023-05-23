// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class ListMessageMetricsResponseBody extends TeaModel {
    /**
     * <p>返回数据。</p>
     */
    @NameInMap("Data")
    public ListMessageMetricsResponseBodyData data;

    /**
     * <p>错误码。</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <p>错误信息。</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListMessageMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessageMetricsResponseBody self = new ListMessageMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessageMetricsResponseBody setData(ListMessageMetricsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMessageMetricsResponseBodyData getData() {
        return this.data;
    }

    public ListMessageMetricsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ListMessageMetricsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListMessageMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMessageMetricsResponseBodyDataMetrics extends TeaModel {
        /**
         * <p>发送日期。</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>发送失败。</p>
         */
        @NameInMap("Fail")
        public Integer fail;

        /**
         * <p>发送中。</p>
         */
        @NameInMap("Pending")
        public Integer pending;

        /**
         * <p>发送成功率。</p>
         */
        @NameInMap("Rate")
        public Float rate;

        /**
         * <p>发送成功。</p>
         */
        @NameInMap("Success")
        public Integer success;

        /**
         * <p>总计短信数量。</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static ListMessageMetricsResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            ListMessageMetricsResponseBodyDataMetrics self = new ListMessageMetricsResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public ListMessageMetricsResponseBodyDataMetrics setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public ListMessageMetricsResponseBodyDataMetrics setFail(Integer fail) {
            this.fail = fail;
            return this;
        }
        public Integer getFail() {
            return this.fail;
        }

        public ListMessageMetricsResponseBodyDataMetrics setPending(Integer pending) {
            this.pending = pending;
            return this;
        }
        public Integer getPending() {
            return this.pending;
        }

        public ListMessageMetricsResponseBodyDataMetrics setRate(Float rate) {
            this.rate = rate;
            return this;
        }
        public Float getRate() {
            return this.rate;
        }

        public ListMessageMetricsResponseBodyDataMetrics setSuccess(Integer success) {
            this.success = success;
            return this;
        }
        public Integer getSuccess() {
            return this.success;
        }

        public ListMessageMetricsResponseBodyDataMetrics setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class ListMessageMetricsResponseBodyData extends TeaModel {
        /**
         * <p>分页返回的统计数据条目列表。</p>
         */
        @NameInMap("Metrics")
        public java.util.List<ListMessageMetricsResponseBodyDataMetrics> metrics;

        /**
         * <p>分页数，从1开始，默认为1。</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>分页大小，默认为10。</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>总统计数据条目数量。</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListMessageMetricsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMessageMetricsResponseBodyData self = new ListMessageMetricsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMessageMetricsResponseBodyData setMetrics(java.util.List<ListMessageMetricsResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<ListMessageMetricsResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public ListMessageMetricsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListMessageMetricsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMessageMetricsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
