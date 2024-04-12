// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListNetworkDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListNetworkDomainsResponseBody body;

    public static ListNetworkDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNetworkDomainsResponse self = new ListNetworkDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListNetworkDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListNetworkDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListNetworkDomainsResponse setBody(ListNetworkDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListNetworkDomainsResponseBody getBody() {
        return this.body;
    }

}
