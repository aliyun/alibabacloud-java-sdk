// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateDBInstanceShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal. Default value: true. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enables auto-renewal.</li>
     * <li><strong>false</strong>: Disables auto-renewal.</li>
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
    public Integer CNNodeCount;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You must specify a unique token for each request.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx-xxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The specifications of compute nodes. Required when you create an Enterprise Edition instance. Not required for a Standard Edition instance.</p>
     * <p>Local node specifications for Enterprise Edition:</p>
     * <ul>
     * <li><strong>polarx.x4.medium.2e</strong>: 2 vCPUs, 8 GB (general-purpose)</li>
     * <li><strong>polarx.x4.large.2e</strong>: 4 vCPUs, 16 GB (general-purpose)</li>
     * <li><strong>polarx.x4.xlarge.2e</strong>: 8 vCPUs, 32 GB (general-purpose)</li>
     * <li><strong>polarx.x4.2xlarge.2e</strong>: 16 vCPUs, 64 GB (general-purpose)</li>
     * <li><strong>polarx.x8.large.2e</strong>: 4 vCPUs, 32 GB (dedicated)</li>
     * <li><strong>polarx.x2.large.2x</strong>: 8 vCPUs, 16 GB (dedicated)</li>
     * <li><strong>polarx.x4.xlarge.2x</strong>: 8 vCPUs, 32 GB (dedicated)</li>
     * <li><strong>polarx.x8.xlarge.2e</strong>: 8 vCPUs, 64 GB (dedicated)</li>
     * <li><strong>polarx.x8.2xlarge.2e</strong>: 16 vCPUs, 128 GB (dedicated)</li>
     * <li><strong>polarx.x4.4xlarge.2e</strong>: 32 vCPUs, 128 GB (dedicated)</li>
     * <li><strong>polarx.x8.4xlarge.2e</strong>: 32 vCPUs, 256 GB (dedicated)</li>
     * <li><strong>polarx.st.8xlarge.2e</strong>: 60 vCPUs, 470 GB (dedicated)</li>
     * <li><strong>polarx.st.12xlarge.2e</strong>: 90 vCPUs, 720 GB (dedicated)</li>
     * </ul>
     * <p>Cloud node specifications for Enterprise Edition:</p>
     * <ul>
     * <li><strong>polarx.x4.medium.c2e</strong>: 2 vCPUs, 8 GB (general-purpose)</li>
     * <li><strong>polarx.x4.large.c2e</strong>: 4 vCPUs, 16 GB (general-purpose)</li>
     * <li><strong>polarx.x4.xlarge.c2e</strong>: 8 vCPUs, 32 GB (general-purpose)</li>
     * <li><strong>polarx.x4.2xlarge.c2e</strong>: 16 vCPUs, 64 GB (general-purpose)</li>
     * <li><strong>polarx.x8.large.c2e</strong>: 4 vCPUs, 32 GB (dedicated)</li>
     * <li><strong>polarx.x2.large.c2x</strong>: 8 vCPUs, 16 GB (dedicated)</li>
     * <li><strong>polarx.x4.xlarge.c2x</strong>: 8 vCPUs, 32 GB (dedicated)</li>
     * <li><strong>polarx.x8.xlarge.c2e</strong>: 8 vCPUs, 64 GB (dedicated)</li>
     * <li><strong>polarx.x8.2xlarge.c2e</strong>: 16 vCPUs, 128 GB (dedicated)</li>
     * <li><strong>polarx.x4.4xlarge.c2e</strong>: 32 vCPUs, 128 GB (dedicated)</li>
     * <li><strong>polarx.x8.4xlarge.c2e</strong>: 32 vCPUs, 256 GB (dedicated)</li>
     * <li><strong>polarx.st.8xlarge.c2e</strong>: 60 vCPUs, 470 GB (dedicated)</li>
     * <li><strong>polarx.st.12xlarge.c2e</strong>: 90 vCPUs, 720 GB (dedicated)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>polarx.x4.medium.2e</p>
     */
    @NameInMap("CnClass")
    public String cnClass;

    /**
     * <p>Required when you create a Standard Edition instance. Not required for an Enterprise Edition instance.</p>
     * <p>Local disk specifications for Standard Edition:</p>
     * <ul>
     * <li><strong>mysql.n8.small.25</strong>: 1 vCPU, 8 GB (general-purpose)</li>
     * <li><strong>mysql.n2.medium.25</strong>: 2 vCPUs, 4 GB (general-purpose)</li>
     * <li><strong>mysql.n4.medium.25</strong>: 2 vCPUs, 8 GB (general-purpose)</li>
     * <li><strong>mysql.n8.medium.25</strong>: 2 vCPUs, 16 GB (general-purpose)</li>
     * <li><strong>mysql.n2.large.25</strong>: 4 vCPUs, 8 GB (general-purpose)</li>
     * <li><strong>mysql.n4.large.25</strong>: 4 vCPUs, 16 GB (general-purpose)</li>
     * <li><strong>mysql.n8.large.25</strong>: 4 vCPUs, 32 GB (general-purpose)</li>
     * <li><strong>mysql.n2.xlarge.25</strong>: 8 vCPUs, 16 GB (general-purpose)</li>
     * <li><strong>mysql.n4.xlarge.25</strong>: 8 vCPUs, 32 GB (general-purpose)</li>
     * <li><strong>mysql.n8.xlarge.25</strong>: 8 vCPUs, 64 GB (general-purpose)</li>
     * <li><strong>mysql.n2.2xlarge.25</strong>: 16 vCPUs, 32 GB (general-purpose)</li>
     * <li><strong>mysql.n4.2xlarge.25</strong>: 16 vCPUs, 64 GB (general-purpose)</li>
     * <li><strong>mysql.n8.2xlarge.25</strong>: 16 vCPUs, 128 GB (general-purpose)</li>
     * <li><strong>mysql.x2.medium.25</strong>: 2 vCPUs, 4 GB (dedicated)</li>
     * <li><strong>mysql.x4.medium.25</strong>: 2 vCPUs, 8 GB (dedicated)</li>
     * <li><strong>mysql.x8.medium.25</strong>: 2 vCPUs, 16 GB (dedicated)</li>
     * <li><strong>mysql.x2.large.25</strong>: 4 vCPUs, 8 GB (dedicated)</li>
     * <li><strong>mysql.x4.large.25</strong>: 4 vCPUs, 16 GB (dedicated)</li>
     * <li><strong>mysql.x8.large.25</strong>: 4 vCPUs, 32 GB (dedicated)</li>
     * <li><strong>mysql.x2.xlarge.25</strong>: 8 vCPUs, 16 GB (dedicated)</li>
     * <li><strong>mysql.x4.xlarge.25</strong>: 8 vCPUs, 32 GB (dedicated)</li>
     * <li><strong>mysql.x8.xlarge.25</strong>: 8 vCPUs, 64 GB (dedicated)</li>
     * <li><strong>mysql.x2.2xlarge.25</strong>: 16 vCPUs, 32 GB (dedicated)</li>
     * <li><strong>mysql.x4.2xlarge.25</strong>: 16 vCPUs, 64 GB (dedicated)</li>
     * <li><strong>mysql.x8.2xlarge.25</strong>: 16 vCPUs, 128 GB (dedicated)</li>
     * <li><strong>mysql.x4.4xlarge.25</strong>: 32 vCPUs, 128 GB (dedicated)</li>
     * <li><strong>mysql.x8.4xlarge.25</strong>: 32 vCPUs, 256 GB (dedicated)</li>
     * <li><strong>mysql.x4.8xlarge.25</strong>: 64 vCPUs, 256 GB (dedicated)</li>
     * <li><strong>mysql.x8.8xlarge.25</strong>: 64 vCPUs, 512 GB (dedicated)</li>
     * <li><strong>mysql.st.12xlarge.25</strong>: 90 vCPUs, 720 GB (dedicated)</li>
     * </ul>
     * <p>Cloud disk specifications for Standard Edition:</p>
     * <ul>
     * <li><strong>polarx.mysql.n2.medium.c25</strong>: 2 vCPUs, 4 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.n4.medium.c25</strong>: 2 vCPUs, 8 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.n8.medium.c25</strong>: 2 vCPUs, 16 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.n2.large.c25</strong>: 4 vCPUs, 8 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.n4.large.c25</strong>: 4 vCPUs, 16 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.n8.large.c25</strong>: 4 vCPUs, 32 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.n2.xlarge.c25</strong>: 8 vCPUs, 16 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.n4.xlarge.c25</strong>: 8 vCPUs, 32 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.n8.xlarge.c25</strong>: 8 vCPUs, 64 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.x2.medium.c25</strong>: 2 vCPUs, 4 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x4.medium.c25</strong>: 2 vCPUs, 8 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x8.medium.c25</strong>: 2 vCPUs, 16 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x2.large.c25</strong>: 4 vCPUs, 8 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x4.large.c25</strong>: 4 vCPUs, 16 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x8.large.c25</strong>: 4 vCPUs, 32 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x2.xlarge.c25</strong>: 8 vCPUs, 16 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x4.xlarge.c25</strong>: 8 vCPUs, 32 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x8.xlarge.c25</strong>: 8 vCPUs, 64 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x2.2xlarge.c25</strong>: 16 vCPUs, 32 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x4.2xlarge.c25</strong>: 16 vCPUs, 64 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x8.2xlarge.c25</strong>: 16 vCPUs, 128 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x2.4xlarge.c25</strong>: 32 vCPUs, 64 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x4.4xlarge.c25</strong>: 32 vCPUs, 128 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x8.4xlarge.c25</strong>: 32 vCPUs, 256 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x2.8xlarge.c25</strong>: 64 vCPUs, 128 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x4.8xlarge.c25</strong>: 64 vCPUs, 256 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x8.8xlarge.c25</strong>: 64 vCPUs, 512 GB (dedicated)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>polarx.x4.2xlarge.2d</p>
     */
    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    /**
     * <p>The number of nodes in the instance. Valid values:</p>
     * <ul>
     * <li>Standard Edition: 1</li>
     * <li>Enterprise Edition: 2 or greater</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DBNodeCount")
    public Integer DBNodeCount;

    /**
     * <p>The number of storage nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("DNNodeCount")
    public Integer DNNodeCount;

    /**
     * <p>The description of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>ods_api_apidata_mobilegame_pay_api_di</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The specifications of storage nodes. Required when you create an Enterprise Edition instance. Not required for a Standard Edition instance.</p>
     * <p>Local node specifications for Enterprise Edition:</p>
     * <ul>
     * <li><strong>mysql.n2.medium.25</strong>: 2 vCPUs, 4 GB (general-purpose)</li>
     * <li><strong>mysql.n4.medium.25</strong>: 2 vCPUs, 8 GB (general-purpose)</li>
     * <li><strong>mysql.n2.large.25</strong>: 4 vCPUs, 8 GB (general-purpose)</li>
     * <li><strong>mysql.n4.large.25</strong>: 4 vCPUs, 16 GB (general-purpose)</li>
     * <li><strong>mysql.n4.xlarge.25</strong>: 8 vCPUs, 32 GB (general-purpose)</li>
     * <li><strong>mysql.n4.2xlarge.25</strong>: 16 vCPUs, 64 GB (general-purpose)</li>
     * <li><strong>mysql.x4.large.25</strong>: 4 vCPUs, 16 GB (dedicated)</li>
     * <li><strong>mysql.x8.large.25</strong>: 4 vCPUs, 32 GB (dedicated)</li>
     * <li><strong>mysql.x2.xlarge.25</strong>: 8 vCPUs, 16 GB (dedicated)</li>
     * <li><strong>mysql.x8.xlarge.25</strong>: 8 vCPUs, 64 GB (dedicated)</li>
     * <li><strong>mysql.x8.2xlarge.25</strong>: 16 vCPUs, 128 GB (dedicated)</li>
     * <li><strong>mysql.x4.4xlarge.25</strong>: 32 vCPUs, 128 GB (dedicated)</li>
     * <li><strong>mysql.x8.4xlarge.25</strong>: 32 vCPUs, 256 GB (dedicated)</li>
     * <li><strong>mysql.st.8xlarge.25</strong>: 60 vCPUs, 470 GB (dedicated)</li>
     * <li><strong>mysql.st.12xlarge.25</strong>: 90 vCPUs, 720 GB (dedicated)</li>
     * <li><strong>mysql.x8.45xlarge.25</strong>: 180 vCPUs, 1440 GB (dedicated)</li>
     * <li><strong>mysql.x8.60xlarge.25</strong>: 240 vCPUs, 1920 GB (dedicated)</li>
     * </ul>
     * <p>Cloud node specifications for Enterprise Edition:</p>
     * <ul>
     * <li><strong>polarx.mysql.n2.medium.c25</strong>: 2 vCPUs, 4 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.n4.medium.c25</strong>: 2 vCPUs, 8 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.n2.large.c25</strong>: 4 vCPUs, 8 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.n4.large.c25</strong>: 4 vCPUs, 16 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.n4.xlarge.c25</strong>: 8 vCPUs, 32 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.n4.2xlarge.c25</strong>: 16 vCPUs, 64 GB (general-purpose)</li>
     * <li><strong>polarx.mysql.x4.large.c25</strong>: 4 vCPUs, 16 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x8.large.c25</strong>: 4 vCPUs, 32 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x2.xlarge.c25</strong>: 8 vCPUs, 16 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x8.xlarge.c25</strong>: 8 vCPUs, 64 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x8.2xlarge.c25</strong>: 16 vCPUs, 128 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x4.4xlarge.c25</strong>: 32 vCPUs, 128 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x8.4xlarge.c25</strong>: 32 vCPUs, 256 GB (dedicated)</li>
     * <li><strong>polarx.mysql.st.8xlarge.c25</strong>: 60 vCPUs, 470 GB (dedicated)</li>
     * <li><strong>polarx.mysql.st.12xlarge.c25</strong>: 90 vCPUs, 720 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x8.45xlarge.c25</strong>: 180 vCPUs, 1440 GB (dedicated)</li>
     * <li><strong>polarx.mysql.x8.60xlarge.c25</strong>: 240 vCPUs, 1920 GB (dedicated)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mysql.n4.medium.25</p>
     */
    @NameInMap("DnClass")
    public String dnClass;

    /**
     * <p>The disk space of the storage nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>1500</p>
     */
    @NameInMap("DnStorageSpace")
    public String dnStorageSpace;

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
     * <p>The extra parameters.</p>
     */
    @NameInMap("ExtraParams")
    public String extraParamsShrink;

    /**
     * <p>Specifies whether the instance to be created is a column store read-only instance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsColumnarReadDBInstance")
    public Boolean isColumnarReadDBInstance;

    /**
     * <p>Specifies whether the instance is a read-only instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsReadDBInstance")
    public Boolean isReadDBInstance;

    /**
     * <p>The network type of the instance. Only VPC is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The minor engine version. This parameter is generally not required.</p>
     * 
     * <strong>example:</strong>
     * <p>polardb-2.4.0_standard_xcluster8.4.20-20260331</p>
     */
    @NameInMap("OriginMinorVersion")
    public String originMinorVersion;

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
     * <p>The billing cycle. Valid values for subscription instances: Year and Month. Default value for pay-as-you-go instances: Hour.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The name of the primary instance. This parameter is required if the instance is a read-only instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-*********</p>
     */
    @NameInMap("PrimaryDBInstanceName")
    public String primaryDBInstanceName;

    /**
     * <p>The primary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen-e</p>
     */
    @NameInMap("PrimaryZone")
    public String primaryZone;

    /**
     * <p>The region of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. This parameter is not supported and can be left empty.</p>
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
     * <li>enterprise: Enterprise Edition</li>
     * <li>standard: Standard Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enterprise</p>
     */
    @NameInMap("Series")
    public String series;

    /**
     * <p>The storage type. Valid values:</p>
     * <ul>
     * <li>custom_local_ssd: local disk</li>
     * <li>cloud_auto: cloud disk</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_auto</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The third active zone in a Three-zone deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen-e</p>
     */
    @NameInMap("TertiaryZone")
    public String tertiaryZone;

    /**
     * <p>The topology type. Valid values:</p>
     * <ul>
     * <li><strong>3azones</strong>: Three-zone deployment (three active zones).</li>
     * <li><strong>1azone</strong>: Single active zone.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3azones</p>
     */
    @NameInMap("TopologyType")
    public String topologyType;

    /**
     * <p>The subscription duration. This parameter is required when the billing method is set to subscription.</p>
     * <blockquote>
     * <p>If Period is set to Year, valid values are 1, 2, and 3.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    /**
     * <p>The VPC ID.</p>
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

    /**
     * <p>The zone of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-a</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateDBInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceShrinkRequest self = new CreateDBInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceShrinkRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateDBInstanceShrinkRequest setCNNodeCount(Integer CNNodeCount) {
        this.CNNodeCount = CNNodeCount;
        return this;
    }
    public Integer getCNNodeCount() {
        return this.CNNodeCount;
    }

    public CreateDBInstanceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDBInstanceShrinkRequest setCnClass(String cnClass) {
        this.cnClass = cnClass;
        return this;
    }
    public String getCnClass() {
        return this.cnClass;
    }

    public CreateDBInstanceShrinkRequest setDBNodeClass(String DBNodeClass) {
        this.DBNodeClass = DBNodeClass;
        return this;
    }
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    public CreateDBInstanceShrinkRequest setDBNodeCount(Integer DBNodeCount) {
        this.DBNodeCount = DBNodeCount;
        return this;
    }
    public Integer getDBNodeCount() {
        return this.DBNodeCount;
    }

    public CreateDBInstanceShrinkRequest setDNNodeCount(Integer DNNodeCount) {
        this.DNNodeCount = DNNodeCount;
        return this;
    }
    public Integer getDNNodeCount() {
        return this.DNNodeCount;
    }

    public CreateDBInstanceShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDBInstanceShrinkRequest setDnClass(String dnClass) {
        this.dnClass = dnClass;
        return this;
    }
    public String getDnClass() {
        return this.dnClass;
    }

    public CreateDBInstanceShrinkRequest setDnStorageSpace(String dnStorageSpace) {
        this.dnStorageSpace = dnStorageSpace;
        return this;
    }
    public String getDnStorageSpace() {
        return this.dnStorageSpace;
    }

    public CreateDBInstanceShrinkRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateDBInstanceShrinkRequest setExtraParamsShrink(String extraParamsShrink) {
        this.extraParamsShrink = extraParamsShrink;
        return this;
    }
    public String getExtraParamsShrink() {
        return this.extraParamsShrink;
    }

    public CreateDBInstanceShrinkRequest setIsColumnarReadDBInstance(Boolean isColumnarReadDBInstance) {
        this.isColumnarReadDBInstance = isColumnarReadDBInstance;
        return this;
    }
    public Boolean getIsColumnarReadDBInstance() {
        return this.isColumnarReadDBInstance;
    }

    public CreateDBInstanceShrinkRequest setIsReadDBInstance(Boolean isReadDBInstance) {
        this.isReadDBInstance = isReadDBInstance;
        return this;
    }
    public Boolean getIsReadDBInstance() {
        return this.isReadDBInstance;
    }

    public CreateDBInstanceShrinkRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateDBInstanceShrinkRequest setOriginMinorVersion(String originMinorVersion) {
        this.originMinorVersion = originMinorVersion;
        return this;
    }
    public String getOriginMinorVersion() {
        return this.originMinorVersion;
    }

    public CreateDBInstanceShrinkRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateDBInstanceShrinkRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateDBInstanceShrinkRequest setPrimaryDBInstanceName(String primaryDBInstanceName) {
        this.primaryDBInstanceName = primaryDBInstanceName;
        return this;
    }
    public String getPrimaryDBInstanceName() {
        return this.primaryDBInstanceName;
    }

    public CreateDBInstanceShrinkRequest setPrimaryZone(String primaryZone) {
        this.primaryZone = primaryZone;
        return this;
    }
    public String getPrimaryZone() {
        return this.primaryZone;
    }

    public CreateDBInstanceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDBInstanceShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateDBInstanceShrinkRequest setSecondaryZone(String secondaryZone) {
        this.secondaryZone = secondaryZone;
        return this;
    }
    public String getSecondaryZone() {
        return this.secondaryZone;
    }

    public CreateDBInstanceShrinkRequest setSeries(String series) {
        this.series = series;
        return this;
    }
    public String getSeries() {
        return this.series;
    }

    public CreateDBInstanceShrinkRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateDBInstanceShrinkRequest setTertiaryZone(String tertiaryZone) {
        this.tertiaryZone = tertiaryZone;
        return this;
    }
    public String getTertiaryZone() {
        return this.tertiaryZone;
    }

    public CreateDBInstanceShrinkRequest setTopologyType(String topologyType) {
        this.topologyType = topologyType;
        return this;
    }
    public String getTopologyType() {
        return this.topologyType;
    }

    public CreateDBInstanceShrinkRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public CreateDBInstanceShrinkRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateDBInstanceShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateDBInstanceShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
