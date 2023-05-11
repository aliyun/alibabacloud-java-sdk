// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    @NameInMap("DBNodeCount")
    public Integer DBNodeCount;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("IsReadDBInstance")
    public Boolean isReadDBInstance;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("Period")
    public String period;

    @NameInMap("PrimaryDBInstanceName")
    public String primaryDBInstanceName;

    @NameInMap("PrimaryZone")
    public String primaryZone;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecondaryZone")
    public String secondaryZone;

    @NameInMap("TertiaryZone")
    public String tertiaryZone;

    @NameInMap("TopologyType")
    public String topologyType;

    @NameInMap("UsedTime")
    public Integer usedTime;

    /**
     * <p>VPC ID。</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceRequest self = new CreateDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateDBInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceRequest setDBNodeClass(String DBNodeClass) {
        this.DBNodeClass = DBNodeClass;
        return this;
    }
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    public CreateDBInstanceRequest setDBNodeCount(Integer DBNodeCount) {
        this.DBNodeCount = DBNodeCount;
        return this;
    }
    public Integer getDBNodeCount() {
        return this.DBNodeCount;
    }

    public CreateDBInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateDBInstanceRequest setIsReadDBInstance(Boolean isReadDBInstance) {
        this.isReadDBInstance = isReadDBInstance;
        return this;
    }
    public Boolean getIsReadDBInstance() {
        return this.isReadDBInstance;
    }

    public CreateDBInstanceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateDBInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDBInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDBInstanceRequest setPrimaryDBInstanceName(String primaryDBInstanceName) {
        this.primaryDBInstanceName = primaryDBInstanceName;
        return this;
    }
    public String getPrimaryDBInstanceName() {
        return this.primaryDBInstanceName;
    }

    public CreateDBInstanceRequest setPrimaryZone(String primaryZone) {
        this.primaryZone = primaryZone;
        return this;
    }
    public String getPrimaryZone() {
        return this.primaryZone;
    }

    public CreateDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBInstanceRequest setSecondaryZone(String secondaryZone) {
        this.secondaryZone = secondaryZone;
        return this;
    }
    public String getSecondaryZone() {
        return this.secondaryZone;
    }

    public CreateDBInstanceRequest setTertiaryZone(String tertiaryZone) {
        this.tertiaryZone = tertiaryZone;
        return this;
    }
    public String getTertiaryZone() {
        return this.tertiaryZone;
    }

    public CreateDBInstanceRequest setTopologyType(String topologyType) {
        this.topologyType = topologyType;
        return this;
    }
    public String getTopologyType() {
        return this.topologyType;
    }

    public CreateDBInstanceRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public CreateDBInstanceRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
