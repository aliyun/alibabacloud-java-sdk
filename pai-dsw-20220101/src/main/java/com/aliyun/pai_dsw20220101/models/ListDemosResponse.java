// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListDemosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public ListDemosResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDemosResponse setBody(ListDemosResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDemosResponseBody getBody() {
        return this.body;
    }

}
