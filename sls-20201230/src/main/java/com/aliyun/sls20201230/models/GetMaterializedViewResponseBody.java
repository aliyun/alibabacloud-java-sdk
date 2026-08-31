// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetMaterializedViewResponseBody extends TeaModel {
    /**
     * <p>The aggregation interval of the materialized view results, in minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("aggIntervalMins")
    public Integer aggIntervalMins;

    /**
     * <p>The time when the materialized view was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1722411060</p>
     */
    @NameInMap("createTime")
    public Integer createTime;

    /**
     * <p>Indicates whether the materialized view is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The Logstore from which the materialized view sources its data.</p>
     * 
     * <strong>example:</strong>
     * <p>ali-test-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>alert-123456</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The original SQL statement executed by the materialized view.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li>| select count(*) from log</li>
     * </ul>
     */
    @NameInMap("originalSql")
    public String originalSql;

    /**
     * <p>The number of shards used by the Logstore that stores the materialized view data.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("shardCount")
    public Integer shardCount;

    /**
     * <p>The time from which the materialized view starts processing data.</p>
     * 
     * <strong>example:</strong>
     * <p>1448748198</p>
     */
    @NameInMap("startTime")
    public Integer startTime;

    /**
     * <p>The status information of the materialized view.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("status")
    public GetMaterializedViewResponseBodyStatus status;

    /**
     * <p>The number of days that the materialized view results are retained.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ttl")
    public Integer ttl;

    public static GetMaterializedViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMaterializedViewResponseBody self = new GetMaterializedViewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMaterializedViewResponseBody setAggIntervalMins(Integer aggIntervalMins) {
        this.aggIntervalMins = aggIntervalMins;
        return this;
    }
    public Integer getAggIntervalMins() {
        return this.aggIntervalMins;
    }

    public GetMaterializedViewResponseBody setCreateTime(Integer createTime) {
        this.createTime = createTime;
        return this;
    }
    public Integer getCreateTime() {
        return this.createTime;
    }

    public GetMaterializedViewResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetMaterializedViewResponseBody setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public GetMaterializedViewResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetMaterializedViewResponseBody setOriginalSql(String originalSql) {
        this.originalSql = originalSql;
        return this;
    }
    public String getOriginalSql() {
        return this.originalSql;
    }

    public GetMaterializedViewResponseBody setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public GetMaterializedViewResponseBody setStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }
    public Integer getStartTime() {
        return this.startTime;
    }

    public GetMaterializedViewResponseBody setStatus(GetMaterializedViewResponseBodyStatus status) {
        this.status = status;
        return this;
    }
    public GetMaterializedViewResponseBodyStatus getStatus() {
        return this.status;
    }

    public GetMaterializedViewResponseBody setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public static class GetMaterializedViewResponseBodyStatusStats extends TeaModel {
        /**
         * <p>The number of times the materialized view was used in the last day.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("hits")
        public Long hits;

        /**
         * <p>The top 3 most frequently accelerated SQL statements by the materialized view.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("queries")
        public java.util.List<String> queries;

        public static GetMaterializedViewResponseBodyStatusStats build(java.util.Map<String, ?> map) throws Exception {
            GetMaterializedViewResponseBodyStatusStats self = new GetMaterializedViewResponseBodyStatusStats();
            return TeaModel.build(map, self);
        }

        public GetMaterializedViewResponseBodyStatusStats setHits(Long hits) {
            this.hits = hits;
            return this;
        }
        public Long getHits() {
            return this.hits;
        }

        public GetMaterializedViewResponseBodyStatusStats setQueries(java.util.List<String> queries) {
            this.queries = queries;
            return this;
        }
        public java.util.List<String> getQueries() {
            return this.queries;
        }

    }

    public static class GetMaterializedViewResponseBodyStatus extends TeaModel {
        /**
         * <p>The error message from the last execution of the materialized view.</p>
         * 
         * <strong>example:</strong>
         * <p>column \&quot;value\&quot; not defined</p>
         */
        @NameInMap("lastRunError")
        public String lastRunError;

        /**
         * <p>The time when the materialized view was last executed.</p>
         * 
         * <strong>example:</strong>
         * <p>1787647228</p>
         */
        @NameInMap("lastRunTime")
        public Long lastRunTime;

        /**
         * <p>The latest position up to which the materialized view has processed data.</p>
         * 
         * <strong>example:</strong>
         * <p>1787647228</p>
         */
        @NameInMap("maxCursorTime")
        public Long maxCursorTime;

        /**
         * <p>The execute statistics information of the materialized view.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("stats")
        public GetMaterializedViewResponseBodyStatusStats stats;

        public static GetMaterializedViewResponseBodyStatus build(java.util.Map<String, ?> map) throws Exception {
            GetMaterializedViewResponseBodyStatus self = new GetMaterializedViewResponseBodyStatus();
            return TeaModel.build(map, self);
        }

        public GetMaterializedViewResponseBodyStatus setLastRunError(String lastRunError) {
            this.lastRunError = lastRunError;
            return this;
        }
        public String getLastRunError() {
            return this.lastRunError;
        }

        public GetMaterializedViewResponseBodyStatus setLastRunTime(Long lastRunTime) {
            this.lastRunTime = lastRunTime;
            return this;
        }
        public Long getLastRunTime() {
            return this.lastRunTime;
        }

        public GetMaterializedViewResponseBodyStatus setMaxCursorTime(Long maxCursorTime) {
            this.maxCursorTime = maxCursorTime;
            return this;
        }
        public Long getMaxCursorTime() {
            return this.maxCursorTime;
        }

        public GetMaterializedViewResponseBodyStatus setStats(GetMaterializedViewResponseBodyStatusStats stats) {
            this.stats = stats;
            return this;
        }
        public GetMaterializedViewResponseBodyStatusStats getStats() {
            return this.stats;
        }

    }

}
