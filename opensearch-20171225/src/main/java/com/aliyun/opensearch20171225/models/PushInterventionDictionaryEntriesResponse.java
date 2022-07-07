// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class PushInterventionDictionaryEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PushInterventionDictionaryEntriesResponseBody body;

    public static PushInterventionDictionaryEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        PushInterventionDictionaryEntriesResponse self = new PushInterventionDictionaryEntriesResponse();
        return TeaModel.build(map, self);
    }

    public PushInterventionDictionaryEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushInterventionDictionaryEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushInterventionDictionaryEntriesResponse setBody(PushInterventionDictionaryEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public PushInterventionDictionaryEntriesResponseBody getBody() {
        return this.body;
    }

}
