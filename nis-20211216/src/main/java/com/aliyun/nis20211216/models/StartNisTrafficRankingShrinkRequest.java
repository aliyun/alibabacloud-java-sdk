// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class StartNisTrafficRankingShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1638239092000</p>
     */
    @NameInMap("BeginTime")
    public Long beginTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Out</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1684373700099</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Filter")
    public String filterShrink;

    @NameInMap("GroupBy")
    public String groupByShrink;

    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>2A07PfBPlzmmNi/75Qca9SK73UfY48/+WBiREjfVfXqMQxtV8XckOg5lk7F2bhC+</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Bytes</p>
     */
    @NameInMap("OrderBy")
    public String orderBy;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <strong>example:</strong>
     * <p>Desc</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("StorageInterval")
    public Integer storageInterval;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TopN")
    public Integer topN;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nta-262****ca07f</p>
     */
    @NameInMap("TrafficAnalyzerId")
    public String trafficAnalyzerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VpcFlowLogAll</p>
     */
    @NameInMap("TrafficScenario")
    public String trafficScenario;

    /**
     * <strong>example:</strong>
     * <p>Tuple1</p>
     */
    @NameInMap("TupleDimension")
    public String tupleDimension;

    public static StartNisTrafficRankingShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartNisTrafficRankingShrinkRequest self = new StartNisTrafficRankingShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartNisTrafficRankingShrinkRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public StartNisTrafficRankingShrinkRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public StartNisTrafficRankingShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public StartNisTrafficRankingShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

    public StartNisTrafficRankingShrinkRequest setGroupByShrink(String groupByShrink) {
        this.groupByShrink = groupByShrink;
        return this;
    }
    public String getGroupByShrink() {
        return this.groupByShrink;
    }

    public StartNisTrafficRankingShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public StartNisTrafficRankingShrinkRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public StartNisTrafficRankingShrinkRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public StartNisTrafficRankingShrinkRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public StartNisTrafficRankingShrinkRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public StartNisTrafficRankingShrinkRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public StartNisTrafficRankingShrinkRequest setStorageInterval(Integer storageInterval) {
        this.storageInterval = storageInterval;
        return this;
    }
    public Integer getStorageInterval() {
        return this.storageInterval;
    }

    public StartNisTrafficRankingShrinkRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

    public StartNisTrafficRankingShrinkRequest setTrafficAnalyzerId(String trafficAnalyzerId) {
        this.trafficAnalyzerId = trafficAnalyzerId;
        return this;
    }
    public String getTrafficAnalyzerId() {
        return this.trafficAnalyzerId;
    }

    public StartNisTrafficRankingShrinkRequest setTrafficScenario(String trafficScenario) {
        this.trafficScenario = trafficScenario;
        return this;
    }
    public String getTrafficScenario() {
        return this.trafficScenario;
    }

    public StartNisTrafficRankingShrinkRequest setTupleDimension(String tupleDimension) {
        this.tupleDimension = tupleDimension;
        return this;
    }
    public String getTupleDimension() {
        return this.tupleDimension;
    }

}
