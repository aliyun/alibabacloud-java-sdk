// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetShareRateDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetShareRateDataResponseBody body;

    public static GetShareRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetShareRateDataResponse self = new GetShareRateDataResponse();
        return TeaModel.build(map, self);
    }

    public GetShareRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetShareRateDataResponse setBody(GetShareRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetShareRateDataResponseBody getBody() {
        return this.body;
    }

}
