// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class StartNisTrafficRankingRequest extends TeaModel {
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
    public java.util.List<StartNisTrafficRankingRequestFilter> filter;

    @NameInMap("GroupBy")
    public java.util.List<String> groupBy;

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

    public static StartNisTrafficRankingRequest build(java.util.Map<String, ?> map) throws Exception {
        StartNisTrafficRankingRequest self = new StartNisTrafficRankingRequest();
        return TeaModel.build(map, self);
    }

    public StartNisTrafficRankingRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public StartNisTrafficRankingRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public StartNisTrafficRankingRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public StartNisTrafficRankingRequest setFilter(java.util.List<StartNisTrafficRankingRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<StartNisTrafficRankingRequestFilter> getFilter() {
        return this.filter;
    }

    public StartNisTrafficRankingRequest setGroupBy(java.util.List<String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public java.util.List<String> getGroupBy() {
        return this.groupBy;
    }

    public StartNisTrafficRankingRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public StartNisTrafficRankingRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public StartNisTrafficRankingRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public StartNisTrafficRankingRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public StartNisTrafficRankingRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public StartNisTrafficRankingRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public StartNisTrafficRankingRequest setStorageInterval(Integer storageInterval) {
        this.storageInterval = storageInterval;
        return this;
    }
    public Integer getStorageInterval() {
        return this.storageInterval;
    }

    public StartNisTrafficRankingRequest setTopN(Integer topN) {
        this.topN = topN;
        return this;
    }
    public Integer getTopN() {
        return this.topN;
    }

    public StartNisTrafficRankingRequest setTrafficAnalyzerId(String trafficAnalyzerId) {
        this.trafficAnalyzerId = trafficAnalyzerId;
        return this;
    }
    public String getTrafficAnalyzerId() {
        return this.trafficAnalyzerId;
    }

    public StartNisTrafficRankingRequest setTrafficScenario(String trafficScenario) {
        this.trafficScenario = trafficScenario;
        return this;
    }
    public String getTrafficScenario() {
        return this.trafficScenario;
    }

    public StartNisTrafficRankingRequest setTupleDimension(String tupleDimension) {
        this.tupleDimension = tupleDimension;
        return this;
    }
    public String getTupleDimension() {
        return this.tupleDimension;
    }

    public static class StartNisTrafficRankingRequestFilter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FlowAction</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public java.util.List<String> value;

        public static StartNisTrafficRankingRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            StartNisTrafficRankingRequestFilter self = new StartNisTrafficRankingRequestFilter();
            return TeaModel.build(map, self);
        }

        public StartNisTrafficRankingRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public StartNisTrafficRankingRequestFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public StartNisTrafficRankingRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
