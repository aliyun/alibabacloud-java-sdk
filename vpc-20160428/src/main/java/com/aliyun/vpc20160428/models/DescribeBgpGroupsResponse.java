// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeBgpGroupsResponse extends TeaModel {
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

    @NameInMap("BgpGroups")
    @Validation(required = true)
    public DescribeBgpGroupsResponseBgpGroups bgpGroups;

    public static DescribeBgpGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpGroupsResponse self = new DescribeBgpGroupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBgpGroupsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBgpGroupsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeBgpGroupsResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBgpGroupsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBgpGroupsResponse setBgpGroups(DescribeBgpGroupsResponseBgpGroups bgpGroups) {
        this.bgpGroups = bgpGroups;
        return this;
    }
    public DescribeBgpGroupsResponseBgpGroups getBgpGroups() {
        return this.bgpGroups;
    }

    public static class DescribeBgpGroupsResponseBgpGroupsBgpGroup extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("BgpGroupId")
        @Validation(required = true)
        public String bgpGroupId;

        @NameInMap("PeerAsn")
        @Validation(required = true)
        public String peerAsn;

        @NameInMap("AuthKey")
        @Validation(required = true)
        public String authKey;

        @NameInMap("RouterId")
        @Validation(required = true)
        public String routerId;

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

        @NameInMap("IpVersion")
        @Validation(required = true)
        public String ipVersion;

        public static DescribeBgpGroupsResponseBgpGroupsBgpGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpGroupsResponseBgpGroupsBgpGroup self = new DescribeBgpGroupsResponseBgpGroupsBgpGroup();
            return TeaModel.build(map, self);
        }

        public DescribeBgpGroupsResponseBgpGroupsBgpGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBgpGroupsResponseBgpGroupsBgpGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBgpGroupsResponseBgpGroupsBgpGroup setBgpGroupId(String bgpGroupId) {
            this.bgpGroupId = bgpGroupId;
            return this;
        }
        public String getBgpGroupId() {
            return this.bgpGroupId;
        }

        public DescribeBgpGroupsResponseBgpGroupsBgpGroup setPeerAsn(String peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public String getPeerAsn() {
            return this.peerAsn;
        }

        public DescribeBgpGroupsResponseBgpGroupsBgpGroup setAuthKey(String authKey) {
            this.authKey = authKey;
            return this;
        }
        public String getAuthKey() {
            return this.authKey;
        }

        public DescribeBgpGroupsResponseBgpGroupsBgpGroup setRouterId(String routerId) {
            this.routerId = routerId;
            return this;
        }
        public String getRouterId() {
            return this.routerId;
        }

        public DescribeBgpGroupsResponseBgpGroupsBgpGroup setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBgpGroupsResponseBgpGroupsBgpGroup setKeepalive(String keepalive) {
            this.keepalive = keepalive;
            return this;
        }
        public String getKeepalive() {
            return this.keepalive;
        }

        public DescribeBgpGroupsResponseBgpGroupsBgpGroup setLocalAsn(String localAsn) {
            this.localAsn = localAsn;
            return this;
        }
        public String getLocalAsn() {
            return this.localAsn;
        }

        public DescribeBgpGroupsResponseBgpGroupsBgpGroup setHold(String hold) {
            this.hold = hold;
            return this;
        }
        public String getHold() {
            return this.hold;
        }

        public DescribeBgpGroupsResponseBgpGroupsBgpGroup setIsFake(String isFake) {
            this.isFake = isFake;
            return this;
        }
        public String getIsFake() {
            return this.isFake;
        }

        public DescribeBgpGroupsResponseBgpGroupsBgpGroup setRouteLimit(String routeLimit) {
            this.routeLimit = routeLimit;
            return this;
        }
        public String getRouteLimit() {
            return this.routeLimit;
        }

        public DescribeBgpGroupsResponseBgpGroupsBgpGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeBgpGroupsResponseBgpGroupsBgpGroup setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

    }

    public static class DescribeBgpGroupsResponseBgpGroups extends TeaModel {
        @NameInMap("BgpGroup")
        @Validation(required = true)
        public java.util.List<DescribeBgpGroupsResponseBgpGroupsBgpGroup> bgpGroup;

        public static DescribeBgpGroupsResponseBgpGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpGroupsResponseBgpGroups self = new DescribeBgpGroupsResponseBgpGroups();
            return TeaModel.build(map, self);
        }

        public DescribeBgpGroupsResponseBgpGroups setBgpGroup(java.util.List<DescribeBgpGroupsResponseBgpGroupsBgpGroup> bgpGroup) {
            this.bgpGroup = bgpGroup;
            return this;
        }
        public java.util.List<DescribeBgpGroupsResponseBgpGroupsBgpGroup> getBgpGroup() {
            return this.bgpGroup;
        }

    }

}
