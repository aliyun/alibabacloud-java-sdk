// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouterInterfaceRequest extends TeaModel {
    /**
     * <p>The ID of the access point to which the VBR belongs. </p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36062.html">DescribeAccessPoints</a> operation to query the access point ID of the Express Connect circuit.  </p>
     * <blockquote>
     * <p>This parameter is required in Express Connect circuit scenarios.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ap-cn-hangzhou-yh-ts-A</p>
     */
    @NameInMap("AccessPointId")
    public String accessPointId;

    /**
     * <p>Specifies whether to enable automatic payment. Valid values: </p>
     * <ul>
     * <li><p><strong>false</strong> (default): Automatic payment is disabled. After an order is generated, go to the Order Center to complete the payment.   </p>
     * </li>
     * <li><p><strong>true</strong>: Automatic payment is enabled. The order is automatically paid.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): Auto-renewal is disabled.</li>
     * <li><strong>true</strong>: Auto-renewal is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. </p>
     * <p>The client generates the value of this parameter. Ensure that the value is unique among different requests. </p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system uses the RequestId of the API request as the ClientToken. The RequestId may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the router interface.  </p>
     * <p>The description must be 2 to 256 characters in length and must start with a letter or a Chinese character. It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>abcabc</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the router interface on the VBR is created in fast link mode. Fast link mode allows the router interfaces on the VBR and VPC to be automatically connected after they are created. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes.</li>
     * <li><strong>false</strong> (default): no.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect only when <strong>RouterType</strong> is set to <strong>VBR</strong> and <strong>OppositeRouterType</strong> is set to <strong>VRouter</strong>.</li>
     * <li>When <strong>FastLinkMode</strong> is set to <strong>true</strong>, <strong>Role</strong> must be set to <strong>InitiatingSide</strong>, and <strong>AccessPointId</strong>, <strong>OppositeRouterType</strong>, <strong>OppositeRouterId</strong>, and <strong>OppositeInterfaceOwnerId</strong> are required.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FastLinkMode")
    public Boolean fastLinkMode;

    /**
     * <p>The source IP address for health checks. The IP address must be an unused IP address in the local VPC. </p>
     * <blockquote>
     * <p>You can specify this parameter in Express Connect circuit scenarios.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.6</p>
     */
    @NameInMap("HealthCheckSourceIp")
    public String healthCheckSourceIp;

    /**
     * <p>The destination IP address for health checks. </p>
     * <blockquote>
     * <p>This parameter is required when <strong>HealthCheckSourceIp</strong> is specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.8</p>
     */
    @NameInMap("HealthCheckTargetIp")
    public String healthCheckTargetIp;

    /**
     * <p>The billing method of the router interface. Valid values: </p>
     * <ul>
     * <li><p><strong>PrePaid</strong>: subscription.</p>
     * </li>
     * <li><p><strong>PostPaid</strong>: pay-as-you-go.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The name of the router interface.  </p>
     * <p>The name must be 2 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the access point to which the peer belongs.</p>
     * <blockquote>
     * <p>This parameter is required when the peer router interface is on a VBR. This parameter cannot be modified after the router interface is created.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ap-cn-shanghai-nt-aligroup-C</p>
     */
    @NameInMap("OppositeAccessPointId")
    public String oppositeAccessPointId;

    /**
     * <p>The ID of the peer router interface.</p>
     * 
     * <strong>example:</strong>
     * <p>ri-2zeo3xzyf38r4urzd****</p>
     */
    @NameInMap("OppositeInterfaceId")
    public String oppositeInterfaceId;

    /**
     * <p>The Alibaba Cloud account ID of the owner of the peer router interface.</p>
     * 
     * <strong>example:</strong>
     * <p>253460731706911258</p>
     */
    @NameInMap("OppositeInterfaceOwnerId")
    public String oppositeInterfaceOwnerId;

    /**
     * <p>The region ID of the accepter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("OppositeRegionId")
    public String oppositeRegionId;

    /**
     * <p>The ID of the peer router.</p>
     * 
     * <strong>example:</strong>
     * <p>vrt-bp1lhl0taikrteen8****</p>
     */
    @NameInMap("OppositeRouterId")
    public String oppositeRouterId;

    /**
     * <p>The type of the router associated with the peer router interface. Valid values: </p>
     * <ul>
     * <li><p><strong>VRouter</strong>: vRouter.</p>
     * </li>
     * <li><p><strong>VBR</strong>: Virtual Border Router.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VRouter</p>
     */
    @NameInMap("OppositeRouterType")
    public String oppositeRouterType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription duration. Valid values: </p>
     * <ul>
     * <li><p>If you select monthly billing, the valid values are <strong>1</strong> to <strong>9</strong>.</p>
     * </li>
     * <li><p>If you select yearly billing, the valid values are <strong>1</strong> to <strong>3</strong>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The billing cycle of the subscription. Valid values:</p>
     * <ul>
     * <li><p><strong>Month</strong> (default): monthly billing.</p>
     * </li>
     * <li><p><strong>Year</strong>: yearly billing.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when <strong>InstanceChargeType</strong> is set to <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The region ID of the router interface.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/2381067.html">What is a resource group?</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The role of the router interface. Valid values: </p>
     * <ul>
     * <li><p><strong>InitiatingSide</strong>: requester.   </p>
     * </li>
     * <li><p><strong>AcceptingSide</strong>: accepter.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>InitiatingSide</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The ID of the router associated with the router interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-m5ebm6g9ptc9mly1c****</p>
     */
    @NameInMap("RouterId")
    public String routerId;

    /**
     * <p>The type of the router associated with the router interface. Valid values: </p>
     * <ul>
     * <li><p><strong>VRouter</strong>: vRouter.</p>
     * </li>
     * <li><p><strong>VBR</strong>: Virtual Border Router.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VRouter</p>
     */
    @NameInMap("RouterType")
    public String routerType;

    /**
     * <p>The specification of the router interface. The available specifications and corresponding bandwidth values are as follows: </p>
     * <ul>
     * <li><p><strong>Mini.2</strong>: 2 Mbps   </p>
     * </li>
     * <li><p><strong>Mini.5</strong>: 5 Mbps   </p>
     * </li>
     * <li><p><strong>Small.1</strong>: 10 Mbps   </p>
     * </li>
     * <li><p><strong>Small.2</strong>: 20 Mbps   </p>
     * </li>
     * <li><p><strong>Small.5</strong>: 50 Mbps   </p>
     * </li>
     * <li><p><strong>Middle.1</strong>: 100 Mbps   </p>
     * </li>
     * <li><p><strong>Middle.2</strong>: 200 Mbps   </p>
     * </li>
     * <li><p><strong>Middle.5</strong>: 500 Mbps   </p>
     * </li>
     * <li><p><strong>Large.1</strong>: 1000 Mbps   </p>
     * </li>
     * <li><p><strong>Large.2</strong>: 2000 Mbps   </p>
     * </li>
     * <li><p><strong>Large.5</strong>: 5000 Mbps   </p>
     * </li>
     * <li><p><strong>Xlarge.1</strong>: 10000 Mbps</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When <strong>Role</strong> is set to <strong>AcceptingSide</strong> (accepter), set <strong>Spec</strong> to <strong>Negative</strong>. No specification is required when you create an accepter router interface.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Mini.2</p>
     */
    @NameInMap("Spec")
    public String spec;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("Tags")
    public java.util.List<CreateRouterInterfaceRequestTags> tags;

    public static CreateRouterInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouterInterfaceRequest self = new CreateRouterInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateRouterInterfaceRequest setAccessPointId(String accessPointId) {
        this.accessPointId = accessPointId;
        return this;
    }
    public String getAccessPointId() {
        return this.accessPointId;
    }

    public CreateRouterInterfaceRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateRouterInterfaceRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateRouterInterfaceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRouterInterfaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRouterInterfaceRequest setFastLinkMode(Boolean fastLinkMode) {
        this.fastLinkMode = fastLinkMode;
        return this;
    }
    public Boolean getFastLinkMode() {
        return this.fastLinkMode;
    }

    public CreateRouterInterfaceRequest setHealthCheckSourceIp(String healthCheckSourceIp) {
        this.healthCheckSourceIp = healthCheckSourceIp;
        return this;
    }
    public String getHealthCheckSourceIp() {
        return this.healthCheckSourceIp;
    }

    public CreateRouterInterfaceRequest setHealthCheckTargetIp(String healthCheckTargetIp) {
        this.healthCheckTargetIp = healthCheckTargetIp;
        return this;
    }
    public String getHealthCheckTargetIp() {
        return this.healthCheckTargetIp;
    }

    public CreateRouterInterfaceRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreateRouterInterfaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRouterInterfaceRequest setOppositeAccessPointId(String oppositeAccessPointId) {
        this.oppositeAccessPointId = oppositeAccessPointId;
        return this;
    }
    public String getOppositeAccessPointId() {
        return this.oppositeAccessPointId;
    }

    public CreateRouterInterfaceRequest setOppositeInterfaceId(String oppositeInterfaceId) {
        this.oppositeInterfaceId = oppositeInterfaceId;
        return this;
    }
    public String getOppositeInterfaceId() {
        return this.oppositeInterfaceId;
    }

    public CreateRouterInterfaceRequest setOppositeInterfaceOwnerId(String oppositeInterfaceOwnerId) {
        this.oppositeInterfaceOwnerId = oppositeInterfaceOwnerId;
        return this;
    }
    public String getOppositeInterfaceOwnerId() {
        return this.oppositeInterfaceOwnerId;
    }

    public CreateRouterInterfaceRequest setOppositeRegionId(String oppositeRegionId) {
        this.oppositeRegionId = oppositeRegionId;
        return this;
    }
    public String getOppositeRegionId() {
        return this.oppositeRegionId;
    }

    public CreateRouterInterfaceRequest setOppositeRouterId(String oppositeRouterId) {
        this.oppositeRouterId = oppositeRouterId;
        return this;
    }
    public String getOppositeRouterId() {
        return this.oppositeRouterId;
    }

    public CreateRouterInterfaceRequest setOppositeRouterType(String oppositeRouterType) {
        this.oppositeRouterType = oppositeRouterType;
        return this;
    }
    public String getOppositeRouterType() {
        return this.oppositeRouterType;
    }

    public CreateRouterInterfaceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateRouterInterfaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateRouterInterfaceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateRouterInterfaceRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreateRouterInterfaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRouterInterfaceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateRouterInterfaceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateRouterInterfaceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateRouterInterfaceRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public CreateRouterInterfaceRequest setRouterId(String routerId) {
        this.routerId = routerId;
        return this;
    }
    public String getRouterId() {
        return this.routerId;
    }

    public CreateRouterInterfaceRequest setRouterType(String routerType) {
        this.routerType = routerType;
        return this;
    }
    public String getRouterType() {
        return this.routerType;
    }

    public CreateRouterInterfaceRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public CreateRouterInterfaceRequest setTags(java.util.List<CreateRouterInterfaceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateRouterInterfaceRequestTags> getTags() {
        return this.tags;
    }

    public static class CreateRouterInterfaceRequestTags extends TeaModel {
        /**
         * <p>The tag key of the resource. You must specify at least 1 and can specify at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>A tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify at most 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateRouterInterfaceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateRouterInterfaceRequestTags self = new CreateRouterInterfaceRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateRouterInterfaceRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRouterInterfaceRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
