// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceKernelVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceName")
    @Validation(required = true)
    public String DBInstanceName;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("TargetMinorVersion")
    @Validation(required = true)
    public String targetMinorVersion;

    public static UpgradeDBInstanceKernelVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceKernelVersionResponse self = new UpgradeDBInstanceKernelVersionResponse();
        return TeaModel.build(map, self);
    }

}
