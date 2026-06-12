// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetMaterializedViewResponseBody extends TeaModel {
    /**
     * <p>The time interval for data aggregation, in minutes.</p>
     */
    @NameInMap("aggIntervalMins")
    public Integer aggIntervalMins;

    /**
     * <p>Specifies whether the materialized view is active. Valid values are <code>true</code> and <code>false</code>.</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The destination logstore that stores the aggregated data.</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The name of the materialized view.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The SQL query that defines the materialized view.</p>
     */
    @NameInMap("originalSql")
    public String originalSql;

    /**
     * <p>The time when the materialized view was created. The value is a Unix timestamp.</p>
     */
    @NameInMap("startTime")
    public Integer startTime;

    @NameInMap("status")
    public GetMaterializedViewResponseBodyStatus status;

    /**
     * <p>The time to live (ttl) of the data in the destination logstore, in days.</p>
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

    public static class GetMaterializedViewResponseBodyStatus extends TeaModel {
        @NameInMap("lastRunError")
        public String lastRunError;

        @NameInMap("lastRunTime")
        public Long lastRunTime;

        @NameInMap("maxCursorTime")
        public Long maxCursorTime;

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

    }

}
