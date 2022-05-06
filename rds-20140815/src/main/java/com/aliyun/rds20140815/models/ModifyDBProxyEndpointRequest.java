// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyEndpointRequest extends TeaModel {
    @NameInMap("ConfigDBProxyFeatures")
    public String configDBProxyFeatures;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBProxyEndpointId")
    public String DBProxyEndpointId;

    @NameInMap("DbEndpointAliases")
    public String dbEndpointAliases;

    @NameInMap("DbEndpointOperator")
    public String dbEndpointOperator;

    @NameInMap("DbEndpointReadWriteMode")
    public String dbEndpointReadWriteMode;

    @NameInMap("DbEndpointType")
    public String dbEndpointType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ReadOnlyInstanceDistributionType")
    public String readOnlyInstanceDistributionType;

    @NameInMap("ReadOnlyInstanceMaxDelayTime")
    public String readOnlyInstanceMaxDelayTime;

    @NameInMap("ReadOnlyInstanceWeight")
    public String readOnlyInstanceWeight;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBProxyEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyEndpointRequest self = new ModifyDBProxyEndpointRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyEndpointRequest setConfigDBProxyFeatures(String configDBProxyFeatures) {
        this.configDBProxyFeatures = configDBProxyFeatures;
        return this;
    }
    public String getConfigDBProxyFeatures() {
        return this.configDBProxyFeatures;
    }

    public ModifyDBProxyEndpointRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBProxyEndpointRequest setDBProxyEndpointId(String DBProxyEndpointId) {
        this.DBProxyEndpointId = DBProxyEndpointId;
        return this;
    }
    public String getDBProxyEndpointId() {
        return this.DBProxyEndpointId;
    }

    public ModifyDBProxyEndpointRequest setDbEndpointAliases(String dbEndpointAliases) {
        this.dbEndpointAliases = dbEndpointAliases;
        return this;
    }
    public String getDbEndpointAliases() {
        return this.dbEndpointAliases;
    }

    public ModifyDBProxyEndpointRequest setDbEndpointOperator(String dbEndpointOperator) {
        this.dbEndpointOperator = dbEndpointOperator;
        return this;
    }
    public String getDbEndpointOperator() {
        return this.dbEndpointOperator;
    }

    public ModifyDBProxyEndpointRequest setDbEndpointReadWriteMode(String dbEndpointReadWriteMode) {
        this.dbEndpointReadWriteMode = dbEndpointReadWriteMode;
        return this;
    }
    public String getDbEndpointReadWriteMode() {
        return this.dbEndpointReadWriteMode;
    }

    public ModifyDBProxyEndpointRequest setDbEndpointType(String dbEndpointType) {
        this.dbEndpointType = dbEndpointType;
        return this;
    }
    public String getDbEndpointType() {
        return this.dbEndpointType;
    }

    public ModifyDBProxyEndpointRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBProxyEndpointRequest setReadOnlyInstanceDistributionType(String readOnlyInstanceDistributionType) {
        this.readOnlyInstanceDistributionType = readOnlyInstanceDistributionType;
        return this;
    }
    public String getReadOnlyInstanceDistributionType() {
        return this.readOnlyInstanceDistributionType;
    }

    public ModifyDBProxyEndpointRequest setReadOnlyInstanceMaxDelayTime(String readOnlyInstanceMaxDelayTime) {
        this.readOnlyInstanceMaxDelayTime = readOnlyInstanceMaxDelayTime;
        return this;
    }
    public String getReadOnlyInstanceMaxDelayTime() {
        return this.readOnlyInstanceMaxDelayTime;
    }

    public ModifyDBProxyEndpointRequest setReadOnlyInstanceWeight(String readOnlyInstanceWeight) {
        this.readOnlyInstanceWeight = readOnlyInstanceWeight;
        return this;
    }
    public String getReadOnlyInstanceWeight() {
        return this.readOnlyInstanceWeight;
    }

    public ModifyDBProxyEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDBProxyEndpointRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBProxyEndpointRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
