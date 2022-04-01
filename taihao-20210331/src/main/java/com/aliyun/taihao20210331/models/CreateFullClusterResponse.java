// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateFullClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFullClusterResponseBody body;

    public static CreateFullClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFullClusterResponse self = new CreateFullClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateFullClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFullClusterResponse setBody(CreateFullClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFullClusterResponseBody getBody() {
        return this.body;
    }

}
