// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RemoveInterventionDictionaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RemoveInterventionDictionaryResponse setBody(RemoveInterventionDictionaryResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveInterventionDictionaryResponseBody getBody() {
        return this.body;
    }

}
