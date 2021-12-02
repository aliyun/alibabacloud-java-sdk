// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeBgpPeersResponseBody extends TeaModel {
    @NameInMap("BgpPeers")
    public DescribeBgpPeersResponseBodyBgpPeers bgpPeers;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AuthKey")
        public String authKey;

        @NameInMap("BfdMultiHop")
        public Integer bfdMultiHop;

        @NameInMap("BgpGroupId")
        public String bgpGroupId;

        @NameInMap("BgpPeerId")
        public String bgpPeerId;

        @NameInMap("BgpStatus")
        public String bgpStatus;

        @NameInMap("Description")
        public String description;

        @NameInMap("EnableBfd")
        public Boolean enableBfd;

        @NameInMap("Hold")
        public String hold;

        @NameInMap("IpVersion")
        public String ipVersion;

        @NameInMap("IsFake")
        public String isFake;

        @NameInMap("Keepalive")
        public String keepalive;

        @NameInMap("LocalAsn")
        public String localAsn;

        @NameInMap("Name")
        public String name;

        @NameInMap("PeerAsn")
        public String peerAsn;

        @NameInMap("PeerIpAddress")
        public String peerIpAddress;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RouteLimit")
        public String routeLimit;

        @NameInMap("RouterId")
        public String routerId;

        @NameInMap("Status")
        public String status;

        public static DescribeBgpPeersResponseBodyBgpPeersBgpPeer build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpPeersResponseBodyBgpPeersBgpPeer self = new DescribeBgpPeersResponseBodyBgpPeersBgpPeer();
            return TeaModel.build(map, self);
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

        public DescribeBgpPeersResponseBodyBgpPeersBgpPeer setIsFake(String isFake) {
            this.isFake = isFake;
            return this;
        }
        public String getIsFake() {
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
