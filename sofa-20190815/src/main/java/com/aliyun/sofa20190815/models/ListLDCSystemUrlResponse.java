// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCSystemUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLDCSystemUrlResponseBody body;

    public static ListLDCSystemUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLDCSystemUrlResponse self = new ListLDCSystemUrlResponse();
        return TeaModel.build(map, self);
    }

    public ListLDCSystemUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLDCSystemUrlResponse setBody(ListLDCSystemUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLDCSystemUrlResponseBody getBody() {
        return this.body;
    }

}
