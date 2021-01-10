// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListGWApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGWApiResponseBody body;

    public static ListGWApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGWApiResponse self = new ListGWApiResponse();
        return TeaModel.build(map, self);
    }

    public ListGWApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGWApiResponse setBody(ListGWApiResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGWApiResponseBody getBody() {
        return this.body;
    }

}
