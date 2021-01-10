// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class CreateInterventionDictionaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInterventionDictionaryResponseBody body;

    public static CreateInterventionDictionaryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInterventionDictionaryResponse self = new CreateInterventionDictionaryResponse();
        return TeaModel.build(map, self);
    }

    public CreateInterventionDictionaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInterventionDictionaryResponse setBody(CreateInterventionDictionaryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInterventionDictionaryResponseBody getBody() {
        return this.body;
    }

}
