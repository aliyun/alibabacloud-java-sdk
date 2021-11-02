// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class ListSlotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListSlotResponseBody body;

    public static ListSlotResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSlotResponse self = new ListSlotResponse();
        return TeaModel.build(map, self);
    }

    public ListSlotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSlotResponse setBody(ListSlotResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSlotResponseBody getBody() {
        return this.body;
    }

}
