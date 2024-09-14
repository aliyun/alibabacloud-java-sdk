// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class ListHotTopicSummariesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHotTopicSummariesResponseBody body;

    public static ListHotTopicSummariesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHotTopicSummariesResponse self = new ListHotTopicSummariesResponse();
        return TeaModel.build(map, self);
    }

    public ListHotTopicSummariesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHotTopicSummariesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHotTopicSummariesResponse setBody(ListHotTopicSummariesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHotTopicSummariesResponseBody getBody() {
        return this.body;
    }

}
