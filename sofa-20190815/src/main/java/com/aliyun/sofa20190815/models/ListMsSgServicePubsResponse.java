// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgServicePubsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgServicePubsResponseBody body;

    public static ListMsSgServicePubsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgServicePubsResponse self = new ListMsSgServicePubsResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgServicePubsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgServicePubsResponse setBody(ListMsSgServicePubsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgServicePubsResponseBody getBody() {
        return this.body;
    }

}
