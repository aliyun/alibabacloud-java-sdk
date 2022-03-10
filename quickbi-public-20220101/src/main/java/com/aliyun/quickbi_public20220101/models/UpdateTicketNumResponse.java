// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateTicketNumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTicketNumResponseBody body;

    public static UpdateTicketNumResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTicketNumResponse self = new UpdateTicketNumResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTicketNumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTicketNumResponse setBody(UpdateTicketNumResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTicketNumResponseBody getBody() {
        return this.body;
    }

}
