// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class QueryDataDiagnosisStatisticsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The statistics for the data diagnosis task.</p>
     */
    @NameInMap("Statistics")
    public QueryDataDiagnosisStatisticsResponseBodyStatistics statistics;

    public static QueryDataDiagnosisStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDataDiagnosisStatisticsResponseBody self = new QueryDataDiagnosisStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDataDiagnosisStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDataDiagnosisStatisticsResponseBody setStatistics(QueryDataDiagnosisStatisticsResponseBodyStatistics statistics) {
        this.statistics = statistics;
        return this;
    }
    public QueryDataDiagnosisStatisticsResponseBodyStatistics getStatistics() {
        return this.statistics;
    }

    public static class QueryDataDiagnosisStatisticsResponseBodyStatistics extends TeaModel {
        /**
         * <p>The dates of task failures.</p>
         */
        @NameInMap("FailedDates")
        public java.util.List<String> failedDates;

        /**
         * <p>The dates with missing task data.</p>
         */
        @NameInMap("NoDataDates")
        public java.util.List<String> noDataDates;

        public static QueryDataDiagnosisStatisticsResponseBodyStatistics build(java.util.Map<String, ?> map) throws Exception {
            QueryDataDiagnosisStatisticsResponseBodyStatistics self = new QueryDataDiagnosisStatisticsResponseBodyStatistics();
            return TeaModel.build(map, self);
        }

        public QueryDataDiagnosisStatisticsResponseBodyStatistics setFailedDates(java.util.List<String> failedDates) {
            this.failedDates = failedDates;
            return this;
        }
        public java.util.List<String> getFailedDates() {
            return this.failedDates;
        }

        public QueryDataDiagnosisStatisticsResponseBodyStatistics setNoDataDates(java.util.List<String> noDataDates) {
            this.noDataDates = noDataDates;
            return this;
        }
        public java.util.List<String> getNoDataDates() {
            return this.noDataDates;
        }

    }

}
