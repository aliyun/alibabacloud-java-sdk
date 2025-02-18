// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class SwitchGdnMemberRoleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SwitchMode")
    public String switchMode;

    @NameInMap("TaskTimeout")
    public Long taskTimeout;

    public static SwitchGdnMemberRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchGdnMemberRoleRequest self = new SwitchGdnMemberRoleRequest();
        return TeaModel.build(map, self);
    }

    public SwitchGdnMemberRoleRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public SwitchGdnMemberRoleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SwitchGdnMemberRoleRequest setSwitchMode(String switchMode) {
        this.switchMode = switchMode;
        return this;
    }
    public String getSwitchMode() {
        return this.switchMode;
    }

    public SwitchGdnMemberRoleRequest setTaskTimeout(Long taskTimeout) {
        this.taskTimeout = taskTimeout;
        return this;
    }
    public Long getTaskTimeout() {
        return this.taskTimeout;
    }

}
