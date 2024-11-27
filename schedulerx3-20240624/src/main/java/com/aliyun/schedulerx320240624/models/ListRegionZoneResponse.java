// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListRegionZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRegionZoneResponseBody body;

    public static ListRegionZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRegionZoneResponse self = new ListRegionZoneResponse();
        return TeaModel.build(map, self);
    }

    public ListRegionZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRegionZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRegionZoneResponse setBody(ListRegionZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRegionZoneResponseBody getBody() {
        return this.body;
    }

}
