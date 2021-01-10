// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uis20180821.models;

import com.aliyun.tea.*;

public class CreateUisNetworkInterfaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUisNetworkInterfaceResponseBody body;

    public static CreateUisNetworkInterfaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUisNetworkInterfaceResponse self = new CreateUisNetworkInterfaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateUisNetworkInterfaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUisNetworkInterfaceResponse setBody(CreateUisNetworkInterfaceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUisNetworkInterfaceResponseBody getBody() {
        return this.body;
    }

}
