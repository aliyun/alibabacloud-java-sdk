// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteServiceLinkedRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DeletionTaskId")
    @Validation(required = true)
    public String deletionTaskId;

    public static DeleteServiceLinkedRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceLinkedRoleResponse self = new DeleteServiceLinkedRoleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServiceLinkedRoleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteServiceLinkedRoleResponse setDeletionTaskId(String deletionTaskId) {
        this.deletionTaskId = deletionTaskId;
        return this;
    }
    public String getDeletionTaskId() {
        return this.deletionTaskId;
    }

}
