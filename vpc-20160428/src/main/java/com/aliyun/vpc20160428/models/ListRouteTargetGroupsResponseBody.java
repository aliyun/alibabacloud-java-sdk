// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListRouteTargetGroupsResponseBody extends TeaModel {
    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Token for the next query. Value: If NextToken is empty, it indicates there is no next query. If NextToken has a return value, it indicates the token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DE77A7F3-3B74-41C0-A5BC-CAFD188C28B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of route target groups.</p>
     */
    @NameInMap("RouteTargetGroups")
    public java.util.List<ListRouteTargetGroupsResponseBodyRouteTargetGroups> routeTargetGroups;

    /**
     * <p>Number of items in the list.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListRouteTargetGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRouteTargetGroupsResponseBody self = new ListRouteTargetGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRouteTargetGroupsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRouteTargetGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRouteTargetGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRouteTargetGroupsResponseBody setRouteTargetGroups(java.util.List<ListRouteTargetGroupsResponseBodyRouteTargetGroups> routeTargetGroups) {
        this.routeTargetGroups = routeTargetGroups;
        return this;
    }
    public java.util.List<ListRouteTargetGroupsResponseBodyRouteTargetGroups> getRouteTargetGroups() {
        return this.routeTargetGroups;
    }

    public ListRouteTargetGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListRouteTargetGroupsResponseBodyRouteTargetGroupsRouteTargetMemberList extends TeaModel {
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
         * <p>The health check status of the route target group member. Values:</p>
         * <ul>
         * <li><strong>Normal</strong>: Normal</li>
         * <li><strong>Abnormal</strong>: Abnormal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("HealthCheckStatus")
        public String healthCheckStatus;

        /**
         * <p>The ID of the route target group member instance.</p>
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
         * 
         * <strong>example:</strong>
         * <p>GatewayLoadBalancerEndpoint</p>
         */
        @NameInMap("MemberType")
        public String memberType;

        /**
         * <p>The weight value of the route target group member. Values:</p>
         * <ul>
         * <li><strong>100</strong>: Indicates that the member is the primary instance.</li>
         * <li><strong>0</strong>: Indicates that the member is the backup instance.</li>
         * </ul>
         * <p>The weight value can only be set during creation and cannot be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static ListRouteTargetGroupsResponseBodyRouteTargetGroupsRouteTargetMemberList build(java.util.Map<String, ?> map) throws Exception {
            ListRouteTargetGroupsResponseBodyRouteTargetGroupsRouteTargetMemberList self = new ListRouteTargetGroupsResponseBodyRouteTargetGroupsRouteTargetMemberList();
            return TeaModel.build(map, self);
        }

        public ListRouteTargetGroupsResponseBodyRouteTargetGroupsRouteTargetMemberList setEnableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }
        public String getEnableStatus() {
            return this.enableStatus;
        }

        public ListRouteTargetGroupsResponseBodyRouteTargetGroupsRouteTargetMemberList setHealthCheckStatus(String healthCheckStatus) {
            this.healthCheckStatus = healthCheckStatus;
            return this;
        }
        public String getHealthCheckStatus() {
            return this.healthCheckStatus;
        }

        public ListRouteTargetGroupsResponseBodyRouteTargetGroupsRouteTargetMemberList setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public ListRouteTargetGroupsResponseBodyRouteTargetGroupsRouteTargetMemberList setMemberType(String memberType) {
            this.memberType = memberType;
            return this;
        }
        public String getMemberType() {
            return this.memberType;
        }

        public ListRouteTargetGroupsResponseBodyRouteTargetGroupsRouteTargetMemberList setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

    public static class ListRouteTargetGroupsResponseBodyRouteTargetGroupsTags extends TeaModel {
        /**
         * <p>The key of the resource tag.</p>
         * 
         * <strong>example:</strong>
         * <p>image/upload/cbbec42e0be33abb27babefcbe0397f0</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the resource tag. Up to 20 tag values are supported. If you need to pass this value, you can input an empty string. A maximum of 128 characters is allowed. The value cannot start with <code>aliyun</code> or <code>acs:</code>, and it must not contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListRouteTargetGroupsResponseBodyRouteTargetGroupsTags build(java.util.Map<String, ?> map) throws Exception {
            ListRouteTargetGroupsResponseBodyRouteTargetGroupsTags self = new ListRouteTargetGroupsResponseBodyRouteTargetGroupsTags();
            return TeaModel.build(map, self);
        }

        public ListRouteTargetGroupsResponseBodyRouteTargetGroupsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListRouteTargetGroupsResponseBodyRouteTargetGroupsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListRouteTargetGroupsResponseBodyRouteTargetGroups extends TeaModel {
        /**
         * <p>The configuration mode of the route target group. Supported modes are as follows:</p>
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
         * <p>The region ID of the VPC to which the route target group belongs.</p>
         * <p>You can obtain the region ID by calling the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> interface.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the route target group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm3swh6ta56ri</p>
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
         * <p>The ID of the route target group instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rtg-xxxx</p>
         */
        @NameInMap("RouteTargetGroupId")
        public String routeTargetGroupId;

        /**
         * <p>The name of the route target group.</p>
         * 
         * <strong>example:</strong>
         * <p>myRouteTargetGroupName</p>
         */
        @NameInMap("RouteTargetGroupName")
        public String routeTargetGroupName;

        /**
         * <p>The list of route target group members.</p>
         */
        @NameInMap("RouteTargetMemberList")
        public java.util.List<ListRouteTargetGroupsResponseBodyRouteTargetGroupsRouteTargetMemberList> routeTargetMemberList;

        /**
         * <p>Status of the route target group. Values:</p>
         * <ul>
         * <li><strong>Recovering</strong>: Active-Standby rollback in progress</li>
         * <li><strong>Switched</strong>: Active-Standby switched</li>
         * <li><strong>Available</strong>: Available</li>
         * <li><strong>Abnormal</strong>: Standby instance abnormal</li>
         * <li><strong>Pending</strong>: Creating</li>
         * <li><strong>Switching</strong>: Active-Standby switching in progress</li>
         * <li><strong>Deleting</strong>: Deleting</li>
         * <li><strong>Unavailable</strong>: Both primary and standby instances are abnormal</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag values. A maximum of 20 tag values are supported. If you need to pass this value, you can input an empty string.</p>
         * <p>A maximum of 128 characters are supported. The value cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListRouteTargetGroupsResponseBodyRouteTargetGroupsTags> tags;

        /**
         * <p>The ID of the VPC to which the route target group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf60y8uzhsvbhmuh3l654</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListRouteTargetGroupsResponseBodyRouteTargetGroups build(java.util.Map<String, ?> map) throws Exception {
            ListRouteTargetGroupsResponseBodyRouteTargetGroups self = new ListRouteTargetGroupsResponseBodyRouteTargetGroups();
            return TeaModel.build(map, self);
        }

        public ListRouteTargetGroupsResponseBodyRouteTargetGroups setConfigMode(String configMode) {
            this.configMode = configMode;
            return this;
        }
        public String getConfigMode() {
            return this.configMode;
        }

        public ListRouteTargetGroupsResponseBodyRouteTargetGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListRouteTargetGroupsResponseBodyRouteTargetGroups setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListRouteTargetGroupsResponseBodyRouteTargetGroups setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListRouteTargetGroupsResponseBodyRouteTargetGroups setRouteTargetGroupDescription(String routeTargetGroupDescription) {
            this.routeTargetGroupDescription = routeTargetGroupDescription;
            return this;
        }
        public String getRouteTargetGroupDescription() {
            return this.routeTargetGroupDescription;
        }

        public ListRouteTargetGroupsResponseBodyRouteTargetGroups setRouteTargetGroupId(String routeTargetGroupId) {
            this.routeTargetGroupId = routeTargetGroupId;
            return this;
        }
        public String getRouteTargetGroupId() {
            return this.routeTargetGroupId;
        }

        public ListRouteTargetGroupsResponseBodyRouteTargetGroups setRouteTargetGroupName(String routeTargetGroupName) {
            this.routeTargetGroupName = routeTargetGroupName;
            return this;
        }
        public String getRouteTargetGroupName() {
            return this.routeTargetGroupName;
        }

        public ListRouteTargetGroupsResponseBodyRouteTargetGroups setRouteTargetMemberList(java.util.List<ListRouteTargetGroupsResponseBodyRouteTargetGroupsRouteTargetMemberList> routeTargetMemberList) {
            this.routeTargetMemberList = routeTargetMemberList;
            return this;
        }
        public java.util.List<ListRouteTargetGroupsResponseBodyRouteTargetGroupsRouteTargetMemberList> getRouteTargetMemberList() {
            return this.routeTargetMemberList;
        }

        public ListRouteTargetGroupsResponseBodyRouteTargetGroups setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListRouteTargetGroupsResponseBodyRouteTargetGroups setTags(java.util.List<ListRouteTargetGroupsResponseBodyRouteTargetGroupsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListRouteTargetGroupsResponseBodyRouteTargetGroupsTags> getTags() {
            return this.tags;
        }

        public ListRouteTargetGroupsResponseBodyRouteTargetGroups setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
