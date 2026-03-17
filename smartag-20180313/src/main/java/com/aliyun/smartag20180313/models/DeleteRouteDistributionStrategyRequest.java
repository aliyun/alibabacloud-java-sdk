// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteRouteDistributionStrategyRequest extends TeaModel {
    /**
     * <p>The destination CIDR block.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.XX.XX.0/24</p>
     */
    @NameInMap("DestCidrBlock")
    public String destCidrBlock;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the Smart Access Gateway (SAG) instance is deployed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source of routes. Valid values:</p>
     * <ul>
     * <li><p><strong>Alibaba Cloud</strong></p>
     * <ul>
     * <li><strong>Virtual private cloud (VPC) IDs</strong>: Routes that are learned from VPCs.</li>
     * <li><strong>Virtual border router (VBR) IDs</strong>: Routes that are learned from VBRs.</li>
     * <li><strong>SAG instance IDs</strong>: Routes that are learned from SAG instances.</li>
     * </ul>
     * </li>
     * <li><p><strong>On-premises network</strong></p>
     * <ul>
     * <li><strong>STATIC</strong>: Static routes that are specified in the SAG console.</li>
     * <li><strong>OSPF</strong>: Routes that are learned through the Open Shortest Path First (OSPF) protocol.</li>
     * <li><strong>BGP</strong>: Routes that are learned through Border Gateway Protocol (BGP).</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>STATIC</p>
     */
    @NameInMap("RouteSource")
    public String routeSource;

    /**
     * <p>The ID of the SAG instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-gyat6giidkvyk****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The type of the route source. Valid values:</p>
     * <ul>
     * <li><strong>cloud</strong>: Alibaba Cloud</li>
     * <li><strong>local</strong>: on-premises network</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>local</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static DeleteRouteDistributionStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteDistributionStrategyRequest self = new DeleteRouteDistributionStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRouteDistributionStrategyRequest setDestCidrBlock(String destCidrBlock) {
        this.destCidrBlock = destCidrBlock;
        return this;
    }
    public String getDestCidrBlock() {
        return this.destCidrBlock;
    }

    public DeleteRouteDistributionStrategyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteRouteDistributionStrategyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteRouteDistributionStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteRouteDistributionStrategyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteRouteDistributionStrategyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteRouteDistributionStrategyRequest setRouteSource(String routeSource) {
        this.routeSource = routeSource;
        return this;
    }
    public String getRouteSource() {
        return this.routeSource;
    }

    public DeleteRouteDistributionStrategyRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public DeleteRouteDistributionStrategyRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
