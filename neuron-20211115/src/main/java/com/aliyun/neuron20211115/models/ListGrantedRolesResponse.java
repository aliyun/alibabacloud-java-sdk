// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListGrantedRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RolePageResult body;

    public static ListGrantedRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGrantedRolesResponse self = new ListGrantedRolesResponse();
        return TeaModel.build(map, self);
    }

    public ListGrantedRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListGrantedRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListGrantedRolesResponse setBody(RolePageResult body) {
        this.body = body;
        return this;
    }
    public RolePageResult getBody() {
        return this.body;
    }

}
