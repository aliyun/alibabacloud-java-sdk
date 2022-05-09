// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class TempPreviewStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TempPreviewStatusResponseBody body;

    public static TempPreviewStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        TempPreviewStatusResponse self = new TempPreviewStatusResponse();
        return TeaModel.build(map, self);
    }

    public TempPreviewStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TempPreviewStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TempPreviewStatusResponse setBody(TempPreviewStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public TempPreviewStatusResponseBody getBody() {
        return this.body;
    }

}
