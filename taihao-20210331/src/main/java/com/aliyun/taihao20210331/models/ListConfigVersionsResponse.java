// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListConfigVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConfigVersionsResponseBody body;

    public static ListConfigVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConfigVersionsResponse self = new ListConfigVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListConfigVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConfigVersionsResponse setBody(ListConfigVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConfigVersionsResponseBody getBody() {
        return this.body;
    }

}
