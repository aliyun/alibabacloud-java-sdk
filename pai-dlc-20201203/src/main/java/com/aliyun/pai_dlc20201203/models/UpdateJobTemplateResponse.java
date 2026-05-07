// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class UpdateJobTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateJobTemplateResponseBody body;

    public static UpdateJobTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobTemplateResponse self = new UpdateJobTemplateResponse();
        return TeaModel.build(map, self);
    }

    public UpdateJobTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateJobTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateJobTemplateResponse setBody(UpdateJobTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateJobTemplateResponseBody getBody() {
        return this.body;
    }

}
