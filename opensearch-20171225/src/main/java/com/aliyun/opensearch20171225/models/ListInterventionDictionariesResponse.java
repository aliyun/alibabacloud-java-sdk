// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionariesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListInterventionDictionariesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListInterventionDictionariesResponse setBody(ListInterventionDictionariesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInterventionDictionariesResponseBody getBody() {
        return this.body;
    }

}
