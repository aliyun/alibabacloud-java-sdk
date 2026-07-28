// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class WithdrawVpcPublishedRouteEntriesRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run without withdrawing the published routing entry. The system checks the required parameters, request format, and business limits. If the check fails, the corresponding error is returned. If the check succeeds, the error code <code>DryRunOperation</code> is returned.</li>
     * <li><strong>false</strong> (default): sends a normal request. If the check succeeds, an HTTP 2xx status code is returned and the operation to withdraw the VPC published routing entry is performed.</li>
     * </ul>
     * 
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
     * <p>The region ID of the instance. You can call the DescribeRegions operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The list of route entries to withdraw. You can specify up to 50 route entries.</p>
     */
    @NameInMap("RouteEntries")
    public java.util.List<WithdrawVpcPublishedRouteEntriesRequestRouteEntries> routeEntries;

    /**
     * <p>The publish route entry target instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-dhw2xsds5****</p>
     */
    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    /**
     * <p>The type of the route publish target.</p>
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
         * <p>The destination CIDR block of the route entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The route table ID of the route entry.</p>
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
