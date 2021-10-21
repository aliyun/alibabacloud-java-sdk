// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class SaveTaskForOfficialFileCustomResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveTaskForOfficialFileCustomResponseBody body;

    public static SaveTaskForOfficialFileCustomResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForOfficialFileCustomResponse self = new SaveTaskForOfficialFileCustomResponse();
        return TeaModel.build(map, self);
    }

    public SaveTaskForOfficialFileCustomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveTaskForOfficialFileCustomResponse setBody(SaveTaskForOfficialFileCustomResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTaskForOfficialFileCustomResponseBody getBody() {
        return this.body;
    }

}
