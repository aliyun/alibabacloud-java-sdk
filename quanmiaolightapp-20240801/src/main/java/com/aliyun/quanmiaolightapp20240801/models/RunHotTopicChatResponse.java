// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class RunHotTopicChatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunHotTopicChatResponseBody body;

    public static RunHotTopicChatResponse build(java.util.Map<String, ?> map) throws Exception {
        RunHotTopicChatResponse self = new RunHotTopicChatResponse();
        return TeaModel.build(map, self);
    }

    public RunHotTopicChatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunHotTopicChatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunHotTopicChatResponse setBody(RunHotTopicChatResponseBody body) {
        this.body = body;
        return this;
    }
    public RunHotTopicChatResponseBody getBody() {
        return this.body;
    }

}
