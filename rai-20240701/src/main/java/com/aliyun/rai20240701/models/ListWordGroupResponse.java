// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class ListWordGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWordGroupResponseBody body;

    public static ListWordGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWordGroupResponse self = new ListWordGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListWordGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWordGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWordGroupResponse setBody(ListWordGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWordGroupResponseBody getBody() {
        return this.body;
    }

}
