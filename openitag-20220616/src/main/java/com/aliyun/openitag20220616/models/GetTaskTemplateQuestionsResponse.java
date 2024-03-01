// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class GetTaskTemplateQuestionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTaskTemplateQuestionsResponseBody body;

    public static GetTaskTemplateQuestionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTaskTemplateQuestionsResponse self = new GetTaskTemplateQuestionsResponse();
        return TeaModel.build(map, self);
    }

    public GetTaskTemplateQuestionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTaskTemplateQuestionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTaskTemplateQuestionsResponse setBody(GetTaskTemplateQuestionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTaskTemplateQuestionsResponseBody getBody() {
        return this.body;
    }

}
