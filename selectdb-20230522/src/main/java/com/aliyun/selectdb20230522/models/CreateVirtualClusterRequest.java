// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class CreateVirtualClusterRequest extends TeaModel {
    /**
     * <p>The primary cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213cjv****
     * -be</p>
     */
    @NameInMap("ActiveClusterId")
    public String activeClusterId;

    /**
     * <p>The cluster name. The name must start with a letter and can be up to 64 characters in length. It can contain letters (case-insensitive), digits, and underscores (<em>). It cannot contain two or more consecutive underscores (</em>). Cluster names must be unique within the same instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vcg_demo</p>
     */
    @NameInMap("ClusterName")
    public String clusterName;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213cjv****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The standby cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-26a3cjv****
     * -be</p>
     */
    @NameInMap("StandbyClusterId")
    public String standbyClusterId;

    public static CreateVirtualClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualClusterRequest self = new CreateVirtualClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateVirtualClusterRequest setActiveClusterId(String activeClusterId) {
        this.activeClusterId = activeClusterId;
        return this;
    }
    public String getActiveClusterId() {
        return this.activeClusterId;
    }

    public CreateVirtualClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateVirtualClusterRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateVirtualClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVirtualClusterRequest setStandbyClusterId(String standbyClusterId) {
        this.standbyClusterId = standbyClusterId;
        return this;
    }
    public String getStandbyClusterId() {
        return this.standbyClusterId;
    }

}
