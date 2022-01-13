// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class ListEnvironmentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.List<Environment> body;

    public static ListEnvironmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentsResponse self = new ListEnvironmentsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentsResponse setBody(java.util.List<Environment> body) {
        this.body = body;
        return this;
    }
    public java.util.List<Environment> getBody() {
        return this.body;
    }

}
