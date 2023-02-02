// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupConsumerUpdateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OnsGroupConsumerUpdateResponseBody body;

    public static OnsGroupConsumerUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupConsumerUpdateResponse self = new OnsGroupConsumerUpdateResponse();
        return TeaModel.build(map, self);
    }

    public OnsGroupConsumerUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsGroupConsumerUpdateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsGroupConsumerUpdateResponse setBody(OnsGroupConsumerUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsGroupConsumerUpdateResponseBody getBody() {
        return this.body;
    }

}
