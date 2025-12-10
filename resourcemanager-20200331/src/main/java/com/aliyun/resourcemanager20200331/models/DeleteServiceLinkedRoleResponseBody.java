// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class DeleteServiceLinkedRoleResponseBody extends TeaModel {
    /**
     * <p>The ID of the deletion task.</p>
     * 
     * <strong>example:</strong>
     * <p>task/acs-service-role/polardb.aliyuncs.com/AliyunServiceRoleForPolarDB/64c4f9cc-fac2-4692-ae1b-804ae4b9****</p>
     */
    @NameInMap("DeletionTaskId")
    public String deletionTaskId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B595E5BF-FF5F-4E7F-B95A-B90FE242FEB6</p>
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
