// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeSupabaseIpWhitelistRequest extends TeaModel {
    /**
     * <p>The instance name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pcsp-**************</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The whitelist group name.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-zhangjiakou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeSupabaseIpWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupabaseIpWhitelistRequest self = new DescribeSupabaseIpWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSupabaseIpWhitelistRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeSupabaseIpWhitelistRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeSupabaseIpWhitelistRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
