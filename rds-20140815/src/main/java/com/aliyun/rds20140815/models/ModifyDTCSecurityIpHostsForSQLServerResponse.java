// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDTCSecurityIpHostsForSQLServerResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("DTCSetResult")
    @Validation(required = true)
    public String DTCSetResult;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static ModifyDTCSecurityIpHostsForSQLServerResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDTCSecurityIpHostsForSQLServerResponse self = new ModifyDTCSecurityIpHostsForSQLServerResponse();
        return TeaModel.build(map, self);
    }

}
