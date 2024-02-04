// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateMaterialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMaterialResponseBody body;

    public static UpdateMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMaterialResponse self = new UpdateMaterialResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMaterialResponse setBody(UpdateMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMaterialResponseBody getBody() {
        return this.body;
    }

}
