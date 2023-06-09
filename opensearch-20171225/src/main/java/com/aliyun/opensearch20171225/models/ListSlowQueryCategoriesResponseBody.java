// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSlowQueryCategoriesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("result")
    public ListSlowQueryCategoriesResponseBodyResult result;

    public static ListSlowQueryCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSlowQueryCategoriesResponseBody self = new ListSlowQueryCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSlowQueryCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSlowQueryCategoriesResponseBody setResult(ListSlowQueryCategoriesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListSlowQueryCategoriesResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListSlowQueryCategoriesResponseBodyResult extends TeaModel {
        /**
         * <p>The status of the analysis. Valid values:</p>
         * <br>
         * <p>*   PENDING: preparing</p>
         * <p>*   SUCCESS: succeeded</p>
         * <p>*   RUNNING: running</p>
         * <p>*   FAILED: failed</p>
         * <p>*   N/A: unknown</p>
         */
        @NameInMap("analyzeStatus")
        public String analyzeStatus;

        /**
         * <p>The timestamp that indicates the end of the time range to query.</p>
         */
        @NameInMap("end")
        public Integer end;

        /**
         * <p>The timestamp that indicates the beginning of the time range to query.</p>
         */
        @NameInMap("start")
        public Integer start;

        public static ListSlowQueryCategoriesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSlowQueryCategoriesResponseBodyResult self = new ListSlowQueryCategoriesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSlowQueryCategoriesResponseBodyResult setAnalyzeStatus(String analyzeStatus) {
            this.analyzeStatus = analyzeStatus;
            return this;
        }
        public String getAnalyzeStatus() {
            return this.analyzeStatus;
        }

        public ListSlowQueryCategoriesResponseBodyResult setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public ListSlowQueryCategoriesResponseBodyResult setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

    }

}
