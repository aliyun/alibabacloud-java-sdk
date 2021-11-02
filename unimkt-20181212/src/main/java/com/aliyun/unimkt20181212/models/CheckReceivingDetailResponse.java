// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CheckReceivingDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckReceivingDetailResponseBody body;

    public static CheckReceivingDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckReceivingDetailResponse self = new CheckReceivingDetailResponse();
        return TeaModel.build(map, self);
    }

    public CheckReceivingDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckReceivingDetailResponse setBody(CheckReceivingDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckReceivingDetailResponseBody getBody() {
        return this.body;
    }

}
