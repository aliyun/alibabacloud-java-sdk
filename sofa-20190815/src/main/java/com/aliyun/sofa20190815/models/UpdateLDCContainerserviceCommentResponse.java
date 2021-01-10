// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCContainerserviceCommentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLDCContainerserviceCommentResponseBody body;

    public static UpdateLDCContainerserviceCommentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCContainerserviceCommentResponse self = new UpdateLDCContainerserviceCommentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLDCContainerserviceCommentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLDCContainerserviceCommentResponse setBody(UpdateLDCContainerserviceCommentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLDCContainerserviceCommentResponseBody getBody() {
        return this.body;
    }

}
