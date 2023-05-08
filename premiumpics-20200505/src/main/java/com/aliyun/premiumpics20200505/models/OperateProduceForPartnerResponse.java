// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class OperateProduceForPartnerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OperateProduceForPartnerResponseBody body;

    public static OperateProduceForPartnerResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateProduceForPartnerResponse self = new OperateProduceForPartnerResponse();
        return TeaModel.build(map, self);
    }

    public OperateProduceForPartnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateProduceForPartnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateProduceForPartnerResponse setBody(OperateProduceForPartnerResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateProduceForPartnerResponseBody getBody() {
        return this.body;
    }

}
