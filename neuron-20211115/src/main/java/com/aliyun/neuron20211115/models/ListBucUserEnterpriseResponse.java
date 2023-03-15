// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListBucUserEnterpriseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BucUserEnterpriseListResult body;

    public static ListBucUserEnterpriseResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBucUserEnterpriseResponse self = new ListBucUserEnterpriseResponse();
        return TeaModel.build(map, self);
    }

    public ListBucUserEnterpriseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBucUserEnterpriseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBucUserEnterpriseResponse setBody(BucUserEnterpriseListResult body) {
        this.body = body;
        return this;
    }
    public BucUserEnterpriseListResult getBody() {
        return this.body;
    }

}
