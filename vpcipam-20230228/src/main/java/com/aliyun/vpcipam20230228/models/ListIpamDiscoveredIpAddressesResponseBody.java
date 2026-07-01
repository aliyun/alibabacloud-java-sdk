// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class ListIpamDiscoveredIpAddressesResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("IpamDiscoveredIpAddresses")
    public java.util.List<ListIpamDiscoveredIpAddressesResponseBodyIpamDiscoveredIpAddresses> ipamDiscoveredIpAddresses;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListIpamDiscoveredIpAddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIpamDiscoveredIpAddressesResponseBody self = new ListIpamDiscoveredIpAddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIpamDiscoveredIpAddressesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListIpamDiscoveredIpAddressesResponseBody setIpamDiscoveredIpAddresses(java.util.List<ListIpamDiscoveredIpAddressesResponseBodyIpamDiscoveredIpAddresses> ipamDiscoveredIpAddresses) {
        this.ipamDiscoveredIpAddresses = ipamDiscoveredIpAddresses;
        return this;
    }
    public java.util.List<ListIpamDiscoveredIpAddressesResponseBodyIpamDiscoveredIpAddresses> getIpamDiscoveredIpAddresses() {
        return this.ipamDiscoveredIpAddresses;
    }

    public ListIpamDiscoveredIpAddressesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListIpamDiscoveredIpAddressesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListIpamDiscoveredIpAddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIpamDiscoveredIpAddressesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListIpamDiscoveredIpAddressesResponseBodyIpamDiscoveredIpAddresses extends TeaModel {
        @NameInMap("IpAddress")
        public String ipAddress;

        @NameInMap("IpVersion")
        public String ipVersion;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceRegionId")
        public String resourceRegionId;

        @NameInMap("ResourceServiceType")
        public String resourceServiceType;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static ListIpamDiscoveredIpAddressesResponseBodyIpamDiscoveredIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            ListIpamDiscoveredIpAddressesResponseBodyIpamDiscoveredIpAddresses self = new ListIpamDiscoveredIpAddressesResponseBodyIpamDiscoveredIpAddresses();
            return TeaModel.build(map, self);
        }

        public ListIpamDiscoveredIpAddressesResponseBodyIpamDiscoveredIpAddresses setIpAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public String getIpAddress() {
            return this.ipAddress;
        }

        public ListIpamDiscoveredIpAddressesResponseBodyIpamDiscoveredIpAddresses setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public ListIpamDiscoveredIpAddressesResponseBodyIpamDiscoveredIpAddresses setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public ListIpamDiscoveredIpAddressesResponseBodyIpamDiscoveredIpAddresses setResourceRegionId(String resourceRegionId) {
            this.resourceRegionId = resourceRegionId;
            return this;
        }
        public String getResourceRegionId() {
            return this.resourceRegionId;
        }

        public ListIpamDiscoveredIpAddressesResponseBodyIpamDiscoveredIpAddresses setResourceServiceType(String resourceServiceType) {
            this.resourceServiceType = resourceServiceType;
            return this;
        }
        public String getResourceServiceType() {
            return this.resourceServiceType;
        }

        public ListIpamDiscoveredIpAddressesResponseBodyIpamDiscoveredIpAddresses setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListIpamDiscoveredIpAddressesResponseBodyIpamDiscoveredIpAddresses setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
