// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class ListMainScenesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMainScenesResponseBody body;

    public static ListMainScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMainScenesResponse self = new ListMainScenesResponse();
        return TeaModel.build(map, self);
    }

    public ListMainScenesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMainScenesResponse setBody(ListMainScenesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMainScenesResponseBody getBody() {
        return this.body;
    }

}
