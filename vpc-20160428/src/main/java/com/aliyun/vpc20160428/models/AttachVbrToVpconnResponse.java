// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AttachVbrToVpconnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachVbrToVpconnResponseBody body;

    public static AttachVbrToVpconnResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachVbrToVpconnResponse self = new AttachVbrToVpconnResponse();
        return TeaModel.build(map, self);
    }

    public AttachVbrToVpconnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachVbrToVpconnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachVbrToVpconnResponse setBody(AttachVbrToVpconnResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachVbrToVpconnResponseBody getBody() {
        return this.body;
    }

}
