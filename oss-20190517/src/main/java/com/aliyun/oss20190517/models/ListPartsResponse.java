// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.tea.*;

public class ListPartsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListPartsResponseBody body;

    public static ListPartsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPartsResponse self = new ListPartsResponse();
        return TeaModel.build(map, self);
    }

    public ListPartsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPartsResponse setBody(ListPartsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPartsResponseBody getBody() {
        return this.body;
    }

}
