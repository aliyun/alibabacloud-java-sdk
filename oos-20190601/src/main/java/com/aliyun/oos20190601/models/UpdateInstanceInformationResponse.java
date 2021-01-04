// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateInstanceInformationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInstanceInformationResponseBody body;

    public static UpdateInstanceInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceInformationResponse self = new UpdateInstanceInformationResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceInformationResponse setBody(UpdateInstanceInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceInformationResponseBody getBody() {
        return this.body;
    }

}
