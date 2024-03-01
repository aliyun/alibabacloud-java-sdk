// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class ListSubtasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSubtasksResponseBody body;

    public static ListSubtasksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubtasksResponse self = new ListSubtasksResponse();
        return TeaModel.build(map, self);
    }

    public ListSubtasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubtasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubtasksResponse setBody(ListSubtasksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubtasksResponseBody getBody() {
        return this.body;
    }

}
