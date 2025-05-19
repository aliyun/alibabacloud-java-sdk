// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class ListLLMConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLLMConfigsResponseBody body;

    public static ListLLMConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLLMConfigsResponse self = new ListLLMConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListLLMConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLLMConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLLMConfigsResponse setBody(ListLLMConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLLMConfigsResponseBody getBody() {
        return this.body;
    }

}
