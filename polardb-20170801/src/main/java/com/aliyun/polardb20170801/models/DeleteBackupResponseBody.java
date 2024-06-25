// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteBackupResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3CF4F9FE-BF77-4739-8D68-B8DF5D******</p>
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
