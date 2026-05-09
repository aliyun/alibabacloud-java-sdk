// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpdateCustinsParamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCustinsParamResponseBody body;

    public static UpdateCustinsParamResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustinsParamResponse self = new UpdateCustinsParamResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustinsParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustinsParamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustinsParamResponse setBody(UpdateCustinsParamResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustinsParamResponseBody getBody() {
        return this.body;
    }

}
