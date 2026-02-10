// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class UpdateMultimodalLabelStudioServiceWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMultimodalLabelStudioServiceWhiteListResponseBody body;

    public static UpdateMultimodalLabelStudioServiceWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultimodalLabelStudioServiceWhiteListResponse self = new UpdateMultimodalLabelStudioServiceWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMultimodalLabelStudioServiceWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMultimodalLabelStudioServiceWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMultimodalLabelStudioServiceWhiteListResponse setBody(UpdateMultimodalLabelStudioServiceWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMultimodalLabelStudioServiceWhiteListResponseBody getBody() {
        return this.body;
    }

}
