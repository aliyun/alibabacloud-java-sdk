// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListGWApiGroupApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGWApiGroupApiResponseBody body;

    public static ListGWApiGroupApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGWApiGroupApiResponse self = new ListGWApiGroupApiResponse();
        return TeaModel.build(map, self);
    }

    public ListGWApiGroupApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGWApiGroupApiResponse setBody(ListGWApiGroupApiResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGWApiGroupApiResponseBody getBody() {
        return this.body;
    }

}
