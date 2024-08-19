// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class PublishVpcRouteEntriesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RouteEntries")
    public java.util.List<PublishVpcRouteEntriesRequestRouteEntries> routeEntries;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-dhw2xsds5****</p>
     */
    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ECR</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    public static PublishVpcRouteEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishVpcRouteEntriesRequest self = new PublishVpcRouteEntriesRequest();
        return TeaModel.build(map, self);
    }

    public PublishVpcRouteEntriesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public PublishVpcRouteEntriesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public PublishVpcRouteEntriesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PublishVpcRouteEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PublishVpcRouteEntriesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public PublishVpcRouteEntriesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public PublishVpcRouteEntriesRequest setRouteEntries(java.util.List<PublishVpcRouteEntriesRequestRouteEntries> routeEntries) {
        this.routeEntries = routeEntries;
        return this;
    }
    public java.util.List<PublishVpcRouteEntriesRequestRouteEntries> getRouteEntries() {
        return this.routeEntries;
    }

    public PublishVpcRouteEntriesRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public PublishVpcRouteEntriesRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public static class PublishVpcRouteEntriesRequestRouteEntries extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>121.41.165.123/32</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-2ze3jgygk9bmsj23s****</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        public static PublishVpcRouteEntriesRequestRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            PublishVpcRouteEntriesRequestRouteEntries self = new PublishVpcRouteEntriesRequestRouteEntries();
            return TeaModel.build(map, self);
        }

        public PublishVpcRouteEntriesRequestRouteEntries setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public PublishVpcRouteEntriesRequestRouteEntries setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

}
