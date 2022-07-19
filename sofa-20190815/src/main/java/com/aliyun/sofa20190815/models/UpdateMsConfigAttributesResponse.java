// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMsConfigAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMsConfigAttributesResponseBody body;

    public static UpdateMsConfigAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMsConfigAttributesResponse self = new UpdateMsConfigAttributesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMsConfigAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMsConfigAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMsConfigAttributesResponse setBody(UpdateMsConfigAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMsConfigAttributesResponseBody getBody() {
        return this.body;
    }

}
