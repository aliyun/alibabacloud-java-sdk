// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAvailableRecoveryTimeRequest extends TeaModel {
    // description: 跨地域备份文件ID。可以通过接口[DescribeCrossRegionBackups](~~121733~~)查看备份集ID。; 
    @NameInMap("CrossBackupId")
    @Validation(required = true)
    public Integer crossBackupId;

    // description: 地域ID。; 
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAvailableRecoveryTimeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableRecoveryTimeRequest self = new DescribeAvailableRecoveryTimeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableRecoveryTimeRequest setCrossBackupId(Integer crossBackupId) {
        this.crossBackupId = crossBackupId;
        return this;
    }
    public Integer getCrossBackupId() {
        return this.crossBackupId;
    }

    public DescribeAvailableRecoveryTimeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
