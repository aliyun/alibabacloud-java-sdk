// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class ListPersonByImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPersonByImageResponseBody body;

    public static ListPersonByImageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPersonByImageResponse self = new ListPersonByImageResponse();
        return TeaModel.build(map, self);
    }

    public ListPersonByImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPersonByImageResponse setBody(ListPersonByImageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPersonByImageResponseBody getBody() {
        return this.body;
    }

}
