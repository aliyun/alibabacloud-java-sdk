// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListEnterprisesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnterprisePageResult body;

    public static ListEnterprisesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnterprisesResponse self = new ListEnterprisesResponse();
        return TeaModel.build(map, self);
    }

    public ListEnterprisesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnterprisesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEnterprisesResponse setBody(EnterprisePageResult body) {
        this.body = body;
        return this;
    }
    public EnterprisePageResult getBody() {
        return this.body;
    }

}
