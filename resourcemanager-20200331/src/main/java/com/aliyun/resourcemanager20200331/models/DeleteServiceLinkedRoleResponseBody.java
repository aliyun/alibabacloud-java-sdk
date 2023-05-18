// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteServiceLinkedRoleResponseBody extends TeaModel {
    /**
     * <p>The ID of the deletion task.</p>
     */
    @NameInMap("DeletionTaskId")
    public String deletionTaskId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceLinkedRoleResponseBody self = new DeleteServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteServiceLinkedRoleResponseBody setDeletionTaskId(String deletionTaskId) {
        this.deletionTaskId = deletionTaskId;
        return this;
    }
    public String getDeletionTaskId() {
        return this.deletionTaskId;
    }

    public DeleteServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
