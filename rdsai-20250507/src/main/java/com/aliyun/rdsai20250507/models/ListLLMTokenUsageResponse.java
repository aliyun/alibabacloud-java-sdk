// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListLLMTokenUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLLMTokenUsageResponseBody body;

    public static ListLLMTokenUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLLMTokenUsageResponse self = new ListLLMTokenUsageResponse();
        return TeaModel.build(map, self);
    }

    public ListLLMTokenUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLLMTokenUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLLMTokenUsageResponse setBody(ListLLMTokenUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLLMTokenUsageResponseBody getBody() {
        return this.body;
    }

}
