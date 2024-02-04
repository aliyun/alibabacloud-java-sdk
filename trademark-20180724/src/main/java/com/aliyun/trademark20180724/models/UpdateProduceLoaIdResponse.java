// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateProduceLoaIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateProduceLoaIdResponseBody body;

    public static UpdateProduceLoaIdResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProduceLoaIdResponse self = new UpdateProduceLoaIdResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProduceLoaIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProduceLoaIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProduceLoaIdResponse setBody(UpdateProduceLoaIdResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProduceLoaIdResponseBody getBody() {
        return this.body;
    }

}
