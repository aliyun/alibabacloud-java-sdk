// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLogBackupPolicyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("EnableBackupLog")
    @Validation(required = true)
    public Integer enableBackupLog;

    @NameInMap("LogBackupRetentionPeriod")
    @Validation(required = true)
    public Integer logBackupRetentionPeriod;

    public static DescribeLogBackupPolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogBackupPolicyResponse self = new DescribeLogBackupPolicyResponse();
        return TeaModel.build(map, self);
    }

}
