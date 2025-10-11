// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeEncryptionDBRolePrivilegeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEncryptionDBRolePrivilegeResponseBody body;

    public static DescribeEncryptionDBRolePrivilegeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEncryptionDBRolePrivilegeResponse self = new DescribeEncryptionDBRolePrivilegeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEncryptionDBRolePrivilegeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEncryptionDBRolePrivilegeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEncryptionDBRolePrivilegeResponse setBody(DescribeEncryptionDBRolePrivilegeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEncryptionDBRolePrivilegeResponseBody getBody() {
        return this.body;
    }

}
