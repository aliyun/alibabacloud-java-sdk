// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListSlowQueryQueriesResponseBody extends TeaModel {
    @NameInMap("result")
    public ListSlowQueryQueriesResponseBodyResult result;

    @NameInMap("requestId")
    public String requestId;

    public static ListSlowQueryQueriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSlowQueryQueriesResponseBody self = new ListSlowQueryQueriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSlowQueryQueriesResponseBody setResult(ListSlowQueryQueriesResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListSlowQueryQueriesResponseBodyResult getResult() {
        return this.result;
    }

    public ListSlowQueryQueriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSlowQueryQueriesResponseBodyResult extends TeaModel {
        @NameInMap("index")
        public Integer index;

        @NameInMap("appQuery")
        public String appQuery;

        @NameInMap("start")
        public Integer start;

        @NameInMap("end")
        public Integer end;

        public static ListSlowQueryQueriesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListSlowQueryQueriesResponseBodyResult self = new ListSlowQueryQueriesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListSlowQueryQueriesResponseBodyResult setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ListSlowQueryQueriesResponseBodyResult setAppQuery(String appQuery) {
            this.appQuery = appQuery;
            return this;
        }
        public String getAppQuery() {
            return this.appQuery;
        }

        public ListSlowQueryQueriesResponseBodyResult setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

        public ListSlowQueryQueriesResponseBodyResult setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

}
