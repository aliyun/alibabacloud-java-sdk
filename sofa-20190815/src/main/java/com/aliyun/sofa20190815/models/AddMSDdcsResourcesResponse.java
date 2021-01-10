// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMSDdcsResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMSDdcsResourcesResponseBody body;

    public static AddMSDdcsResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMSDdcsResourcesResponse self = new AddMSDdcsResourcesResponse();
        return TeaModel.build(map, self);
    }

    public AddMSDdcsResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMSDdcsResourcesResponse setBody(AddMSDdcsResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMSDdcsResourcesResponseBody getBody() {
        return this.body;
    }

}
