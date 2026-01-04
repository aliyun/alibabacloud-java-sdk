// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetRouteTargetGroupResponseBody extends TeaModel {
    /**
     * <p>Configuration mode of the route target group. Supported modes are as follows:</p>
     * <ul>
     * <li><strong>Active-Standby</strong>: Active-standby mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active-Standby</p>
     */
    @NameInMap("ConfigMode")
    public String configMode;

    /**
     * <p>The time when the route target group was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-12-30T06:40:50Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The region ID of the VPC to which the route target group belongs. You can obtain the region ID by calling the DescribeRegions interface.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-qingdao</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AE05898-06E5-4782-xxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group to which the route target group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazdjdhd****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Description of the route target group.</p>
     * 
     * <strong>example:</strong>
     * <p>myRouteTargetGroupDescription</p>
     */
    @NameInMap("RouteTargetGroupDescription")
    public String routeTargetGroupDescription;

    /**
     * <p>ID of the route target group instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rtg-xxxx</p>
     */
    @NameInMap("RouteTargetGroupId")
    public String routeTargetGroupId;

    /**
     * <p>Name of the route target group.</p>
     * 
     * <strong>example:</strong>
     * <p>myRouteTargetGroupName</p>
     */
    @NameInMap("RouteTargetGroupName")
    public String routeTargetGroupName;

    /**
     * <p>List of members in the route target group.</p>
     */
    @NameInMap("RouteTargetMemberList")
    public java.util.List<GetRouteTargetGroupResponseBodyRouteTargetMemberList> routeTargetMemberList;

    /**
     * <p>Status of the route target group.</p>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Tags of the route target group.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetRouteTargetGroupResponseBodyTags> tags;

    /**
     * <p>ID of the VPC to which the route target group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static GetRouteTargetGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRouteTargetGroupResponseBody self = new GetRouteTargetGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRouteTargetGroupResponseBody setConfigMode(String configMode) {
        this.configMode = configMode;
        return this;
    }
    public String getConfigMode() {
        return this.configMode;
    }

    public GetRouteTargetGroupResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetRouteTargetGroupResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetRouteTargetGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRouteTargetGroupResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetRouteTargetGroupResponseBody setRouteTargetGroupDescription(String routeTargetGroupDescription) {
        this.routeTargetGroupDescription = routeTargetGroupDescription;
        return this;
    }
    public String getRouteTargetGroupDescription() {
        return this.routeTargetGroupDescription;
    }

    public GetRouteTargetGroupResponseBody setRouteTargetGroupId(String routeTargetGroupId) {
        this.routeTargetGroupId = routeTargetGroupId;
        return this;
    }
    public String getRouteTargetGroupId() {
        return this.routeTargetGroupId;
    }

    public GetRouteTargetGroupResponseBody setRouteTargetGroupName(String routeTargetGroupName) {
        this.routeTargetGroupName = routeTargetGroupName;
        return this;
    }
    public String getRouteTargetGroupName() {
        return this.routeTargetGroupName;
    }

    public GetRouteTargetGroupResponseBody setRouteTargetMemberList(java.util.List<GetRouteTargetGroupResponseBodyRouteTargetMemberList> routeTargetMemberList) {
        this.routeTargetMemberList = routeTargetMemberList;
        return this;
    }
    public java.util.List<GetRouteTargetGroupResponseBodyRouteTargetMemberList> getRouteTargetMemberList() {
        return this.routeTargetMemberList;
    }

    public GetRouteTargetGroupResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetRouteTargetGroupResponseBody setTags(java.util.List<GetRouteTargetGroupResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetRouteTargetGroupResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetRouteTargetGroupResponseBody setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class GetRouteTargetGroupResponseBodyRouteTargetMemberList extends TeaModel {
        /**
         * <p>The enable status of the route target group member. Values:</p>
         * <ul>
         * <li><strong>Enable</strong>: Enabled.</li>
         * <li><strong>Disable</strong>: Disabled.</li>
         * </ul>
         * <p>Only disabled route target group members can be modified to other instances. Enabled route target group members cannot be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        @NameInMap("EnableStatus")
        public String enableStatus;

        /**
         * <p>Route target group member health check status. Values:</p>
         * <ul>
         * <li><strong>Normal</strong>: Normal </li>
         * <li><strong>Abnormal</strong>: Abnormal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("HealthCheckStatus")
        public String healthCheckStatus;

        /**
         * <p>ID of the route target group member instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-xxxx</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <p>Type of the route target group member.</p>
         * <p>Currently supported types:</p>
         * <ul>
         * <li><strong>GatewayLoadBalancerEndpoint</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GatewayLoadBalancerEndpoint</p>
         */
        @NameInMap("MemberType")
        public String memberType;

        /**
         * <p>Weight value of the route target group member. Values:</p>
         * <ul>
         * <li><strong>100</strong>: Indicates the member is the primary instance.</li>
         * <li><strong>0</strong>: Indicates the member is the standby instance.</li>
         * </ul>
         * <p>The weight value can only be set during creation and cannot be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static GetRouteTargetGroupResponseBodyRouteTargetMemberList build(java.util.Map<String, ?> map) throws Exception {
            GetRouteTargetGroupResponseBodyRouteTargetMemberList self = new GetRouteTargetGroupResponseBodyRouteTargetMemberList();
            return TeaModel.build(map, self);
        }

        public GetRouteTargetGroupResponseBodyRouteTargetMemberList setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public GetRouteTargetGroupResponseBodyRouteTargetMemberList setHealthCheckStatus(String healthCheckStatus) {
            this.healthCheckStatus = healthCheckStatus;
            return this;
        }
        public String getHealthCheckStatus() {
            return this.healthCheckStatus;
        }

        public GetRouteTargetGroupResponseBodyRouteTargetMemberList setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public GetRouteTargetGroupResponseBodyRouteTargetMemberList setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

        public GetRouteTargetGroupResponseBodyRouteTargetMemberList setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class GetRouteTargetGroupResponseBodyTags extends TeaModel {
        /**
         * <p>Tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetRouteTargetGroupResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetRouteTargetGroupResponseBodyTags self = new GetRouteTargetGroupResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetRouteTargetGroupResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetRouteTargetGroupResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
