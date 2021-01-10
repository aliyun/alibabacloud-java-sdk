// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddClriskDataNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddClriskDataNodeResponseBody body;

    public static AddClriskDataNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddClriskDataNodeResponse self = new AddClriskDataNodeResponse();
        return TeaModel.build(map, self);
    }

    public AddClriskDataNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddClriskDataNodeResponse setBody(AddClriskDataNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddClriskDataNodeResponseBody getBody() {
        return this.body;
    }

}
