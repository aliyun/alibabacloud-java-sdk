// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableRecoveryTimeResponse extends TeaModel {
    // description: 请求ID。; 
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    // description: 跨地域备份文件可恢复的起始时间。格式：<i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z（UTC时间）。; 
    @NameInMap("RecoveryBeginTime")
    @Validation(required = true)
    public String recoveryBeginTime;

    // description: 跨地域备份文件可恢复的结束时间。格式：<i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z（UTC时间）。; 
    @NameInMap("RecoveryEndTime")
    @Validation(required = true)
    public String recoveryEndTime;

    // description: 源实例所在地域ID。; 
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    // description: 跨地域备份文件ID。; 
    @NameInMap("CrossBackupId")
    @Validation(required = true)
    public Integer crossBackupId;

    public static DescribeAvailableRecoveryTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableRecoveryTimeResponse self = new DescribeAvailableRecoveryTimeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableRecoveryTimeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvailableRecoveryTimeResponse setRecoveryBeginTime(String recoveryBeginTime) {
        this.recoveryBeginTime = recoveryBeginTime;
        return this;
    }
    public String getRecoveryBeginTime() {
        return this.recoveryBeginTime;
    }

    public DescribeAvailableRecoveryTimeResponse setRecoveryEndTime(String recoveryEndTime) {
        this.recoveryEndTime = recoveryEndTime;
        return this;
    }
    public String getRecoveryEndTime() {
        return this.recoveryEndTime;
    }

    public DescribeAvailableRecoveryTimeResponse setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailableRecoveryTimeResponse setCrossBackupId(Integer crossBackupId) {
        this.crossBackupId = crossBackupId;
        return this;
    }
    public Integer getCrossBackupId() {
        return this.crossBackupId;
    }

}
