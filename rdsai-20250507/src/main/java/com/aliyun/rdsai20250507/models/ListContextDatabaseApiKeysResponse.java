// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListContextDatabaseApiKeysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListContextDatabaseApiKeysResponseBody body;

    public static ListContextDatabaseApiKeysResponse build(java.util.Map<String, ?> map) throws Exception {
        ListContextDatabaseApiKeysResponse self = new ListContextDatabaseApiKeysResponse();
        return TeaModel.build(map, self);
    }

    public ListContextDatabaseApiKeysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListContextDatabaseApiKeysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListContextDatabaseApiKeysResponse setBody(ListContextDatabaseApiKeysResponseBody body) {
        this.body = body;
        return this;
    }
    public ListContextDatabaseApiKeysResponseBody getBody() {
        return this.body;
    }

}
