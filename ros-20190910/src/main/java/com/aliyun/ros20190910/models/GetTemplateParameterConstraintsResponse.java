// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class GetTemplateParameterConstraintsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTemplateParameterConstraintsResponseBody body;

    public static GetTemplateParameterConstraintsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateParameterConstraintsResponse self = new GetTemplateParameterConstraintsResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplateParameterConstraintsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTemplateParameterConstraintsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTemplateParameterConstraintsResponse setBody(GetTemplateParameterConstraintsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTemplateParameterConstraintsResponseBody getBody() {
        return this.body;
    }

}
