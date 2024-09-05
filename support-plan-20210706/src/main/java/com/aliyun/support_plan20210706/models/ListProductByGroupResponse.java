// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.support_plan20210706.models;

import com.aliyun.tea.*;

public class ListProductByGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListProductByGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProductByGroupResponse setBody(ListProductByGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProductByGroupResponseBody getBody() {
        return this.body;
    }

}
