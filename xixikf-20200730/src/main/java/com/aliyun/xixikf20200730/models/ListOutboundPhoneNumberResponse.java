// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class ListOutboundPhoneNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListOutboundPhoneNumberResponseBody body;

    public static ListOutboundPhoneNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundPhoneNumberResponse self = new ListOutboundPhoneNumberResponse();
        return TeaModel.build(map, self);
    }

    public ListOutboundPhoneNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOutboundPhoneNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOutboundPhoneNumberResponse setBody(ListOutboundPhoneNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOutboundPhoneNumberResponseBody getBody() {
        return this.body;
    }

}
