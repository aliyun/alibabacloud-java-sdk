// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListNatGatewayEcsMetricRequest extends TeaModel {
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OrderKey")
    public String orderKey;

    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TimePoint")
    public Long timePoint;

    public static ListNatGatewayEcsMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNatGatewayEcsMetricRequest self = new ListNatGatewayEcsMetricRequest();
        return TeaModel.build(map, self);
    }

    public ListNatGatewayEcsMetricRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ListNatGatewayEcsMetricRequest setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListNatGatewayEcsMetricRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public ListNatGatewayEcsMetricRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNatGatewayEcsMetricRequest setOrderKey(String orderKey) {
        this.orderKey = orderKey;
        return this;
    }
    public String getOrderKey() {
        return this.orderKey;
    }

    public ListNatGatewayEcsMetricRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public ListNatGatewayEcsMetricRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public ListNatGatewayEcsMetricRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListNatGatewayEcsMetricRequest setTimePoint(Long timePoint) {
        this.timePoint = timePoint;
        return this;
    }
    public Long getTimePoint() {
        return this.timePoint;
    }

}
