// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAppInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppInfoResponseBody body;

    public static ListAppInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppInfoResponse self = new ListAppInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListAppInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppInfoResponse setBody(ListAppInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppInfoResponseBody getBody() {
        return this.body;
    }

}
