// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListGroupResponseBody body;

    public static ListGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGroupResponse self = new ListGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGroupResponse setBody(ListGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListGroupResponseBody getBody() {
        return this.body;
    }

}
