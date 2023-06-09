// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSlowQueryQueriesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The return result.</p>
     */
    @NameInMap("result")
    public ListSlowQueryQueriesResponseBodyResult result;

    public static ListSlowQueryQueriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSlowQueryQueriesResponseBody self = new ListSlowQueryQueriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSlowQueryQueriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSlowQueryQueriesResponseBody setResult(ListSlowQueryQueriesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListSlowQueryQueriesResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListSlowQueryQueriesResponseBodyResult extends TeaModel {
        /**
         * <p>The content of the optimization suggestion for the query.</p>
         */
        @NameInMap("appQuery")
        public String appQuery;

        /**
         * <p>The end of the time range that was queried.</p>
         */
        @NameInMap("end")
        public Integer end;

        /**
         * <p>The ID of the optimization suggestion.</p>
         */
        @NameInMap("index")
        public Integer index;

        /**
         * <p>The beginning of the time range that was queried.</p>
         */
        @NameInMap("start")
        public Integer start;

        public static ListSlowQueryQueriesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSlowQueryQueriesResponseBodyResult self = new ListSlowQueryQueriesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSlowQueryQueriesResponseBodyResult setAppQuery(String appQuery) {
            this.appQuery = appQuery;
            return this;
        }
        public String getAppQuery() {
            return this.appQuery;
        }

        public ListSlowQueryQueriesResponseBodyResult setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public ListSlowQueryQueriesResponseBodyResult setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListSlowQueryQueriesResponseBodyResult setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

    }

}
