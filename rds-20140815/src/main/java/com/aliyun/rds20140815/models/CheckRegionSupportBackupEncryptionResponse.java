// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckRegionSupportBackupEncryptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckRegionSupportBackupEncryptionResponseBody body;

    public static CheckRegionSupportBackupEncryptionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckRegionSupportBackupEncryptionResponse self = new CheckRegionSupportBackupEncryptionResponse();
        return TeaModel.build(map, self);
    }

    public CheckRegionSupportBackupEncryptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckRegionSupportBackupEncryptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckRegionSupportBackupEncryptionResponse setBody(CheckRegionSupportBackupEncryptionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckRegionSupportBackupEncryptionResponseBody getBody() {
        return this.body;
    }

}
