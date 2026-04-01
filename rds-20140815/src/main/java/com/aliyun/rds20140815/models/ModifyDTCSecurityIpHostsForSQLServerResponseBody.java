// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDTCSecurityIpHostsForSQLServerResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The result of the IP address whitelist configuration. Valid values:</p>
     * <ul>
     * <li><strong>Success</strong></li>
     * <li><strong>Fail</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("DTCSetResult")
    public String DTCSetResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>671B6D32-B907-4EFF-A3B7-94D2EAD5E3A3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>178968983</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static ModifyDTCSecurityIpHostsForSQLServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDTCSecurityIpHostsForSQLServerResponseBody self = new ModifyDTCSecurityIpHostsForSQLServerResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDTCSecurityIpHostsForSQLServerResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDTCSecurityIpHostsForSQLServerResponseBody setDTCSetResult(String DTCSetResult) {
        this.DTCSetResult = DTCSetResult;
        return this;
    }
    public String getDTCSetResult() {
        return this.DTCSetResult;
    }

    public ModifyDTCSecurityIpHostsForSQLServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDTCSecurityIpHostsForSQLServerResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
