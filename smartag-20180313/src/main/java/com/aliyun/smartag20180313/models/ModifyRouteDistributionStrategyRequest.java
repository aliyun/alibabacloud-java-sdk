// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifyRouteDistributionStrategyRequest extends TeaModel {
    /**
     * <p>The destination CIDR block.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172.XX.XX.0/24</p>
     */
    @NameInMap("DestCidrBlock")
    public String destCidrBlock;

    /**
     * <p>The ID of the health check instance.</p>
     * 
     * <strong>example:</strong>
     * <p>hc-sztovuprqzgm50****</p>
     */
    @NameInMap("HcInstanceId")
    public String hcInstanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the Smart Access Gateway (SAG) instance.</p>
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
     * <p>The route advertisement policy. Valid values:</p>
     * <ul>
     * <li><strong>publish</strong>: advertises routes.</li>
     * <li><strong>no_publish</strong>: does not advertise routes.</li>
     * <li><strong>no_publish_and_publish_on_health_success</strong>: routes are advertised only when they pass the health check.</li>
     * <li><strong>no_publish_and_publish_on_health_fail</strong>: routes are advertised only when they fail the health check.</li>
     * <li><strong>publish_and_revoke_on_health_success</strong>: advertised routes are withdrawn only when they pass the health check.</li>
     * <li><strong>publish_and_revoke_on_health_fail</strong>: advertised routes are withdrawn only when they fail the health check.</li>
     * </ul>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/163971.html">Configure health checks</a> and <a href="https://help.aliyun.com/document_detail/163973.html">Advertise routes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>publish</p>
     */
    @NameInMap("RouteDistribution")
    public String routeDistribution;

    /**
     * <p>The source of routes. Valid values:</p>
     * <ul>
     * <li><p><strong>Alibaba Cloud-facing routes</strong></p>
     * <ul>
     * <li><strong>The ID of the Virtual Private Cloud (VPC)</strong>: learns routes from the VPC network.</li>
     * <li><strong>The ID of the virtual border router (VBR)</strong>: learns routes from the VBR.</li>
     * <li><strong>The ID of the SAG instance</strong>: learns routes from the SAG instance.</li>
     * </ul>
     * </li>
     * <li><p><strong>Private network-facing routes</strong></p>
     * <ul>
     * <li><strong>STATIC</strong>: static routes specified in the SAG console.</li>
     * <li><strong>OSPF</strong>: learns routes through the Open Shortest Path First (OSPF) protocol.</li>
     * <li><strong>BGP</strong>: learns routes through Border Gateway Protocol (BGP).</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OSPF</p>
     */
    @NameInMap("RouteSource")
    public String routeSource;

    /**
     * <p>The ID of the SAG instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-erx3qta5xg5zyq****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    /**
     * <p>The type of the route source. Valid values:</p>
     * <ul>
     * <li><strong>cloud</strong>: Alibaba Cloud-facing routes.</li>
     * <li><strong>local</strong>: private network-facing routes.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>local</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static ModifyRouteDistributionStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyRouteDistributionStrategyRequest self = new ModifyRouteDistributionStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyRouteDistributionStrategyRequest setDestCidrBlock(String destCidrBlock) {
        this.destCidrBlock = destCidrBlock;
        return this;
    }
    public String getDestCidrBlock() {
        return this.destCidrBlock;
    }

    public ModifyRouteDistributionStrategyRequest setHcInstanceId(String hcInstanceId) {
        this.hcInstanceId = hcInstanceId;
        return this;
    }
    public String getHcInstanceId() {
        return this.hcInstanceId;
    }

    public ModifyRouteDistributionStrategyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyRouteDistributionStrategyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyRouteDistributionStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyRouteDistributionStrategyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyRouteDistributionStrategyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyRouteDistributionStrategyRequest setRouteDistribution(String routeDistribution) {
        this.routeDistribution = routeDistribution;
        return this;
    }
    public String getRouteDistribution() {
        return this.routeDistribution;
    }

    public ModifyRouteDistributionStrategyRequest setRouteSource(String routeSource) {
        this.routeSource = routeSource;
        return this;
    }
    public String getRouteSource() {
        return this.routeSource;
    }

    public ModifyRouteDistributionStrategyRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ModifyRouteDistributionStrategyRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
