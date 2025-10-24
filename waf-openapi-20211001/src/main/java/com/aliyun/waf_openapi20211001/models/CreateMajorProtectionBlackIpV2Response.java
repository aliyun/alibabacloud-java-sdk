// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateMajorProtectionBlackIpV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMajorProtectionBlackIpV2ResponseBody body;

    public static CreateMajorProtectionBlackIpV2Response build(java.util.Map<String, ?> map) throws Exception {
        CreateMajorProtectionBlackIpV2Response self = new CreateMajorProtectionBlackIpV2Response();
        return TeaModel.build(map, self);
    }

    public CreateMajorProtectionBlackIpV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMajorProtectionBlackIpV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMajorProtectionBlackIpV2Response setBody(CreateMajorProtectionBlackIpV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMajorProtectionBlackIpV2ResponseBody getBody() {
        return this.body;
    }

}
