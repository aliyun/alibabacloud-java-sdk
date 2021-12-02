// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatIpsResponseBody extends TeaModel {
    @NameInMap("NatIps")
    public java.util.List<ListNatIpsResponseBodyNatIps> natIps;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    public static ListNatIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNatIpsResponseBody self = new ListNatIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNatIpsResponseBody setNatIps(java.util.List<ListNatIpsResponseBodyNatIps> natIps) {
        this.natIps = natIps;
        return this;
    }
    public java.util.List<ListNatIpsResponseBodyNatIps> getNatIps() {
        return this.natIps;
    }

    public ListNatIpsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNatIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNatIpsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListNatIpsResponseBodyNatIps extends TeaModel {
        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("NatGatewayId")
        public String natGatewayId;

        @NameInMap("NatIp")
        public String natIp;

        @NameInMap("NatIpCidr")
        public String natIpCidr;

        @NameInMap("NatIpDescription")
        public String natIpDescription;

        @NameInMap("NatIpId")
        public String natIpId;

        @NameInMap("NatIpName")
        public String natIpName;

        @NameInMap("NatIpStatus")
        public String natIpStatus;

        public static ListNatIpsResponseBodyNatIps build(java.util.Map<String, ?> map) throws Exception {
            ListNatIpsResponseBodyNatIps self = new ListNatIpsResponseBodyNatIps();
            return TeaModel.build(map, self);
        }

        public ListNatIpsResponseBodyNatIps setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListNatIpsResponseBodyNatIps setNatGatewayId(String natGatewayId) {
            this.natGatewayId = natGatewayId;
            return this;
        }
        public String getNatGatewayId() {
            return this.natGatewayId;
        }

        public ListNatIpsResponseBodyNatIps setNatIp(String natIp) {
            this.natIp = natIp;
            return this;
        }
        public String getNatIp() {
            return this.natIp;
        }

        public ListNatIpsResponseBodyNatIps setNatIpCidr(String natIpCidr) {
            this.natIpCidr = natIpCidr;
            return this;
        }
        public String getNatIpCidr() {
            return this.natIpCidr;
        }

        public ListNatIpsResponseBodyNatIps setNatIpDescription(String natIpDescription) {
            this.natIpDescription = natIpDescription;
            return this;
        }
        public String getNatIpDescription() {
            return this.natIpDescription;
        }

        public ListNatIpsResponseBodyNatIps setNatIpId(String natIpId) {
            this.natIpId = natIpId;
            return this;
        }
        public String getNatIpId() {
            return this.natIpId;
        }

        public ListNatIpsResponseBodyNatIps setNatIpName(String natIpName) {
            this.natIpName = natIpName;
            return this;
        }
        public String getNatIpName() {
            return this.natIpName;
        }

        public ListNatIpsResponseBodyNatIps setNatIpStatus(String natIpStatus) {
            this.natIpStatus = natIpStatus;
            return this;
        }
        public String getNatIpStatus() {
            return this.natIpStatus;
        }

    }

}
