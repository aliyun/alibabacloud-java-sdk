// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class RefuseAdditionalMaterialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RefuseAdditionalMaterialResponseBody body;

    public static RefuseAdditionalMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        RefuseAdditionalMaterialResponse self = new RefuseAdditionalMaterialResponse();
        return TeaModel.build(map, self);
    }

    public RefuseAdditionalMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefuseAdditionalMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefuseAdditionalMaterialResponse setBody(RefuseAdditionalMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public RefuseAdditionalMaterialResponseBody getBody() {
        return this.body;
    }

}
