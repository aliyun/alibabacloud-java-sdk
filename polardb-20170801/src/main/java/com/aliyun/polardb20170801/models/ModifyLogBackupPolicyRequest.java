// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyLogBackupPolicyRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("LogBackupRetentionPeriod")
    public String logBackupRetentionPeriod;

    public static ModifyLogBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLogBackupPolicyRequest self = new ModifyLogBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

}
