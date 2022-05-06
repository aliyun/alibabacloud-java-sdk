// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableRecoveryTimeResponseBody extends TeaModel {
    @NameInMap("CrossBackupId")
    public Integer crossBackupId;

    @NameInMap("RecoveryBeginTime")
    public String recoveryBeginTime;

    @NameInMap("RecoveryEndTime")
    public String recoveryEndTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAvailableRecoveryTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableRecoveryTimeResponseBody self = new DescribeAvailableRecoveryTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableRecoveryTimeResponseBody setCrossBackupId(Integer crossBackupId) {
        this.crossBackupId = crossBackupId;
        return this;
    }
    public Integer getCrossBackupId() {
        return this.crossBackupId;
    }

    public DescribeAvailableRecoveryTimeResponseBody setRecoveryBeginTime(String recoveryBeginTime) {
        this.recoveryBeginTime = recoveryBeginTime;
        return this;
    }
    public String getRecoveryBeginTime() {
        return this.recoveryBeginTime;
    }

    public DescribeAvailableRecoveryTimeResponseBody setRecoveryEndTime(String recoveryEndTime) {
        this.recoveryEndTime = recoveryEndTime;
        return this;
    }
    public String getRecoveryEndTime() {
        return this.recoveryEndTime;
    }

    public DescribeAvailableRecoveryTimeResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailableRecoveryTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
