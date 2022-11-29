// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class ListTaskTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.List<TaskTemplate> body;

    public static ListTaskTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTaskTemplatesResponse self = new ListTaskTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public ListTaskTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTaskTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTaskTemplatesResponse setBody(java.util.List<TaskTemplate> body) {
        this.body = body;
        return this;
    }
    public java.util.List<TaskTemplate> getBody() {
        return this.body;
    }

}
