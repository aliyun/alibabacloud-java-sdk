// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DownloadLinkelinkflowLinkflowAttachmentsResponseBody extends TeaModel {
    @NameInMap("ResponseContent")
    public String responseContent;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    public static DownloadLinkelinkflowLinkflowAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadLinkelinkflowLinkflowAttachmentsResponseBody self = new DownloadLinkelinkflowLinkflowAttachmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadLinkelinkflowLinkflowAttachmentsResponseBody setResponseContent(String responseContent) {
        this.responseContent = responseContent;
        return this;
    }
    public String getResponseContent() {
        return this.responseContent;
    }

    public DownloadLinkelinkflowLinkflowAttachmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadLinkelinkflowLinkflowAttachmentsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public DownloadLinkelinkflowLinkflowAttachmentsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DownloadLinkelinkflowLinkflowAttachmentsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

}
