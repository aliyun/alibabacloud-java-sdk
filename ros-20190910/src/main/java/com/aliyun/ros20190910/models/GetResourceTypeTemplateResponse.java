// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetResourceTypeTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceTypeTemplateResponseBody body;

    public static GetResourceTypeTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeTemplateResponse self = new GetResourceTypeTemplateResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceTypeTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceTypeTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceTypeTemplateResponse setBody(GetResourceTypeTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceTypeTemplateResponseBody getBody() {
        return this.body;
    }

}
