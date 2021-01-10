// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DownloadLinkelinkflowLinkflowAttachmentsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DownloadLinkelinkflowLinkflowAttachmentsResponseBody body;

    public static DownloadLinkelinkflowLinkflowAttachmentsResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadLinkelinkflowLinkflowAttachmentsResponse self = new DownloadLinkelinkflowLinkflowAttachmentsResponse();
        return TeaModel.build(map, self);
    }

    public DownloadLinkelinkflowLinkflowAttachmentsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadLinkelinkflowLinkflowAttachmentsResponse setBody(DownloadLinkelinkflowLinkflowAttachmentsResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadLinkelinkflowLinkflowAttachmentsResponseBody getBody() {
        return this.body;
    }

}
