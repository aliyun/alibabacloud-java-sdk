// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessagePageQueryByTopicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OnsMessagePageQueryByTopicResponseBody body;

    public static OnsMessagePageQueryByTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsMessagePageQueryByTopicResponse self = new OnsMessagePageQueryByTopicResponse();
        return TeaModel.build(map, self);
    }

    public OnsMessagePageQueryByTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsMessagePageQueryByTopicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsMessagePageQueryByTopicResponse setBody(OnsMessagePageQueryByTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsMessagePageQueryByTopicResponseBody getBody() {
        return this.body;
    }

}
