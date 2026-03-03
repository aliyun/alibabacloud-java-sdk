// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListDevelopersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeveloperPageResult body;

    public static ListDevelopersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDevelopersResponse self = new ListDevelopersResponse();
        return TeaModel.build(map, self);
    }

    public ListDevelopersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDevelopersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDevelopersResponse setBody(DeveloperPageResult body) {
        this.body = body;
        return this;
    }
    public DeveloperPageResult getBody() {
        return this.body;
    }

}
