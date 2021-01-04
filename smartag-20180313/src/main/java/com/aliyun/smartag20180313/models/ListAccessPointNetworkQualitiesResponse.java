// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListAccessPointNetworkQualitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAccessPointNetworkQualitiesResponseBody body;

    public static ListAccessPointNetworkQualitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAccessPointNetworkQualitiesResponse self = new ListAccessPointNetworkQualitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListAccessPointNetworkQualitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAccessPointNetworkQualitiesResponse setBody(ListAccessPointNetworkQualitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccessPointNetworkQualitiesResponseBody getBody() {
        return this.body;
    }

}
