// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogsV2ResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("data")
    public java.util.List<java.util.Map<String, String>> data;

    /**
     * <p>The metadata that is returned.</p>
     */
    @NameInMap("meta")
    public GetLogsV2ResponseBodyMeta meta;

    public static GetLogsV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogsV2ResponseBody self = new GetLogsV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogsV2ResponseBody setData(java.util.List<java.util.Map<String, String>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getData() {
        return this.data;
    }

    public GetLogsV2ResponseBody setMeta(GetLogsV2ResponseBodyMeta meta) {
        this.meta = meta;
        return this;
    }
    public GetLogsV2ResponseBodyMeta getMeta() {
        return this.meta;
    }

    public static class GetLogsV2ResponseBodyMeta extends TeaModel {
        /**
         * <p>The SQL statement after | in the query statement.</p>
         */
        @NameInMap("aggQuery")
        public String aggQuery;

        /**
         * <p>The number of rows that are returned.</p>
         */
        @NameInMap("count")
        public Integer count;

        /**
         * <p>The amount of time that is consumed by the request. Unit: milliseconds.</p>
         */
        @NameInMap("elapsedMillisecond")
        public Long elapsedMillisecond;

        /**
         * <p>Indicates whether the query is an SQL query.</p>
         */
        @NameInMap("hasSQL")
        public Boolean hasSQL;

        /**
         * <p>Indicates whether the returned result is accurate.</p>
         */
        @NameInMap("isAccurate")
        public Boolean isAccurate;

        /**
         * <p>All keys in the query result.</p>
         */
        @NameInMap("keys")
        public java.util.List<String> keys;

        /**
         * <p>The number of logs that are processed in the request.</p>
         */
        @NameInMap("processedBytes")
        public Long processedBytes;

        /**
         * <p>The number of rows that are processed in the request.</p>
         */
        @NameInMap("processedRows")
        public Integer processedRows;

        /**
         * <p>Indicates whether the query result is complete. Valid values:</p>
         * <br>
         * <p>*   Complete: The query was successful, and the complete result is returned.</p>
         * <p>*   Incomplete: The query was successful, but the query result is incomplete. To obtain the complete result, you must call the operation again.</p>
         */
        @NameInMap("progress")
        public String progress;

        /**
         * <p>The type of observable data.</p>
         */
        @NameInMap("telementryType")
        public String telementryType;

        /**
         * <p>All terms in the query statement.</p>
         */
        @NameInMap("terms")
        public java.util.List<java.util.Map<String, ?>> terms;

        /**
         * <p>The part before | in the query statement.</p>
         */
        @NameInMap("whereQuery")
        public String whereQuery;

        public static GetLogsV2ResponseBodyMeta build(java.util.Map<String, ?> map) throws Exception {
            GetLogsV2ResponseBodyMeta self = new GetLogsV2ResponseBodyMeta();
            return TeaModel.build(map, self);
        }

        public GetLogsV2ResponseBodyMeta setAggQuery(String aggQuery) {
            this.aggQuery = aggQuery;
            return this;
        }
        public String getAggQuery() {
            return this.aggQuery;
        }

        public GetLogsV2ResponseBodyMeta setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetLogsV2ResponseBodyMeta setElapsedMillisecond(Long elapsedMillisecond) {
            this.elapsedMillisecond = elapsedMillisecond;
            return this;
        }
        public Long getElapsedMillisecond() {
            return this.elapsedMillisecond;
        }

        public GetLogsV2ResponseBodyMeta setHasSQL(Boolean hasSQL) {
            this.hasSQL = hasSQL;
            return this;
        }
        public Boolean getHasSQL() {
            return this.hasSQL;
        }

        public GetLogsV2ResponseBodyMeta setIsAccurate(Boolean isAccurate) {
            this.isAccurate = isAccurate;
            return this;
        }
        public Boolean getIsAccurate() {
            return this.isAccurate;
        }

        public GetLogsV2ResponseBodyMeta setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public GetLogsV2ResponseBodyMeta setProcessedBytes(Long processedBytes) {
            this.processedBytes = processedBytes;
            return this;
        }
        public Long getProcessedBytes() {
            return this.processedBytes;
        }

        public GetLogsV2ResponseBodyMeta setProcessedRows(Integer processedRows) {
            this.processedRows = processedRows;
            return this;
        }
        public Integer getProcessedRows() {
            return this.processedRows;
        }

        public GetLogsV2ResponseBodyMeta setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetLogsV2ResponseBodyMeta setTelementryType(String telementryType) {
            this.telementryType = telementryType;
            return this;
        }
        public String getTelementryType() {
            return this.telementryType;
        }

        public GetLogsV2ResponseBodyMeta setTerms(java.util.List<java.util.Map<String, ?>> terms) {
            this.terms = terms;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getTerms() {
            return this.terms;
        }

        public GetLogsV2ResponseBodyMeta setWhereQuery(String whereQuery) {
            this.whereQuery = whereQuery;
            return this;
        }
        public String getWhereQuery() {
            return this.whereQuery;
        }

    }

}
