// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20220112.models;

import com.aliyun.tea.*;

public class UpdateReportUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateReportUrlResponseBody body;

    public static UpdateReportUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateReportUrlResponse self = new UpdateReportUrlResponse();
        return TeaModel.build(map, self);
    }

    public UpdateReportUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateReportUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateReportUrlResponse setBody(UpdateReportUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateReportUrlResponseBody getBody() {
        return this.body;
    }

}
