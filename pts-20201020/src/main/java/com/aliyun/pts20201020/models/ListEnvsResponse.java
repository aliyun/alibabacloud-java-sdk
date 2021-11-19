// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListEnvsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnvsResponseBody body;

    public static ListEnvsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvsResponse self = new ListEnvsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvsResponse setBody(ListEnvsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnvsResponseBody getBody() {
        return this.body;
    }

}
