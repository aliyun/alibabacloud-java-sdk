// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListWebApplicationInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWebApplicationInstancesBody body;

    public static ListWebApplicationInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWebApplicationInstancesResponse self = new ListWebApplicationInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListWebApplicationInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWebApplicationInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWebApplicationInstancesResponse setBody(ListWebApplicationInstancesBody body) {
        this.body = body;
        return this;
    }
    public ListWebApplicationInstancesBody getBody() {
        return this.body;
    }

}
