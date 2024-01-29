// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class CheckInstanceDatasourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckInstanceDatasourceResponseBody body;

    public static CheckInstanceDatasourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckInstanceDatasourceResponse self = new CheckInstanceDatasourceResponse();
        return TeaModel.build(map, self);
    }

    public CheckInstanceDatasourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckInstanceDatasourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckInstanceDatasourceResponse setBody(CheckInstanceDatasourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckInstanceDatasourceResponseBody getBody() {
        return this.body;
    }

}
