// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class ListPodsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPodsResponseBody body;

    public static ListPodsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPodsResponse self = new ListPodsResponse();
        return TeaModel.build(map, self);
    }

    public ListPodsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPodsResponse setBody(ListPodsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPodsResponseBody getBody() {
        return this.body;
    }

}
