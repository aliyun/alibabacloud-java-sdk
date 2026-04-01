// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeLocalAvailableRecoveryTimeResponseBody extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The start of the time range to which the instance can be restored.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-03-16T07:59:18Z</p>
     */
    @NameInMap("RecoveryBeginTime")
    public String recoveryBeginTime;

    /**
     * <p>The end of the time range to which the instance can be restored.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-03-20T08:41:29Z</p>
     */
    @NameInMap("RecoveryEndTime")
    public String recoveryEndTime;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14E986AC-0F27-4FFB-8EED-9A8A3A2A0309</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLocalAvailableRecoveryTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLocalAvailableRecoveryTimeResponseBody self = new DescribeLocalAvailableRecoveryTimeResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeLocalAvailableRecoveryTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
