// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeLocalAvailableRecoveryTimeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("RecoveryBeginTime")
    public String recoveryBeginTime;

    @NameInMap("RecoveryEndTime")
    public String recoveryEndTime;

    public static DescribeLocalAvailableRecoveryTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLocalAvailableRecoveryTimeResponseBody self = new DescribeLocalAvailableRecoveryTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLocalAvailableRecoveryTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLocalAvailableRecoveryTimeResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeLocalAvailableRecoveryTimeResponseBody setRecoveryBeginTime(String recoveryBeginTime) {
        this.recoveryBeginTime = recoveryBeginTime;
        return this;
    }
    public String getRecoveryBeginTime() {
        return this.recoveryBeginTime;
    }

    public DescribeLocalAvailableRecoveryTimeResponseBody setRecoveryEndTime(String recoveryEndTime) {
        this.recoveryEndTime = recoveryEndTime;
        return this;
    }
    public String getRecoveryEndTime() {
        return this.recoveryEndTime;
    }

}
