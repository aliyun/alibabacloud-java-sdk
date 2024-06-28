// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListIpv4GatewaysResponseBody extends TeaModel {
    /**
     * <p>The list of IPv4 gateways.</p>
     */
    @NameInMap("Ipv4GatewayModels")
    public java.util.List<ListIpv4GatewaysResponseBodyIpv4GatewayModels> ipv4GatewayModels;

    /**
     * <p>The token that is used for the next query. Valid values:</p>
     * <ul>
     * <li>If no value is returned for <strong>NextToken</strong>, no next queries are sent.</li>
     * <li>If a value of <strong>NextToken</strong> is returned, the value is the token that is used for the subsequent query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2D265800-E306-529C-8418-84B0A1D201DB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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

    public static class ListIpv4GatewaysResponseBodyIpv4GatewayModelsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceDept</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListIpv4GatewaysResponseBodyIpv4GatewayModelsTags build(java.util.Map<String, ?> map) throws Exception {
            ListIpv4GatewaysResponseBodyIpv4GatewayModelsTags self = new ListIpv4GatewaysResponseBodyIpv4GatewayModelsTags();
            return TeaModel.build(map, self);
        }

        public ListIpv4GatewaysResponseBodyIpv4GatewayModelsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListIpv4GatewaysResponseBodyIpv4GatewayModelsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListIpv4GatewaysResponseBodyIpv4GatewayModels extends TeaModel {
        /**
         * <p>Indicates whether the IPv4 gateway is activated. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The time when the IPv4 gateway was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-02T07:07:35Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The description of the IPv4 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Ipv4GatewayDescription")
        public String ipv4GatewayDescription;

        /**
         * <p>The ID of the IPv4 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4gw-5tsnc6s4ogsedtp3k****</p>
         */
        @NameInMap("Ipv4GatewayId")
        public String ipv4GatewayId;

        /**
         * <p>The name of the IPv4 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Ipv4GatewayName")
        public String ipv4GatewayName;

        /**
         * <p>The ID of the route table associated with the IPv4 gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-5ts0ohchwkp3dydt2****</p>
         */
        @NameInMap("Ipv4GatewayRouteTableId")
        public String ipv4GatewayRouteTableId;

        /**
         * <p>The ID of the resource group to which the IPv4 gateway belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4ph****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The status of the IPv4 gateway. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Created</strong></li>
         * <li><strong>Modifying</strong></li>
         * <li><strong>Deleting</strong></li>
         * <li><strong>Deleted</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of tags that are added to the resource group.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListIpv4GatewaysResponseBodyIpv4GatewayModelsTags> tags;

        /**
         * <p>The ID of the VPC with which the IPv4 gateways are associated.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-5tsrxlw7dv074gci4****</p>
         */
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

        public ListIpv4GatewaysResponseBodyIpv4GatewayModels setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListIpv4GatewaysResponseBodyIpv4GatewayModels setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListIpv4GatewaysResponseBodyIpv4GatewayModels setTags(java.util.List<ListIpv4GatewaysResponseBodyIpv4GatewayModelsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListIpv4GatewaysResponseBodyIpv4GatewayModelsTags> getTags() {
            return this.tags;
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
