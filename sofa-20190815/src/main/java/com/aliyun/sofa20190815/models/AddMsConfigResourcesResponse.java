// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsConfigResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public AddMsConfigResourcesResponse setBody(AddMsConfigResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsConfigResourcesResponseBody getBody() {
        return this.body;
    }

}
