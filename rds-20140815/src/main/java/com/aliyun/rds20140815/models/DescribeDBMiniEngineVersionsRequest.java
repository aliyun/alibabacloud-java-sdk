// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBMiniEngineVersionsRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the ID.</p>
     * <blockquote>
     * <p>For ApsaraDB RDS for PostgreSQL instances, if you specify an instance ID, only minor versions later than the current minor version of the instance are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The dedicated cluster ID. You can call the DescribeDedicatedHostGroups operation to query the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dhg-4n****</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>The database engine. Set the value to <strong>MySQL</strong> or <strong>PostgreSQL</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version. Valid values:</p>
     * <ul>
     * <li>MySQL: <strong>8.0</strong>, <strong>5.7</strong>, <strong>5.6</strong>, <strong>5.5</strong></li>
     * <li>PostgreSQL: <strong>17.0</strong>, <strong>16.0</strong>, <strong>15.0</strong>, <strong>14.0</strong>, <strong>13.0</strong>, <strong>12.0</strong>, <strong>11.0</strong>, <strong>10.0</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5.7</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The minor engine version number. Specify this parameter to query the details of the specified minor version.</p>
     * <blockquote>
     * <p>This parameter is applicable only to ApsaraDB RDS for MySQL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rds_20220731</p>
     */
    @NameInMap("MinorVersionTag")
    public String minorVersionTag;

    /**
     * <p>The instance edition. Valid values:</p>
     * <ul>
     * <li><strong>Basic</strong>: Basic Edition.</li>
     * <li><strong>HighAvailability</strong>: high-availability series.</li>
     * <li><strong>cluster</strong>: Cluster Edition.</li>
     * <li><strong>Finance</strong>: RDS Enterprise Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HighAvailability</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the ID.</p>
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
     * <p>The instance storage type. Valid values:</p>
     * <ul>
     * <li><strong>local_ssd</strong>: Premium Local SSDs.</li>
     * <li><strong>general_essd</strong>: premium performance disk.</li>
     * <li><strong>cloud_ssd</strong>: standard SSDs.</li>
     * <li><strong>cloud_essd</strong>: PL1 ESSDs.</li>
     * <li><strong>cloud_essd2</strong>: PL2 ESSDs.</li>
     * <li><strong>cloud_essd3</strong>: PL3 ESSDs.</li>
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
