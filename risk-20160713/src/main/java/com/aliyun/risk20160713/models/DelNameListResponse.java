// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class DelNameListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DelNameListResponseBody body;

    public static DelNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        DelNameListResponse self = new DelNameListResponse();
        return TeaModel.build(map, self);
    }

    public DelNameListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DelNameListResponse setBody(DelNameListResponseBody body) {
        this.body = body;
        return this;
    }
    public DelNameListResponseBody getBody() {
        return this.body;
    }

}
