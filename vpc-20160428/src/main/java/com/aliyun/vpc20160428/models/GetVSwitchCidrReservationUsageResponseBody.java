// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVSwitchCidrReservationUsageResponseBody extends TeaModel {
    /**
     * <p>A list of reserved CIDR blocks that are in use.</p>
     */
    @NameInMap("CidrReservationUsages")
    public java.util.List<GetVSwitchCidrReservationUsageResponseBodyCidrReservationUsages> cidrReservationUsages;

    /**
     * <p>The number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The returned value of NextToken is a pagination token, which can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value is returned for <strong>NextToken</strong>, the value is the token that determines the start point of the next query.</li>
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
     * <p>54B48E3D-DF70-471B-AA93-08E683A1B45</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetVSwitchCidrReservationUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVSwitchCidrReservationUsageResponseBody self = new GetVSwitchCidrReservationUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVSwitchCidrReservationUsageResponseBody setCidrReservationUsages(java.util.List<GetVSwitchCidrReservationUsageResponseBodyCidrReservationUsages> cidrReservationUsages) {
        this.cidrReservationUsages = cidrReservationUsages;
        return this;
    }
    public java.util.List<GetVSwitchCidrReservationUsageResponseBodyCidrReservationUsages> getCidrReservationUsages() {
        return this.cidrReservationUsages;
    }

    public GetVSwitchCidrReservationUsageResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public GetVSwitchCidrReservationUsageResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetVSwitchCidrReservationUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVSwitchCidrReservationUsageResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetVSwitchCidrReservationUsageResponseBodyCidrReservationUsages extends TeaModel {
        /**
         * <p>The CIDR block allocated to the ENI from the reserved CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.64/28</p>
         */
        @NameInMap("IpPrefixCidr")
        public String ipPrefixCidr;

        /**
         * <p>The ID of the reserved CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>vcr-bp1m12saqteraw3rp****</p>
         */
        @NameInMap("IpPrefixId")
        public String ipPrefixId;

        /**
         * <p>The ID of the elastic network interface (ENI) whose CIDR block is allocated from the reserved CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-bp14v2sdd3v8htln****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The type of the resource to which a CIDR block is allocated from the reserved CIDR block. Only <strong>NetworkInterface</strong> may be returned, which indicates an ENI.</p>
         * 
         * <strong>example:</strong>
         * <p>NetworkInterface</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the reserved CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>vcr-bp1m12saqteraw3rp****</p>
         */
        @NameInMap("VSwitchCidrReservationId")
        public String vSwitchCidrReservationId;

        /**
         * <p>The ID of the vSwitch to which the reserved CIDR block belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-25navfgbue4g****</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        public static GetVSwitchCidrReservationUsageResponseBodyCidrReservationUsages build(java.util.Map<String, ?> map) throws Exception {
            GetVSwitchCidrReservationUsageResponseBodyCidrReservationUsages self = new GetVSwitchCidrReservationUsageResponseBodyCidrReservationUsages();
            return TeaModel.build(map, self);
        }

        public GetVSwitchCidrReservationUsageResponseBodyCidrReservationUsages setIpPrefixCidr(String ipPrefixCidr) {
            this.ipPrefixCidr = ipPrefixCidr;
            return this;
        }
        public String getIpPrefixCidr() {
            return this.ipPrefixCidr;
        }

        public GetVSwitchCidrReservationUsageResponseBodyCidrReservationUsages setIpPrefixId(String ipPrefixId) {
            this.ipPrefixId = ipPrefixId;
            return this;
        }
        public String getIpPrefixId() {
            return this.ipPrefixId;
        }

        public GetVSwitchCidrReservationUsageResponseBodyCidrReservationUsages setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetVSwitchCidrReservationUsageResponseBodyCidrReservationUsages setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetVSwitchCidrReservationUsageResponseBodyCidrReservationUsages setVSwitchCidrReservationId(String vSwitchCidrReservationId) {
            this.vSwitchCidrReservationId = vSwitchCidrReservationId;
            return this;
        }
        public String getVSwitchCidrReservationId() {
            return this.vSwitchCidrReservationId;
        }

        public GetVSwitchCidrReservationUsageResponseBodyCidrReservationUsages setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

    }

}
