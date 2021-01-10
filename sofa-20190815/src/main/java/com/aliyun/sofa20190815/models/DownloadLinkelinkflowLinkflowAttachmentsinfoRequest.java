// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DownloadLinkelinkflowLinkflowAttachmentsinfoRequest extends TeaModel {
    @NameInMap("AttachmentId")
    public String attachmentId;

    public static DownloadLinkelinkflowLinkflowAttachmentsinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadLinkelinkflowLinkflowAttachmentsinfoRequest self = new DownloadLinkelinkflowLinkflowAttachmentsinfoRequest();
        return TeaModel.build(map, self);
    }

    public DownloadLinkelinkflowLinkflowAttachmentsinfoRequest setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }
    public String getAttachmentId() {
        return this.attachmentId;
    }

}
