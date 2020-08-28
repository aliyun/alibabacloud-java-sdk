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

    }

    public static class DescribeBgpGroupsResponseBgpGroups extends TeaModel {
        @NameInMap("BgpGroup")
        @Validation(required = true)
        public java.util.List<DescribeBgpGroupsResponseBgpGroupsBgpGroup> bgpGroup;

        public static DescribeBgpGroupsResponseBgpGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeBgpGroupsResponseBgpGroups self = new DescribeBgpGroupsResponseBgpGroups();
            return TeaModel.build(map, self);
        }

    }

}
