// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsConfigResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsConfigResourcesResponseBody body;

    public static AddMsConfigResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsConfigResourcesResponse self = new AddMsConfigResourcesResponse();
        return TeaModel.build(map, self);
    }

    public AddMsConfigResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsConfigResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddMsConfigResourcesResponse setBody(AddMsConfigResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsConfigResourcesResponseBody getBody() {
        return this.body;
    }

}
