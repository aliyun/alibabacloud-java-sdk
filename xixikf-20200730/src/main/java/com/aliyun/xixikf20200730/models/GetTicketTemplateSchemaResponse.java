// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class GetTicketTemplateSchemaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTicketTemplateSchemaResponseBody body;

    public static GetTicketTemplateSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTicketTemplateSchemaResponse self = new GetTicketTemplateSchemaResponse();
        return TeaModel.build(map, self);
    }

    public GetTicketTemplateSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTicketTemplateSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTicketTemplateSchemaResponse setBody(GetTicketTemplateSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTicketTemplateSchemaResponseBody getBody() {
        return this.body;
    }

}
