// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListDemosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDemosResponseBody body;

    public static ListDemosResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDemosResponse self = new ListDemosResponse();
        return TeaModel.build(map, self);
    }

    public ListDemosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDemosResponse setBody(ListDemosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDemosResponseBody getBody() {
        return this.body;
    }

}
