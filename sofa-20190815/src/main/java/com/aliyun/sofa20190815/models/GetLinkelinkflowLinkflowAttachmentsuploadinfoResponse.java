// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBody body;

    public static GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse self = new GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponse setBody(GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkelinkflowLinkflowAttachmentsuploadinfoResponseBody getBody() {
        return this.body;
    }

}
