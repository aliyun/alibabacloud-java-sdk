// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveInterventionDictionaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveInterventionDictionaryResponseBody body;

    public static RemoveInterventionDictionaryResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveInterventionDictionaryResponse self = new RemoveInterventionDictionaryResponse();
        return TeaModel.build(map, self);
    }

    public RemoveInterventionDictionaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveInterventionDictionaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveInterventionDictionaryResponse setBody(RemoveInterventionDictionaryResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveInterventionDictionaryResponseBody getBody() {
        return this.body;
    }

}
