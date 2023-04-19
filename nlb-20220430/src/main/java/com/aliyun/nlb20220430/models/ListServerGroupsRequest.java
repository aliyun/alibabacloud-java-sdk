// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListServerGroupsRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that determines the start point of the query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query and no next queries are to be sent, ignore this parameter.</p>
     * <p>*   If a next query is to be sent, set the value to the value of NextToken that is returned from the last call.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where the NLB instance is deployed.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~443657~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the server group belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ServerGroupIds")
    public java.util.List<String> serverGroupIds;

    @NameInMap("ServerGroupNames")
    public java.util.List<String> serverGroupNames;

    /**
     * <p>The type of server group. Valid values:</p>
     * <br>
     * <p>*   **Instance** : allows you to add servers of the **Ecs**, **Ens**, and **Eci** types.</p>
     * <p>*   **Ip**: allows you to add servers by specifying IP addresses.</p>
     */
    @NameInMap("ServerGroupType")
    public String serverGroupType;

    @NameInMap("Tag")
    public java.util.List<ListServerGroupsRequestTag> tag;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the server group belongs.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ListServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServerGroupsRequest self = new ListServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListServerGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServerGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServerGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServerGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListServerGroupsRequest setServerGroupIds(java.util.List<String> serverGroupIds) {
        this.serverGroupIds = serverGroupIds;
        return this;
    }
    public java.util.List<String> getServerGroupIds() {
        return this.serverGroupIds;
    }

    public ListServerGroupsRequest setServerGroupNames(java.util.List<String> serverGroupNames) {
        this.serverGroupNames = serverGroupNames;
        return this;
    }
    public java.util.List<String> getServerGroupNames() {
        return this.serverGroupNames;
    }

    public ListServerGroupsRequest setServerGroupType(String serverGroupType) {
        this.serverGroupType = serverGroupType;
        return this;
    }
    public String getServerGroupType() {
        return this.serverGroupType;
    }

    public ListServerGroupsRequest setTag(java.util.List<ListServerGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListServerGroupsRequestTag> getTag() {
        return this.tag;
    }

    public ListServerGroupsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class ListServerGroupsRequestTag extends TeaModel {
        /**
         * <p>The tag key. You can specify up to 10 tag keys.</p>
         * <br>
         * <p>The tag key can be up to 64 characters in length, and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify up to 10 tag values.</p>
         * <br>
         * <p>The tag value can be up to 128 characters in length, and cannot contain `http://` or `https://`. It cannot start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListServerGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsRequestTag self = new ListServerGroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListServerGroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
