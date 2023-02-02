// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OnsTopicListResponseBody body;

    public static OnsTopicListResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicListResponse self = new OnsTopicListResponse();
        return TeaModel.build(map, self);
    }

    public OnsTopicListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsTopicListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsTopicListResponse setBody(OnsTopicListResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsTopicListResponseBody getBody() {
        return this.body;
    }

}
