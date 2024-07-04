// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNisNetworkRankingShrinkRequest extends TeaModel {
    @NameInMap("AccountIds")
    public java.util.List<String> accountIds;

    /**
     * <strong>example:</strong>
     * <p>1684373600099</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <strong>example:</strong>
     * <p>1684379093000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Filter")
    public String filterShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Protocol</p>
     */
    @NameInMap("GroupBy")
    public String groupBy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bps</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AccessInternetIpV4</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopN")
    public Integer topN;

    /**
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
