// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class ListDataMaskingEncryptionAlgorithmsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataMaskingEncryptionAlgorithmsResponseBody body;

    public static ListDataMaskingEncryptionAlgorithmsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataMaskingEncryptionAlgorithmsResponse self = new ListDataMaskingEncryptionAlgorithmsResponse();
        return TeaModel.build(map, self);
    }

    public ListDataMaskingEncryptionAlgorithmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataMaskingEncryptionAlgorithmsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataMaskingEncryptionAlgorithmsResponse setBody(ListDataMaskingEncryptionAlgorithmsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataMaskingEncryptionAlgorithmsResponseBody getBody() {
        return this.body;
    }

}
