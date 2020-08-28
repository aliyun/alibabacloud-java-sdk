// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteRouteEntryRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RouteTableId")
    public String routeTableId;

    @NameInMap("RouteEntryId")
    public String routeEntryId;

    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    @NameInMap("NextHopId")
    public String nextHopId;

    @NameInMap("NextHopList")
    public java.util.List<DeleteRouteEntryRequestNextHopList> nextHopList;

    public static DeleteRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteEntryRequest self = new DeleteRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public static class DeleteRouteEntryRequestNextHopList extends TeaModel {
        @NameInMap("NextHopType")
        @Validation(required = true)
        public String nextHopType;

        @NameInMap("NextHopId")
        @Validation(required = true)
        public String nextHopId;

        public static DeleteRouteEntryRequestNextHopList build(java.util.Map<String, ?> map) throws Exception {
            DeleteRouteEntryRequestNextHopList self = new DeleteRouteEntryRequestNextHopList();
            return TeaModel.build(map, self);
        }

    }

}
