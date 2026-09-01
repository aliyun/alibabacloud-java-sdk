// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeFailoverTestJobsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> value as the <strong>ClientToken</strong> value. The <strong>RequestId</strong> value is different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The filter information.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeFailoverTestJobsRequestFilter> filter;

    /**
     * <p>The number of entries per page for a paginated query. Valid values: <strong>1</strong> to <strong>100</strong>. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Valid values:</p>
     * <ul>
     * <li><p>Leave this parameter empty for the first query or if no subsequent query is required.</p>
     * </li>
     * <li><p>If a subsequent query is required, set this parameter to the NextToken value returned in the previous API call.</p>
     * </li>
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
     * <p>The region where the failover test jobs reside.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    public static DescribeFailoverTestJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFailoverTestJobsRequest self = new DescribeFailoverTestJobsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFailoverTestJobsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeFailoverTestJobsRequest setFilter(java.util.List<DescribeFailoverTestJobsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeFailoverTestJobsRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeFailoverTestJobsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeFailoverTestJobsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeFailoverTestJobsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeFailoverTestJobsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeFailoverTestJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeFailoverTestJobsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public static class DescribeFailoverTestJobsRequestFilter extends TeaModel {
        /**
         * <p>The filter condition. Valid values:</p>
         * <ul>
         * <li><p><strong>JobId</strong>: the failover test job ID.</p>
         * </li>
         * <li><p><strong>JobName</strong>: the failover test job name.</p>
         * </li>
         * <li><p><strong>JobStatus</strong>: the failover test job status.</p>
         * </li>
         * <li><p><strong>ResourceId</strong>: the failover test resource ID.</p>
         * </li>
         * <li><p><strong>ResourceName</strong>: the failover test resource name.</p>
         * </li>
         * <li><p><strong>ResourceType</strong>: the failover test resource type.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You can specify up to 5 unique filter conditions. If you specify a resource ID or resource name, you must also specify the resource type. All filter conditions must be met to return accurate query results.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>JobId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter values that correspond to the filter condition.</p>
         * <blockquote>
         * <p>Each filter condition can contain up to 5 filter values. These filter values use the OR logic. A record is considered a match if it matches any one of the filter values.</p>
         * </blockquote>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeFailoverTestJobsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeFailoverTestJobsRequestFilter self = new DescribeFailoverTestJobsRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeFailoverTestJobsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeFailoverTestJobsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
