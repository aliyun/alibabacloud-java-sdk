// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetServiceLinkedRoleDeletionStatusRequest extends TeaModel {
    /**
     * <p>The ID of the deletion task.</p>
     */
    @NameInMap("DeletionTaskId")
    public String deletionTaskId;

    public static GetServiceLinkedRoleDeletionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceLinkedRoleDeletionStatusRequest self = new GetServiceLinkedRoleDeletionStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetServiceLinkedRoleDeletionStatusRequest setDeletionTaskId(String deletionTaskId) {
        this.deletionTaskId = deletionTaskId;
        return this;
    }
    public String getDeletionTaskId() {
        return this.deletionTaskId;
    }

}
