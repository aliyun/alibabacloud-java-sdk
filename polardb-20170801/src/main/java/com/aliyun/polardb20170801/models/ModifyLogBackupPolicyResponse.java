// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyLogBackupPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyLogBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogBackupPolicyResponse self = new ModifyLogBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

}
