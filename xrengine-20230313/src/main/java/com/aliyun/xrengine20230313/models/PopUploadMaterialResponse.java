// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopUploadMaterialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PopUploadMaterialResponseBody body;

    public static PopUploadMaterialResponse build(java.util.Map<String, ?> map) throws Exception {
        PopUploadMaterialResponse self = new PopUploadMaterialResponse();
        return TeaModel.build(map, self);
    }

    public PopUploadMaterialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopUploadMaterialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopUploadMaterialResponse setBody(PopUploadMaterialResponseBody body) {
        this.body = body;
        return this;
    }
    public PopUploadMaterialResponseBody getBody() {
        return this.body;
    }

}
