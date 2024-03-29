// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class UpdateDatasourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDatasourceResponseBody body;

    public static UpdateDatasourceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDatasourceResponse self = new UpdateDatasourceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDatasourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDatasourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDatasourceResponse setBody(UpdateDatasourceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDatasourceResponseBody getBody() {
        return this.body;
    }

}
