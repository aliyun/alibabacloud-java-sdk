// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListPublicPatchBaselinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPublicPatchBaselinesResponseBody body;

    public static ListPublicPatchBaselinesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublicPatchBaselinesResponse self = new ListPublicPatchBaselinesResponse();
        return TeaModel.build(map, self);
    }

    public ListPublicPatchBaselinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublicPatchBaselinesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublicPatchBaselinesResponse setBody(ListPublicPatchBaselinesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublicPatchBaselinesResponseBody getBody() {
        return this.body;
    }

}
