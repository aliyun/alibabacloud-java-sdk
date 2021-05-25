// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddMeshTagToEcsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddMeshTagToEcsResponseBody body;

    public static AddMeshTagToEcsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddMeshTagToEcsResponse self = new AddMeshTagToEcsResponse();
        return TeaModel.build(map, self);
    }

    public AddMeshTagToEcsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddMeshTagToEcsResponse setBody(AddMeshTagToEcsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddMeshTagToEcsResponseBody getBody() {
        return this.body;
    }

}
