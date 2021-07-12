// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UploadDeviceRecordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UploadDeviceRecordResponseBody body;

    public static UploadDeviceRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadDeviceRecordResponse self = new UploadDeviceRecordResponse();
        return TeaModel.build(map, self);
    }

    public UploadDeviceRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadDeviceRecordResponse setBody(UploadDeviceRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadDeviceRecordResponseBody getBody() {
        return this.body;
    }

}
