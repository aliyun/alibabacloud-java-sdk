// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class AddUisNodeIpResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddUisNodeIpResponseBody body;

    public static AddUisNodeIpResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUisNodeIpResponse self = new AddUisNodeIpResponse();
        return TeaModel.build(map, self);
    }

    public AddUisNodeIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUisNodeIpResponse setBody(AddUisNodeIpResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUisNodeIpResponseBody getBody() {
        return this.body;
    }

}
