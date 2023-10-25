// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class ListSpanNamesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The span names.</p>
     */
    @NameInMap("SpanNames")
    public ListSpanNamesResponseBodySpanNames spanNames;

    public static ListSpanNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSpanNamesResponseBody self = new ListSpanNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSpanNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSpanNamesResponseBody setSpanNames(ListSpanNamesResponseBodySpanNames spanNames) {
        this.spanNames = spanNames;
        return this;
    }
    public ListSpanNamesResponseBodySpanNames getSpanNames() {
        return this.spanNames;
    }

    public static class ListSpanNamesResponseBodySpanNames extends TeaModel {
        @NameInMap("SpanName")
        public java.util.List<String> spanName;

        public static ListSpanNamesResponseBodySpanNames build(java.util.Map<String, ?> map) throws Exception {
            ListSpanNamesResponseBodySpanNames self = new ListSpanNamesResponseBodySpanNames();
            return TeaModel.build(map, self);
        }

        public ListSpanNamesResponseBodySpanNames setSpanName(java.util.List<String> spanName) {
            this.spanName = spanName;
            return this;
        }
        public java.util.List<String> getSpanName() {
            return this.spanName;
        }

    }

}
