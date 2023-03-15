// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListInvokePbcsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PbcListResult body;

    public static ListInvokePbcsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInvokePbcsResponse self = new ListInvokePbcsResponse();
        return TeaModel.build(map, self);
    }

    public ListInvokePbcsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInvokePbcsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInvokePbcsResponse setBody(PbcListResult body) {
        this.body = body;
        return this;
    }
    public PbcListResult getBody() {
        return this.body;
    }

}
