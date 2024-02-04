// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ConfirmAdditionalMaterialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfirmAdditionalMaterialResponseBody body;

    public static ConfirmAdditionalMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAdditionalMaterialResponse self = new ConfirmAdditionalMaterialResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmAdditionalMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfirmAdditionalMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfirmAdditionalMaterialResponse setBody(ConfirmAdditionalMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfirmAdditionalMaterialResponseBody getBody() {
        return this.body;
    }

}
