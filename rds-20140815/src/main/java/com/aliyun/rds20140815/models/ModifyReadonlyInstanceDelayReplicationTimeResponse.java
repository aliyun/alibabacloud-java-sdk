// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyReadonlyInstanceDelayReplicationTimeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("ReadSQLReplicationTime")
    @Validation(required = true)
    public String readSQLReplicationTime;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static ModifyReadonlyInstanceDelayReplicationTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyReadonlyInstanceDelayReplicationTimeResponse self = new ModifyReadonlyInstanceDelayReplicationTimeResponse();
        return TeaModel.build(map, self);
    }

}
