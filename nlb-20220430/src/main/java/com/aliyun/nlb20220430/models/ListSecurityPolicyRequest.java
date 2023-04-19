// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlb20220430.models;

import com.aliyun.tea.*;

public class ListSecurityPolicyRequest extends TeaModel {
    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **100**. Default value: **20**.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <br>
     * <p>*   If this is your first query or no next query is to be sent, ignore this parameter.</p>
     * <p>*   If a next query is to be sent, set the parameter to the value of NextToken that is returned from the last call.</p>
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
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SecurityPolicyIds")
    public java.util.List<String> securityPolicyIds;

    @NameInMap("SecurityPolicyNames")
    public java.util.List<String> securityPolicyNames;

    @NameInMap("Tag")
    public java.util.List<ListSecurityPolicyRequestTag> tag;

    public static ListSecurityPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityPolicyRequest self = new ListSecurityPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ListSecurityPolicyRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSecurityPolicyRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSecurityPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSecurityPolicyRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListSecurityPolicyRequest setSecurityPolicyIds(java.util.List<String> securityPolicyIds) {
        this.securityPolicyIds = securityPolicyIds;
        return this;
    }
    public java.util.List<String> getSecurityPolicyIds() {
        return this.securityPolicyIds;
    }

    public ListSecurityPolicyRequest setSecurityPolicyNames(java.util.List<String> securityPolicyNames) {
        this.securityPolicyNames = securityPolicyNames;
        return this;
    }
    public java.util.List<String> getSecurityPolicyNames() {
        return this.securityPolicyNames;
    }

    public ListSecurityPolicyRequest setTag(java.util.List<ListSecurityPolicyRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListSecurityPolicyRequestTag> getTag() {
        return this.tag;
    }

    public static class ListSecurityPolicyRequestTag extends TeaModel {
        /**
         * <p>The tag keys. You can specify up to 10 tag keys.</p>
         * <br>
         * <p>It can be at most 64 characters in length, and cannot contain `http://` or `https://`. It must not start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values. You can specify up to 10 tag values.</p>
         * <br>
         * <p>It can be at most 128 characters in length, and cannot contain `http://` or `https://`. It must not start with `aliyun` or `acs:`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListSecurityPolicyRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityPolicyRequestTag self = new ListSecurityPolicyRequestTag();
            return TeaModel.build(map, self);
        }

        public ListSecurityPolicyRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListSecurityPolicyRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
