// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public OnsTopicStatusResponse setBody(OnsTopicStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsTopicStatusResponseBody getBody() {
        return this.body;
    }

}
