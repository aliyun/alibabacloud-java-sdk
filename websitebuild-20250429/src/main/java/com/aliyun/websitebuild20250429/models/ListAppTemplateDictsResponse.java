// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListAppTemplateDictsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAppTemplateDictsResponseBody body;

    public static ListAppTemplateDictsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppTemplateDictsResponse self = new ListAppTemplateDictsResponse();
        return TeaModel.build(map, self);
    }

    public ListAppTemplateDictsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppTemplateDictsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppTemplateDictsResponse setBody(ListAppTemplateDictsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppTemplateDictsResponseBody getBody() {
        return this.body;
    }

}
