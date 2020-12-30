// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetFeeHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetFeeHistoryResponseBody body;

    public static GetFeeHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFeeHistoryResponse self = new GetFeeHistoryResponse();
        return TeaModel.build(map, self);
    }

    public GetFeeHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFeeHistoryResponse setBody(GetFeeHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFeeHistoryResponseBody getBody() {
        return this.body;
    }

}
