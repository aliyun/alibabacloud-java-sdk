// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StopCategoryCallbackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopCategoryCallbackResponseBody body;

    public static StopCategoryCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        StopCategoryCallbackResponse self = new StopCategoryCallbackResponse();
        return TeaModel.build(map, self);
    }

    public StopCategoryCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopCategoryCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopCategoryCallbackResponse setBody(StopCategoryCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public StopCategoryCallbackResponseBody getBody() {
        return this.body;
    }

}
