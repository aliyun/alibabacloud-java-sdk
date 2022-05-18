// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class SearchTicketByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SearchTicketByIdResponseBody body;

    public static SearchTicketByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTicketByIdResponse self = new SearchTicketByIdResponse();
        return TeaModel.build(map, self);
    }

    public SearchTicketByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchTicketByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchTicketByIdResponse setBody(SearchTicketByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchTicketByIdResponseBody getBody() {
        return this.body;
    }

}
