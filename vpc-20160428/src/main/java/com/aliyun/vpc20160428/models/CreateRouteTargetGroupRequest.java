// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteTargetGroupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters. If you do not specify this parameter, the system automatically uses the RequestId value as the ClientToken value. The RequestId value is different for each API request.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe6****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The configuration mode of the route target group. Valid values:</p>
     * <ul>
     * <li><strong>Active-Standby</strong>: active/standby mode.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Active-Standby</p>
     */
    @NameInMap("ConfigMode")
    public String configMode;

    /**
     * <p>The region ID of the route target group. You can call the DescribeRegions operation to query the most recent region list.</p>
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
     * <p>rg-acfmxazffggds****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The description of the route target group.
     * The description must be 1 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>myRouteTargetGroupDescription</p>
     */
    @NameInMap("RouteTargetGroupDescription")
    public String routeTargetGroupDescription;

    /**
     * <p>The name of the route target group.</p>
     * <p>The name must be 1 to 128 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>myRouteTargetGroupName</p>
     */
    @NameInMap("RouteTargetGroupName")
    public String routeTargetGroupName;

    /**
     * <p>The member list of the route target group.</p>
     * <p>In active/standby mode, the following limits apply to route target group members:</p>
     * <ol>
     * <li>The number of route target group members must be 2.</li>
     * <li>The route target group members must be in different zones.</li>
     * </ol>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RouteTargetMemberList")
    public java.util.List<CreateRouteTargetGroupRequestRouteTargetMemberList> routeTargetMemberList;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateRouteTargetGroupRequestTag> tag;

    /**
     * <p>The ID of the VPC to which the route target group belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateRouteTargetGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteTargetGroupRequest self = new CreateRouteTargetGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateRouteTargetGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRouteTargetGroupRequest setConfigMode(String configMode) {
        this.configMode = configMode;
        return this;
    }
    public String getConfigMode() {
        return this.configMode;
    }

    public CreateRouteTargetGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateRouteTargetGroupRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateRouteTargetGroupRequest setRouteTargetGroupDescription(String routeTargetGroupDescription) {
        this.routeTargetGroupDescription = routeTargetGroupDescription;
        return this;
    }
    public String getRouteTargetGroupDescription() {
        return this.routeTargetGroupDescription;
    }

    public CreateRouteTargetGroupRequest setRouteTargetGroupName(String routeTargetGroupName) {
        this.routeTargetGroupName = routeTargetGroupName;
        return this;
    }
    public String getRouteTargetGroupName() {
        return this.routeTargetGroupName;
    }

    public CreateRouteTargetGroupRequest setRouteTargetMemberList(java.util.List<CreateRouteTargetGroupRequestRouteTargetMemberList> routeTargetMemberList) {
        this.routeTargetMemberList = routeTargetMemberList;
        return this;
    }
    public java.util.List<CreateRouteTargetGroupRequestRouteTargetMemberList> getRouteTargetMemberList() {
        return this.routeTargetMemberList;
    }

    public CreateRouteTargetGroupRequest setTag(java.util.List<CreateRouteTargetGroupRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateRouteTargetGroupRequestTag> getTag() {
        return this.tag;
    }

    public CreateRouteTargetGroupRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class CreateRouteTargetGroupRequestRouteTargetMemberList extends TeaModel {
        /**
         * <p>The instance ID of the route target group member.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-xxxx</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <p>The member type of the route target group.</p>
         * <p>Supported type:</p>
         * <ul>
         * <li><strong>GatewayLoadBalancerEndpoint</strong></li>
         * </ul>
         * <p>In active/standby mode, all members of the route target group must be of the same type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GatewayLoadBalancerEndpoint</p>
         */
        @NameInMap("MemberType")
        public String memberType;

        /**
         * <p>The weight of the route target group member. Valid values:</p>
         * <ul>
         * <li><strong>100</strong>: The member is the active instance.</li>
         * <li><strong>0</strong>: The member is the standby instance.</li>
         * </ul>
         * <p>The weight can only be set during creation and cannot be modified.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static CreateRouteTargetGroupRequestRouteTargetMemberList build(java.util.Map<String, ?> map) throws Exception {
            CreateRouteTargetGroupRequestRouteTargetMemberList self = new CreateRouteTargetGroupRequestRouteTargetMemberList();
            return TeaModel.build(map, self);
        }

        public CreateRouteTargetGroupRequestRouteTargetMemberList setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public CreateRouteTargetGroupRequestRouteTargetMemberList setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

        public CreateRouteTargetGroupRequestRouteTargetMemberList setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class CreateRouteTargetGroupRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateRouteTargetGroupRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateRouteTargetGroupRequestTag self = new CreateRouteTargetGroupRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateRouteTargetGroupRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateRouteTargetGroupRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
