// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetTransitRouterFlowTopNShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the member accounts.</p>
     */
    @NameInMap("AccountIds")
    public String accountIdsShrink;

    /**
     * <p>The ID of the CEN bandwidth plan.</p>
     * 
     * <strong>example:</strong>
     * <p>cenbwp-ia8kw1zjv4hyal*****</p>
     */
    @NameInMap("BandwithPackageId")
    public String bandwithPackageId;

    /**
     * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. The maximum time range that you can query is 24 hours.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1684373600099</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The CEN instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-ia8kw1zjv4hyal****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The direction of the inter-region traffic in the local regions or for the local IP addresses. Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: inbound traffic</li>
     * <li><strong>out</strong>: outbound traffic</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. The maximum time range that you can query is 24 hours.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1638239093000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The dimension for ranking inter-region traffic data. The value of this parameter is case-sensitive. Valid values:</p>
     * <ul>
     * <li><strong>1Tuple</strong>: queries the rankings of inter-region traffic data for the local regions, Cloud Enterprise Network (CEN) instances, and IP addresses.</li>
     * <li><strong>2Tuple</strong>: queries the rankings of inter-region traffic data for the local and remote regions, and the local and remote IP addresses.</li>
     * <li><strong>5Tuple</strong>: queries the rankings of inter-region traffic data for the local and remote IP addresses, local and remote ports, and protocols.</li>
     * <li><strong>Cen</strong>: queries the rankings of inter-region traffic data for CEN instances.</li>
     * <li><strong>RegionPair</strong>: queries the rankings of inter-region traffic data for the local and remote regions.</li>
     * <li><strong>Port</strong>: queries the rankings of inter-region traffic data for the local and remote ports.</li>
     * <li><strong>Protocol</strong>: queries the rankings of inter-region traffic data for the protocols.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1Tuple</p>
     */
    @NameInMap("GroupBy")
    public String groupBy;

    /**
     * <p>The metric for ranking inter-region traffic data. Default value: Bytes. This value specifies that inter-region traffic data is ranked by traffic volume.</p>
     * 
     * <strong>example:</strong>
     * <p>Bytes</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The remote IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>122.112.XX.XX</p>
     */
    @NameInMap("OtherIp")
    public String otherIp;

    /**
     * <p>The remote port.</p>
     * 
     * <strong>example:</strong>
     * <p>10869</p>
     */
    @NameInMap("OtherPort")
    public String otherPort;

    /**
     * <p>The remote region.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1</p>
     */
    @NameInMap("OtherRegion")
    public String otherRegion;

    /**
     * <p>The protocol number.</p>
     * <blockquote>
     * <p> All protocols are supported. This parameter is required only if you set <strong>GroupBy</strong> to <strong>5Tuple</strong> or <strong>Protocol</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The order for ranking inter-region traffic data. Valid values:</p>
     * <ul>
     * <li><strong>desc</strong>: descending order</li>
     * <li><strong>asc</strong>: ascending order</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The local IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>1.8.XX.XX</p>
     */
    @NameInMap("ThisIp")
    public String thisIp;

    /**
     * <p>The local port.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ThisPort")
    public String thisPort;

    /**
     * <p>The local region where the <strong>local IP address</strong> resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("ThisRegion")
    public String thisRegion;

    /**
     * <p>Specifies the maximum number of data entries to display. Default value: <strong>10</strong>. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TopN")
    public Integer topN;

    /**
     * <p>Specifies whether to enable the multi-account management feature. Default value: <strong>false</strong>. This value specifies that the multi-account management feature is disabled.</p>
     * <blockquote>
     * <p> By default, the multi-account management feature is not available. If you want to use this feature, contact your account manager to apply for permissions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
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
