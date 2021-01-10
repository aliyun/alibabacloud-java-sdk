// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListGWAppApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListGWAppApiResponseBody body;

    public static ListGWAppApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGWAppApiResponse self = new ListGWAppApiResponse();
        return TeaModel.build(map, self);
    }

    public ListGWAppApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGWAppApiResponse setBody(ListGWAppApiResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGWAppApiResponseBody getBody() {
        return this.body;
    }

}
