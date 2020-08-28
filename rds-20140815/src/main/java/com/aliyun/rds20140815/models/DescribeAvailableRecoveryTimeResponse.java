// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableRecoveryTimeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RecoveryBeginTime")
    @Validation(required = true)
    public String recoveryBeginTime;

    @NameInMap("RecoveryEndTime")
    @Validation(required = true)
    public String recoveryEndTime;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("CrossBackupId")
    @Validation(required = true)
    public Integer crossBackupId;

    public static DescribeAvailableRecoveryTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableRecoveryTimeResponse self = new DescribeAvailableRecoveryTimeResponse();
        return TeaModel.build(map, self);
    }

}
