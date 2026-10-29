// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcpeer20220101.models;

import com.aliyun.tea.*;

public class ListVpcPeerConnectionsShrinkRequest extends TeaModel {
    /**
     * <p>The instance ID of the VPC peering connection that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>pcc-lnk0m24khwvtkm****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the VPC peering connection that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>vpcpeer</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The token that is used to retrieve the next page of results. Valid values:</p>
     * <ul>
     * <li>If this is your first request or no subsequent request is to be sent, leave this parameter empty.</li>
     * <li>If a subsequent request is to be sent, set the value to the NextToken value returned from the last API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the VPC peering connection that you want to query.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.html">What is a resource group</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<Tags> tags;

    /**
     * <p>Filters the results by the VPC IDs of the initiator and acceptor. The filter does not distinguish between the initiator and the acceptor. If you specify only one VPC ID, the results are filtered based on the specified VPC ID.</p>
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
         * <p>The tag key. You can specify up to 20 tag keys. If you specify this parameter, it cannot be an empty string.</p>
         * <p>A tag key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can specify up to 20 tag values. If you specify this parameter, it can be an empty string.</p>
         * <p>A tag value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
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
