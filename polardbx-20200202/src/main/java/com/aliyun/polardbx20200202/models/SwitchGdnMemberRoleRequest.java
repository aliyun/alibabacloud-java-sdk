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

    @NameInMap("DstMainConnectString")
    public String dstMainConnectString;

    @NameInMap("DstMainPort")
    public String dstMainPort;

    @NameInMap("IsModifyEndpoint")
    public String isModifyEndpoint;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SrcMainConnectString")
    public String srcMainConnectString;

    @NameInMap("SrcMainPort")
    public String srcMainPort;

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

    public SwitchGdnMemberRoleRequest setDstMainConnectString(String dstMainConnectString) {
        this.dstMainConnectString = dstMainConnectString;
        return this;
    }
    public String getDstMainConnectString() {
        return this.dstMainConnectString;
    }

    public SwitchGdnMemberRoleRequest setDstMainPort(String dstMainPort) {
        this.dstMainPort = dstMainPort;
        return this;
    }
    public String getDstMainPort() {
        return this.dstMainPort;
    }

    public SwitchGdnMemberRoleRequest setIsModifyEndpoint(String isModifyEndpoint) {
        this.isModifyEndpoint = isModifyEndpoint;
        return this;
    }
    public String getIsModifyEndpoint() {
        return this.isModifyEndpoint;
    }

    public SwitchGdnMemberRoleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SwitchGdnMemberRoleRequest setSrcMainConnectString(String srcMainConnectString) {
        this.srcMainConnectString = srcMainConnectString;
        return this;
    }
    public String getSrcMainConnectString() {
        return this.srcMainConnectString;
    }

    public SwitchGdnMemberRoleRequest setSrcMainPort(String srcMainPort) {
        this.srcMainPort = srcMainPort;
        return this;
    }
    public String getSrcMainPort() {
        return this.srcMainPort;
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
