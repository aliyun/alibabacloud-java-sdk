// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateGdnStandbyMemberRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal. Default value: true.</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The number of compute nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CNNodeCount")
    public String CNNodeCount;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. Make sure that the value is different for each request.</p>
     * 
     * <strong>example:</strong>
     * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the source instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-***</p>
     */
    @NameInMap("CloneInstanceName")
    public String cloneInstanceName;

    /**
     * <p>The compute node specifications. This parameter is required for Enterprise Edition instances and is not required for Standard Edition instances.</p>
     * <p>Enterprise Edition with local disks:</p>
     * <ul>
     * <li><strong>polarx.x4.medium.2e</strong>: 2 cores, 8 GB (general-purpose)</li>
     * <li><strong>polarx.x4.large.2e</strong>: 4 cores, 16 GB (general-purpose)</li>
     * <li><strong>polarx.x4.xlarge.2e</strong>: 8 cores, 32 GB (general-purpose)</li>
     * <li><strong>polarx.x4.2xlarge.2e</strong>: 16 cores, 64 GB (general-purpose)</li>
     * <li><strong>polarx.x8.large.2e</strong>: 4 cores, 32 GB (dedicated)</li>
     * <li><strong>polarx.x2.large.2x</strong>: 8 cores, 16 GB (dedicated)</li>
     * <li><strong>polarx.x4.xlarge.2x</strong>: 8 cores, 32 GB (dedicated)</li>
     * <li><strong>polarx.x8.xlarge.2e</strong>: 8 cores, 64 GB (dedicated)</li>
     * <li><strong>polarx.x8.2xlarge.2e</strong>: 16 cores, 128 GB (dedicated)</li>
     * <li><strong>polarx.x4.4xlarge.2e</strong>: 32 cores, 128 GB (dedicated)</li>
     * <li><strong>polarx.x8.4xlarge.2e</strong>: 32 cores, 256 GB (dedicated)</li>
     * <li><strong>polarx.st.8xlarge.2e</strong>: 60 cores, 470 GB (dedicated)</li>
     * <li><strong>polarx.st.12xlarge.2e</strong>: 90 cores, 720 GB (dedicated)</li>
     * </ul>
     * <p>Enterprise Edition with cloud disks:</p>
     * <ul>
     * <li><strong>polarx.x4.medium.c2e</strong>: 2 cores, 8 GB (general-purpose)</li>
     * <li><strong>polarx.x4.large.c2e</strong>: 4 cores, 16 GB (general-purpose)</li>
     * <li><strong>polarx.x4.xlarge.c2e</strong>: 8 cores, 32 GB (general-purpose)</li>
     * <li><strong>polarx.x4.2xlarge.c2e</strong>: 16 cores, 64 GB (general-purpose)</li>
     * <li><strong>polarx.x8.large.c2e</strong>: 4 cores, 32 GB (dedicated)</li>
     * <li><strong>polarx.x2.large.c2x</strong>: 8 cores, 16 GB (dedicated)</li>
     * <li><strong>polarx.x4.xlarge.c2x</strong>: 8 cores, 32 GB (dedicated)</li>
     * <li><strong>polarx.x8.xlarge.c2e</strong>: 8 cores, 64 GB (dedicated)</li>
     * <li><strong>polarx.x8.2xlarge.c2e</strong>: 16 cores, 128 GB (dedicated)</li>
     * <li><strong>polarx.x4.4xlarge.c2e</strong>: 32 cores, 128 GB (dedicated)</li>
     * <li><strong>polarx.x8.4xlarge.c2e</strong>: 32 cores, 256 GB (dedicated)</li>
     * <li><strong>polarx.st.8xlarge.c2e</strong>: 60 cores, 470 GB (dedicated)</li>
     * <li><strong>polarx.st.12xlarge.c2e</strong>: 90 cores, 720 GB (dedicated)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4 cores, 32 GB</p>
     */
    @NameInMap("CnClass")
    public String cnClass;

    /**
     * <p>The number of storage nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DNNodeCount")
    public String DNNodeCount;

    /**
     * <p>The description of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>go-to-the-docks-for-french-fries</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The storage node specifications. This parameter is required for Enterprise Edition instances and is not required for Standard Edition instances.</p>
     * <p>Enterprise Edition with local disks:</p>
     * <ul>
     * <li><strong>mysql.n2.medium.25</strong>: 2 cores, 4 GB (general-purpose)</li>
     * <li><strong>mysql.n4.medium.25</strong>: 2 cores, 8 GB (general-purpose)</li>
     * <li><strong>mysql.n2.large.25</strong>: 4 cores, 8 GB (general-purpose)</li>
     * <li><strong>mysql.n4.large.25</strong>: 4 cores, 16 GB (general-purpose)</li>
     * <li><strong>mysql.n4.xlarge.25</strong>: 8 cores, 32 GB (general-purpose)</li>
     * <li><strong>mysql.n4.2xlarge.25</strong>: 16 cores, 64 GB (general-purpose)</li>
     * <li><strong>mysql.x4.large.25</strong>: 4 cores, 16 GB (dedicated)</li>
     * <li><strong>mysql.x8.large.25</strong>: 4 cores, 32 GB (dedicated)</li>
     * <li><strong>mysql.x2.xlarge.25</strong>: 8 cores, 16 GB (dedicated)</li>
     * <li><strong>mysql.x8.xlarge.25</strong>: 8 cores, 64 GB (dedicated)</li>
     * <li><strong>mysql.x8.2xlarge.25</strong>: 16 cores, 128 GB (dedicated)</li>
     * <li><strong>mysql.x4.4xlarge.25</strong>: 32 cores, 128 GB (dedicated)</li>
     * <li><strong>mysql.x8.4xlarge.25</strong>: 32 cores, 256 GB (dedicated)</li>
     * <li><strong>mysql.st.8xlarge.25</strong>: 60 cores, 470 GB (dedicated)</li>
     * <li><strong>mysql.st.12xlarge.25</strong>: 90 cores, 720 GB (dedicated)</li>
     * <li><strong>mysql.x8.45xlarge.25</strong>: 180 cores, 1440 GB (dedicated)</li>
     * <li><strong>mysql.x8.60xlarge.25</strong>: 240 cores, 1920 GB (dedicated)</li>
     * </ul>
     * <p>Enterprise Edition with cloud disks:</p>
     * <ul>
     * <li><strong>polarx.mysql.n2.medium.c25</strong>: 2 cores, 4 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.n4.medium.c25</strong>: 2 cores, 8 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.n2.large.c25</strong>: 4 cores, 8 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.n4.large.c25</strong>: 4 cores, 16 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.n4.xlarge.c25</strong>: 8 cores, 32 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.n4.2xlarge.c25</strong>: 16 cores, 64 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.x4.large.c25</strong>: 4 cores, 16 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x8.large.c25</strong>: 4 cores, 32 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x2.xlarge.c25</strong>: 8 cores, 16 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x8.xlarge.c25</strong>: 8 cores, 64 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x8.2xlarge.c25</strong>: 16 cores, 128 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x4.4xlarge.c25</strong>: 32 cores, 128 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x8.4xlarge.c25</strong>: 32 cores, 256 GB (dedicated)</li>
     * <li><strong>polarx.mysql.st.8xlarge.c25</strong>: 60 cores, 470 GB (dedicated)</li>
     * <li><strong>polarx.mysql.st.12xlarge.c25</strong>: 90 cores, 720 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x8.45xlarge.c25</strong>: 180 cores, 1440 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x8.60xlarge.c25</strong>: 240 cores, 1920 GB (dedicated)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4 cores, 32 GB</p>
     */
    @NameInMap("DnClass")
    public String dnClass;

    /**
     * <p>The MySQL DPI engine version. Valid values: 5.7 and 8.0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5.7</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The network type. Only VPC is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The billing method of the instance.</p>
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
     * <p>The unit of the subscription duration. Valid values:</p>
     * <ul>
     * <li>Year</li>
     * <li>Month</li>
     * </ul>
     * <p>For pay-as-you-go instances, the default value is Hour.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The primary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen-e</p>
     */
    @NameInMap("PrimaryZone")
    public String primaryZone;

    /**
     * <p>The region in which the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. This parameter can be left empty. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The secondary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen-a</p>
     */
    @NameInMap("SecondaryZone")
    public String secondaryZone;

    /**
     * <p>The edition of the instance. Valid values:</p>
     * <ul>
     * <li>enterprise: Enterprise Edition.</li>
     * <li>standard: Standard Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enterprise</p>
     */
    @NameInMap("Series")
    public String series;

    /**
     * <p>The region in which the source instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("SourceInstanceRegion")
    public String sourceInstanceRegion;

    /**
     * <p>The storage type.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_auto</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The zone for Three-zone deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen-e</p>
     */
    @NameInMap("TertiaryZone")
    public String tertiaryZone;

    /**
     * <p>The topology type. Valid values:</p>
     * <ul>
     * <li><strong>3azones</strong>: three-zone deployment.</li>
     * <li><strong>1azone</strong>: single-zone deployment.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3azones</p>
     */
    @NameInMap("TopologyType")
    public String topologyType;

    /**
     * <p>The subscription duration. Unit: months or years.</p>
     * <blockquote>
     * <p>If Period is set to Year, valid values of this parameter are 1, 2, and 3.</p>
     * </blockquote>
     * 
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
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-*********</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateGdnStandbyMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateGdnStandbyMemberRequest self = new CreateGdnStandbyMemberRequest();
        return TeaModel.build(map, self);
    }

    public CreateGdnStandbyMemberRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateGdnStandbyMemberRequest setCNNodeCount(String CNNodeCount) {
        this.CNNodeCount = CNNodeCount;
        return this;
    }
    public String getCNNodeCount() {
        return this.CNNodeCount;
    }

    public CreateGdnStandbyMemberRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateGdnStandbyMemberRequest setCloneInstanceName(String cloneInstanceName) {
        this.cloneInstanceName = cloneInstanceName;
        return this;
    }
    public String getCloneInstanceName() {
        return this.cloneInstanceName;
    }

    public CreateGdnStandbyMemberRequest setCnClass(String cnClass) {
        this.cnClass = cnClass;
        return this;
    }
    public String getCnClass() {
        return this.cnClass;
    }

    public CreateGdnStandbyMemberRequest setDNNodeCount(String DNNodeCount) {
        this.DNNodeCount = DNNodeCount;
        return this;
    }
    public String getDNNodeCount() {
        return this.DNNodeCount;
    }

    public CreateGdnStandbyMemberRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateGdnStandbyMemberRequest setDnClass(String dnClass) {
        this.dnClass = dnClass;
        return this;
    }
    public String getDnClass() {
        return this.dnClass;
    }

    public CreateGdnStandbyMemberRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateGdnStandbyMemberRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateGdnStandbyMemberRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateGdnStandbyMemberRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateGdnStandbyMemberRequest setPrimaryZone(String primaryZone) {
        this.primaryZone = primaryZone;
        return this;
    }
    public String getPrimaryZone() {
        return this.primaryZone;
    }

    public CreateGdnStandbyMemberRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateGdnStandbyMemberRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateGdnStandbyMemberRequest setSecondaryZone(String secondaryZone) {
        this.secondaryZone = secondaryZone;
        return this;
    }
    public String getSecondaryZone() {
        return this.secondaryZone;
    }

    public CreateGdnStandbyMemberRequest setSeries(String series) {
        this.series = series;
        return this;
    }
    public String getSeries() {
        return this.series;
    }

    public CreateGdnStandbyMemberRequest setSourceInstanceRegion(String sourceInstanceRegion) {
        this.sourceInstanceRegion = sourceInstanceRegion;
        return this;
    }
    public String getSourceInstanceRegion() {
        return this.sourceInstanceRegion;
    }

    public CreateGdnStandbyMemberRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateGdnStandbyMemberRequest setTertiaryZone(String tertiaryZone) {
        this.tertiaryZone = tertiaryZone;
        return this;
    }
    public String getTertiaryZone() {
        return this.tertiaryZone;
    }

    public CreateGdnStandbyMemberRequest setTopologyType(String topologyType) {
        this.topologyType = topologyType;
        return this;
    }
    public String getTopologyType() {
        return this.topologyType;
    }

    public CreateGdnStandbyMemberRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public CreateGdnStandbyMemberRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateGdnStandbyMemberRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
