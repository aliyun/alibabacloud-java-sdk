// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeOpenBackupSetRequest extends TeaModel {
    /**
     * <p>The instance name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The region ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The point in time to which you want to restore the instance. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-14T00:00:00Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    public static DescribeOpenBackupSetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenBackupSetRequest self = new DescribeOpenBackupSetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOpenBackupSetRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeOpenBackupSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeOpenBackupSetRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

}
