// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class ListResourceBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListResourceBasicInfoResponseBody body;

    public static ListResourceBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListResourceBasicInfoResponse self = new ListResourceBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListResourceBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListResourceBasicInfoResponse setBody(ListResourceBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListResourceBasicInfoResponseBody getBody() {
        return this.body;
    }

}
