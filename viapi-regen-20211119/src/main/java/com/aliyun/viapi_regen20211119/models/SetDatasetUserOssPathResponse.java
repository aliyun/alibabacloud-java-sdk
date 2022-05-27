// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi_regen20211119.models;

import com.aliyun.tea.*;

public class SetDatasetUserOssPathResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetDatasetUserOssPathResponseBody body;

    public static SetDatasetUserOssPathResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDatasetUserOssPathResponse self = new SetDatasetUserOssPathResponse();
        return TeaModel.build(map, self);
    }

    public SetDatasetUserOssPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDatasetUserOssPathResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDatasetUserOssPathResponse setBody(SetDatasetUserOssPathResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDatasetUserOssPathResponseBody getBody() {
        return this.body;
    }

}
