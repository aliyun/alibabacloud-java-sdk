// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListWebApplicationRevisionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWebApplicationRevisionsBody body;

    public static ListWebApplicationRevisionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWebApplicationRevisionsResponse self = new ListWebApplicationRevisionsResponse();
        return TeaModel.build(map, self);
    }

    public ListWebApplicationRevisionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWebApplicationRevisionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWebApplicationRevisionsResponse setBody(ListWebApplicationRevisionsBody body) {
        this.body = body;
        return this;
    }
    public ListWebApplicationRevisionsBody getBody() {
        return this.body;
    }

}
