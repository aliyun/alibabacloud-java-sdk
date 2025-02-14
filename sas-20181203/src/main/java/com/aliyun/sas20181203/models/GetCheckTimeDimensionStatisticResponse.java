// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckTimeDimensionStatisticResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCheckTimeDimensionStatisticResponseBody body;

    public static GetCheckTimeDimensionStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCheckTimeDimensionStatisticResponse self = new GetCheckTimeDimensionStatisticResponse();
        return TeaModel.build(map, self);
    }

    public GetCheckTimeDimensionStatisticResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCheckTimeDimensionStatisticResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCheckTimeDimensionStatisticResponse setBody(GetCheckTimeDimensionStatisticResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCheckTimeDimensionStatisticResponseBody getBody() {
        return this.body;
    }

}
