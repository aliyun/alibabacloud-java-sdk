// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMSDdsJobStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMSDdsJobStatusResponseBody body;

    public static UpdateMSDdsJobStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMSDdsJobStatusResponse self = new UpdateMSDdsJobStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMSDdsJobStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMSDdsJobStatusResponse setBody(UpdateMSDdsJobStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMSDdsJobStatusResponseBody getBody() {
        return this.body;
    }

}
