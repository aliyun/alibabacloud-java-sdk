// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class ListOutboundPhoneNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public ListOutboundPhoneNumberResponse setBody(ListOutboundPhoneNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOutboundPhoneNumberResponseBody getBody() {
        return this.body;
    }

}
