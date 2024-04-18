// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListTemplateVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTemplateVersionsResponseBody body;

    public static ListTemplateVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateVersionsResponse self = new ListTemplateVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListTemplateVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTemplateVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTemplateVersionsResponse setBody(ListTemplateVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTemplateVersionsResponseBody getBody() {
        return this.body;
    }

}
