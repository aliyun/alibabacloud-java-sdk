// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111.models;

import com.aliyun.tea.*;

public class ListLlmAccessProfilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLlmAccessProfilesResponseBody body;

    public static ListLlmAccessProfilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLlmAccessProfilesResponse self = new ListLlmAccessProfilesResponse();
        return TeaModel.build(map, self);
    }

    public ListLlmAccessProfilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLlmAccessProfilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLlmAccessProfilesResponse setBody(ListLlmAccessProfilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLlmAccessProfilesResponseBody getBody() {
        return this.body;
    }

}
