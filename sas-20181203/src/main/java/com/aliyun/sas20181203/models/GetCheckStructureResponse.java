// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckStructureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCheckStructureResponseBody body;

    public static GetCheckStructureResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCheckStructureResponse self = new GetCheckStructureResponse();
        return TeaModel.build(map, self);
    }

    public GetCheckStructureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCheckStructureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCheckStructureResponse setBody(GetCheckStructureResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCheckStructureResponseBody getBody() {
        return this.body;
    }

}
