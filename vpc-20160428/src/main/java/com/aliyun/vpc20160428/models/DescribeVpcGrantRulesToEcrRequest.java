// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpcGrantRulesToEcrRequest extends TeaModel {
    /**
     * <p>The ID of the ECR that you want to query.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-ncxadcujadncsa****</p>
     */
    @NameInMap("EcrInstanceId")
    public String ecrInstanceId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the ECR belongs.</p>
     * <blockquote>
     * <p>If you want to connect to a network instance that belongs to a different account, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>192732132151****</p>
     */
    @NameInMap("EcrOwnerId")
    public Long ecrOwnerId;

    /**
     * <p>The ID of the network instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-wz9ek66wd7tl5xqpy****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of instance. Valid values:</p>
     * <ul>
     * <li><strong>VBR</strong>: queries the permissions that are granted to a VBR.</li>
     * <li><strong>VPC</strong>: queries the permissions that are granted from a VPC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The number of entries to return per page. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>You do not need to specify this parameter for the first request.</li>
     * <li>If a value is returned for NextToken, you must specify the token that is obtained from the previous query as the value of <strong>NextToken</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the network instance that you want to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the network instance belongs.</p>
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
     * <p>The tag.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeVpcGrantRulesToEcrRequestTags> tags;

    public static DescribeVpcGrantRulesToEcrRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcGrantRulesToEcrRequest self = new DescribeVpcGrantRulesToEcrRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcGrantRulesToEcrRequest setEcrInstanceId(String ecrInstanceId) {
        this.ecrInstanceId = ecrInstanceId;
        return this;
    }
    public String getEcrInstanceId() {
        return this.ecrInstanceId;
    }

    public DescribeVpcGrantRulesToEcrRequest setEcrOwnerId(Long ecrOwnerId) {
        this.ecrOwnerId = ecrOwnerId;
        return this;
    }
    public Long getEcrOwnerId() {
        return this.ecrOwnerId;
    }

    public DescribeVpcGrantRulesToEcrRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeVpcGrantRulesToEcrRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeVpcGrantRulesToEcrRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeVpcGrantRulesToEcrRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeVpcGrantRulesToEcrRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeVpcGrantRulesToEcrRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeVpcGrantRulesToEcrRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVpcGrantRulesToEcrRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeVpcGrantRulesToEcrRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeVpcGrantRulesToEcrRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeVpcGrantRulesToEcrRequest setTags(java.util.List<DescribeVpcGrantRulesToEcrRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeVpcGrantRulesToEcrRequestTags> getTags() {
        return this.tags;
    }

    public static class DescribeVpcGrantRulesToEcrRequestTags extends TeaModel {
        /**
         * <p>The key of the tag. You must specify at least one tag key and at most 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>A tag key can be up to 128 characters in length. It cannot start with <code>acs:</code> or <code>aliyun</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. You can enter a maximum of 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag key can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeVpcGrantRulesToEcrRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcGrantRulesToEcrRequestTags self = new DescribeVpcGrantRulesToEcrRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeVpcGrantRulesToEcrRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeVpcGrantRulesToEcrRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
