// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListCheckTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCheckTypesResponseBody body;

    public static ListCheckTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCheckTypesResponse self = new ListCheckTypesResponse();
        return TeaModel.build(map, self);
    }

    public ListCheckTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCheckTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCheckTypesResponse setBody(ListCheckTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCheckTypesResponseBody getBody() {
        return this.body;
    }

}
