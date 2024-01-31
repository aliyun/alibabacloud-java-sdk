// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckSaleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCheckSaleResponseBody body;

    public static GetCheckSaleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCheckSaleResponse self = new GetCheckSaleResponse();
        return TeaModel.build(map, self);
    }

    public GetCheckSaleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCheckSaleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCheckSaleResponse setBody(GetCheckSaleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCheckSaleResponseBody getBody() {
        return this.body;
    }

}
