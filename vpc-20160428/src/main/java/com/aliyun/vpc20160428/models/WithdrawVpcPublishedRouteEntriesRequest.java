// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class WithdrawVpcPublishedRouteEntriesRequest extends TeaModel {
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
    public java.util.List<WithdrawVpcPublishedRouteEntriesRequestRouteEntries> routeEntries;

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

    public static WithdrawVpcPublishedRouteEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        WithdrawVpcPublishedRouteEntriesRequest self = new WithdrawVpcPublishedRouteEntriesRequest();
        return TeaModel.build(map, self);
    }

    public WithdrawVpcPublishedRouteEntriesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public WithdrawVpcPublishedRouteEntriesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public WithdrawVpcPublishedRouteEntriesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public WithdrawVpcPublishedRouteEntriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public WithdrawVpcPublishedRouteEntriesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public WithdrawVpcPublishedRouteEntriesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public WithdrawVpcPublishedRouteEntriesRequest setRouteEntries(java.util.List<WithdrawVpcPublishedRouteEntriesRequestRouteEntries> routeEntries) {
        this.routeEntries = routeEntries;
        return this;
    }
    public java.util.List<WithdrawVpcPublishedRouteEntriesRequestRouteEntries> getRouteEntries() {
        return this.routeEntries;
    }

    public WithdrawVpcPublishedRouteEntriesRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public WithdrawVpcPublishedRouteEntriesRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public static class WithdrawVpcPublishedRouteEntriesRequestRouteEntries extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-bp145q7glnuzd****</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        public static WithdrawVpcPublishedRouteEntriesRequestRouteEntries build(java.util.Map<String, ?> map) throws Exception {
            WithdrawVpcPublishedRouteEntriesRequestRouteEntries self = new WithdrawVpcPublishedRouteEntriesRequestRouteEntries();
            return TeaModel.build(map, self);
        }

        public WithdrawVpcPublishedRouteEntriesRequestRouteEntries setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public WithdrawVpcPublishedRouteEntriesRequestRouteEntries setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

}
