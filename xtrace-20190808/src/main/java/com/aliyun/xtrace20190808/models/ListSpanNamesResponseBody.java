// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class ListSpanNamesResponseBody extends TeaModel {
    @NameInMap("SpanNames")
    public java.util.List<String> spanNames;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSpanNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSpanNamesResponseBody self = new ListSpanNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSpanNamesResponseBody setSpanNames(java.util.List<String> spanNames) {
        this.spanNames = spanNames;
        return this;
    }
    public java.util.List<String> getSpanNames() {
        return this.spanNames;
    }

    public ListSpanNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
