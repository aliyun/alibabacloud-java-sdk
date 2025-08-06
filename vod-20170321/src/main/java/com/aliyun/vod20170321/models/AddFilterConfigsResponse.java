// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AddFilterConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddFilterConfigsResponseBody body;

    public static AddFilterConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFilterConfigsResponse self = new AddFilterConfigsResponse();
        return TeaModel.build(map, self);
    }

    public AddFilterConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFilterConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFilterConfigsResponse setBody(AddFilterConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFilterConfigsResponseBody getBody() {
        return this.body;
    }

}
