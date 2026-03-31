// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateTemplateAttributesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateTemplateAttributesResponseBody body;

    public static UpdateTemplateAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateAttributesResponse self = new UpdateTemplateAttributesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTemplateAttributesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateTemplateAttributesResponse setBody(UpdateTemplateAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTemplateAttributesResponseBody getBody() {
        return this.body;
    }

}
