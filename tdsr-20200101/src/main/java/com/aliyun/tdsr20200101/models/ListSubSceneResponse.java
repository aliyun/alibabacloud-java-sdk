// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ListSubSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSubSceneResponseBody body;

    public static ListSubSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSubSceneResponse self = new ListSubSceneResponse();
        return TeaModel.build(map, self);
    }

    public ListSubSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSubSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSubSceneResponse setBody(ListSubSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSubSceneResponseBody getBody() {
        return this.body;
    }

}
