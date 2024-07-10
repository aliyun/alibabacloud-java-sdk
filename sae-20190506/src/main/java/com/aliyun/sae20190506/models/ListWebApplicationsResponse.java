// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListWebApplicationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWebApplicationsBody body;

    public static ListWebApplicationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWebApplicationsResponse self = new ListWebApplicationsResponse();
        return TeaModel.build(map, self);
    }

    public ListWebApplicationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWebApplicationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWebApplicationsResponse setBody(ListWebApplicationsBody body) {
        this.body = body;
        return this;
    }
    public ListWebApplicationsBody getBody() {
        return this.body;
    }

}
