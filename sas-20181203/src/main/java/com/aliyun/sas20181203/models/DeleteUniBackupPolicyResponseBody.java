// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteUniBackupPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUniBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUniBackupPolicyResponseBody self = new DeleteUniBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUniBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
