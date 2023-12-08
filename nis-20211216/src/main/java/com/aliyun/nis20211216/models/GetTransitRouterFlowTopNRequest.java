// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetTransitRouterFlowTopNRequest extends TeaModel {
    /**
     * <p>The IDs of member accounts.</p>
     */
    @NameInMap("AccountIds")
    public java.util.List<Long> accountIds;

    /**
     * <p>The ID of the CEN bandwidth plan.</p>
     */
    @NameInMap("BandwithPackageId")
    public String bandwithPackageId;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. The maximum time range that you can query is 24 hours.</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The CEN instance ID.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The direction of the inter-region traffic in the local regions or for the local IP addresses. Valid values:</p>
     * <br>
     * <p>*   in: inbound traffic</p>
     * <p>*   out: outbound traffic</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. The maximum time range that you can query is 24 hours.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The dimension for ranking inter-region traffic data. The value of this parameter is case-sensitive. Valid values:</p>
     * <br>
     * <p>*   1Tuple: queries the rankings of inter-region traffic data for the local regions, Cloud Enterprise Network (CEN) instances, and IP addresses.</p>
     * <p>*   2Tuple: queries the rankings of inter-region traffic data for the local and remote regions, and the local and remote IP addresses.</p>
     * <p>*   5Tuple: queries the rankings of inter-region traffic data for the local and remote IP addresses, local and remote ports, and protocols in use.</p>
     * <p>*   Cen: queries the rankings of inter-region traffic data for CEN instances.</p>
     * <p>*   RegionPair: queries the rankings of inter-region traffic data for the local and remote regions.</p>
     * <p>*   Port: queries the rankings of inter-region traffic data for the local and remote ports.</p>
     * <p>*   Protocol: queries the rankings of inter-region traffic data for the protocols in use.</p>
     */
    @NameInMap("GroupBy")
    public String groupBy;

    /**
     * <p>The metric for ranking inter-region traffic data. Default value: Bytes. This value specifies that inter-region traffic data is ranked by traffic volume.</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The remote IP address.</p>
     */
    @NameInMap("OtherIp")
    public String otherIp;

    /**
     * <p>The remote port.</p>
     */
    @NameInMap("OtherPort")
    public String otherPort;

    /**
     * <p>The remote region.</p>
     */
    @NameInMap("OtherRegion")
    public String otherRegion;

    /**
     * <p>The protocol number.</p>
     * <br>
     * <p>>  All protocols are supported. This parameter is required only if you set GroupBy to 5Tuple or Protocol.</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The order for ranking inter-region traffic data. Valid values:</p>
     * <br>
     * <p>*   desc: descending order</p>
     * <p>*   asc: ascending order</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The local IP address.</p>
     */
    @NameInMap("ThisIp")
    public String thisIp;

    /**
     * <p>The local port.</p>
     */
    @NameInMap("ThisPort")
    public String thisPort;

    /**
     * <p>The local region where the **local IP address** resides.</p>
     */
    @NameInMap("ThisRegion")
    public String thisRegion;

    /**
     * <p>Specifies the maximum number of data entries to display. Default value: **10**. Maximum value: 100.</p>
     */
    @NameInMap("TopN")
    public Integer topN;

    /**
     * <p>Specifies whether to enable the multi-account management feature. Default value: **false**. This value specifies that the multi-account management feature is disabled.</p>
     * <br>
     * <p>>  By default, the multi-account management feature is not available. If you want to use this feature, contact your account manager to apply for permissions.</p>
     */
    @NameInMap("UseMultiAccount")
    public Boolean useMultiAccount;

    public static GetTransitRouterFlowTopNRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTransitRouterFlowTopNRequest self = new GetTransitRouterFlowTopNRequest();
        return TeaModel.build(map, self);
    }

    public GetTransitRouterFlowTopNRequest setAccountIds(java.util.List<Long> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<Long> getAccountIds() {
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
