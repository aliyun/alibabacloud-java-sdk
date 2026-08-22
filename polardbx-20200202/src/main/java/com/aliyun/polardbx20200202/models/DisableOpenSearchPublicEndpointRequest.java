// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DisableOpenSearchPublicEndpointRequest extends TeaModel {
    /**
     * <p>The name of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The type of the target node. Valid values:</p>
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
     * <p>The region in which the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DisableOpenSearchPublicEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableOpenSearchPublicEndpointRequest self = new DisableOpenSearchPublicEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DisableOpenSearchPublicEndpointRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DisableOpenSearchPublicEndpointRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public DisableOpenSearchPublicEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
