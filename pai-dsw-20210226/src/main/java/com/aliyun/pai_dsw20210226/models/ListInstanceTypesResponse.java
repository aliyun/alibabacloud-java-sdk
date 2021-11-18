// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListInstanceTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstanceTypesResponseBody body;

    public static ListInstanceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceTypesResponse self = new ListInstanceTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceTypesResponse setBody(ListInstanceTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceTypesResponseBody getBody() {
        return this.body;
    }

}
