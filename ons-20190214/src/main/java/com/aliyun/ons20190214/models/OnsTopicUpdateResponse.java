// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicUpdateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsTopicUpdateResponseBody body;

    public static OnsTopicUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicUpdateResponse self = new OnsTopicUpdateResponse();
        return TeaModel.build(map, self);
    }

    public OnsTopicUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsTopicUpdateResponse setBody(OnsTopicUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsTopicUpdateResponseBody getBody() {
        return this.body;
    }

}
