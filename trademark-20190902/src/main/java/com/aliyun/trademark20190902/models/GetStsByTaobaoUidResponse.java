// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class GetStsByTaobaoUidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStsByTaobaoUidResponseBody body;

    public static GetStsByTaobaoUidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStsByTaobaoUidResponse self = new GetStsByTaobaoUidResponse();
        return TeaModel.build(map, self);
    }

    public GetStsByTaobaoUidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStsByTaobaoUidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStsByTaobaoUidResponse setBody(GetStsByTaobaoUidResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStsByTaobaoUidResponseBody getBody() {
        return this.body;
    }

}
