// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionaryNerResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListInterventionDictionaryNerResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInterventionDictionaryNerResultsResponse setBody(ListInterventionDictionaryNerResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInterventionDictionaryNerResultsResponseBody getBody() {
        return this.body;
    }

}
