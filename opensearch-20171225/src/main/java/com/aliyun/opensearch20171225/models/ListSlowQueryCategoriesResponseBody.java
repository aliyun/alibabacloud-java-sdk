// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSlowQueryCategoriesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4406F40B-A0A2-9D5D-531F-3B6936567584</p>
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
         * <ul>
         * <li>PENDING: preparing</li>
         * <li>SUCCESS: succeeded</li>
         * <li>RUNNING: running</li>
         * <li>FAILED: failed</li>
         * <li>N/A: unknown</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;PENDING&quot;</p>
         */
        @NameInMap("analyzeStatus")
        public String analyzeStatus;

        /**
         * <p>The timestamp that indicates the end of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>1589990340</p>
         */
        @NameInMap("end")
        public Integer end;

        /**
         * <p>The timestamp that indicates the beginning of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>1589986800</p>
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
