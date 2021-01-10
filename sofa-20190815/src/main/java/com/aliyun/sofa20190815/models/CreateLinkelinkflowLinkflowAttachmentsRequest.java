// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkelinkflowLinkflowAttachmentsRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("ProcessInstanceId")
    public String processInstanceId;

    @NameInMap("RemoteUrl")
    public String remoteUrl;

    public static CreateLinkelinkflowLinkflowAttachmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkelinkflowLinkflowAttachmentsRequest self = new CreateLinkelinkflowLinkflowAttachmentsRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkelinkflowLinkflowAttachmentsRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateLinkelinkflowLinkflowAttachmentsRequest setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    public CreateLinkelinkflowLinkflowAttachmentsRequest setRemoteUrl(String remoteUrl) {
        this.remoteUrl = remoteUrl;
        return this;
    }
    public String getRemoteUrl() {
        return this.remoteUrl;
    }

}
