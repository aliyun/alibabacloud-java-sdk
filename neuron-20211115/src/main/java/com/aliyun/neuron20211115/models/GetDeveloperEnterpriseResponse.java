// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetDeveloperEnterpriseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeveloperEnterpriseResponseBody body;

    public static GetDeveloperEnterpriseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeveloperEnterpriseResponse self = new GetDeveloperEnterpriseResponse();
        return TeaModel.build(map, self);
    }

    public GetDeveloperEnterpriseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeveloperEnterpriseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeveloperEnterpriseResponse setBody(GetDeveloperEnterpriseResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeveloperEnterpriseResponseBody getBody() {
        return this.body;
    }

}
