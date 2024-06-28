// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeBgpPeersResponseBody extends TeaModel {
    /**
     * <p>The information about the BGP peer.</p>
     */
    @NameInMap("BgpPeers")
    public DescribeBgpPeersResponseBodyBgpPeers bgpPeers;

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
     * <p>DE77A7F3-3B74-41C0-A5BC-CAFD188C28B6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBgpPeersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpPeersResponseBody self = new DescribeBgpPeersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBgpPeersResponseBody setBgpPeers(DescribeBgpPeersResponseBodyBgpPeers bgpPeers) {
        this.bgpPeers = bgpPeers;
        return this;
    }
    public DescribeBgpPeersResponseBodyBgpPeers getBgpPeers() {
        return this.bgpPeers;
    }

    public DescribeBgpPeersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBgpPeersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBgpPeersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBgpPeersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBgpPeersResponseBodyBgpPeersBgpPeer extends TeaModel {
        /**
         * <p>The number of advertised routes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AdvertisedRouteCount")
        public Integer advertisedRouteCount;

        /**
         * <p>The authentication key of the BGP group.</p>
         * 
         * <strong>example:</strong>
         * <p>!PWZ****</p>
         */
        @NameInMap("AuthKey")
        public String authKey;

        /**
         * <p>The Bidirectional Forwarding Detection (BFD) hop count.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BfdMultiHop")
        public Integer bfdMultiHop;

        /**
         * <p>The ID of the BGP group.</p>
         * 
         * <strong>example:</strong>
         * <p>bgpg-2zev8h2wo414sfh****</p>
         */
        @NameInMap("BgpGroupId")
        public String bgpGroupId;

        /**
         * <p>The ID of the BGP peer.</p>
         * 
         * <strong>example:</strong>
         * <p>bgp-2ze3un0ft1jd1xd****</p>
         */
        @NameInMap("BgpPeerId")
        public String bgpPeerId;

        /**
         * <p>The status of the BGP connection. Valid values:</p>
         * <ul>
         * <li><strong>Idle</strong>: The BGP connection is not used.</li>
         * <li><strong>Connect</strong>: The BGP connection is used.</li>
         * <li><strong>Active</strong>: The BGP connection is available.</li>
         * <li><strong>Established</strong>: The BGP connection is established.</li>
         * <li><strong>Down</strong>: The BGP connection is unavailable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Connect</p>
         */
        @NameInMap("BgpStatus")
        public String bgpStatus;

        /**
         * <p>The description of the BGP group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether BFD is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableBfd")
        public Boolean enableBfd;

        /**
         * <p>The time when the BGP peer is modified.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-20T07:29:08Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The hold time.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Hold")
        public String hold;

        /**
         * <p>The version of the IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("IpVersion")
        public String ipVersion;

        /**
         * <p>Indicates whether a fake autonomous system number (ASN) is used. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsFake")
        public Boolean isFake;

        /**
         * <p>The Keepalive interval.</p>
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
         * <p>The name of the BGP peer.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The autonomous system number (ASN)of the BGP peer.</p>
         * 
         * <strong>example:</strong>
         * <p>65515</p>
         */
        @NameInMap("PeerAsn")
        public String peerAsn;

        /**
         * <p>The IP address of the BGP peer.</p>
         * 
         * <strong>example:</strong>
         * <p>116.62.XX.XX</p>
         */
        @NameInMap("PeerIpAddress")
        public String peerIpAddress;

        /**
         * <p>The number of received routes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReceivedRouteCount")
        public Integer receivedRouteCount;

        /**
         * <p>The ID of the region to which the BGP group belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The maximum number of routes.</p>
         * 
         * <strong>example:</strong>
         * <p>110</p>
         */
        @NameInMap("RouteLimit")
        public String routeLimit;

        /**
         * <p>The Router ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-2zecmmvg5gvu8i4te****</p>
         */
        @NameInMap("RouterId")
        public String routerId;

        /**
         * <p>The status of the BGP peer. Valid values:</p>
         * <ul>
         * <li><strong>Pending</strong></li>
         * <li><strong>Available</strong></li>
         * <li><strong>Modifying</strong></li>
         * <li><strong>Deleting</strong></li>
         * <li><strong>Deleted</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeBgpPeersResponseBodyBgpPeersBgpPeer build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpPeersResponseBodyBgpPeersBgpPeer self = new DescribeBgpPeersResponseBodyBgpPeersBgpPeer();
            return TeaModel.build(map, self);
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setAdvertisedRouteCount(Integer advertisedRouteCount) {
            this.advertisedRouteCount = advertisedRouteCount;
            return this;
        }
        public Integer getAdvertisedRouteCount() {
            return this.advertisedRouteCount;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setBfdMultiHop(Integer bfdMultiHop) {
            this.bfdMultiHop = bfdMultiHop;
            return this;
        }
        public Integer getBfdMultiHop() {
            return this.bfdMultiHop;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setBgpGroupId(String bgpGroupId) {
            this.bgpGroupId = bgpGroupId;
            return this;
        }
        public String getBgpGroupId() {
            return this.bgpGroupId;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setBgpPeerId(String bgpPeerId) {
            this.bgpPeerId = bgpPeerId;
            return this;
        }
        public String getBgpPeerId() {
            return this.bgpPeerId;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setBgpStatus(String bgpStatus) {
            this.bgpStatus = bgpStatus;
            return this;
        }
        public String getBgpStatus() {
            return this.bgpStatus;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setEnableBfd(Boolean enableBfd) {
            this.enableBfd = enableBfd;
            return this;
        }
        public Boolean getEnableBfd() {
            return this.enableBfd;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setHold(String hold) {
            this.hold = hold;
            return this;
        }
        public String getHold() {
            return this.hold;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setIsFake(Boolean isFake) {
            this.isFake = isFake;
            return this;
        }
        public Boolean getIsFake() {
            return this.isFake;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setKeepalive(String keepalive) {
            this.keepalive = keepalive;
            return this;
        }
        public String getKeepalive() {
            return this.keepalive;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setLocalAsn(String localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public String getLocalAsn() {
            return this.localAsn;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setPeerAsn(String peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public String getPeerAsn() {
            return this.peerAsn;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setPeerIpAddress(String peerIpAddress) {
            this.peerIpAddress = peerIpAddress;
            return this;
        }
        public String getPeerIpAddress() {
            return this.peerIpAddress;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setReceivedRouteCount(Integer receivedRouteCount) {
            this.receivedRouteCount = receivedRouteCount;
            return this;
        }
        public Integer getReceivedRouteCount() {
            return this.receivedRouteCount;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setRouteLimit(String routeLimit) {
            this.routeLimit = routeLimit;
            return this;
        }
        public String getRouteLimit() {
            return this.routeLimit;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeBgpPeersResponseBodyBgpPeers extends TeaModel {
        @NameInMap("BgpPeer")
        public java.util.List<DescribeBgpPeersResponseBodyBgpPeersBgpPeer> bgpPeer;

        public static DescribeBgpPeersResponseBodyBgpPeers build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpPeersResponseBodyBgpPeers self = new DescribeBgpPeersResponseBodyBgpPeers();
            return TeaModel.build(map, self);
        }

        public DescribeBgpPeersResponseBodyBgpPeers setBgpPeer(java.util.List<DescribeBgpPeersResponseBodyBgpPeersBgpPeer> bgpPeer) {
            this.bgpPeer = bgpPeer;
            return this;
        }
        public java.util.List<DescribeBgpPeersResponseBodyBgpPeersBgpPeer> getBgpPeer() {
            return this.bgpPeer;
        }

    }

}
