// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeFailoverTestJobsRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
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
     * <p>The number of entries per page. Valid values: <strong>1 to 100</strong>. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <ul>
     * <li>If the value of <strong>NextToken</strong> is not returned, it indicates that no next query is to be sent.</li>
     * <li>If a value of <strong>NextToken</strong> is returned, the value is the token that is used for the subsequent query.</li>
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
     * <p>The region where you want to perform the failover test.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The filter key. Valid values:</p>
         * <ul>
         * <li><strong>JobId</strong></li>
         * <li><strong>JobName</strong></li>
         * <li><strong>JobStatus</strong></li>
         * <li><strong>ResourceId</strong></li>
         * <li><strong>ResourceName</strong></li>
         * <li><strong>ResourceType</strong></li>
         * </ul>
         * <blockquote>
         * <p>You can specify at most five different filter keys. If you specify ResourceId or ResourceName, you must also specify ResourceType. The logical operator among the filter keys is AND. Results that meet all specified filter keys are returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>JobId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter key.</p>
         * <blockquote>
         * <p>You can specify at most five filter values for each filter key. The logical operator among filter values is OR. If a filter value is matched, the filter key is considered matched.</p>
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
