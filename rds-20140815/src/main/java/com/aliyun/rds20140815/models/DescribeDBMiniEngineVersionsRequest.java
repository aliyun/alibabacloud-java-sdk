// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBMiniEngineVersionsRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("MinorVersionTag")
    public String minorVersionTag;

    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
