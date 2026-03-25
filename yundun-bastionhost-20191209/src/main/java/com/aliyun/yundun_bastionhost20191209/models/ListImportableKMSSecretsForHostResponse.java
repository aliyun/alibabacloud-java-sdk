// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class ListImportableKMSSecretsForHostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListImportableKMSSecretsForHostResponseBody body;

    public static ListImportableKMSSecretsForHostResponse build(java.util.Map<String, ?> map) throws Exception {
        ListImportableKMSSecretsForHostResponse self = new ListImportableKMSSecretsForHostResponse();
        return TeaModel.build(map, self);
    }

    public ListImportableKMSSecretsForHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListImportableKMSSecretsForHostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListImportableKMSSecretsForHostResponse setBody(ListImportableKMSSecretsForHostResponseBody body) {
        this.body = body;
        return this;
    }
    public ListImportableKMSSecretsForHostResponseBody getBody() {
        return this.body;
    }

}
