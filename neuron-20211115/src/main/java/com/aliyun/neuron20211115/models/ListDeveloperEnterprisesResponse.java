// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListDeveloperEnterprisesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnterprisePageResult body;

    public static ListDeveloperEnterprisesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeveloperEnterprisesResponse self = new ListDeveloperEnterprisesResponse();
        return TeaModel.build(map, self);
    }

    public ListDeveloperEnterprisesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDeveloperEnterprisesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDeveloperEnterprisesResponse setBody(EnterprisePageResult body) {
        this.body = body;
        return this;
    }
    public EnterprisePageResult getBody() {
        return this.body;
    }

}
