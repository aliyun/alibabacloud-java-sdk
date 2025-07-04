// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamPoolCidrsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The IDs of IPAM pools.</p>
     */
    @NameInMap("IpamPoolCidrs")
    public java.util.List<ListIpamPoolCidrsResponseBodyIpamPoolCidrs> ipamPoolCidrs;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9E7CCB95-62E0-534D-9B9A-71F27E8B71B1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListIpamPoolCidrsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpamPoolCidrsResponseBody self = new ListIpamPoolCidrsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpamPoolCidrsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListIpamPoolCidrsResponseBody setIpamPoolCidrs(java.util.List<ListIpamPoolCidrsResponseBodyIpamPoolCidrs> ipamPoolCidrs) {
        this.ipamPoolCidrs = ipamPoolCidrs;
        return this;
    }
    public java.util.List<ListIpamPoolCidrsResponseBodyIpamPoolCidrs> getIpamPoolCidrs() {
        return this.ipamPoolCidrs;
    }

    public ListIpamPoolCidrsResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListIpamPoolCidrsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamPoolCidrsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpamPoolCidrsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpamPoolCidrsResponseBodyIpamPoolCidrs extends TeaModel {
        /**
         * <p>The provisioned CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The ID of the IPAM pool.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-6rcq3tobayc20t****</p>
         */
        @NameInMap("IpamPoolId")
        public String ipamPoolId;

        /**
         * <p>The status of the CIDR block provisioned to the IPAM pool. Valid values:</p>
         * <ul>
         * <li><strong>Created</strong></li>
         * <li><strong>Deleted</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListIpamPoolCidrsResponseBodyIpamPoolCidrs build(java.util.Map<String, ?> map) throws Exception {
            ListIpamPoolCidrsResponseBodyIpamPoolCidrs self = new ListIpamPoolCidrsResponseBodyIpamPoolCidrs();
            return TeaModel.build(map, self);
        }

        public ListIpamPoolCidrsResponseBodyIpamPoolCidrs setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public ListIpamPoolCidrsResponseBodyIpamPoolCidrs setIpamPoolId(String ipamPoolId) {
            this.ipamPoolId = ipamPoolId;
            return this;
        }
        public String getIpamPoolId() {
            return this.ipamPoolId;
        }

        public ListIpamPoolCidrsResponseBodyIpamPoolCidrs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
