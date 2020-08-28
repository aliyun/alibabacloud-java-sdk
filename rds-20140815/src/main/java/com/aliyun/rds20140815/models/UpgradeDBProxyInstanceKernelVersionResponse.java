// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBProxyInstanceKernelVersionResponse extends TeaModel {
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

    public static UpgradeDBProxyInstanceKernelVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBProxyInstanceKernelVersionResponse self = new UpgradeDBProxyInstanceKernelVersionResponse();
        return TeaModel.build(map, self);
    }

}
