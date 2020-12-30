// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snapshot20201118.models;

import com.aliyun.tea.*;

public class ListChangedBlocksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListChangedBlocksResponseBody body;

    public static ListChangedBlocksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListChangedBlocksResponse self = new ListChangedBlocksResponse();
        return TeaModel.build(map, self);
    }

    public ListChangedBlocksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListChangedBlocksResponse setBody(ListChangedBlocksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListChangedBlocksResponseBody getBody() {
        return this.body;
    }

}
