// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UpdateFacegroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFacegroupResponseBody body;

    public static UpdateFacegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFacegroupResponse self = new UpdateFacegroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFacegroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFacegroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFacegroupResponse setBody(UpdateFacegroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFacegroupResponseBody getBody() {
        return this.body;
    }

}
