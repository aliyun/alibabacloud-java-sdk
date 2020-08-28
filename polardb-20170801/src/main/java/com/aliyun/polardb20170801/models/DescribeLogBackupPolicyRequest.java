// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLogBackupPolicyRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    public static DescribeLogBackupPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogBackupPolicyRequest self = new DescribeLogBackupPolicyRequest();
        return TeaModel.build(map, self);
    }

}
