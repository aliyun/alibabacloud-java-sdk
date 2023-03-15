// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPbcVersionNumbersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcVersionListResult body;

    public static ListPbcVersionNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPbcVersionNumbersResponse self = new ListPbcVersionNumbersResponse();
        return TeaModel.build(map, self);
    }

    public ListPbcVersionNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPbcVersionNumbersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPbcVersionNumbersResponse setBody(PbcVersionListResult body) {
        this.body = body;
        return this;
    }
    public PbcVersionListResult getBody() {
        return this.body;
    }

}
