// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetRepoForkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReposFork body;

    public static GetRepoForkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRepoForkResponse self = new GetRepoForkResponse();
        return TeaModel.build(map, self);
    }

    public GetRepoForkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRepoForkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRepoForkResponse setBody(ReposFork body) {
        this.body = body;
        return this;
    }
    public ReposFork getBody() {
        return this.body;
    }

}
