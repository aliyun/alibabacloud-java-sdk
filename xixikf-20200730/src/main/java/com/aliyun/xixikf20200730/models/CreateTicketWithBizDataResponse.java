// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class CreateTicketWithBizDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public CreateTicketWithBizDataResponse setBody(CreateTicketWithBizDataResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTicketWithBizDataResponseBody getBody() {
        return this.body;
    }

}
