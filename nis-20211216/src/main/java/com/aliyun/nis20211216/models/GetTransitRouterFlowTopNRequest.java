// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetTransitRouterFlowTopNRequest extends TeaModel {
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

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

    public static GetTransitRouterFlowTopNRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTransitRouterFlowTopNRequest self = new GetTransitRouterFlowTopNRequest();
        return TeaModel.build(map, self);
    }

    public GetTransitRouterFlowTopNRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public GetTransitRouterFlowTopNRequest setBandwithPackageId(String bandwithPackageId) {
        this.bandwithPackageId = bandwithPackageId;
        return this;
    }
    public String getBandwithPackageId() {
        return this.bandwithPackageId;
    }

    public GetTransitRouterFlowTopNRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetTransitRouterFlowTopNRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public GetTransitRouterFlowTopNRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public GetTransitRouterFlowTopNRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetTransitRouterFlowTopNRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public GetTransitRouterFlowTopNRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetTransitRouterFlowTopNRequest setOtherIp(String otherIp) {
        this.otherIp = otherIp;
        return this;
    }
    public String getOtherIp() {
        return this.otherIp;
    }

    public GetTransitRouterFlowTopNRequest setOtherPort(String otherPort) {
        this.otherPort = otherPort;
        return this;
    }
    public String getOtherPort() {
        return this.otherPort;
    }

    public GetTransitRouterFlowTopNRequest setOtherRegion(String otherRegion) {
        this.otherRegion = otherRegion;
        return this;
    }
    public String getOtherRegion() {
        return this.otherRegion;
    }

    public GetTransitRouterFlowTopNRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public GetTransitRouterFlowTopNRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public GetTransitRouterFlowTopNRequest setThisIp(String thisIp) {
        this.thisIp = thisIp;
        return this;
    }
    public String getThisIp() {
        return this.thisIp;
    }

    public GetTransitRouterFlowTopNRequest setThisPort(String thisPort) {
        this.thisPort = thisPort;
        return this;
    }
    public String getThisPort() {
        return this.thisPort;
    }

    public GetTransitRouterFlowTopNRequest setThisRegion(String thisRegion) {
        this.thisRegion = thisRegion;
        return this;
    }
    public String getThisRegion() {
        return this.thisRegion;
    }

    public GetTransitRouterFlowTopNRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

    public GetTransitRouterFlowTopNRequest setUseMultiAccount(Boolean useMultiAccount) {
        this.useMultiAccount = useMultiAccount;
        return this;
    }
    public Boolean getUseMultiAccount() {
        return this.useMultiAccount;
    }

}
