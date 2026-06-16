// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateDBInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal. Default value: true.</p>
     * <ul>
     * <li><strong>true</strong>: Enable</li>
     * <li><strong>false</strong>: Disable</li>
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
     * <p>The idempotency token. Ensure that a unique value is used for each creation request.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx-xxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The compute node specification. Required for creating Enterprise Edition instances. Not required for Standard Edition.</p>
     * <p>Enterprise Edition local disk:</p>
     * <ul>
     * <li><strong>polarx.x4.medium.2e</strong>:	2 Cores 8 GB (General Purpose)</li>
     * <li><strong>polarx.x4.large.2e</strong>:	4 Cores 16 GB (General Purpose)</li>
     * <li><strong>polarx.x4.xlarge.2e</strong>:	8 Cores 32 GB (General Purpose)</li>
     * <li><strong>polarx.x4.2xlarge.2e</strong>:	16 Cores 64 GB (General Purpose)</li>
     * <li><strong>polarx.x8.large.2e</strong>:	4 Cores 32 GB (Dedicated)</li>
     * <li><strong>polarx.x2.large.2x</strong>:	8 Cores 16 GB (Dedicated)</li>
     * <li><strong>polarx.x4.xlarge.2x</strong>:	8 Cores 32 GB (Dedicated)</li>
     * <li><strong>polarx.x8.xlarge.2e</strong>:	8 Cores 64 GB (Dedicated)</li>
     * <li><strong>polarx.x8.2xlarge.2e</strong>:	16 Cores 128 GB (Dedicated)</li>
     * <li><strong>polarx.x4.4xlarge.2e</strong>:	32 Cores 128 GB (Dedicated)</li>
     * <li><strong>polarx.x8.4xlarge.2e</strong>:	32 Cores 256 GB (Dedicated)</li>
     * <li><strong>polarx.st.8xlarge.2e</strong>:	60 Cores 470 GB (Dedicated)</li>
     * <li><strong>polarx.st.12xlarge.2e</strong>:	90 Cores 720 GB (Dedicated)</li>
     * </ul>
     * <p>Enterprise Edition cloud disk:</p>
     * <ul>
     * <li><strong>polarx.x4.medium.c2e</strong>:	2 Cores 8 GB (General Purpose)</li>
     * <li><strong>polarx.x4.large.c2e</strong>:	4 Cores 16 GB (General Purpose)</li>
     * <li><strong>polarx.x4.xlarge.c2e</strong>:	8 Cores 32 GB (General Purpose)</li>
     * <li><strong>polarx.x4.2xlarge.c2e</strong>:	16 Cores 64 GB (General Purpose)</li>
     * <li><strong>polarx.x8.large.c2e</strong>:	4 Cores 32 GB (Dedicated)</li>
     * <li><strong>polarx.x2.large.c2x</strong>:	8 Cores 16 GB (Dedicated)</li>
     * <li><strong>polarx.x4.xlarge.c2x</strong>:	8 Cores 32 GB (Dedicated)</li>
     * <li><strong>polarx.x8.xlarge.c2e</strong>:	8 Cores 64 GB (Dedicated)</li>
     * <li><strong>polarx.x8.2xlarge.c2e</strong>:	16 Cores 128 GB (Dedicated)</li>
     * <li><strong>polarx.x4.4xlarge.c2e</strong>:	32 Cores 128 GB (Dedicated)</li>
     * <li><strong>polarx.x8.4xlarge.c2e</strong>:	32 Cores 256 GB (Dedicated)</li>
     * <li><strong>polarx.st.8xlarge.c2e</strong>:	60 Cores 470 GB (Dedicated)</li>
     * <li><strong>polarx.st.12xlarge.c2e</strong>:	90 Cores 720 GB (Dedicated)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>polarx.x4.medium.2e</p>
     */
    @NameInMap("CnClass")
    public String cnClass;

    /**
     * <p>Required for creating Standard Edition instances. Not required for Enterprise Edition.</p>
     * <p>Standard Edition local disk specifications:</p>
     * <ul>
     * <li><strong>mysql.n8.small.25</strong>:	1 Core 8 GB (General Purpose)</li>
     * <li><strong>mysql.n2.medium.25</strong>:	2 Cores 4 GB (General Purpose)</li>
     * <li><strong>mysql.n4.medium.25</strong>:	2 Cores 8 GB (General Purpose)</li>
     * <li><strong>mysql.n8.medium.25</strong>:	2 Cores 16 GB (General Purpose)</li>
     * <li><strong>mysql.n2.large.25</strong>:	4 Cores 8 GB (General Purpose)</li>
     * <li><strong>mysql.n4.large.25</strong>:	4 Cores 16 GB (General Purpose)</li>
     * <li><strong>mysql.n8.large.25</strong>:	4 Cores 32 GB (General Purpose)</li>
     * <li><strong>mysql.n2.xlarge.25</strong>:	8 Cores 16 GB (General Purpose)</li>
     * <li><strong>mysql.n4.xlarge.25</strong>:	8 Cores 32 GB (General Purpose)</li>
     * <li><strong>mysql.n8.xlarge.25</strong>:	8 Cores 64 GB (General Purpose)</li>
     * <li><strong>mysql.n2.2xlarge.25</strong>:	16 Cores 32 GB (General Purpose)</li>
     * <li><strong>mysql.n4.2xlarge.25</strong>:	16 Cores 64 GB (General Purpose)</li>
     * <li><strong>mysql.n8.2xlarge.25</strong>:	16 Cores 128 GB (General Purpose)</li>
     * <li><strong>mysql.x2.medium.25</strong>:	2 Cores 4 GB (Dedicated)</li>
     * <li><strong>mysql.x4.medium.25</strong>:	2 Cores 8 GB (Dedicated)</li>
     * <li><strong>mysql.x8.medium.25</strong>:	2 Cores 16 GB (Dedicated)</li>
     * <li><strong>mysql.x2.large.25</strong>:	4 Cores 8 GB (Dedicated)</li>
     * <li><strong>mysql.x4.large.25</strong>:	4 Cores 16 GB (Dedicated)</li>
     * <li><strong>mysql.x8.large.25</strong>:	4 Cores 32 GB (Dedicated)</li>
     * <li><strong>mysql.x2.xlarge.25</strong>:	8 Cores 16 GB (Dedicated)</li>
     * <li><strong>mysql.x4.xlarge.25</strong>:	8 Cores 32 GB (Dedicated)</li>
     * <li><strong>mysql.x8.xlarge.25</strong>:	8 Cores 64 GB (Dedicated)</li>
     * <li><strong>mysql.x2.2xlarge.25</strong>:	16 Cores 32 GB (Dedicated)</li>
     * <li><strong>mysql.x4.2xlarge.25</strong>:	16 Cores 64 GB (Dedicated)</li>
     * <li><strong>mysql.x8.2xlarge.25</strong>:	16 Cores 128 GB (Dedicated)</li>
     * <li><strong>mysql.x4.4xlarge.25</strong>:	32 Cores 128 GB (Dedicated)</li>
     * <li><strong>mysql.x8.4xlarge.25</strong>:	32 Cores 256 GB (Dedicated)</li>
     * <li><strong>mysql.x4.8xlarge.25</strong>:	64 Cores 256 GB (Dedicated)</li>
     * <li><strong>mysql.x8.8xlarge.25</strong>:	64 Cores 512 GB (Dedicated)</li>
     * <li><strong>mysql.st.12xlarge.25</strong>:	90 Cores 720 GB (Dedicated)</li>
     * </ul>
     * <p>Standard Edition cloud disk specifications:</p>
     * <ul>
     * <li><strong>polarx.mysql.n2.medium.c25</strong>:	2 Cores 4 GB (General Purpose)</li>
     * <li><strong>polarx.mysql.n4.medium.c25</strong>:	2 Cores 8 GB (General Purpose)</li>
     * <li><strong>polarx.mysql.n8.medium.c25</strong>:	2 Cores 16 GB (General Purpose)</li>
     * <li><strong>polarx.mysql.n2.large.c25</strong>:	4 Cores 8 GB (General Purpose)</li>
     * <li><strong>polarx.mysql.n4.large.c25</strong>:	4 Cores 16 GB (General Purpose)</li>
     * <li><strong>polarx.mysql.n8.large.c25</strong>:	4 Cores 32 GB (General Purpose)</li>
     * <li><strong>polarx.mysql.n2.xlarge.c25</strong>:	8 Cores 16 GB (General Purpose)</li>
     * <li><strong>polarx.mysql.n4.xlarge.c25</strong>:	8 Cores 32 GB (General Purpose)</li>
     * <li><strong>polarx.mysql.n8.xlarge.c25</strong>:	8 Cores 64 GB (General Purpose)</li>
     * <li><strong>polarx.mysql.x2.medium.c25</strong>:	2 Cores 4 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x4.medium.c25</strong>:	2 Cores 8 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x8.medium.c25</strong>:	2 Cores 16 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x2.large.c25</strong>:	4 Cores 8 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x4.large.c25</strong>:	4 Cores 16 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x8.large.c25</strong>:	4 Cores 32 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x2.xlarge.c25</strong>:	8 Cores 16 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x4.xlarge.c25</strong>:	8 Cores 32 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x8.xlarge.c25</strong>:	8 Cores 64 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x2.2xlarge.c25</strong>:	16 Cores 32 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x4.2xlarge.c25</strong>:	16 Cores 64 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x8.2xlarge.c25</strong>:	16 Cores 128 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x2.4xlarge.c25</strong>:	32 Cores 64 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x4.4xlarge.c25</strong>:	32 Cores 128 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x8.4xlarge.c25</strong>:	32 Cores 256 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x2.8xlarge.c25</strong>:	64 Cores 128 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x4.8xlarge.c25</strong>:	64 Cores 256 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x8.8xlarge.c25</strong>:	64 Cores 512 GB (Dedicated)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>polarx.x4.2xlarge.2d</p>
     */
    @NameInMap("DBNodeClass")
    public String DBNodeClass;

    /**
     * <p>The number of instance nodes:</p>
     * <ul>
     * <li>Standard Edition: 1</li>
     * <li>Enterprise Edition: &gt;=2</li>
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
     * <p>The storage node specification. Required for creating Enterprise Edition instances. Not required for Standard Edition.</p>
     * <p>Enterprise Edition local disk:</p>
     * <ul>
     * <li><strong>mysql.n2.medium.25</strong>:	2 Cores 4 GB (General Purpose)</li>
     * <li><strong>mysql.n4.medium.25</strong>:	2 Cores 8 GB (General Purpose)</li>
     * <li><strong>mysql.n2.large.25</strong>:	4 Cores 8 GB (General Purpose)</li>
     * <li><strong>mysql.n4.large.25</strong>:	4 Cores 16 GB (General Purpose)</li>
     * <li><strong>mysql.n4.xlarge.25</strong>:	8 Cores 32 GB (General Purpose)</li>
     * <li><strong>mysql.n4.2xlarge.25</strong>:	16 Cores 64 GB (General Purpose)</li>
     * <li><strong>mysql.x4.large.25</strong>:	4 Cores 16 GB (Dedicated)</li>
     * <li><strong>mysql.x8.large.25</strong>:	4 Cores 32 GB (Dedicated)</li>
     * <li><strong>mysql.x2.xlarge.25</strong>:	8 Cores 16 GB (Dedicated)</li>
     * <li><strong>mysql.x8.xlarge.25</strong>:	8 Cores 64 GB (Dedicated)</li>
     * <li><strong>mysql.x8.2xlarge.25</strong>:	16 Cores 128 GB (Dedicated)</li>
     * <li><strong>mysql.x4.4xlarge.25</strong>:	32 Cores 128 GB (Dedicated)</li>
     * <li><strong>mysql.x8.4xlarge.25</strong>:	32 Cores 256 GB (Dedicated)</li>
     * <li><strong>mysql.st.8xlarge.25</strong>:	60 Cores 470 GB (Dedicated)</li>
     * <li><strong>mysql.st.12xlarge.25</strong>:	90 Cores 720 GB (Dedicated)</li>
     * <li><strong>mysql.x8.45xlarge.25</strong>:	180 Cores 1440 GB (Dedicated)</li>
     * <li><strong>mysql.x8.60xlarge.25</strong>:	240 Cores 1920 GB (Dedicated)</li>
     * </ul>
     * <p>Enterprise Edition cloud disk:</p>
     * <ul>
     * <li><strong>polarx.mysql.n2.medium.c25</strong>:	2 Cores 4 GB (General Purpose)</li>
     * <li><strong>polarx.mysql.n4.medium.c25</strong>:	2 Cores 8 GB (General Purpose)</li>
     * <li><strong>polarx.mysql.n2.large.c25</strong>:	4 Cores 8 GB (General Purpose)</li>
     * <li><strong>polarx.mysql.n4.large.c25</strong>:	4 Cores 16 GB (General Purpose)</li>
     * <li><strong>polarx.mysql.n4.xlarge.c25</strong>:	8 Cores 32 GB (General Purpose)</li>
     * <li><strong>polarx.mysql.n4.2xlarge.c25</strong>:	16 Cores 64 GB (General Purpose)</li>
     * <li><strong>polarx.mysql.x4.large.c25</strong>:	4 Cores 16 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x8.large.c25</strong>:	4 Cores 32 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x2.xlarge.c25</strong>:	8 Cores 16 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x8.xlarge.c25</strong>:	8 Cores 64 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x8.2xlarge.c25</strong>:	16 Cores 128 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x4.4xlarge.c25</strong>:	32 Cores 128 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x8.4xlarge.c25</strong>:	32 Cores 256 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.st.8xlarge.c25</strong>:	60 Cores 470 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.st.12xlarge.c25</strong>: 90 Cores 720 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x8.45xlarge.c25</strong>: 180 Cores 1440 GB (Dedicated)</li>
     * <li><strong>polarx.mysql.x8.60xlarge.c25</strong>: 240 Cores 1920 GB (Dedicated)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>mysql.n4.medium.25</p>
     */
    @NameInMap("DnClass")
    public String dnClass;

    /**
     * <p>The disk space size of the storage node.</p>
     * 
     * <strong>example:</strong>
     * <p>1500</p>
     */
    @NameInMap("DnStorageSpace")
    public String dnStorageSpace;

    /**
     * <p>The MySQL engine version. Valid values: 5.7 and 8.0.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5.7</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>Additional parameters.</p>
     */
    @NameInMap("ExtraParams")
    public java.util.Map<String, String> extraParams;

    /**
     * <p>Specifies whether the instance to be created is a columnar read-only instance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsColumnarReadDBInstance")
    public Boolean isColumnarReadDBInstance;

    /**
     * <p>Specifies whether the instance is a read-only instance.</p>
     * <ul>
     * <li><strong>true</strong>: Yes</li>
     * <li><strong>false</strong>: No</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsReadDBInstance")
    public Boolean isReadDBInstance;

    /**
     * <p>The network type. Only VPC is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The minor version number. This parameter is generally not required.</p>
     * 
     * <strong>example:</strong>
     * <p>polardb-2.4.0_standard_xcluster8.4.20-20260331</p>
     */
    @NameInMap("OriginMinorVersion")
    public String originMinorVersion;

    /**
     * <p>The billing method of the instance.</p>
     * <ul>
     * <li><strong>PREPAY</strong>: Subscription</li>
     * <li><strong>POSTPAY</strong>: Pay-as-you-go</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing cycle. For subscription instances, valid values are Year and Month. For pay-as-you-go instances, the default value is Hour.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The primary instance must be specified if the instance is a read-only instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-*********</p>
     */
    @NameInMap("PrimaryDBInstanceName")
    public String primaryDBInstanceName;

    /**
     * <p>The primary availability zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen-e</p>
     */
    @NameInMap("PrimaryZone")
    public String primaryZone;

    /**
     * <p>The region where the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. This parameter can be left empty. This feature is currently not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The secondary availability zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen-a</p>
     */
    @NameInMap("SecondaryZone")
    public String secondaryZone;

    /**
     * <p>Enterprise Edition: enterprise
     * Standard Edition: standard</p>
     * 
     * <strong>example:</strong>
     * <p>enterprise</p>
     */
    @NameInMap("Series")
    public String series;

    /**
     * <p>The storage type.</p>
     * <ul>
     * <li>Local disk: custom_local_ssd</li>
     * <li>Cloud disk: cloud_auto</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_auto</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The tertiary availability zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen-e</p>
     */
    @NameInMap("TertiaryZone")
    public String tertiaryZone;

    /**
     * <p>The topology type:</p>
     * <ul>
     * <li><strong>3azones</strong>: Three availability zones</li>
     * <li><strong>1azone</strong>: Single availability zone</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3azones</p>
     */
    @NameInMap("TopologyType")
    public String topologyType;

    /**
     * <p>The subscription duration. You can specify the number of months or years for prepaid instances.</p>
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
     * <p>The availability zone of the instance.</p>
     * 
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

    public CreateDBInstanceRequest setCNNodeCount(Integer CNNodeCount) {
        this.CNNodeCount = CNNodeCount;
        return this;
    }
    public Integer getCNNodeCount() {
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

    public CreateDBInstanceRequest setDNNodeCount(Integer DNNodeCount) {
        this.DNNodeCount = DNNodeCount;
        return this;
    }
    public Integer getDNNodeCount() {
        return this.DNNodeCount;
    }

    public CreateDBInstanceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
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

    public CreateDBInstanceRequest setExtraParams(java.util.Map<String, String> extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public java.util.Map<String, String> getExtraParams() {
        return this.extraParams;
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

    public CreateDBInstanceRequest setOriginMinorVersion(String originMinorVersion) {
        this.originMinorVersion = originMinorVersion;
        return this;
    }
    public String getOriginMinorVersion() {
        return this.originMinorVersion;
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

    public CreateDBInstanceRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
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
