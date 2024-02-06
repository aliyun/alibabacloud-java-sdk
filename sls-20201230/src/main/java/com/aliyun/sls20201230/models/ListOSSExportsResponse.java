// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListOSSExportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOSSExportsResponseBody body;

    public static ListOSSExportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOSSExportsResponse self = new ListOSSExportsResponse();
        return TeaModel.build(map, self);
    }

    public ListOSSExportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOSSExportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOSSExportsResponse setBody(ListOSSExportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOSSExportsResponseBody getBody() {
        return this.body;
    }

}
