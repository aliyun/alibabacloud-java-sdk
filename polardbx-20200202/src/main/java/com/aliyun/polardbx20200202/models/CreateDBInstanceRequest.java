// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("CNNodeCount")
    public String CNNodeCount;

    /**
     * <strong>example:</strong>
     * <p>xxxxxx-xxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CnClass")
    public String cnClass;

    /**
     * <strong>example:</strong>
     * <p>polarx.x4.2xlarge.2d</p>
     */
    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DBNodeCount")
    public Integer DBNodeCount;

    @NameInMap("DNNodeCount")
    public String DNNodeCount;

    @NameInMap("DnClass")
    public String dnClass;

    @NameInMap("DnStorageSpace")
    public String dnStorageSpace;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("IsColumnarReadDBInstance")
    public Boolean isColumnarReadDBInstance;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsReadDBInstance")
    public Boolean isReadDBInstance;

    /**
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <strong>example:</strong>
     * <p>pxc-*********</p>
     */
    @NameInMap("PrimaryDBInstanceName")
    public String primaryDBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen-e</p>
     */
    @NameInMap("PrimaryZone")
    public String primaryZone;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen-a</p>
     */
    @NameInMap("SecondaryZone")
    public String secondaryZone;

    @NameInMap("Series")
    public String series;

    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen-e</p>
     */
    @NameInMap("TertiaryZone")
    public String tertiaryZone;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3azones</p>
     */
    @NameInMap("TopologyType")
    public String topologyType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    /**
     * <p>VPC ID。</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-*****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <strong>example:</strong>
     * <p>vsw-*********</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou-a</p>
     */
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

    public CreateDBInstanceRequest setCNNodeCount(String CNNodeCount) {
        this.CNNodeCount = CNNodeCount;
        return this;
    }
    public String getCNNodeCount() {
        return this.CNNodeCount;
    }

    public CreateDBInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceRequest setCnClass(String cnClass) {
        this.cnClass = cnClass;
        return this;
    }
    public String getCnClass() {
        return this.cnClass;
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

    public CreateDBInstanceRequest setDNNodeCount(String DNNodeCount) {
        this.DNNodeCount = DNNodeCount;
        return this;
    }
    public String getDNNodeCount() {
        return this.DNNodeCount;
    }

    public CreateDBInstanceRequest setDnClass(String dnClass) {
        this.dnClass = dnClass;
        return this;
    }
    public String getDnClass() {
        return this.dnClass;
    }

    public CreateDBInstanceRequest setDnStorageSpace(String dnStorageSpace) {
        this.dnStorageSpace = dnStorageSpace;
        return this;
    }
    public String getDnStorageSpace() {
        return this.dnStorageSpace;
    }

    public CreateDBInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateDBInstanceRequest setIsColumnarReadDBInstance(Boolean isColumnarReadDBInstance) {
        this.isColumnarReadDBInstance = isColumnarReadDBInstance;
        return this;
    }
    public Boolean getIsColumnarReadDBInstance() {
        return this.isColumnarReadDBInstance;
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

    public CreateDBInstanceRequest setSeries(String series) {
        this.series = series;
        return this;
    }
    public String getSeries() {
        return this.series;
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
