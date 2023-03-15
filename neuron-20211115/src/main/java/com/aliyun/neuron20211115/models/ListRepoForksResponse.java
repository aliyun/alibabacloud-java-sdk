// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListRepoForksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcRepoForkListResult body;

    public static ListRepoForksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepoForksResponse self = new ListRepoForksResponse();
        return TeaModel.build(map, self);
    }

    public ListRepoForksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepoForksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepoForksResponse setBody(PbcRepoForkListResult body) {
        this.body = body;
        return this;
    }
    public PbcRepoForkListResult getBody() {
        return this.body;
    }

}
