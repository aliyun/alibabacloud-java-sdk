// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceAttributeRequest extends TeaModel {
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
     * <p>The instance parameter to be modified. Valid values:</p>
     * <ul>
     * <li><strong>MaintainTime</strong>: Modify the maintenance window of the instance in the hh:mm-hh:mm format.</li>
     * <li><strong>DBInstanceDescription</strong>: Modify the description of the instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DBInstanceDescription</p>
     */
    @NameInMap("InstanceAttributeType")
    public String instanceAttributeType;

    /**
     * <p>The region ID of the instance.</p>
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
     * <p>The new value of the instance parameter to be modified. Examples:</p>
     * <ul>
     * <li>If InstanceAttributeType is set to MaintainTime, you can set Value to 00:00-06:00.</li>
     * <li>If InstanceAttributeType is set to DBInstanceDescription, you can set Value to testdb.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb01</p>
     */
    @NameInMap("Value")
    public String value;

    public static ModifyDBInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceAttributeRequest self = new ModifyDBInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceAttributeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceAttributeRequest setInstanceAttributeType(String instanceAttributeType) {
        this.instanceAttributeType = instanceAttributeType;
        return this;
    }
    public String getInstanceAttributeType() {
        return this.instanceAttributeType;
    }

    public ModifyDBInstanceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBInstanceAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBInstanceAttributeRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
