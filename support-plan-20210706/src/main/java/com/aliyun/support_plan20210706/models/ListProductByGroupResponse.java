// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ListProductByGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListProductByGroupResponseBody body;

    public static ListProductByGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProductByGroupResponse self = new ListProductByGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListProductByGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProductByGroupResponse setBody(ListProductByGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductByGroupResponseBody getBody() {
        return this.body;
    }

}
