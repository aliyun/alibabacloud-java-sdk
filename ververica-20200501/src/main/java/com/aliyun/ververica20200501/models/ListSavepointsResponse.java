// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20200501.models;

import com.aliyun.tea.*;

public class ListSavepointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSavepointsResponseBody body;

    public static ListSavepointsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSavepointsResponse self = new ListSavepointsResponse();
        return TeaModel.build(map, self);
    }

    public ListSavepointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSavepointsResponse setBody(ListSavepointsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSavepointsResponseBody getBody() {
        return this.body;
    }

}
