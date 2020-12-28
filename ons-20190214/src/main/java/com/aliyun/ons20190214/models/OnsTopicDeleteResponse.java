// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsTopicDeleteResponseBody body;

    public static OnsTopicDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicDeleteResponse self = new OnsTopicDeleteResponse();
        return TeaModel.build(map, self);
    }

    public OnsTopicDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsTopicDeleteResponse setBody(OnsTopicDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsTopicDeleteResponseBody getBody() {
        return this.body;
    }

}
