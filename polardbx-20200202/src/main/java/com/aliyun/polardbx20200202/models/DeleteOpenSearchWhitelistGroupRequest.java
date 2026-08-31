// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteOpenSearchWhitelistGroupRequest extends TeaModel {
    /**
     * <p>The name of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-**************</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The ID of the service group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_y6sqhtr6jyu52w4oublg3674du</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the region where the instance resides. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196841.html">DescribeRegions</a> operation to query the regions supported by PolarDB-X, including region IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteOpenSearchWhitelistGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOpenSearchWhitelistGroupRequest self = new DeleteOpenSearchWhitelistGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOpenSearchWhitelistGroupRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DeleteOpenSearchWhitelistGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteOpenSearchWhitelistGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
