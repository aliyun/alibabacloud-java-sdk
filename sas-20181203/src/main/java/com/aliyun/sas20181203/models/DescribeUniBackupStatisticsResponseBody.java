// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupStatisticsResponseBody extends TeaModel {
    @NameInMap("ProtectedDatabaseCount")
    public Integer protectedDatabaseCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RestoringTaskCount")
    public Integer restoringTaskCount;

    @NameInMap("TotalRecoverableCount")
    public Integer totalRecoverableCount;

    @NameInMap("TotalRestoreTaskCount")
    public Integer totalRestoreTaskCount;

    @NameInMap("UnprotectedDatabaseCount")
    public Integer unprotectedDatabaseCount;

    public static DescribeUniBackupStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUniBackupStatisticsResponseBody self = new DescribeUniBackupStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUniBackupStatisticsResponseBody setProtectedDatabaseCount(Integer protectedDatabaseCount) {
        this.protectedDatabaseCount = protectedDatabaseCount;
        return this;
    }
    public Integer getProtectedDatabaseCount() {
        return this.protectedDatabaseCount;
    }

    public DescribeUniBackupStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUniBackupStatisticsResponseBody setRestoringTaskCount(Integer restoringTaskCount) {
        this.restoringTaskCount = restoringTaskCount;
        return this;
    }
    public Integer getRestoringTaskCount() {
        return this.restoringTaskCount;
    }

    public DescribeUniBackupStatisticsResponseBody setTotalRecoverableCount(Integer totalRecoverableCount) {
        this.totalRecoverableCount = totalRecoverableCount;
        return this;
    }
    public Integer getTotalRecoverableCount() {
        return this.totalRecoverableCount;
    }

    public DescribeUniBackupStatisticsResponseBody setTotalRestoreTaskCount(Integer totalRestoreTaskCount) {
        this.totalRestoreTaskCount = totalRestoreTaskCount;
        return this;
    }
    public Integer getTotalRestoreTaskCount() {
        return this.totalRestoreTaskCount;
    }

    public DescribeUniBackupStatisticsResponseBody setUnprotectedDatabaseCount(Integer unprotectedDatabaseCount) {
        this.unprotectedDatabaseCount = unprotectedDatabaseCount;
        return this;
    }
    public Integer getUnprotectedDatabaseCount() {
        return this.unprotectedDatabaseCount;
    }

}
