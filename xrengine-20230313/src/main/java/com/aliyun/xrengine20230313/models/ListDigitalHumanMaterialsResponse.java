// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class ListDigitalHumanMaterialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDigitalHumanMaterialsResponseBody body;

    public static ListDigitalHumanMaterialsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDigitalHumanMaterialsResponse self = new ListDigitalHumanMaterialsResponse();
        return TeaModel.build(map, self);
    }

    public ListDigitalHumanMaterialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDigitalHumanMaterialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDigitalHumanMaterialsResponse setBody(ListDigitalHumanMaterialsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDigitalHumanMaterialsResponseBody getBody() {
        return this.body;
    }

}
