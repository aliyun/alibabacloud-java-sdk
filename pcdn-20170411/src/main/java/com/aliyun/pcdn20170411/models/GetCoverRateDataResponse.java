// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetCoverRateDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCoverRateDataResponseBody body;

    public static GetCoverRateDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCoverRateDataResponse self = new GetCoverRateDataResponse();
        return TeaModel.build(map, self);
    }

    public GetCoverRateDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCoverRateDataResponse setBody(GetCoverRateDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCoverRateDataResponseBody getBody() {
        return this.body;
    }

}
