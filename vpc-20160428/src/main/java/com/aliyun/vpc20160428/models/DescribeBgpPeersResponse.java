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

    }

    public static class DescribeBgpPeersResponseBgpPeers extends TeaModel {
        @NameInMap("BgpPeer")
        @Validation(required = true)
        public java.util.List<DescribeBgpPeersResponseBgpPeersBgpPeer> bgpPeer;

        public static DescribeBgpPeersResponseBgpPeers build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpPeersResponseBgpPeers self = new DescribeBgpPeersResponseBgpPeers();
            return TeaModel.build(map, self);
        }

    }

}
