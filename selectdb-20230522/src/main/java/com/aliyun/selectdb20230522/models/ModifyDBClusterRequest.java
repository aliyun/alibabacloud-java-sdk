// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyDBClusterRequest extends TeaModel {
    /**
     * <p>The reserved cache size.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("CacheSize")
    public String cacheSize;

    /**
     * <p>The number of cluster nodes. This parameter takes effect only in Serverless mode.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClusterNodeCount")
    public Integer clusterNodeCount;

    /**
     * <p>The cluster node type. This parameter takes effect only in Serverless mode.</p>
     */
    @NameInMap("ClusterNodeType")
    public String clusterNodeType;

    /**
     * <p>The cluster specifications. Valid values:</p>
     * <ul>
     * <li><strong>selectdb.xlarge</strong>: 4 cores and 32 GB.</li>
     * <li><strong>selectdb.2xlarge</strong>: 8 cores and 64 GB.</li>
     * <li><strong>selectdb.4xlarge</strong>: 16 cores and 128 GB.</li>
     * <li><strong>selectdb.8xlarge</strong>: 32 cores and 256 GB.</li>
     * <li><strong>selectdb.16xlarge</strong>: 16 cores and 512 GB.</li>
     * <li><strong>selectdb.24xlarge</strong>: 24 cores and 768 GB.</li>
     * <li><strong>selectdb.32xlarge</strong>: 32 cores and 1024 GB.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb.2xlarge</p>
     */
    @NameInMap("DBClusterClass")
    public String DBClusterClass;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-xxxb9f2w-be</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

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
     * <p>The database engine type. Set the value to selectdb.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The maximum value of the auto-scaling range for the instance RCU (RDS Capacity Unit).</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("ScaleMax")
    public Double scaleMax;

    /**
     * <p>The minimum value of the auto-scaling range for the instance RCU (RDS Capacity Unit).</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("ScaleMin")
    public Double scaleMin;

    public static ModifyDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterRequest self = new ModifyDBClusterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterRequest setCacheSize(String cacheSize) {
        this.cacheSize = cacheSize;
        return this;
    }
    public String getCacheSize() {
        return this.cacheSize;
    }

    public ModifyDBClusterRequest setClusterNodeCount(Integer clusterNodeCount) {
        this.clusterNodeCount = clusterNodeCount;
        return this;
    }
    public Integer getClusterNodeCount() {
        return this.clusterNodeCount;
    }

    public ModifyDBClusterRequest setClusterNodeType(String clusterNodeType) {
        this.clusterNodeType = clusterNodeType;
        return this;
    }
    public String getClusterNodeType() {
        return this.clusterNodeType;
    }

    public ModifyDBClusterRequest setDBClusterClass(String DBClusterClass) {
        this.DBClusterClass = DBClusterClass;
        return this;
    }
    public String getDBClusterClass() {
        return this.DBClusterClass;
    }

    public ModifyDBClusterRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBClusterRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public ModifyDBClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBClusterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBClusterRequest setScaleMax(Double scaleMax) {
        this.scaleMax = scaleMax;
        return this;
    }
    public Double getScaleMax() {
        return this.scaleMax;
    }

    public ModifyDBClusterRequest setScaleMin(Double scaleMin) {
        this.scaleMin = scaleMin;
        return this;
    }
    public Double getScaleMin() {
        return this.scaleMin;
    }

}
