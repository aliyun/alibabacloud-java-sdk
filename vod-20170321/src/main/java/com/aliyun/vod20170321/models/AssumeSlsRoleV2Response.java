// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class AssumeSlsRoleV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssumeSlsRoleV2ResponseBody body;

    public static AssumeSlsRoleV2Response build(java.util.Map<String, ?> map) throws Exception {
        AssumeSlsRoleV2Response self = new AssumeSlsRoleV2Response();
        return TeaModel.build(map, self);
    }

    public AssumeSlsRoleV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssumeSlsRoleV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssumeSlsRoleV2Response setBody(AssumeSlsRoleV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public AssumeSlsRoleV2ResponseBody getBody() {
        return this.body;
    }

}
