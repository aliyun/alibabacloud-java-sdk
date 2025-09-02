// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpcGrantRulesToEcrRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ecr-ncxadcujadncsa****</p>
     */
    @NameInMap("EcrInstanceId")
    public String ecrInstanceId;

    /**
     * <strong>example:</strong>
     * <p>192732132151****</p>
     */
    @NameInMap("EcrOwnerId")
    public Long ecrOwnerId;

    /**
     * <strong>example:</strong>
     * <p>vpc-wz9ek66wd7tl5xqpy****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmxazb4ph6aiy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
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
