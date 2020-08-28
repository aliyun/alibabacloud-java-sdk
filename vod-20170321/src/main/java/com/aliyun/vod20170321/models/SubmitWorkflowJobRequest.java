// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class SubmitWorkflowJobRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("WorkflowId")
    @Validation(required = true)
    public String workflowId;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("FileUrl")
    public String fileUrl;

    public static SubmitWorkflowJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitWorkflowJobRequest self = new SubmitWorkflowJobRequest();
        return TeaModel.build(map, self);
    }

}
