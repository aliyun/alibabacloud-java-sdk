// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitEditMediaManifestJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitEditMediaManifestJobResponseBody body;

    public static SubmitEditMediaManifestJobResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitEditMediaManifestJobResponse self = new SubmitEditMediaManifestJobResponse();
        return TeaModel.build(map, self);
    }

    public SubmitEditMediaManifestJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitEditMediaManifestJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitEditMediaManifestJobResponse setBody(SubmitEditMediaManifestJobResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitEditMediaManifestJobResponseBody getBody() {
        return this.body;
    }

}
