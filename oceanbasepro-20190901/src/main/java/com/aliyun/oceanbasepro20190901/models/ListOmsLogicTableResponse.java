// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsLogicTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListOmsLogicTableResponseBody body;

    public static ListOmsLogicTableResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOmsLogicTableResponse self = new ListOmsLogicTableResponse();
        return TeaModel.build(map, self);
    }

    public ListOmsLogicTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOmsLogicTableResponse setBody(ListOmsLogicTableResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOmsLogicTableResponseBody getBody() {
        return this.body;
    }

}
