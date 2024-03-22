// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DeleteComponentAssetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteComponentAssetResponseBody body;

    public static DeleteComponentAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteComponentAssetResponse self = new DeleteComponentAssetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteComponentAssetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteComponentAssetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteComponentAssetResponse setBody(DeleteComponentAssetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteComponentAssetResponseBody getBody() {
        return this.body;
    }

}
