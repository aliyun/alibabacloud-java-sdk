// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNisNetworkRankingRequest extends TeaModel {
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
    public java.util.List<GetNisNetworkRankingRequestFilter> filter;

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

    public static GetNisNetworkRankingRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNisNetworkRankingRequest self = new GetNisNetworkRankingRequest();
        return TeaModel.build(map, self);
    }

    public GetNisNetworkRankingRequest setAccountIds(java.util.List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    public GetNisNetworkRankingRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetNisNetworkRankingRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public GetNisNetworkRankingRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetNisNetworkRankingRequest setFilter(java.util.List<GetNisNetworkRankingRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<GetNisNetworkRankingRequestFilter> getFilter() {
        return this.filter;
    }

    public GetNisNetworkRankingRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public GetNisNetworkRankingRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public GetNisNetworkRankingRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public GetNisNetworkRankingRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetNisNetworkRankingRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public GetNisNetworkRankingRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

    public GetNisNetworkRankingRequest setUseCrossAccount(Boolean useCrossAccount) {
        this.useCrossAccount = useCrossAccount;
        return this;
    }
    public Boolean getUseCrossAccount() {
        return this.useCrossAccount;
    }

    public static class GetNisNetworkRankingRequestFilter extends TeaModel {
        /**
         * <p>The name of the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-2zxxxxz1d</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetNisNetworkRankingRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            GetNisNetworkRankingRequestFilter self = new GetNisNetworkRankingRequestFilter();
            return TeaModel.build(map, self);
        }

        public GetNisNetworkRankingRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetNisNetworkRankingRequestFilter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
