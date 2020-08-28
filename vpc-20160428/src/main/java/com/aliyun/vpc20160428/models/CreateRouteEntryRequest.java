// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateRouteEntryRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RouteTableId")
    @Validation(required = true)
    public String routeTableId;

    @NameInMap("DestinationCidrBlock")
    @Validation(required = true)
    public String destinationCidrBlock;

    @NameInMap("NextHopId")
    public String nextHopId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RouteEntryName")
    public String routeEntryName;

    @NameInMap("Description")
    public String description;

    @NameInMap("NextHopType")
    public String nextHopType;

    @NameInMap("NextHopList")
    public java.util.List<CreateRouteEntryRequestNextHopList> nextHopList;

    public static CreateRouteEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteEntryRequest self = new CreateRouteEntryRequest();
        return TeaModel.build(map, self);
    }

    public static class CreateRouteEntryRequestNextHopList extends TeaModel {
        @NameInMap("NextHopType")
        @Validation(required = true)
        public String nextHopType;

        @NameInMap("NextHopId")
        @Validation(required = true)
        public String nextHopId;

        @NameInMap("Weight")
        @Validation(required = true)
        public Integer weight;

        public static CreateRouteEntryRequestNextHopList build(java.util.Map<String, ?> map) throws Exception {
            CreateRouteEntryRequestNextHopList self = new CreateRouteEntryRequestNextHopList();
            return TeaModel.build(map, self);
        }

    }

}
