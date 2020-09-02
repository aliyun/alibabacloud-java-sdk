// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeBgpPeersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("BgpPeers")
    @Validation(required = true)
    public DescribeBgpPeersResponseBgpPeers bgpPeers;

    public static DescribeBgpPeersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpPeersResponse self = new DescribeBgpPeersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBgpPeersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBgpPeersResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeBgpPeersResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBgpPeersResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBgpPeersResponse setBgpPeers(DescribeBgpPeersResponseBgpPeers bgpPeers) {
        this.bgpPeers = bgpPeers;
        return this;
    }
    public DescribeBgpPeersResponseBgpPeers getBgpPeers() {
        return this.bgpPeers;
    }

    public static class DescribeBgpPeersResponseBgpPeersBgpPeer extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("BgpPeerId")
        @Validation(required = true)
        public String bgpPeerId;

        @NameInMap("BgpGroupId")
        @Validation(required = true)
        public String bgpGroupId;

        @NameInMap("PeerIpAddress")
        @Validation(required = true)
        public String peerIpAddress;

        @NameInMap("PeerAsn")
        @Validation(required = true)
        public String peerAsn;

        @NameInMap("AuthKey")
        @Validation(required = true)
        public String authKey;

        @NameInMap("RouterId")
        @Validation(required = true)
        public String routerId;

        @NameInMap("BgpStatus")
        @Validation(required = true)
        public String bgpStatus;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("Keepalive")
        @Validation(required = true)
        public String keepalive;

        @NameInMap("LocalAsn")
        @Validation(required = true)
        public String localAsn;

        @NameInMap("Hold")
        @Validation(required = true)
        public String hold;

        @NameInMap("IsFake")
        @Validation(required = true)
        public String isFake;

        @NameInMap("RouteLimit")
        @Validation(required = true)
        public String routeLimit;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("EnableBfd")
        @Validation(required = true)
        public Boolean enableBfd;

        @NameInMap("IpVersion")
        @Validation(required = true)
        public String ipVersion;

        @NameInMap("BfdMultiHop")
        @Validation(required = true)
        public Integer bfdMultiHop;

        public static DescribeBgpPeersResponseBgpPeersBgpPeer build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpPeersResponseBgpPeersBgpPeer self = new DescribeBgpPeersResponseBgpPeersBgpPeer();
            return TeaModel.build(map, self);
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setBgpPeerId(String bgpPeerId) {
            this.bgpPeerId = bgpPeerId;
            return this;
        }
        public String getBgpPeerId() {
            return this.bgpPeerId;
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setBgpGroupId(String bgpGroupId) {
            this.bgpGroupId = bgpGroupId;
            return this;
        }
        public String getBgpGroupId() {
            return this.bgpGroupId;
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setPeerIpAddress(String peerIpAddress) {
            this.peerIpAddress = peerIpAddress;
            return this;
        }
        public String getPeerIpAddress() {
            return this.peerIpAddress;
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setPeerAsn(String peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public String getPeerAsn() {
            return this.peerAsn;
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setBgpStatus(String bgpStatus) {
            this.bgpStatus = bgpStatus;
            return this;
        }
        public String getBgpStatus() {
            return this.bgpStatus;
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setKeepalive(String keepalive) {
            this.keepalive = keepalive;
            return this;
        }
        public String getKeepalive() {
            return this.keepalive;
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setLocalAsn(String localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public String getLocalAsn() {
            return this.localAsn;
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setHold(String hold) {
            this.hold = hold;
            return this;
        }
        public String getHold() {
            return this.hold;
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setIsFake(String isFake) {
            this.isFake = isFake;
            return this;
        }
        public String getIsFake() {
            return this.isFake;
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setRouteLimit(String routeLimit) {
            this.routeLimit = routeLimit;
            return this;
        }
        public String getRouteLimit() {
            return this.routeLimit;
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setEnableBfd(Boolean enableBfd) {
            this.enableBfd = enableBfd;
            return this;
        }
        public Boolean getEnableBfd() {
            return this.enableBfd;
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public DescribeBgpPeersResponseBgpPeersBgpPeer setBfdMultiHop(Integer bfdMultiHop) {
            this.bfdMultiHop = bfdMultiHop;
            return this;
        }
        public Integer getBfdMultiHop() {
            return this.bfdMultiHop;
        }

    }

    public static class DescribeBgpPeersResponseBgpPeers extends TeaModel {
        @NameInMap("BgpPeer")
        @Validation(required = true)
        public java.util.List<DescribeBgpPeersResponseBgpPeersBgpPeer> bgpPeer;

        public static DescribeBgpPeersResponseBgpPeers build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpPeersResponseBgpPeers self = new DescribeBgpPeersResponseBgpPeers();
            return TeaModel.build(map, self);
        }

        public DescribeBgpPeersResponseBgpPeers setBgpPeer(java.util.List<DescribeBgpPeersResponseBgpPeersBgpPeer> bgpPeer) {
            this.bgpPeer = bgpPeer;
            return this;
        }
        public java.util.List<DescribeBgpPeersResponseBgpPeersBgpPeer> getBgpPeer() {
            return this.bgpPeer;
        }

    }

}
