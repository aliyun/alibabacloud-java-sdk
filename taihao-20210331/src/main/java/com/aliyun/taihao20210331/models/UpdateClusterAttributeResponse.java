// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateClusterAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateClusterAttributeResponseBody body;

    public static UpdateClusterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateClusterAttributeResponse self = new UpdateClusterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateClusterAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateClusterAttributeResponse setBody(UpdateClusterAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateClusterAttributeResponseBody getBody() {
        return this.body;
    }

}
