// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyBEClusterAttributeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-xxxb9f2w-be</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213cjv****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The cluster parameter to be modified.</p>
     * <ul>
     * <li>Valid values:****</li>
     * </ul>
     * <!---->
     * 
     * <ul>
     * <li>MaintainTime</li>
     * <li>DBInstanceDescription</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DBInstanceDescription</p>
     */
    @NameInMap("InstanceAttributeType")
    public String instanceAttributeType;

    /**
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
     * <p>The modfied cluster name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
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
