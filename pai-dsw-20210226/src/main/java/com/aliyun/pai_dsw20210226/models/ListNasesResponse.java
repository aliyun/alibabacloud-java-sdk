// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListNasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListNasesResponseBody body;

    public static ListNasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNasesResponse self = new ListNasesResponse();
        return TeaModel.build(map, self);
    }

    public ListNasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNasesResponse setBody(ListNasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNasesResponseBody getBody() {
        return this.body;
    }

}
