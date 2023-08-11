// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class UploadSymbolFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadSymbolFileResponseBody body;

    public static UploadSymbolFileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadSymbolFileResponse self = new UploadSymbolFileResponse();
        return TeaModel.build(map, self);
    }

    public UploadSymbolFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadSymbolFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadSymbolFileResponse setBody(UploadSymbolFileResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadSymbolFileResponseBody getBody() {
        return this.body;
    }

}
