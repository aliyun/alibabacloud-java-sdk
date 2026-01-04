// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListRouteTargetGroupsRequest extends TeaModel {
    /**
     * <p>Client token used to ensure idempotence of the request. Generate a unique parameter value from your client to ensure uniqueness across different requests. ClientToken only supports ASCII characters. Note: If you do not specify this, the system will automatically use the RequestId of the API request as the ClientToken identifier. The RequestId is different for each API request.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Page size, with a range of <strong>1</strong> to <strong>50</strong>. Default value: <strong>50</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Route target group member instance ID.
     * Filters the route target groups that contain the specified member instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-xxxx</p>
     */
    @NameInMap("MemberId")
    public String memberId;

    /**
     * <p>Token for the next query. Value: If it is the first query or there is no next query, this field does not need to be filled. If there is a next query, the value should be the NextToken returned from the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the VPC to which the route target group belongs. You can obtain the region ID by calling the DescribeRegions interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Resource group ID. For more information about resource groups, see What is a Resource Group?</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazdjdhd****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>List of route target group instance IDs.</p>
     * <p>Up to 50 instance IDs can be queried at a time.</p>
     */
    @NameInMap("RouteTargetGroupIds")
    public java.util.List<String> routeTargetGroupIds;

    /**
     * <p>List of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListRouteTargetGroupsRequestTag> tag;

    /**
     * <p>The ID of the VPC to which the route target group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ListRouteTargetGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRouteTargetGroupsRequest self = new ListRouteTargetGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListRouteTargetGroupsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListRouteTargetGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRouteTargetGroupsRequest setMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }
    public String getMemberId() {
        return this.memberId;
    }

    public ListRouteTargetGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRouteTargetGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListRouteTargetGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListRouteTargetGroupsRequest setRouteTargetGroupIds(java.util.List<String> routeTargetGroupIds) {
        this.routeTargetGroupIds = routeTargetGroupIds;
        return this;
    }
    public java.util.List<String> getRouteTargetGroupIds() {
        return this.routeTargetGroupIds;
    }

    public ListRouteTargetGroupsRequest setTag(java.util.List<ListRouteTargetGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListRouteTargetGroupsRequestTag> getTag() {
        return this.tag;
    }

    public ListRouteTargetGroupsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class ListRouteTargetGroupsRequestTag extends TeaModel {
        /**
         * <p>Resource tag key. Up to 20 tag keys are supported. If you need to pass this value, you cannot input an empty string.</p>
         * <p>A tag key can have up to 128 characters and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Resource tag value. Up to 20 tag values are supported. If you need to pass this value, you can input an empty string.</p>
         * <p>A tag value can have up to 128 characters and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListRouteTargetGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListRouteTargetGroupsRequestTag self = new ListRouteTargetGroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListRouteTargetGroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListRouteTargetGroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
