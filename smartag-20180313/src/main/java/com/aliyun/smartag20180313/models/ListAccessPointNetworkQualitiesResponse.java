// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListAccessPointNetworkQualitiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListAccessPointNetworkQualitiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAccessPointNetworkQualitiesResponse setBody(ListAccessPointNetworkQualitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAccessPointNetworkQualitiesResponseBody getBody() {
        return this.body;
    }

}
