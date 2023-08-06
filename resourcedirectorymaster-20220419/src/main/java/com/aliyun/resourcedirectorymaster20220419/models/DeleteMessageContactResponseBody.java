// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcedirectorymaster20220419.models;

import com.aliyun.tea.*;

public class DeleteMessageContactResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The deletion status of the contact. Valid values:</p>
     * <br>
     * <p>*   Deleting</p>
     * <p>*   Deleted</p>
     */
    @NameInMap("Status")
    public String status;

    public static DeleteMessageContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageContactResponseBody self = new DeleteMessageContactResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMessageContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMessageContactResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
