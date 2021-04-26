// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.reid_cloud20201030.models;

import com.aliyun.tea.*;

public class DescribeCursorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCursorResponseBody body;

    public static DescribeCursorResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCursorResponse self = new DescribeCursorResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCursorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCursorResponse setBody(DescribeCursorResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCursorResponseBody getBody() {
        return this.body;
    }

}
