// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DownloadLinkelinkflowLinkflowAttachmentsinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadLinkelinkflowLinkflowAttachmentsinfoResponseBody body;

    public static DownloadLinkelinkflowLinkflowAttachmentsinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadLinkelinkflowLinkflowAttachmentsinfoResponse self = new DownloadLinkelinkflowLinkflowAttachmentsinfoResponse();
        return TeaModel.build(map, self);
    }

    public DownloadLinkelinkflowLinkflowAttachmentsinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadLinkelinkflowLinkflowAttachmentsinfoResponse setBody(DownloadLinkelinkflowLinkflowAttachmentsinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadLinkelinkflowLinkflowAttachmentsinfoResponseBody getBody() {
        return this.body;
    }

}
