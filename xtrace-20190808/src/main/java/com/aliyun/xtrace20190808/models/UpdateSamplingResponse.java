// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class UpdateSamplingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSamplingResponseBody body;

    public static UpdateSamplingResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSamplingResponse self = new UpdateSamplingResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSamplingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSamplingResponse setBody(UpdateSamplingResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSamplingResponseBody getBody() {
        return this.body;
    }

}
