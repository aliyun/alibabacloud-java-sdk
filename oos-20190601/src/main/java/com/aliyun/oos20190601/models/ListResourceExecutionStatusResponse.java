// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListResourceExecutionStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourceExecutionStatusResponseBody body;

    public static ListResourceExecutionStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceExecutionStatusResponse self = new ListResourceExecutionStatusResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceExecutionStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceExecutionStatusResponse setBody(ListResourceExecutionStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceExecutionStatusResponseBody getBody() {
        return this.body;
    }

}
