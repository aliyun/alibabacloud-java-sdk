// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddMsDrmDrmResourceTplResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMsDrmDrmResourceTplResponseBody body;

    public static AddMsDrmDrmResourceTplResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMsDrmDrmResourceTplResponse self = new AddMsDrmDrmResourceTplResponse();
        return TeaModel.build(map, self);
    }

    public AddMsDrmDrmResourceTplResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMsDrmDrmResourceTplResponse setBody(AddMsDrmDrmResourceTplResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMsDrmDrmResourceTplResponseBody getBody() {
        return this.body;
    }

}
