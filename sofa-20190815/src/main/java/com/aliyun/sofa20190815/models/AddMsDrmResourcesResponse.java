// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsDrmResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsDrmResourcesResponseBody body;

    public static AddMsDrmResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsDrmResourcesResponse self = new AddMsDrmResourcesResponse();
        return TeaModel.build(map, self);
    }

    public AddMsDrmResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsDrmResourcesResponse setBody(AddMsDrmResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsDrmResourcesResponseBody getBody() {
        return this.body;
    }

}
