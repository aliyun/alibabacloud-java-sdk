// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeBahamutTaskResponseBody body;

    public static UpdateLinkeBahamutTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutTaskResponse self = new UpdateLinkeBahamutTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeBahamutTaskResponse setBody(UpdateLinkeBahamutTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeBahamutTaskResponseBody getBody() {
        return this.body;
    }

}
