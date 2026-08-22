// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyOpenSearchWhitelistGroupRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-xxx</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>group_y6sqhtr6jyu52w4oublg3674du</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The list of source IP address restrictions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.0/24</p>
     */
    @NameInMap("IPs")
    public String IPs;

    /**
     * <p>The region in which the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>000G2DJ1YGee321432</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static ModifyOpenSearchWhitelistGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOpenSearchWhitelistGroupRequest self = new ModifyOpenSearchWhitelistGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOpenSearchWhitelistGroupRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifyOpenSearchWhitelistGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyOpenSearchWhitelistGroupRequest setIPs(String IPs) {
        this.IPs = IPs;
        return this;
    }
    public String getIPs() {
        return this.IPs;
    }

    public ModifyOpenSearchWhitelistGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyOpenSearchWhitelistGroupRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
