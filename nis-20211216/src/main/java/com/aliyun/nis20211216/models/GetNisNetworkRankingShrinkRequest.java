// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNisNetworkRankingShrinkRequest extends TeaModel {
    /**
     * <p>The member account IDs explicitly passed.</p>
     */
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <p>The start timestamp, in <strong>ms</strong>. If not specified, the last hour is queried by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1684373600099</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>The network traffic direction based on Alibaba Cloud resources. Valid values:</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The end timestamp, in <strong>ms</strong>. If not specified, the last hour is queried by default. If only BeginTime is specified, the one hour after BeginTime is queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1684379093000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>Specifies filter conditions for focused network traffic analysis.</p>
     */
    @NameInMap("Filter")
    public String filterShrink;

    /**
     * <p>The dimension for metric ranking. Valid values vary by scenario:</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Protocol</p>
     */
    @NameInMap("GroupBy")
    public String groupBy;

    /**
     * <p>The metric for ranking Internet traffic. Case-sensitive. Valid values:</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bps</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>The region where the resource resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The Alibaba Cloud network resource type used for traffic forwarding. Valid values:</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AccessInternetIpV4</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The sort order. Default value: desc. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The number of top-ranked entries to display. Default value: <strong>10</strong>. Maximum value: <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopN")
    public Integer topN;

    /**
     * <p>Specifies whether to use multi-account access mode. This is a reserved parameter and is not currently supported.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseCrossAccount")
    public Boolean useCrossAccount;

    public static GetNisNetworkRankingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNisNetworkRankingShrinkRequest self = new GetNisNetworkRankingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetNisNetworkRankingShrinkRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public GetNisNetworkRankingShrinkRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetNisNetworkRankingShrinkRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public GetNisNetworkRankingShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetNisNetworkRankingShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public GetNisNetworkRankingShrinkRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public GetNisNetworkRankingShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetNisNetworkRankingShrinkRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public GetNisNetworkRankingShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetNisNetworkRankingShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public GetNisNetworkRankingShrinkRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

    public GetNisNetworkRankingShrinkRequest setUseCrossAccount(Boolean useCrossAccount) {
        this.useCrossAccount = useCrossAccount;
        return this;
    }
    public Boolean getUseCrossAccount() {
        return this.useCrossAccount;
    }

}
