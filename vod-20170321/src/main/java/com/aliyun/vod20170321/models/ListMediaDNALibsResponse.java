// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListMediaDNALibsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMediaDNALibsResponseBody body;

    public static ListMediaDNALibsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMediaDNALibsResponse self = new ListMediaDNALibsResponse();
        return TeaModel.build(map, self);
    }

    public ListMediaDNALibsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMediaDNALibsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMediaDNALibsResponse setBody(ListMediaDNALibsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMediaDNALibsResponseBody getBody() {
        return this.body;
    }

}
