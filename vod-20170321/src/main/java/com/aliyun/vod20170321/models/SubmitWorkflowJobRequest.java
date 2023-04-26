// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitWorkflowJobRequest extends TeaModel {
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("WorkflowId")
    public String workflowId;

    public static SubmitWorkflowJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitWorkflowJobRequest self = new SubmitWorkflowJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitWorkflowJobRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public SubmitWorkflowJobRequest setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }
    public String getWorkflowId() {
        return this.workflowId;
    }

}
