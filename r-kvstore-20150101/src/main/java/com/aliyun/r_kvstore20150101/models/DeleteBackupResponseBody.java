// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DeleteBackupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F14475F4-644E-51EA-B1E8-E4D442093D0C</p>
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
