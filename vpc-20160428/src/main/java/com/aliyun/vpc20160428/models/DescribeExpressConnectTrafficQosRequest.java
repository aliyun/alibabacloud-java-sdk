// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectTrafficQosRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-0016e04115b</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The maximum number of entries to return. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
     * <ul>
     * <li>If no value is returned for NetToken, you do not need to specify this parameter.</li>
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
     * <p>The IDs of QoS policies.</p>
     */
    @NameInMap("QosIdList")
    public java.util.List<String> qosIdList;

    /**
     * <p>The names of QoS policies.</p>
     */
    @NameInMap("QosNameList")
    public java.util.List<String> qosNameList;

    /**
     * <p>The ID of the region in which the QoS policy is created.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxazfdgdg****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The tags of the resource.</p>
     */
    @NameInMap("Tags")
    public java.util.List<DescribeExpressConnectTrafficQosRequestTags> tags;

    public static DescribeExpressConnectTrafficQosRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectTrafficQosRequest self = new DescribeExpressConnectTrafficQosRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectTrafficQosRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeExpressConnectTrafficQosRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeExpressConnectTrafficQosRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeExpressConnectTrafficQosRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeExpressConnectTrafficQosRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeExpressConnectTrafficQosRequest setQosIdList(java.util.List<String> qosIdList) {
        this.qosIdList = qosIdList;
        return this;
    }
    public java.util.List<String> getQosIdList() {
        return this.qosIdList;
    }

    public DescribeExpressConnectTrafficQosRequest setQosNameList(java.util.List<String> qosNameList) {
        this.qosNameList = qosNameList;
        return this;
    }
    public java.util.List<String> getQosNameList() {
        return this.qosNameList;
    }

    public DescribeExpressConnectTrafficQosRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeExpressConnectTrafficQosRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeExpressConnectTrafficQosRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeExpressConnectTrafficQosRequest setTags(java.util.List<DescribeExpressConnectTrafficQosRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<DescribeExpressConnectTrafficQosRequestTags> getTags() {
        return this.tags;
    }

    public static class DescribeExpressConnectTrafficQosRequestTags extends TeaModel {
        /**
         * <p>The tag key. You must enter at least one tag key. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
         * <p>A tag key can be at most 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values of the resources. You can specify up to 20 tag values. The tag value can be an empty string.</p>
         * <p>The tag value can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. The tag value cannot start with <code>aliyun</code> or <code>acs:</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeExpressConnectTrafficQosRequestTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectTrafficQosRequestTags self = new DescribeExpressConnectTrafficQosRequestTags();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectTrafficQosRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeExpressConnectTrafficQosRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
