// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListSessionGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSessionGroupResponseBody body;

    public static ListSessionGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSessionGroupResponse self = new ListSessionGroupResponse();
        return TeaModel.build(map, self);
    }

    public ListSessionGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSessionGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSessionGroupResponse setBody(ListSessionGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSessionGroupResponseBody getBody() {
        return this.body;
    }

}
