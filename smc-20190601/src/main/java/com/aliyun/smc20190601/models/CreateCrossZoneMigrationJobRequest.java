// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class CreateCrossZoneMigrationJobRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong> (default): enables automatic payment. Make sure that you have sufficient balance within your account.</li>
     * <li><strong>false</strong>: disables automatic payment. In this case, you must manually pay for the instance. For more information, see <a href="https://help.aliyun.com/document_detail/85052.html">Renew a subscription instance</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The disk information.</p>
     */
    @NameInMap("Disk")
    public java.util.List<CreateCrossZoneMigrationJobRequestDisk> disk;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1ff25rzvnul6kr****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the destination Alibaba Cloud region.</p>
     * <p>For example, if you want to migrate the source server to the China (Hangzhou) region, set this parameter to <code>cn-hangzhou</code>. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmw3ty5y7****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The type of the new instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g7.large</p>
     */
    @NameInMap("TargetInstanceType")
    public String targetInstanceType;

    /**
     * <p>The vSwitch ID of the destination Elastic Compute Service (ECS) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1mxqnssl8nafltcx32e</p>
     */
    @NameInMap("TargetVSwitchId")
    public String targetVSwitchId;

    /**
     * <p>The ID of the destination zone.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("TargetZoneId")
    public String targetZoneId;

    public static CreateCrossZoneMigrationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCrossZoneMigrationJobRequest self = new CreateCrossZoneMigrationJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateCrossZoneMigrationJobRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateCrossZoneMigrationJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCrossZoneMigrationJobRequest setDisk(java.util.List<CreateCrossZoneMigrationJobRequestDisk> disk) {
        this.disk = disk;
        return this;
    }
    public java.util.List<CreateCrossZoneMigrationJobRequestDisk> getDisk() {
        return this.disk;
    }

    public CreateCrossZoneMigrationJobRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateCrossZoneMigrationJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCrossZoneMigrationJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCrossZoneMigrationJobRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateCrossZoneMigrationJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCrossZoneMigrationJobRequest setTargetInstanceType(String targetInstanceType) {
        this.targetInstanceType = targetInstanceType;
        return this;
    }
    public String getTargetInstanceType() {
        return this.targetInstanceType;
    }

    public CreateCrossZoneMigrationJobRequest setTargetVSwitchId(String targetVSwitchId) {
        this.targetVSwitchId = targetVSwitchId;
        return this;
    }
    public String getTargetVSwitchId() {
        return this.targetVSwitchId;
    }

    public CreateCrossZoneMigrationJobRequest setTargetZoneId(String targetZoneId) {
        this.targetZoneId = targetZoneId;
        return this;
    }
    public String getTargetZoneId() {
        return this.targetZoneId;
    }

    public static class CreateCrossZoneMigrationJobRequestDisk extends TeaModel {
        /**
         * <p>The disk category. A value of cloud_essd that indicates enhanced SSD (ESSD).</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The disk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp1eeplkn4j29wf7irpb</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The performance level of the ESSD. Valid values:</p>
         * <ul>
         * <li>PL0: A single ESSD can deliver up to 10,000 random read/write IOPS.</li>
         * <li>PL1: A single ESSD can deliver up to 50,000 random read/write IOPS.</li>
         * <li>PL2: A single ESSD can deliver up to 100,000 random read/write IOPS.</li>
         * <li>PL3: A single ESSD can deliver up to 1,000,000 random read/write IOPS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("PerformanceLevel")
        public String performanceLevel;

        public static CreateCrossZoneMigrationJobRequestDisk build(java.util.Map<String, ?> map) throws Exception {
            CreateCrossZoneMigrationJobRequestDisk self = new CreateCrossZoneMigrationJobRequestDisk();
            return TeaModel.build(map, self);
        }

        public CreateCrossZoneMigrationJobRequestDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public CreateCrossZoneMigrationJobRequestDisk setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public CreateCrossZoneMigrationJobRequestDisk setPerformanceLevel(String performanceLevel) {
            this.performanceLevel = performanceLevel;
            return this;
        }
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

    }

}
