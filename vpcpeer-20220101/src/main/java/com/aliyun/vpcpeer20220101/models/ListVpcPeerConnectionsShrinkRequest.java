// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class ListVpcPeerConnectionsShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the VPC peering connection that you want to query.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries to return per page. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the VPC peering connection that you want to query.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   You do not need to specify this parameter for the first request.</p>
     * <p>*   You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the region where you want to query VPC peering connections.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * <br>
     * <p>For more information about resource groups, see [What is a resource group?](~~94475~~)</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<Tags> tags;

    /**
     * <p>The ID of the requester VPC or accepter VPC of the VPC peering connection that you want to query.</p>
     */
    @NameInMap("VpcId")
    public String vpcIdShrink;

    public static ListVpcPeerConnectionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVpcPeerConnectionsShrinkRequest self = new ListVpcPeerConnectionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListVpcPeerConnectionsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListVpcPeerConnectionsShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVpcPeerConnectionsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListVpcPeerConnectionsShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVpcPeerConnectionsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListVpcPeerConnectionsShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListVpcPeerConnectionsShrinkRequest setTags(java.util.List<Tags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    public ListVpcPeerConnectionsShrinkRequest setVpcIdShrink(String vpcIdShrink) {
        this.vpcIdShrink = vpcIdShrink;
        return this;
    }
    public String getVpcIdShrink() {
        return this.vpcIdShrink;
    }

    public static class Tags extends TeaModel {
        /**
         * <p>The tag key. You can specify at most 20 tag keys. It cannot be an empty string.</p>
         * <br>
         * <p>The key cannot exceed 64 characters in length, and can contain digits, periods (.), underscores (\_), and hyphens (-). The key must start with a letter but cannot start with `aliyun` or `acs:`. The key cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify at most 20 tag values. The tag key can be an empty string.</p>
         * <br>
         * <p>The tag value cannot exceed 128 characters in length, and can contain digits, periods (.), underscores (\_), and hyphens (-). The key must start with a letter but cannot start with `aliyun` or `acs:`. The key cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static Tags build(java.util.Map<String, ?> map) throws Exception {
            Tags self = new Tags();
            return TeaModel.build(map, self);
        }

        public Tags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public Tags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
