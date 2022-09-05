// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetTaskTemplateViewsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTaskTemplateViewsResponseBody body;

    public static GetTaskTemplateViewsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskTemplateViewsResponse self = new GetTaskTemplateViewsResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskTemplateViewsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskTemplateViewsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskTemplateViewsResponse setBody(GetTaskTemplateViewsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskTemplateViewsResponseBody getBody() {
        return this.body;
    }

}
