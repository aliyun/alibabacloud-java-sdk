// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateRouteTargetGroupRequest extends TeaModel {
    /**
     * <p>Client Token, used to ensure the idempotence of requests. Generate a unique value for this parameter from your client for each request. ClientToken supports only ASCII characters. Note that if you do not specify this, the system will automatically use the RequestId of the API request as the ClientToken identifier. The RequestId may differ for each API request.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the region to which the route target group instance belongs. You can obtain the region ID by calling the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Description of the route target group. </p>
     * <p>The description length should be between 1 to 256 characters and must not start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>myRouteTargetGroupDescription</p>
     */
    @NameInMap("RouteTargetGroupDescription")
    public String routeTargetGroupDescription;

    /**
     * <p>The ID of the route target group instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rtg-xxx</p>
     */
    @NameInMap("RouteTargetGroupId")
    public String routeTargetGroupId;

    /**
     * <p>The name of the route target group.</p>
     * <p>The name length should be between 1 and 128 characters, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>myRouteTargetGroupName</p>
     */
    @NameInMap("RouteTargetGroupName")
    public String routeTargetGroupName;

    /**
     * <p>List of members in the route target group.
     * Under the primary-standby mode, there are the following restrictions on the members of the route target group:</p>
     * <ol>
     * <li>The number of members in the route target group must be 2. </li>
     * <li>The members of the route target group must belong to different availability zones.</li>
     * </ol>
     */
    @NameInMap("RouteTargetMemberList")
    public java.util.List<UpdateRouteTargetGroupRequestRouteTargetMemberList> routeTargetMemberList;

    public static UpdateRouteTargetGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRouteTargetGroupRequest self = new UpdateRouteTargetGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRouteTargetGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRouteTargetGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateRouteTargetGroupRequest setRouteTargetGroupDescription(String routeTargetGroupDescription) {
        this.routeTargetGroupDescription = routeTargetGroupDescription;
        return this;
    }
    public String getRouteTargetGroupDescription() {
        return this.routeTargetGroupDescription;
    }

    public UpdateRouteTargetGroupRequest setRouteTargetGroupId(String routeTargetGroupId) {
        this.routeTargetGroupId = routeTargetGroupId;
        return this;
    }
    public String getRouteTargetGroupId() {
        return this.routeTargetGroupId;
    }

    public UpdateRouteTargetGroupRequest setRouteTargetGroupName(String routeTargetGroupName) {
        this.routeTargetGroupName = routeTargetGroupName;
        return this;
    }
    public String getRouteTargetGroupName() {
        return this.routeTargetGroupName;
    }

    public UpdateRouteTargetGroupRequest setRouteTargetMemberList(java.util.List<UpdateRouteTargetGroupRequestRouteTargetMemberList> routeTargetMemberList) {
        this.routeTargetMemberList = routeTargetMemberList;
        return this;
    }
    public java.util.List<UpdateRouteTargetGroupRequestRouteTargetMemberList> getRouteTargetMemberList() {
        return this.routeTargetMemberList;
    }

    public static class UpdateRouteTargetGroupRequestRouteTargetMemberList extends TeaModel {
        /**
         * <p>ID of the route target group member instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-xxxx</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <p>The member type of the route target group. </p>
         * <p>Currently supported types: - <strong>GatewayLoadBalancerEndpoint</strong> </p>
         * <p>In active-standby mode, all members of the route target group must be of the same type.</p>
         * 
         * <strong>example:</strong>
         * <p>GatewayLoadBalancerEndpoint</p>
         */
        @NameInMap("MemberType")
        public String memberType;

        /**
         * <p>The weight value of the route target group member. Values:</p>
         * <ul>
         * <li>100: indicates the member is the primary instance. </li>
         * <li>0: indicates the member is the backup instance.
         * The weight value can only be set during creation and cannot be modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static UpdateRouteTargetGroupRequestRouteTargetMemberList build(java.util.Map<String, ?> map) throws Exception {
            UpdateRouteTargetGroupRequestRouteTargetMemberList self = new UpdateRouteTargetGroupRequestRouteTargetMemberList();
            return TeaModel.build(map, self);
        }

        public UpdateRouteTargetGroupRequestRouteTargetMemberList setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public UpdateRouteTargetGroupRequestRouteTargetMemberList setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

        public UpdateRouteTargetGroupRequestRouteTargetMemberList setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
