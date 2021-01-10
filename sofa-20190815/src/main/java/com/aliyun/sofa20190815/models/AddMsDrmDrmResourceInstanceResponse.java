// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsDrmDrmResourceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsDrmDrmResourceInstanceResponseBody body;

    public static AddMsDrmDrmResourceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsDrmDrmResourceInstanceResponse self = new AddMsDrmDrmResourceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public AddMsDrmDrmResourceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsDrmDrmResourceInstanceResponse setBody(AddMsDrmDrmResourceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsDrmDrmResourceInstanceResponseBody getBody() {
        return this.body;
    }

}
