// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionaryEntriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInterventionDictionaryEntriesResponseBody body;

    public static ListInterventionDictionaryEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInterventionDictionaryEntriesResponse self = new ListInterventionDictionaryEntriesResponse();
        return TeaModel.build(map, self);
    }

    public ListInterventionDictionaryEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInterventionDictionaryEntriesResponse setBody(ListInterventionDictionaryEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInterventionDictionaryEntriesResponseBody getBody() {
        return this.body;
    }

}
