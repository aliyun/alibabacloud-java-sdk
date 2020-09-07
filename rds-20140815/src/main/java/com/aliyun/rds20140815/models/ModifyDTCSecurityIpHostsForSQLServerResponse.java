// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDTCSecurityIpHostsForSQLServerResponse extends TeaModel {
    // description: 请求ID。; 
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // description: RDS实例ID。; 
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    // description: 设置白名单的结果，取值：* **Success**：设置成功；* **Fail**：设置失败。; 
    @NameInMap("DTCSetResult")
    @Validation(required = true)
    public String DTCSetResult;

    // description: 设置任务ID。; 
    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    public static ModifyDTCSecurityIpHostsForSQLServerResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDTCSecurityIpHostsForSQLServerResponse self = new ModifyDTCSecurityIpHostsForSQLServerResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDTCSecurityIpHostsForSQLServerResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDTCSecurityIpHostsForSQLServerResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDTCSecurityIpHostsForSQLServerResponse setDTCSetResult(String DTCSetResult) {
        this.DTCSetResult = DTCSetResult;
        return this;
    }
    public String getDTCSetResult() {
        return this.DTCSetResult;
    }

    public ModifyDTCSecurityIpHostsForSQLServerResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
