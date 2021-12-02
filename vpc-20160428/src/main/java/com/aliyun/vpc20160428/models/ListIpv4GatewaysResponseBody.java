// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListIpv4GatewaysResponseBody extends TeaModel {
    @NameInMap("Ipv4GatewayModels")
    public java.util.List<ListIpv4GatewaysResponseBodyIpv4GatewayModels> ipv4GatewayModels;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    public static ListIpv4GatewaysResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpv4GatewaysResponseBody self = new ListIpv4GatewaysResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpv4GatewaysResponseBody setIpv4GatewayModels(java.util.List<ListIpv4GatewaysResponseBodyIpv4GatewayModels> ipv4GatewayModels) {
        this.ipv4GatewayModels = ipv4GatewayModels;
        return this;
    }
    public java.util.List<ListIpv4GatewaysResponseBodyIpv4GatewayModels> getIpv4GatewayModels() {
        return this.ipv4GatewayModels;
    }

    public ListIpv4GatewaysResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpv4GatewaysResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpv4GatewaysResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpv4GatewaysResponseBodyIpv4GatewayModels extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Ipv4GatewayDescription")
        public String ipv4GatewayDescription;

        @NameInMap("Ipv4GatewayId")
        public String ipv4GatewayId;

        @NameInMap("Ipv4GatewayName")
        public String ipv4GatewayName;

        @NameInMap("Ipv4GatewayRouteTableId")
        public String ipv4GatewayRouteTableId;

        @NameInMap("Status")
        public String status;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListIpv4GatewaysResponseBodyIpv4GatewayModels build(java.util.Map<String, ?> map) throws Exception {
            ListIpv4GatewaysResponseBodyIpv4GatewayModels self = new ListIpv4GatewaysResponseBodyIpv4GatewayModels();
            return TeaModel.build(map, self);
        }

        public ListIpv4GatewaysResponseBodyIpv4GatewayModels setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListIpv4GatewaysResponseBodyIpv4GatewayModels setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListIpv4GatewaysResponseBodyIpv4GatewayModels setIpv4GatewayDescription(String ipv4GatewayDescription) {
            this.ipv4GatewayDescription = ipv4GatewayDescription;
            return this;
        }
        public String getIpv4GatewayDescription() {
            return this.ipv4GatewayDescription;
        }

        public ListIpv4GatewaysResponseBodyIpv4GatewayModels setIpv4GatewayId(String ipv4GatewayId) {
            this.ipv4GatewayId = ipv4GatewayId;
            return this;
        }
        public String getIpv4GatewayId() {
            return this.ipv4GatewayId;
        }

        public ListIpv4GatewaysResponseBodyIpv4GatewayModels setIpv4GatewayName(String ipv4GatewayName) {
            this.ipv4GatewayName = ipv4GatewayName;
            return this;
        }
        public String getIpv4GatewayName() {
            return this.ipv4GatewayName;
        }

        public ListIpv4GatewaysResponseBodyIpv4GatewayModels setIpv4GatewayRouteTableId(String ipv4GatewayRouteTableId) {
            this.ipv4GatewayRouteTableId = ipv4GatewayRouteTableId;
            return this;
        }
        public String getIpv4GatewayRouteTableId() {
            return this.ipv4GatewayRouteTableId;
        }

        public ListIpv4GatewaysResponseBodyIpv4GatewayModels setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIpv4GatewaysResponseBodyIpv4GatewayModels setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
