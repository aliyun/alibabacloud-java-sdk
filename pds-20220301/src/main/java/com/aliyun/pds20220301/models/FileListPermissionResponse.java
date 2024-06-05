// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class FileListPermissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<FilePermissionMember> body;

    public static FileListPermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        FileListPermissionResponse self = new FileListPermissionResponse();
        return TeaModel.build(map, self);
    }

    public FileListPermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FileListPermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FileListPermissionResponse setBody(java.util.List<FilePermissionMember> body) {
        this.body = body;
        return this;
    }
    public java.util.List<FilePermissionMember> getBody() {
        return this.body;
    }

}
