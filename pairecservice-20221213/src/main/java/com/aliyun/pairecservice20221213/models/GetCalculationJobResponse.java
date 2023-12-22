// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetCalculationJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCalculationJobResponseBody body;

    public static GetCalculationJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCalculationJobResponse self = new GetCalculationJobResponse();
        return TeaModel.build(map, self);
    }

    public GetCalculationJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCalculationJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCalculationJobResponse setBody(GetCalculationJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCalculationJobResponseBody getBody() {
        return this.body;
    }

}
