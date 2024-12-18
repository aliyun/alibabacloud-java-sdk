// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OnsTopicStatusResponseBody body;

    public static OnsTopicStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicStatusResponse self = new OnsTopicStatusResponse();
        return TeaModel.build(map, self);
    }

    public OnsTopicStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsTopicStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsTopicStatusResponse setBody(OnsTopicStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsTopicStatusResponseBody getBody() {
        return this.body;
    }

}
