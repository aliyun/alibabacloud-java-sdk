// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicCreateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OnsTopicCreateResponseBody body;

    public static OnsTopicCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicCreateResponse self = new OnsTopicCreateResponse();
        return TeaModel.build(map, self);
    }

    public OnsTopicCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsTopicCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsTopicCreateResponse setBody(OnsTopicCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsTopicCreateResponseBody getBody() {
        return this.body;
    }

}
