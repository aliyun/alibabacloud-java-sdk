// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteCustomizationConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCustomizationConfigResponseBody body;

    public static DeleteCustomizationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomizationConfigResponse self = new DeleteCustomizationConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomizationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomizationConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomizationConfigResponse setBody(DeleteCustomizationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomizationConfigResponseBody getBody() {
        return this.body;
    }

}
