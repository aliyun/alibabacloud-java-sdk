// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListUploadedPartsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListUploadedPartsResponseBody body;

    public static ListUploadedPartsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUploadedPartsResponse self = new ListUploadedPartsResponse();
        return TeaModel.build(map, self);
    }

    public ListUploadedPartsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUploadedPartsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUploadedPartsResponse setBody(ListUploadedPartsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUploadedPartsResponseBody getBody() {
        return this.body;
    }

}
