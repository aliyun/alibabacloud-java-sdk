// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteEnterpriseCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEnterpriseCodeResponseBody body;

    public static DeleteEnterpriseCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnterpriseCodeResponse self = new DeleteEnterpriseCodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnterpriseCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnterpriseCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEnterpriseCodeResponse setBody(DeleteEnterpriseCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnterpriseCodeResponseBody getBody() {
        return this.body;
    }

}
