// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetTransitRouterFlowTopNShrinkRequest extends TeaModel {
    @NameInMap("AccountIds")
    public String accountIdsShrink;

    @NameInMap("BandwithPackageId")
    public String bandwithPackageId;

    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("GroupBy")
    public String groupBy;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("OtherIp")
    public String otherIp;

    @NameInMap("OtherPort")
    public String otherPort;

    @NameInMap("OtherRegion")
    public String otherRegion;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("ThisIp")
    public String thisIp;

    @NameInMap("ThisPort")
    public String thisPort;

    @NameInMap("ThisRegion")
    public String thisRegion;

    @NameInMap("TopN")
    public Integer topN;

    @NameInMap("UseMultiAccount")
    public Boolean useMultiAccount;

    public static GetTransitRouterFlowTopNShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTransitRouterFlowTopNShrinkRequest self = new GetTransitRouterFlowTopNShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetTransitRouterFlowTopNShrinkRequest setAccountIdsShrink(String accountIdsShrink) {
        this.accountIdsShrink = accountIdsShrink;
        return this;
    }
    public String getAccountIdsShrink() {
        return this.accountIdsShrink;
    }

    public GetTransitRouterFlowTopNShrinkRequest setBandwithPackageId(String bandwithPackageId) {
        this.bandwithPackageId = bandwithPackageId;
        return this;
    }
    public String getBandwithPackageId() {
        return this.bandwithPackageId;
    }

    public GetTransitRouterFlowTopNShrinkRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetTransitRouterFlowTopNShrinkRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public GetTransitRouterFlowTopNShrinkRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public GetTransitRouterFlowTopNShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetTransitRouterFlowTopNShrinkRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public GetTransitRouterFlowTopNShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetTransitRouterFlowTopNShrinkRequest setOtherIp(String otherIp) {
        this.otherIp = otherIp;
        return this;
    }
    public String getOtherIp() {
        return this.otherIp;
    }

    public GetTransitRouterFlowTopNShrinkRequest setOtherPort(String otherPort) {
        this.otherPort = otherPort;
        return this;
    }
    public String getOtherPort() {
        return this.otherPort;
    }

    public GetTransitRouterFlowTopNShrinkRequest setOtherRegion(String otherRegion) {
        this.otherRegion = otherRegion;
        return this;
    }
    public String getOtherRegion() {
        return this.otherRegion;
    }

    public GetTransitRouterFlowTopNShrinkRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public GetTransitRouterFlowTopNShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public GetTransitRouterFlowTopNShrinkRequest setThisIp(String thisIp) {
        this.thisIp = thisIp;
        return this;
    }
    public String getThisIp() {
        return this.thisIp;
    }

    public GetTransitRouterFlowTopNShrinkRequest setThisPort(String thisPort) {
        this.thisPort = thisPort;
        return this;
    }
    public String getThisPort() {
        return this.thisPort;
    }

    public GetTransitRouterFlowTopNShrinkRequest setThisRegion(String thisRegion) {
        this.thisRegion = thisRegion;
        return this;
    }
    public String getThisRegion() {
        return this.thisRegion;
    }

    public GetTransitRouterFlowTopNShrinkRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

    public GetTransitRouterFlowTopNShrinkRequest setUseMultiAccount(Boolean useMultiAccount) {
        this.useMultiAccount = useMultiAccount;
        return this;
    }
    public Boolean getUseMultiAccount() {
        return this.useMultiAccount;
    }

}
