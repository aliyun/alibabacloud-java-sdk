// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyBEClusterAttributeRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("InstanceAttributeType")
    public String instanceAttributeType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Value")
    public String value;

    public static ModifyBEClusterAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBEClusterAttributeRequest self = new ModifyBEClusterAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBEClusterAttributeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyBEClusterAttributeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyBEClusterAttributeRequest setInstanceAttributeType(String instanceAttributeType) {
        this.instanceAttributeType = instanceAttributeType;
        return this;
    }
    public String getInstanceAttributeType() {
        return this.instanceAttributeType;
    }

    public ModifyBEClusterAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyBEClusterAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyBEClusterAttributeRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
