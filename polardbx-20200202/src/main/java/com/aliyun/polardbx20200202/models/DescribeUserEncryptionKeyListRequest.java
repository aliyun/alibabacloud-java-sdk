// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeUserEncryptionKeyListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pxc-hzjasd****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeUserEncryptionKeyListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserEncryptionKeyListRequest self = new DescribeUserEncryptionKeyListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUserEncryptionKeyListRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeUserEncryptionKeyListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
