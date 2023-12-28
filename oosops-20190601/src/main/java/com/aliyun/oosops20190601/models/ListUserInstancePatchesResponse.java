// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class ListUserInstancePatchesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserInstancePatchesResponseBody body;

    public static ListUserInstancePatchesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserInstancePatchesResponse self = new ListUserInstancePatchesResponse();
        return TeaModel.build(map, self);
    }

    public ListUserInstancePatchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserInstancePatchesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserInstancePatchesResponse setBody(ListUserInstancePatchesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserInstancePatchesResponseBody getBody() {
        return this.body;
    }

}
