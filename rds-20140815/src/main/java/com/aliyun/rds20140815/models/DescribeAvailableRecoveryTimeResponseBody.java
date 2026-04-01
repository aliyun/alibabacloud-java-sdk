// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableRecoveryTimeResponseBody extends TeaModel {
    /**
     * <p>The ID of the cross-region data backup file.</p>
     * 
     * <strong>example:</strong>
     * <p>14377</p>
     */
    @NameInMap("CrossBackupId")
    public Integer crossBackupId;

    /**
     * <p>The start time from which data can be restored. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-06-12T05:22:29Z</p>
     */
    @NameInMap("RecoveryBeginTime")
    public String recoveryBeginTime;

    /**
     * <p>The end time to which data can be restored. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-06-12T07:33:12Z</p>
     */
    @NameInMap("RecoveryEndTime")
    public String recoveryEndTime;

    /**
     * <p>The region where the source instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8CCBF4BA-7CE1-47E1-B49F-E97EA200A40D</p>
     */
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
