// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class CreateAppInstanceTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAppInstanceTicketResponseBody body;

    public static CreateAppInstanceTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAppInstanceTicketResponse self = new CreateAppInstanceTicketResponse();
        return TeaModel.build(map, self);
    }

    public CreateAppInstanceTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAppInstanceTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAppInstanceTicketResponse setBody(CreateAppInstanceTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAppInstanceTicketResponseBody getBody() {
        return this.body;
    }

}
