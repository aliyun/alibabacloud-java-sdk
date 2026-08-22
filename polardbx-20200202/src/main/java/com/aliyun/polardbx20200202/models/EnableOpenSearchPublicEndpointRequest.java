// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class EnableOpenSearchPublicEndpointRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The target node type. Valid values:</p>
     * <ul>
     * <li><strong>search</strong>: data node. This is the default value.</li>
     * <li><strong>dashboard</strong>: dashboard node.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>search</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static EnableOpenSearchPublicEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableOpenSearchPublicEndpointRequest self = new EnableOpenSearchPublicEndpointRequest();
        return TeaModel.build(map, self);
    }

    public EnableOpenSearchPublicEndpointRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public EnableOpenSearchPublicEndpointRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public EnableOpenSearchPublicEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
