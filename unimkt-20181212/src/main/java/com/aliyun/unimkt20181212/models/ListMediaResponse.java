// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListMediaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMediaResponseBody body;

    public static ListMediaResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaResponse self = new ListMediaResponse();
        return TeaModel.build(map, self);
    }

    public ListMediaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMediaResponse setBody(ListMediaResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaResponseBody getBody() {
        return this.body;
    }

}
