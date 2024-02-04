// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateOceanBaseDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOceanBaseDataSourceResponseBody body;

    public static CreateOceanBaseDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOceanBaseDataSourceResponse self = new CreateOceanBaseDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateOceanBaseDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOceanBaseDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOceanBaseDataSourceResponse setBody(CreateOceanBaseDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOceanBaseDataSourceResponseBody getBody() {
        return this.body;
    }

}
