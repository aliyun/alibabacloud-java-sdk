// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeBgpGroupsResponseBody extends TeaModel {
    /**
     * <p>The detailed information about the BGP group.</p>
     */
    @NameInMap("BgpGroups")
    public DescribeBgpGroupsResponseBodyBgpGroups bgpGroups;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1D0971B2-A35A-42C1-A44C-E91360C36C0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBgpGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpGroupsResponseBody self = new DescribeBgpGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBgpGroupsResponseBody setBgpGroups(DescribeBgpGroupsResponseBodyBgpGroups bgpGroups) {
        this.bgpGroups = bgpGroups;
        return this;
    }
    public DescribeBgpGroupsResponseBodyBgpGroups getBgpGroups() {
        return this.bgpGroups;
    }

    public DescribeBgpGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBgpGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBgpGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBgpGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup extends TeaModel {
        /**
         * <p>The key used by the BGP group.</p>
         * 
         * <strong>example:</strong>
         * <p>!PWZ****</p>
         */
        @NameInMap("AuthKey")
        public String authKey;

        /**
         * <p>The ID of the BGP group.</p>
         * 
         * <strong>example:</strong>
         * <p>bgpg-bp1k25cyp26cllath****</p>
         */
        @NameInMap("BgpGroupId")
        public String bgpGroupId;

        /**
         * <p>The description of the BGP group.</p>
         * 
         * <strong>example:</strong>
         * <p>The description of the BGP group.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The hold time to receive BGP messages. Unit: seconds.</p>
         * <blockquote>
         * <p> If no message is received within the hold time, the BGP peer is considered disconnected.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Hold")
        public String hold;

        /**
         * <p>The IP version of the BGP group. Valid values:</p>
         * <ul>
         * <li><strong>ipv4</strong>: IPv4</li>
         * <li><strong>ipv6</strong>: IPv6. IPv6 is supported only if the VBR of the BGP group has IPv6 enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>Indicates whether the ASN is fake. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsFake")
        public String isFake;

        /**
         * <p>The keepalive time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Keepalive")
        public String keepalive;

        /**
         * <p>The ASN of the device on the Alibaba Cloud side.</p>
         * 
         * <strong>example:</strong>
         * <p>45104</p>
         */
        @NameInMap("LocalAsn")
        public String localAsn;

        /**
         * <p>The name of the BGP group.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The autonomous system number (ASN) of the on-premises device in the data center.</p>
         * 
         * <strong>example:</strong>
         * <p>1****</p>
         */
        @NameInMap("PeerAsn")
        public String peerAsn;

        /**
         * <p>The ID of the region to which the BGP group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The maximum number of route entries for BGP dynamic route learning.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("RouteLimit")
        public String routeLimit;

        /**
         * <p>The ID of the VBR.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-bp1ctxy813985gkuk****</p>
         */
        @NameInMap("RouterId")
        public String routerId;

        /**
         * <p>The status of the BGP group.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup self = new DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup();
            return TeaModel.build(map, self);
        }

        public DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

        public DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup setBgpGroupId(String bgpGroupId) {
            this.bgpGroupId = bgpGroupId;
            return this;
        }
        public String getBgpGroupId() {
            return this.bgpGroupId;
        }

        public DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup setHold(String hold) {
            this.hold = hold;
            return this;
        }
        public String getHold() {
            return this.hold;
        }

        public DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup setIsFake(String isFake) {
            this.isFake = isFake;
            return this;
        }
        public String getIsFake() {
            return this.isFake;
        }

        public DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup setKeepalive(String keepalive) {
            this.keepalive = keepalive;
            return this;
        }
        public String getKeepalive() {
            return this.keepalive;
        }

        public DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup setLocalAsn(String localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public String getLocalAsn() {
            return this.localAsn;
        }

        public DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup setPeerAsn(String peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public String getPeerAsn() {
            return this.peerAsn;
        }

        public DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup setRouteLimit(String routeLimit) {
            this.routeLimit = routeLimit;
            return this;
        }
        public String getRouteLimit() {
            return this.routeLimit;
        }

        public DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeBgpGroupsResponseBodyBgpGroups extends TeaModel {
        @NameInMap("BgpGroup")
        public java.util.List<DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup> bgpGroup;

        public static DescribeBgpGroupsResponseBodyBgpGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpGroupsResponseBodyBgpGroups self = new DescribeBgpGroupsResponseBodyBgpGroups();
            return TeaModel.build(map, self);
        }

        public DescribeBgpGroupsResponseBodyBgpGroups setBgpGroup(java.util.List<DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup> bgpGroup) {
            this.bgpGroup = bgpGroup;
            return this;
        }
        public java.util.List<DescribeBgpGroupsResponseBodyBgpGroupsBgpGroup> getBgpGroup() {
            return this.bgpGroup;
        }

    }

}
