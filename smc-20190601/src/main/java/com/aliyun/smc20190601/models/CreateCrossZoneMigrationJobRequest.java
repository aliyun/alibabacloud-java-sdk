// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class CreateCrossZoneMigrationJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Disk")
    public java.util.List<CreateCrossZoneMigrationJobRequestDisk> disk;

    /**
     * <strong>example:</strong>
     * <p>i-bp1ff25rzvnul6kr****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

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
     * <p>rg-acfmw3ty5y7****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <strong>example:</strong>
     * <p>ecs.g7.large</p>
     */
    @NameInMap("TargetInstanceType")
    public String targetInstanceType;

    /**
     * <strong>example:</strong>
     * <p>vsw-bp1mxqnssl8nafltcx32e</p>
     */
    @NameInMap("TargetVSwitchId")
    public String targetVSwitchId;

    /**
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
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>d-bp1eeplkn4j29wf7irpb</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
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
