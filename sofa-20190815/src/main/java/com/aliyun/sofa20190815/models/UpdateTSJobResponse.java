// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateTSJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTSJobResponseBody body;

    public static UpdateTSJobResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTSJobResponse self = new UpdateTSJobResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTSJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTSJobResponse setBody(UpdateTSJobResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTSJobResponseBody getBody() {
        return this.body;
    }

}
