// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListConsumedServicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListConsumedServicesResponseBody body;

    public static ListConsumedServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConsumedServicesResponse self = new ListConsumedServicesResponse();
        return TeaModel.build(map, self);
    }

    public ListConsumedServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConsumedServicesResponse setBody(ListConsumedServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConsumedServicesResponseBody getBody() {
        return this.body;
    }

}
