// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryEmbeddedInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The embedded information of the reports under the organization.</p>
     */
    @NameInMap("Result")
    public QueryEmbeddedInfoResponseBodyResult result;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryEmbeddedInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEmbeddedInfoResponseBody self = new QueryEmbeddedInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEmbeddedInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEmbeddedInfoResponseBody setResult(QueryEmbeddedInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryEmbeddedInfoResponseBodyResult getResult() {
        return this.result;
    }

    public QueryEmbeddedInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEmbeddedInfoResponseBodyResultDetail extends TeaModel {
        /**
         * <p>The number of embedded self-service fetching.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DashboardOfflineQuery")
        public Integer dashboardOfflineQuery;

        /**
         * <p>The number of embedded dashboards.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of embedded spreadsheets.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Report")
        public Integer report;

        public static QueryEmbeddedInfoResponseBodyResultDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryEmbeddedInfoResponseBodyResultDetail self = new QueryEmbeddedInfoResponseBodyResultDetail();
            return TeaModel.build(map, self);
        }

        public QueryEmbeddedInfoResponseBodyResultDetail setDashboardOfflineQuery(Integer dashboardOfflineQuery) {
            this.dashboardOfflineQuery = dashboardOfflineQuery;
            return this;
        }
        public Integer getDashboardOfflineQuery() {
            return this.dashboardOfflineQuery;
        }

        public QueryEmbeddedInfoResponseBodyResultDetail setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryEmbeddedInfoResponseBodyResultDetail setReport(Integer report) {
            this.report = report;
            return this;
        }
        public Integer getReport() {
            return this.report;
        }

    }

    public static class QueryEmbeddedInfoResponseBodyResult extends TeaModel {
        /**
         * <p>Embed the statistics of the work.</p>
         */
        @NameInMap("Detail")
        public QueryEmbeddedInfoResponseBodyResultDetail detail;

        /**
         * <p>The number of reports that are currently embedded.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EmbeddedCount")
        public Integer embeddedCount;

        /**
         * <p>The maximum number of reports that can be embedded.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxCount")
        public Integer maxCount;

        public static QueryEmbeddedInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryEmbeddedInfoResponseBodyResult self = new QueryEmbeddedInfoResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryEmbeddedInfoResponseBodyResult setDetail(QueryEmbeddedInfoResponseBodyResultDetail detail) {
            this.detail = detail;
            return this;
        }
        public QueryEmbeddedInfoResponseBodyResultDetail getDetail() {
            return this.detail;
        }

        public QueryEmbeddedInfoResponseBodyResult setEmbeddedCount(Integer embeddedCount) {
            this.embeddedCount = embeddedCount;
            return this;
        }
        public Integer getEmbeddedCount() {
            return this.embeddedCount;
        }

        public QueryEmbeddedInfoResponseBodyResult setMaxCount(Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Integer getMaxCount() {
            return this.maxCount;
        }

    }

}
