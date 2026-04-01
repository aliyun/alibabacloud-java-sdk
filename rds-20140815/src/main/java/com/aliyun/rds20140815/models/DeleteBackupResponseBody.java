// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteBackupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>37441409-FFD1-40AA-8EC5-9ECF5E2F7C29</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBackupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupResponseBody self = new DeleteBackupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBackupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
