// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListPatchBaselinesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPatchBaselinesResponseBody body;

    public static ListPatchBaselinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPatchBaselinesResponse self = new ListPatchBaselinesResponse();
        return TeaModel.build(map, self);
    }

    public ListPatchBaselinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPatchBaselinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPatchBaselinesResponse setBody(ListPatchBaselinesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPatchBaselinesResponseBody getBody() {
        return this.body;
    }

}
