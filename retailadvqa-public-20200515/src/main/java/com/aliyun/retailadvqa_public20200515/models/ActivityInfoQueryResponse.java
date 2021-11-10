// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ActivityInfoQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ActivityInfoQueryResponseBody body;

    public static ActivityInfoQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivityInfoQueryResponse self = new ActivityInfoQueryResponse();
        return TeaModel.build(map, self);
    }

    public ActivityInfoQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivityInfoQueryResponse setBody(ActivityInfoQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivityInfoQueryResponseBody getBody() {
        return this.body;
    }

}
