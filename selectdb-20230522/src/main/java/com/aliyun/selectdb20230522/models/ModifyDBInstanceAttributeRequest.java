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
     * <p>The attribute to modify. Valid values:</p>
     * <ul>
     * <li><p><strong>MaintainTime</strong>: modifies the O&amp;M time. The format is hh:mm-hh:mm.</p>
     * </li>
     * <li><p><strong>DBInstanceDescription</strong>: modifies the instance description.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DBInstanceDescription</p>
     */
    @NameInMap("InstanceAttributeType")
    public String instanceAttributeType;

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
     * <p>The new value of the attribute. Valid values:</p>
     * <ul>
     * <li><p>If InstanceAttributeType is set to MaintainTime, set this parameter to a time range such as 00:00-06:00.</p>
     * </li>
     * <li><p>If InstanceAttributeType is set to DBInstanceDescription, set this parameter to a description such as testdb.</p>
     * </li>
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
