// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateFullClusterByMainVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateFullClusterByMainVersionResponseBody body;

    public static CreateFullClusterByMainVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFullClusterByMainVersionResponse self = new CreateFullClusterByMainVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateFullClusterByMainVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFullClusterByMainVersionResponse setBody(CreateFullClusterByMainVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFullClusterByMainVersionResponseBody getBody() {
        return this.body;
    }

}
