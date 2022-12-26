// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateUniBackupPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateUniBackupPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUniBackupPolicyResponseBody self = new CreateUniBackupPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUniBackupPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
