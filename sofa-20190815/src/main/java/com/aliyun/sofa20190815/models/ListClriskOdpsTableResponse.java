// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskOdpsTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClriskOdpsTableResponseBody body;

    public static ListClriskOdpsTableResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClriskOdpsTableResponse self = new ListClriskOdpsTableResponse();
        return TeaModel.build(map, self);
    }

    public ListClriskOdpsTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClriskOdpsTableResponse setBody(ListClriskOdpsTableResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClriskOdpsTableResponseBody getBody() {
        return this.body;
    }

}
