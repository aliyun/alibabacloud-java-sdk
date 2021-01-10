// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionaryNerResultsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInterventionDictionaryNerResultsResponseBody body;

    public static ListInterventionDictionaryNerResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInterventionDictionaryNerResultsResponse self = new ListInterventionDictionaryNerResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListInterventionDictionaryNerResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInterventionDictionaryNerResultsResponse setBody(ListInterventionDictionaryNerResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInterventionDictionaryNerResultsResponseBody getBody() {
        return this.body;
    }

}
