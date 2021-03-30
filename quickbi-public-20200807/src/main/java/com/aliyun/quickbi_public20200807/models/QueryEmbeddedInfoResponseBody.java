// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200807.models;

import com.aliyun.tea.*;

public class QueryEmbeddedInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public QueryEmbeddedInfoResponseBodyResult result;

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

    public QueryEmbeddedInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEmbeddedInfoResponseBody setResult(QueryEmbeddedInfoResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryEmbeddedInfoResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryEmbeddedInfoResponseBodyResultDetail extends TeaModel {
        @NameInMap("Report")
        public Integer report;

        @NameInMap("DashboardOfflineQuery")
        public Integer dashboardOfflineQuery;

        @NameInMap("Page")
        public Integer page;

        public static QueryEmbeddedInfoResponseBodyResultDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryEmbeddedInfoResponseBodyResultDetail self = new QueryEmbeddedInfoResponseBodyResultDetail();
            return TeaModel.build(map, self);
        }

        public QueryEmbeddedInfoResponseBodyResultDetail setReport(Integer report) {
            this.report = report;
            return this;
        }
        public Integer getReport() {
            return this.report;
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

    }

    public static class QueryEmbeddedInfoResponseBodyResult extends TeaModel {
        @NameInMap("EmbeddedCount")
        public Integer embeddedCount;

        @NameInMap("MaxCount")
        public Integer maxCount;

        @NameInMap("Detail")
        public QueryEmbeddedInfoResponseBodyResultDetail detail;

        public static QueryEmbeddedInfoResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryEmbeddedInfoResponseBodyResult self = new QueryEmbeddedInfoResponseBodyResult();
            return TeaModel.build(map, self);
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

        public QueryEmbeddedInfoResponseBodyResult setDetail(QueryEmbeddedInfoResponseBodyResultDetail detail) {
            this.detail = detail;
            return this;
        }
        public QueryEmbeddedInfoResponseBodyResultDetail getDetail() {
            return this.detail;
        }

    }

}
