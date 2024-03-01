// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetTemplateQuestionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTemplateQuestionsResponseBody body;

    public static GetTemplateQuestionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateQuestionsResponse self = new GetTemplateQuestionsResponse();
        return TeaModel.build(map, self);
    }

    public GetTemplateQuestionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTemplateQuestionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTemplateQuestionsResponse setBody(GetTemplateQuestionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTemplateQuestionsResponseBody getBody() {
        return this.body;
    }

}
