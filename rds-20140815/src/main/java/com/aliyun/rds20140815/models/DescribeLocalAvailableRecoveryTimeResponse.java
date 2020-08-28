// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeLocalAvailableRecoveryTimeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("RecoveryBeginTime")
    @Validation(required = true)
    public String recoveryBeginTime;

    @NameInMap("RecoveryEndTime")
    @Validation(required = true)
    public String recoveryEndTime;

    public static DescribeLocalAvailableRecoveryTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLocalAvailableRecoveryTimeResponse self = new DescribeLocalAvailableRecoveryTimeResponse();
        return TeaModel.build(map, self);
    }

}
