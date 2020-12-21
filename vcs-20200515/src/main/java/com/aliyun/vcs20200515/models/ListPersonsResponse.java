// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class ListPersonsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPersonsResponseBody body;

    public static ListPersonsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersonsResponse self = new ListPersonsResponse();
        return TeaModel.build(map, self);
    }

    public ListPersonsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPersonsResponse setBody(ListPersonsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPersonsResponseBody getBody() {
        return this.body;
    }

}
