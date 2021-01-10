// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionariesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInterventionDictionariesResponseBody body;

    public static ListInterventionDictionariesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInterventionDictionariesResponse self = new ListInterventionDictionariesResponse();
        return TeaModel.build(map, self);
    }

    public ListInterventionDictionariesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInterventionDictionariesResponse setBody(ListInterventionDictionariesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInterventionDictionariesResponseBody getBody() {
        return this.body;
    }

}
