// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class CreateTicketWithBizDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTicketWithBizDataResponseBody body;

    public static CreateTicketWithBizDataResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketWithBizDataResponse self = new CreateTicketWithBizDataResponse();
        return TeaModel.build(map, self);
    }

    public CreateTicketWithBizDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTicketWithBizDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTicketWithBizDataResponse setBody(CreateTicketWithBizDataResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTicketWithBizDataResponseBody getBody() {
        return this.body;
    }

}
