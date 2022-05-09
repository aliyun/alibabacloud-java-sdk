// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class TempPreviewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TempPreviewResponseBody body;

    public static TempPreviewResponse build(java.util.Map<String, ?> map) throws Exception {
        TempPreviewResponse self = new TempPreviewResponse();
        return TeaModel.build(map, self);
    }

    public TempPreviewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TempPreviewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TempPreviewResponse setBody(TempPreviewResponseBody body) {
        this.body = body;
        return this;
    }
    public TempPreviewResponseBody getBody() {
        return this.body;
    }

}
