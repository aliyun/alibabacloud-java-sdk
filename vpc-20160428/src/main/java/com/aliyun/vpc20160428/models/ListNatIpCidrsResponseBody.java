// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatIpCidrsResponseBody extends TeaModel {
    /**
     * <p>The list of NAT CIDR blocks.</p>
     */
    @NameInMap("NatIpCidrs")
    public java.util.List<ListNatIpCidrsResponseBodyNatIpCidrs> natIpCidrs;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no subsequent requests exist.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7479A224-4A28-4895-9604-11F48BCE6A88</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of NAT CIDR block entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListNatIpCidrsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNatIpCidrsResponseBody self = new ListNatIpCidrsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNatIpCidrsResponseBody setNatIpCidrs(java.util.List<ListNatIpCidrsResponseBodyNatIpCidrs> natIpCidrs) {
        this.natIpCidrs = natIpCidrs;
        return this;
    }
    public java.util.List<ListNatIpCidrsResponseBodyNatIpCidrs> getNatIpCidrs() {
        return this.natIpCidrs;
    }

    public ListNatIpCidrsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNatIpCidrsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNatIpCidrsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListNatIpCidrsResponseBodyNatIpCidrs extends TeaModel {
        /**
         * <p>The time when the NAT CIDR block was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-28T20:50Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether the NAT CIDR block is the default NAT CIDR block. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The NAT CIDR block is the default NAT CIDR block.</li>
         * <li><strong>false</strong>: The NAT CIDR block is not the default NAT CIDR block.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The instance ID of the VPC NAT gateway to which the NAT CIDR block belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-gw8v16wgvtq26vh59****</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The NAT CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/24</p>
         */
        @NameInMap("NatIpCidr")
        public String natIpCidr;

        /**
         * <p>The description of the NAT CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NatIpCidrDescription")
        public String natIpCidrDescription;

        /**
         * <p>The instance ID of the NAT CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>vpcnatcidr-gw8ov42ei6xh1jys2****</p>
         */
        @NameInMap("NatIpCidrId")
        public String natIpCidrId;

        /**
         * <p>The name of the NAT CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("NatIpCidrName")
        public String natIpCidrName;

        /**
         * <p>The status of the NAT CIDR block. The value is <strong>Available</strong>, which indicates that the NAT CIDR block is available.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("NatIpCidrStatus")
        public String natIpCidrStatus;

        public static ListNatIpCidrsResponseBodyNatIpCidrs build(java.util.Map<String, ?> map) throws Exception {
            ListNatIpCidrsResponseBodyNatIpCidrs self = new ListNatIpCidrsResponseBodyNatIpCidrs();
            return TeaModel.build(map, self);
        }

        public ListNatIpCidrsResponseBodyNatIpCidrs setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListNatIpCidrsResponseBodyNatIpCidrs setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListNatIpCidrsResponseBodyNatIpCidrs setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public ListNatIpCidrsResponseBodyNatIpCidrs setNatIpCidr(String natIpCidr) {
            this.natIpCidr = natIpCidr;
            return this;
        }
        public String getNatIpCidr() {
            return this.natIpCidr;
        }

        public ListNatIpCidrsResponseBodyNatIpCidrs setNatIpCidrDescription(String natIpCidrDescription) {
            this.natIpCidrDescription = natIpCidrDescription;
            return this;
        }
        public String getNatIpCidrDescription() {
            return this.natIpCidrDescription;
        }

        public ListNatIpCidrsResponseBodyNatIpCidrs setNatIpCidrId(String natIpCidrId) {
            this.natIpCidrId = natIpCidrId;
            return this;
        }
        public String getNatIpCidrId() {
            return this.natIpCidrId;
        }

        public ListNatIpCidrsResponseBodyNatIpCidrs setNatIpCidrName(String natIpCidrName) {
            this.natIpCidrName = natIpCidrName;
            return this;
        }
        public String getNatIpCidrName() {
            return this.natIpCidrName;
        }

        public ListNatIpCidrsResponseBodyNatIpCidrs setNatIpCidrStatus(String natIpCidrStatus) {
            this.natIpCidrStatus = natIpCidrStatus;
            return this;
        }
        public String getNatIpCidrStatus() {
            return this.natIpCidrStatus;
        }

    }

}
