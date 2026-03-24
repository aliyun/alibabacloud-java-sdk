// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DescribeAddressesResponseBody extends TeaModel {
    /**
     * <p>The addresses in the address book.</p>
     */
    @NameInMap("AddressList")
    public java.util.List<DescribeAddressesResponseBodyAddressList> addressList;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. If this parameter is returned, more results are available.</p>
     * <blockquote>
     * <p>Include this value in the <strong>NextToken</strong> parameter of the next request to retrieve additional results. If this parameter is not returned, all results have been retrieved.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8D8EBFB7-E1EB-5236-952A-092EDC72***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of addresses that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeAddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddressesResponseBody self = new DescribeAddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAddressesResponseBody setAddressList(java.util.List<DescribeAddressesResponseBodyAddressList> addressList) {
        this.addressList = addressList;
        return this;
    }
    public java.util.List<DescribeAddressesResponseBodyAddressList> getAddressList() {
        return this.addressList;
    }

    public DescribeAddressesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAddressesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAddressesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAddressesResponseBodyAddressList extends TeaModel {
        /**
         * <p>The IP address or CIDR block in the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The most recent modification time of the address. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1760408233000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>The ID of the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        public static DescribeAddressesResponseBodyAddressList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddressesResponseBodyAddressList self = new DescribeAddressesResponseBodyAddressList();
            return TeaModel.build(map, self);
        }

        public DescribeAddressesResponseBodyAddressList setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeAddressesResponseBodyAddressList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAddressesResponseBodyAddressList setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

    }

}
