// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionaryRelatedEntitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInterventionDictionaryRelatedEntitiesResponseBody body;

    public static ListInterventionDictionaryRelatedEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInterventionDictionaryRelatedEntitiesResponse self = new ListInterventionDictionaryRelatedEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListInterventionDictionaryRelatedEntitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInterventionDictionaryRelatedEntitiesResponse setBody(ListInterventionDictionaryRelatedEntitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInterventionDictionaryRelatedEntitiesResponseBody getBody() {
        return this.body;
    }

}
