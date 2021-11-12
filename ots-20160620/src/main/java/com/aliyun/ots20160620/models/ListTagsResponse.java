// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ots20160620.models;

import com.aliyun.tea.*;

public class ListTagsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListTagsResponseBody body;

    public static ListTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagsResponse self = new ListTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTagsResponse setBody(ListTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTagsResponseBody getBody() {
        return this.body;
    }

}
