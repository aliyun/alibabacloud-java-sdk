// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBMiniEngineVersionsRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*******</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The dedicated cluster ID. You can call the DescribeDedicatedHostGroups operation to query the dedicated cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dhg-4n*****</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>The database engine of the instance. Valid values: <strong>MySQL</strong> and <strong>PostgreSQL</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version of the instance. Valid values:</p>
     * <ul>
     * <li>Valid values when you set the Engine parameter to MySQL: <strong>8.0</strong>, <strong>5.7</strong>, <strong>5.6</strong>, and <strong>5.5</strong></li>
     * <li>Valid values when you set the Engine parameter to PostgreSQL: <strong>15.0</strong>, <strong>14.0</strong>, <strong>13.0</strong>, <strong>12.0</strong>, <strong>11.0</strong>, and <strong>10.0</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5.7</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The minor engine version of the instance. You can specify this parameter to query the minor engine version of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_20220731</p>
     */
    @NameInMap("MinorVersionTag")
    public String minorVersionTag;

    /**
     * <p>The instance edition. Valid values:</p>
     * <ul>
     * <li><strong>Basic</strong>: RDS Basic Edition</li>
     * <li><strong>HighAvailability</strong>: RDS High-availability Edition</li>
     * <li><strong>Finance</strong>: RDS Enterprise Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HighAvailability</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
     * <p>The storage type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>local_ssd</strong>: local SSD</li>
     * <li><strong>cloud_ssd</strong>: standard SSD</li>
     * <li><strong>cloud_essd</strong>: enhanced SSD (ESSD) of performance level 1 (PL1)</li>
     * <li><strong>cloud_essd2</strong>: ESSD of PL2</li>
     * <li><strong>cloud_essd3</strong>: ESSD of PL3</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>local_ssd</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    public static DescribeDBMiniEngineVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBMiniEngineVersionsRequest self = new DescribeDBMiniEngineVersionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBMiniEngineVersionsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBMiniEngineVersionsRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public DescribeDBMiniEngineVersionsRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeDBMiniEngineVersionsRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeDBMiniEngineVersionsRequest setMinorVersionTag(String minorVersionTag) {
        this.minorVersionTag = minorVersionTag;
        return this;
    }
    public String getMinorVersionTag() {
        return this.minorVersionTag;
    }

    public DescribeDBMiniEngineVersionsRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public DescribeDBMiniEngineVersionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBMiniEngineVersionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBMiniEngineVersionsRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

}
