// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListPtsSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPtsSceneResponseBody body;

    public static ListPtsSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPtsSceneResponse self = new ListPtsSceneResponse();
        return TeaModel.build(map, self);
    }

    public ListPtsSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPtsSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPtsSceneResponse setBody(ListPtsSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPtsSceneResponseBody getBody() {
        return this.body;
    }

}
