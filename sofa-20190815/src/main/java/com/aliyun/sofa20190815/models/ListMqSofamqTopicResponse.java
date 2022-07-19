// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMqSofamqTopicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListMqSofamqTopicResponseBody body;

    public static ListMqSofamqTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMqSofamqTopicResponse self = new ListMqSofamqTopicResponse();
        return TeaModel.build(map, self);
    }

    public ListMqSofamqTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMqSofamqTopicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMqSofamqTopicResponse setBody(ListMqSofamqTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMqSofamqTopicResponseBody getBody() {
        return this.body;
    }

}
