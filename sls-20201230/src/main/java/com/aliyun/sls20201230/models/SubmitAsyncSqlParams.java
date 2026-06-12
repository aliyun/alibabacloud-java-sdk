// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class SubmitAsyncSqlParams extends TeaModel {
    /**
     * <p>Extensions.</p>
     */
    @NameInMap("extensions")
    public SubmitAsyncSqlParamsExtensions extensions;

    /**
     * <p>The start of the query time range. This time is the log time specified when the log was written. The time range defined by the from and to parameters is left-inclusive and right-exclusive. This means the time range includes the start time but excludes the end time. If the from and to values are the same, the time range is invalid and the function returns an error. The value is a UNIX timestamp in seconds since 00:00:00 UTC on January 1, 1970.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627268100</p>
     */
    @NameInMap("from")
    public Integer from;

    /**
     * <p>The name of the logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-logstore</p>
     */
    @NameInMap("logstore")
    public String logstore;

    /**
     * <p>The SQL statement to execute.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>job: IT | select name, age, gender from log</p>
     */
    @NameInMap("query")
    public String query;

    /**
     * <p>The end of the query time range. This time is the log time specified when the log was written. The time range defined by the from and to parameters is left-inclusive and right-exclusive. This means the time range includes the start time but excludes the end time. If the from and to values are the same, the time range is invalid and the function returns an error. The value is a UNIX timestamp in seconds since 00:00:00 UTC on January 1, 1970.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627268200</p>
     */
    @NameInMap("to")
    public Integer to;

    public static SubmitAsyncSqlParams build(java.util.Map<String, ?> map) throws Exception {
        SubmitAsyncSqlParams self = new SubmitAsyncSqlParams();
        return TeaModel.build(map, self);
    }

    public SubmitAsyncSqlParams setExtensions(SubmitAsyncSqlParamsExtensions extensions) {
        this.extensions = extensions;
        return this;
    }
    public SubmitAsyncSqlParamsExtensions getExtensions() {
        return this.extensions;
    }

    public SubmitAsyncSqlParams setFrom(Integer from) {
        this.from = from;
        return this;
    }
    public Integer getFrom() {
        return this.from;
    }

    public SubmitAsyncSqlParams setLogstore(String logstore) {
        this.logstore = logstore;
        return this;
    }
    public String getLogstore() {
        return this.logstore;
    }

    public SubmitAsyncSqlParams setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public SubmitAsyncSqlParams setTo(Integer to) {
        this.to = to;
        return this;
    }
    public Integer getTo() {
        return this.to;
    }

    public static class SubmitAsyncSqlParamsExtensions extends TeaModel {
        /**
         * <p>The maximum running time for the request in milliseconds. Maximum value: 600,000 (10 minutes). Default value: 600,000.</p>
         * 
         * <strong>example:</strong>
         * <p>30000</p>
         */
        @NameInMap("maxRunTime")
        public Long maxRunTime;

        /**
         * <p>Specifies whether to enable enhanced SQL. The default value is false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("powerSql")
        public Boolean powerSql;

        public static SubmitAsyncSqlParamsExtensions build(java.util.Map<String, ?> map) throws Exception {
            SubmitAsyncSqlParamsExtensions self = new SubmitAsyncSqlParamsExtensions();
            return TeaModel.build(map, self);
        }

        public SubmitAsyncSqlParamsExtensions setMaxRunTime(Long maxRunTime) {
            this.maxRunTime = maxRunTime;
            return this;
        }
        public Long getMaxRunTime() {
            return this.maxRunTime;
        }

        public SubmitAsyncSqlParamsExtensions setPowerSql(Boolean powerSql) {
            this.powerSql = powerSql;
            return this;
        }
        public Boolean getPowerSql() {
            return this.powerSql;
        }

    }

}
