// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSlowQueryCategoriesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4406F40B-A0A2-9D5D-531F-3B6936567584</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned data.</p>
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
         * <p>The analysis status.</p>
         * <ul>
         * <li><p>PENDING: The analysis is being prepared.</p>
         * </li>
         * <li><p>SUCCESS: The analysis is successful.</p>
         * </li>
         * <li><p>RUNNING: The analysis is in progress.</p>
         * </li>
         * <li><p>FAILED: The analysis failed.</p>
         * </li>
         * <li><p>N/A: The analysis status is unknown.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;PENDING&quot;</p>
         */
        @NameInMap("analyzeStatus")
        public String analyzeStatus;

        /**
         * <p>The end timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1589990340</p>
         */
        @NameInMap("end")
        public Integer end;

        /**
         * <p>The start timestamp.</p>
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
