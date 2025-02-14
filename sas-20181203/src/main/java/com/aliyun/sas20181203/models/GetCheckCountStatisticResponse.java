// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckCountStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCheckCountStatisticResponseBody body;

    public static GetCheckCountStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCheckCountStatisticResponse self = new GetCheckCountStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetCheckCountStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCheckCountStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCheckCountStatisticResponse setBody(GetCheckCountStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCheckCountStatisticResponseBody getBody() {
        return this.body;
    }

}
