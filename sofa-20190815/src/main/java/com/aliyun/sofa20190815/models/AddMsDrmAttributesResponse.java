// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsDrmAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsDrmAttributesResponseBody body;

    public static AddMsDrmAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsDrmAttributesResponse self = new AddMsDrmAttributesResponse();
        return TeaModel.build(map, self);
    }

    public AddMsDrmAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsDrmAttributesResponse setBody(AddMsDrmAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsDrmAttributesResponseBody getBody() {
        return this.body;
    }

}
