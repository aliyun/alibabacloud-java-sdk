// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ArchiveFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ArchiveFilesResponseBody body;

    public static ArchiveFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ArchiveFilesResponse self = new ArchiveFilesResponse();
        return TeaModel.build(map, self);
    }

    public ArchiveFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ArchiveFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ArchiveFilesResponse setBody(ArchiveFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ArchiveFilesResponseBody getBody() {
        return this.body;
    }

}
