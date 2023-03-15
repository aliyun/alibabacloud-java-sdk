// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPbcVersionBuildResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcVersionListResult body;

    public static ListPbcVersionBuildResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPbcVersionBuildResponse self = new ListPbcVersionBuildResponse();
        return TeaModel.build(map, self);
    }

    public ListPbcVersionBuildResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPbcVersionBuildResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPbcVersionBuildResponse setBody(PbcVersionListResult body) {
        this.body = body;
        return this;
    }
    public PbcVersionListResult getBody() {
        return this.body;
    }

}
