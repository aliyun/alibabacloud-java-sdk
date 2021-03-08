// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitWorkflowJobRequest extends TeaModel {
    @NameInMap("WorkflowId")
    public String workflowId;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("FileUrl")
    public String fileUrl;

    public static SubmitWorkflowJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitWorkflowJobRequest self = new SubmitWorkflowJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitWorkflowJobRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

    public SubmitWorkflowJobRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitWorkflowJobRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
