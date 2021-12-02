// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatIpCidrsResponseBody extends TeaModel {
    @NameInMap("NatIpCidrs")
    public java.util.List<ListNatIpCidrsResponseBodyNatIpCidrs> natIpCidrs;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("NatGatewayId")
        public String natGatewayId;

        @NameInMap("NatIpCidr")
        public String natIpCidr;

        @NameInMap("NatIpCidrDescription")
        public String natIpCidrDescription;

        @NameInMap("NatIpCidrId")
        public String natIpCidrId;

        @NameInMap("NatIpCidrName")
        public String natIpCidrName;

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
