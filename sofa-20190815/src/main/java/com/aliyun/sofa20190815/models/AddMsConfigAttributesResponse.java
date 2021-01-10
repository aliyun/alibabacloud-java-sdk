// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsConfigAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsConfigAttributesResponseBody body;

    public static AddMsConfigAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsConfigAttributesResponse self = new AddMsConfigAttributesResponse();
        return TeaModel.build(map, self);
    }

    public AddMsConfigAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsConfigAttributesResponse setBody(AddMsConfigAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsConfigAttributesResponseBody getBody() {
        return this.body;
    }

}
