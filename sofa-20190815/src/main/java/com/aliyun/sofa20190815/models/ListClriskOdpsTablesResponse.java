// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskOdpsTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClriskOdpsTablesResponseBody body;

    public static ListClriskOdpsTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClriskOdpsTablesResponse self = new ListClriskOdpsTablesResponse();
        return TeaModel.build(map, self);
    }

    public ListClriskOdpsTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClriskOdpsTablesResponse setBody(ListClriskOdpsTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClriskOdpsTablesResponseBody getBody() {
        return this.body;
    }

}
