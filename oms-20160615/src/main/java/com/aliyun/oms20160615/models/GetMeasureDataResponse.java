// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetMeasureDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMeasureDataResponseBody body;

    public static GetMeasureDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMeasureDataResponse self = new GetMeasureDataResponse();
        return TeaModel.build(map, self);
    }

    public GetMeasureDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMeasureDataResponse setBody(GetMeasureDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMeasureDataResponseBody getBody() {
        return this.body;
    }

}
