// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyModelApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyModelApiResponseBody body;

    public static ModifyModelApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyModelApiResponse self = new ModifyModelApiResponse();
        return TeaModel.build(map, self);
    }

    public ModifyModelApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyModelApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyModelApiResponse setBody(ModifyModelApiResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyModelApiResponseBody getBody() {
        return this.body;
    }

}
