// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ReleaseContext0PublicConnectionRequest extends TeaModel {
    /**
     * <p>The public connection string to release. This parameter is optional. If you do not specify this parameter, the Mem0 public endpoint is automatically released.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-hzjasdyuoo.polarx.rds.aliyuncs.com</p>
     */
    @NameInMap("CurrentConnectionString")
    public String currentConnectionString;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-htri0****r4k9p</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The type of the target node. Valid values: service, dashboard.</p>
     * 
     * <strong>example:</strong>
     * <p>dn</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ReleaseContext0PublicConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseContext0PublicConnectionRequest self = new ReleaseContext0PublicConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseContext0PublicConnectionRequest setCurrentConnectionString(String currentConnectionString) {
        this.currentConnectionString = currentConnectionString;
        return this;
    }
    public String getCurrentConnectionString() {
        return this.currentConnectionString;
    }

    public ReleaseContext0PublicConnectionRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ReleaseContext0PublicConnectionRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public ReleaseContext0PublicConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
