// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListWebCustomDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWebCustomDomainBody body;

    public static ListWebCustomDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWebCustomDomainsResponse self = new ListWebCustomDomainsResponse();
        return TeaModel.build(map, self);
    }

    public ListWebCustomDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWebCustomDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWebCustomDomainsResponse setBody(ListWebCustomDomainBody body) {
        this.body = body;
        return this;
    }
    public ListWebCustomDomainBody getBody() {
        return this.body;
    }

}
