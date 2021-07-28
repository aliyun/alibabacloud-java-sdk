// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceStatusResponseBody extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DBInstanceCpuCores")
    public String DBInstanceCpuCores;

    @NameInMap("TaskStatus")
    public Integer taskStatus;

    @NameInMap("DBInstanceId")
    public Integer DBInstanceId;

    @NameInMap("DBInstanceStatus")
    public Integer DBInstanceStatus;

    @NameInMap("DBInstanceUseType")
    public String DBInstanceUseType;

    public static DescribeDBInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceStatusResponseBody self = new DescribeDBInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceStatusResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeDBInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceStatusResponseBody setDBInstanceCpuCores(String DBInstanceCpuCores) {
        this.DBInstanceCpuCores = DBInstanceCpuCores;
        return this;
    }
    public String getDBInstanceCpuCores() {
        return this.DBInstanceCpuCores;
    }

    public DescribeDBInstanceStatusResponseBody setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public DescribeDBInstanceStatusResponseBody setDBInstanceId(Integer DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public Integer getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceStatusResponseBody setDBInstanceStatus(Integer DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
        return this;
    }
    public Integer getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    public DescribeDBInstanceStatusResponseBody setDBInstanceUseType(String DBInstanceUseType) {
        this.DBInstanceUseType = DBInstanceUseType;
        return this;
    }
    public String getDBInstanceUseType() {
        return this.DBInstanceUseType;
    }

}
