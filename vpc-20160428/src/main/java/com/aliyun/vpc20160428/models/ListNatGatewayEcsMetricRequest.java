// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatGatewayEcsMetricRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("NatGatewayId")
    @Validation(required = true)
    public String natGatewayId;

    @NameInMap("TimePoint")
    @Validation(required = true)
    public Long timePoint;

    @NameInMap("OrderKey")
    public String orderKey;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public String maxResults;

    public static ListNatGatewayEcsMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNatGatewayEcsMetricRequest self = new ListNatGatewayEcsMetricRequest();
        return TeaModel.build(map, self);
    }

}
