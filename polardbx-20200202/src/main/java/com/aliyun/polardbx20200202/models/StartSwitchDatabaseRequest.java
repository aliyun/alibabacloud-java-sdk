// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class StartSwitchDatabaseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pxc-xxx</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>pxc-*********.polarx.rds.aliyuncs.com</p>
     */
    @NameInMap("DstMainConnectString")
    public String dstMainConnectString;

    /**
     * <strong>example:</strong>
     * <p>3313</p>
     */
    @NameInMap("DstMainPort")
    public String dstMainPort;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>etx-szr2rr6i*****</p>
     */
    @NameInMap("SlinkTaskId")
    public String slinkTaskId;

    /**
     * <strong>example:</strong>
     * <p>rm-*********.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("SrcMainConnectString")
    public String srcMainConnectString;

    /**
     * <strong>example:</strong>
     * <p>3308</p>
     */
    @NameInMap("SrcMainPort")
    public String srcMainPort;

    public static StartSwitchDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        StartSwitchDatabaseRequest self = new StartSwitchDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public StartSwitchDatabaseRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public StartSwitchDatabaseRequest setDstMainConnectString(String dstMainConnectString) {
        this.dstMainConnectString = dstMainConnectString;
        return this;
    }
    public String getDstMainConnectString() {
        return this.dstMainConnectString;
    }

    public StartSwitchDatabaseRequest setDstMainPort(String dstMainPort) {
        this.dstMainPort = dstMainPort;
        return this;
    }
    public String getDstMainPort() {
        return this.dstMainPort;
    }

    public StartSwitchDatabaseRequest setIsModifyEndpoint(String isModifyEndpoint) {
        this.isModifyEndpoint = isModifyEndpoint;
        return this;
    }
    public String getIsModifyEndpoint() {
        return this.isModifyEndpoint;
    }

    public StartSwitchDatabaseRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartSwitchDatabaseRequest setSlinkTaskId(String slinkTaskId) {
        this.slinkTaskId = slinkTaskId;
        return this;
    }
    public String getSlinkTaskId() {
        return this.slinkTaskId;
    }

    public StartSwitchDatabaseRequest setSrcMainConnectString(String srcMainConnectString) {
        this.srcMainConnectString = srcMainConnectString;
        return this;
    }
    public String getSrcMainConnectString() {
        return this.srcMainConnectString;
    }

    public StartSwitchDatabaseRequest setSrcMainPort(String srcMainPort) {
        this.srcMainPort = srcMainPort;
        return this;
    }
    public String getSrcMainPort() {
        return this.srcMainPort;
    }

}
