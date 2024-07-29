// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartCategoryCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartCategoryCallbackResponseBody body;

    public static StartCategoryCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        StartCategoryCallbackResponse self = new StartCategoryCallbackResponse();
        return TeaModel.build(map, self);
    }

    public StartCategoryCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartCategoryCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartCategoryCallbackResponse setBody(StartCategoryCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public StartCategoryCallbackResponseBody getBody() {
        return this.body;
    }

}
