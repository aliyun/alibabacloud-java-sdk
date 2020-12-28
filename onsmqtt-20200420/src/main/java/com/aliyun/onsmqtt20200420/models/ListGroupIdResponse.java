// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ListGroupIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGroupIdResponseBody body;

    public static ListGroupIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupIdResponse self = new ListGroupIdResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupIdResponse setBody(ListGroupIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupIdResponseBody getBody() {
        return this.body;
    }

}
