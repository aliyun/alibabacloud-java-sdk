// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMSDdcsAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMSDdcsAttributesResponseBody body;

    public static AddMSDdcsAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMSDdcsAttributesResponse self = new AddMSDdcsAttributesResponse();
        return TeaModel.build(map, self);
    }

    public AddMSDdcsAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMSDdcsAttributesResponse setBody(AddMSDdcsAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMSDdcsAttributesResponseBody getBody() {
        return this.body;
    }

}
