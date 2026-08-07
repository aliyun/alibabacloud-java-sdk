// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111.models;

import com.aliyun.tea.*;

public class ListFlashSmsAccessProfilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFlashSmsAccessProfilesResponseBody body;

    public static ListFlashSmsAccessProfilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFlashSmsAccessProfilesResponse self = new ListFlashSmsAccessProfilesResponse();
        return TeaModel.build(map, self);
    }

    public ListFlashSmsAccessProfilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFlashSmsAccessProfilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFlashSmsAccessProfilesResponse setBody(ListFlashSmsAccessProfilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFlashSmsAccessProfilesResponseBody getBody() {
        return this.body;
    }

}
