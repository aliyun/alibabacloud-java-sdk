// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListOSSHDFSExportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOSSHDFSExportsResponseBody body;

    public static ListOSSHDFSExportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOSSHDFSExportsResponse self = new ListOSSHDFSExportsResponse();
        return TeaModel.build(map, self);
    }

    public ListOSSHDFSExportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOSSHDFSExportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOSSHDFSExportsResponse setBody(ListOSSHDFSExportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOSSHDFSExportsResponseBody getBody() {
        return this.body;
    }

}
