// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nls_cloud_measure20190905.models;

import com.aliyun.tea.*;

public class ListAvailableTtsModelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAvailableTtsModelsResponseBody body;

    public static ListAvailableTtsModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableTtsModelsResponse self = new ListAvailableTtsModelsResponse();
        return TeaModel.build(map, self);
    }

    public ListAvailableTtsModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAvailableTtsModelsResponse setBody(ListAvailableTtsModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAvailableTtsModelsResponseBody getBody() {
        return this.body;
    }

}
