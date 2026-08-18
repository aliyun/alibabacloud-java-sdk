// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ReleaseContextDBPublicConnectionRequest extends TeaModel {
    /**
     * <p>The public network connection string to release. This parameter is optional. If you do not specify this parameter, the Mem0 public endpoint is subject to automatic release.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-hzjasdyuoo.polarx.rds.aliyuncs.com</p>
     */
    @NameInMap("CurrentConnectionString")
    public String currentConnectionString;

    /**
     * <p>The instance name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-htri0****r4k9p</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The target node type: service or dashboard.</p>
     * 
     * <strong>example:</strong>
     * <p>service</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ReleaseContextDBPublicConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseContextDBPublicConnectionRequest self = new ReleaseContextDBPublicConnectionRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseContextDBPublicConnectionRequest setCurrentConnectionString(String currentConnectionString) {
        this.currentConnectionString = currentConnectionString;
        return this;
    }
    public String getCurrentConnectionString() {
        return this.currentConnectionString;
    }

    public ReleaseContextDBPublicConnectionRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ReleaseContextDBPublicConnectionRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public ReleaseContextDBPublicConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
