// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeBgpGroupsResponseBody extends TeaModel {
    @NameInMap("BgpGroups")
    public DescribeBgpGroupsResponseBodyBgpGroups bgpGroups;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AuthKey")
        public String authKey;

        @NameInMap("BgpGroupId")
        public String bgpGroupId;

        @NameInMap("Description")
        public String description;

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

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RouteLimit")
        public String routeLimit;

        @NameInMap("RouterId")
        public String routerId;

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
