// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeLinktWorkitemrelationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddLinkeLinktWorkitemrelationsResponseBody body;

    public static AddLinkeLinktWorkitemrelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeLinktWorkitemrelationsResponse self = new AddLinkeLinktWorkitemrelationsResponse();
        return TeaModel.build(map, self);
    }

    public AddLinkeLinktWorkitemrelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLinkeLinktWorkitemrelationsResponse setBody(AddLinkeLinktWorkitemrelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLinkeLinktWorkitemrelationsResponseBody getBody() {
        return this.body;
    }

}
