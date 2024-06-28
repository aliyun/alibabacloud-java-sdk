// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatIpCidrsResponseBody extends TeaModel {
    /**
     * <p>The CIDR blocks of the NAT gateway.</p>
     */
    @NameInMap("NatIpCidrs")
    public java.util.List<ListNatIpCidrsResponseBodyNatIpCidrs> natIpCidrs;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <ul>
     * <li>If the value of <strong>NextToken</strong> is not returned, it indicates that no next query is to be sent.</li>
     * <li>If the value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7479A224-4A28-4895-9604-11F48BCE6A88</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of CIDR blocks that are returned.</p>
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
         * <p>The time when the CIDR block was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-06-28T20:50Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>Indicates whether the CIDR block is the default CIDR block of the NAT gateway. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The CIDR block is the default CIDR block of the NAT gateway.</li>
         * <li><strong>false</strong>: The CIDR block is not the default CIDR block of the NAT gateway.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The ID of the VPC NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-gw8v16wgvtq26vh59****</p>
         */
        @NameInMap("NatGatewayId")
        public String natGatewayId;

        /**
         * <p>The CIDR block of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/24</p>
         */
        @NameInMap("NatIpCidr")
        public String natIpCidr;

        /**
         * <p>The description of the CIDR block of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("NatIpCidrDescription")
        public String natIpCidrDescription;

        /**
         * <p>The ID of the CIDR block of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vpcnatcidr-gw8ov42ei6xh1jys2****</p>
         */
        @NameInMap("NatIpCidrId")
        public String natIpCidrId;

        /**
         * <p>The name of the CIDR block of the NAT gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>Name</p>
         */
        @NameInMap("NatIpCidrName")
        public String natIpCidrName;

        /**
         * <p>The status of the CIDR block of the NAT gateway. If <strong>Available</strong> is returned, it indicates that the CIDR block is available.</p>
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
