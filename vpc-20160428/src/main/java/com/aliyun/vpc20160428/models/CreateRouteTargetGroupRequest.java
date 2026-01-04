// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteTargetGroupRequest extends TeaModel {
    /**
     * <p>Client token used to ensure the idempotence of the request. Generate a parameter value from your client to ensure that it is unique across different requests. ClientToken supports only ASCII characters. Note: If you do not specify this, the system automatically uses the RequestId of the API request as the ClientToken identifier. Each API request has a different RequestId.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88e9fe6****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The configuration mode of the route target group. Supported modes:</p>
     * <ul>
     * <li><strong>Active-Standby</strong>: Active-Standby mode.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Active-Standby</p>
     */
    @NameInMap("ConfigMode")
    public String configMode;

    /**
     * <p>The region ID to which the route target group belongs. You can obtain the region ID by calling the DescribeRegions interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/2381067.html">What is a Resource Group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazffggds****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The description of the route target group.</p>
     * <p>The description length must be between 1 and 256 characters, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>myRouteTargetGroupDescription</p>
     */
    @NameInMap("RouteTargetGroupDescription")
    public String routeTargetGroupDescription;

    /**
     * <p>The name of the route target group.</p>
     * <p>The name length must be between 1 and 128 characters, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>myRouteTargetGroupName</p>
     */
    @NameInMap("RouteTargetGroupName")
    public String routeTargetGroupName;

    /**
     * <p>The member list of the route target group.</p>
     * <p>In Active-Standby mode, the following restrictions apply to the members of the route target group:</p>
     * <ol>
     * <li>The number of route target group members must be 2.</li>
     * <li>The route target group members must belong to different availability zones.</li>
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
         * <p>The type of the route target group member.</p>
         * <p>Currently supported types:</p>
         * <ul>
         * <li><strong>GatewayLoadBalancerEndpoint</strong></li>
         * </ul>
         * <p>In Active-Standby mode, all members of the route target group must have the same type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GatewayLoadBalancerEndpoint</p>
         */
        @NameInMap("MemberType")
        public String memberType;

        /**
         * <p>The weight value of the route target group member. Values:</p>
         * <ul>
         * <li><strong>100</strong>: Indicates the member is a primary instance.</li>
         * <li><strong>0</strong>: Indicates the member is a standby instance.</li>
         * </ul>
         * <p>The weight value can only be set during creation and cannot be modified.</p>
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
         * <p>The tag key of the resource. Up to 20 tag keys are supported. If you need to pass this value, you cannot input an empty string.</p>
         * <p>A tag key can have up to 128 characters and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. Up to 20 tag values are supported. If you need to pass this value, you can input an empty string.</p>
         * <p>A tag value can have up to 128 characters and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
