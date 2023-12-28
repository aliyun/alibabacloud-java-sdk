// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListUserInstancePatchStatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserInstancePatchStatesResponseBody body;

    public static ListUserInstancePatchStatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserInstancePatchStatesResponse self = new ListUserInstancePatchStatesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserInstancePatchStatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserInstancePatchStatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserInstancePatchStatesResponse setBody(ListUserInstancePatchStatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserInstancePatchStatesResponseBody getBody() {
        return this.body;
    }

}
