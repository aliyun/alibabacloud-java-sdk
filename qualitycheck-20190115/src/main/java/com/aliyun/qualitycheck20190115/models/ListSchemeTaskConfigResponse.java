// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListSchemeTaskConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListSchemeTaskConfigResponseBody body;

    public static ListSchemeTaskConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSchemeTaskConfigResponse self = new ListSchemeTaskConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListSchemeTaskConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSchemeTaskConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSchemeTaskConfigResponse setBody(ListSchemeTaskConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSchemeTaskConfigResponseBody getBody() {
        return this.body;
    }

}
