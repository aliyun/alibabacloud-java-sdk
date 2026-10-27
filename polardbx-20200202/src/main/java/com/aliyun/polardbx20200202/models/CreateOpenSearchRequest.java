// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateOpenSearchRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal. Default value: true. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables auto-renewal</li>
     * <li><strong>false</strong>: disables auto-renewal</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The idempotency token. Make sure that the value is unique for each creation request.</p>
     * 
     * <strong>example:</strong>
     * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Test instance</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The code for the node specifications of the PolarDBX Search data node. The active node specifications vary by region and sales configuration. Use a PolarDBX Search node specifications code that is available for purchase in the current region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>opensearch.sn2ne.large.1</p>
     */
    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    /**
     * <p>The database engine version of PolarDBX Search. The current fixed DPI engine version is 3.0. If this parameter is not specified, 3.0 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>3.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>A compatible parameter. This parameter does not take effect. Specify the node specifications of the PolarDBX Search data node by using DBNodeClass.</p>
     * 
     * <strong>example:</strong>
     * <p>opensearch.sn2ne.large.1</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p>The number of PolarDBX Search data nodes. The value must be a positive integer and an integer multiple of the number of selected zones.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("NodeCount")
    public Integer nodeCount;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>PREPAY</strong>: subscription</li>
     * <li><strong>POSTPAY</strong>: pay-as-you-go</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing cycle. For subscription instances, only Year and Month are supported. For pay-as-you-go instances, the default value is Hour.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. This parameter can be left empty and is not currently supported.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-xxxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The storage space per node, in GB. The value must be a positive integer.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("StorageSpace")
    public Integer storageSpace;

    /**
     * <p>The storage type. Default value: cloud_auto.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_auto</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The active topology type. Valid values:</p>
     * <ul>
     * <li><strong>1azone</strong>: single-zone.</li>
     * <li><strong>3azones</strong>: Three-zone deployment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3azones</p>
     */
    @NameInMap("TopologyType")
    public String topologyType;

    /**
     * <p>The subscription duration. You can specify a duration in months or years for subscription instances.</p>
     * <blockquote>
     * <p>When Period is set to Year, valid values for this parameter are 1, 2, and 3.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    /**
     * <p>The VPC ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-*****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-*********</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The secondary zone. This parameter is required when TopologyType is set to 3azones, and the value must be different from other zones.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("Zone2")
    public String zone2;

    /**
     * <p>The third zone for Three-zone deployment. This parameter is required when TopologyType is set to 3azones, and the value must be different from other active zones.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("Zone3")
    public String zone3;

    /**
     * <p>The zone of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateOpenSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOpenSearchRequest self = new CreateOpenSearchRequest();
        return TeaModel.build(map, self);
    }

    public CreateOpenSearchRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateOpenSearchRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateOpenSearchRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateOpenSearchRequest setDBNodeClass(String DBNodeClass) {
        this.DBNodeClass = DBNodeClass;
        return this;
    }
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    public CreateOpenSearchRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateOpenSearchRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public CreateOpenSearchRequest setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    public CreateOpenSearchRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateOpenSearchRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateOpenSearchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateOpenSearchRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateOpenSearchRequest setStorageSpace(Integer storageSpace) {
        this.storageSpace = storageSpace;
        return this;
    }
    public Integer getStorageSpace() {
        return this.storageSpace;
    }

    public CreateOpenSearchRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateOpenSearchRequest setTopologyType(String topologyType) {
        this.topologyType = topologyType;
        return this;
    }
    public String getTopologyType() {
        return this.topologyType;
    }

    public CreateOpenSearchRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public CreateOpenSearchRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateOpenSearchRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateOpenSearchRequest setZone2(String zone2) {
        this.zone2 = zone2;
        return this;
    }
    public String getZone2() {
        return this.zone2;
    }

    public CreateOpenSearchRequest setZone3(String zone3) {
        this.zone3 = zone3;
        return this;
    }
    public String getZone3() {
        return this.zone3;
    }

    public CreateOpenSearchRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
