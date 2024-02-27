// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListApiDatasourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApiDatasourceResponseBody body;

    public static ListApiDatasourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApiDatasourceResponse self = new ListApiDatasourceResponse();
        return TeaModel.build(map, self);
    }

    public ListApiDatasourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApiDatasourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApiDatasourceResponse setBody(ListApiDatasourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApiDatasourceResponseBody getBody() {
        return this.body;
    }

}
