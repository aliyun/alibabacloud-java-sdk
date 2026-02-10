// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class DeleteMultimodalLabelStudioServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMultimodalLabelStudioServiceResponseBody body;

    public static DeleteMultimodalLabelStudioServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultimodalLabelStudioServiceResponse self = new DeleteMultimodalLabelStudioServiceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMultimodalLabelStudioServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMultimodalLabelStudioServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMultimodalLabelStudioServiceResponse setBody(DeleteMultimodalLabelStudioServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMultimodalLabelStudioServiceResponseBody getBody() {
        return this.body;
    }

}
