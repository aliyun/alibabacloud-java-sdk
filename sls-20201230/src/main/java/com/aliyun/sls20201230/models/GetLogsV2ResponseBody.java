// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogsV2ResponseBody extends TeaModel {
    /**
     * <p>The query results.</p>
     */
    @NameInMap("data")
    public java.util.List<java.util.Map<String, String>> data;

    /**
     * <p>The metadata of the returned data.</p>
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

    public static class GetLogsV2ResponseBodyMetaPhraseQueryInfo extends TeaModel {
        /**
         * <p>The starting offset of the scan result after index filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("beginOffset")
        public Long beginOffset;

        /**
         * <p>The end offset of the scan result after index filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("endOffset")
        public Long endOffset;

        /**
         * <p>The end time of the scan result after index filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("endTime")
        public Long endTime;

        /**
         * <p>Indicates whether all logs are scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("scanAll")
        public Boolean scanAll;

        public static GetLogsV2ResponseBodyMetaPhraseQueryInfo build(java.util.Map<String, ?> map) throws Exception {
            GetLogsV2ResponseBodyMetaPhraseQueryInfo self = new GetLogsV2ResponseBodyMetaPhraseQueryInfo();
            return TeaModel.build(map, self);
        }

        public GetLogsV2ResponseBodyMetaPhraseQueryInfo setBeginOffset(Long beginOffset) {
            this.beginOffset = beginOffset;
            return this;
        }
        public Long getBeginOffset() {
            return this.beginOffset;
        }

        public GetLogsV2ResponseBodyMetaPhraseQueryInfo setEndOffset(Long endOffset) {
            this.endOffset = endOffset;
            return this;
        }
        public Long getEndOffset() {
            return this.endOffset;
        }

        public GetLogsV2ResponseBodyMetaPhraseQueryInfo setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetLogsV2ResponseBodyMetaPhraseQueryInfo setScanAll(Boolean scanAll) {
            this.scanAll = scanAll;
            return this;
        }
        public Boolean getScanAll() {
            return this.scanAll;
        }

    }

    public static class GetLogsV2ResponseBodyMeta extends TeaModel {
        /**
         * <p>The SQL part of the query statement that follows the pipe character (|).</p>
         * 
         * <strong>example:</strong>
         * <p>select *</p>
         */
        @NameInMap("aggQuery")
        public String aggQuery;

        /**
         * <p>The column types.</p>
         */
        @NameInMap("columnTypes")
        public java.util.List<String> columnTypes;

        /**
         * <p>The number of log entries returned in this query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("count")
        public Integer count;

        /**
         * <p>The number of CPU cores used.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("cpuCores")
        public Integer cpuCores;

        /**
         * <p>The core-hours for the Exclusive SQL.</p>
         * 
         * <strong>example:</strong>
         * <p>0.002</p>
         */
        @NameInMap("cpuSec")
        public Double cpuSec;

        /**
         * <p>The time consumed by the query, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("elapsedMillisecond")
        public Long elapsedMillisecond;

        /**
         * <p>Indicates whether the query is an SQL query.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("hasSQL")
        public Boolean hasSQL;

        /**
         * <p>The highlighted content.</p>
         */
        @NameInMap("highlights")
        public java.util.List<java.util.List<LogContent>> highlights;

        /**
         * <p>Indicates whether nanosecond-level sorting is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isAccurate")
        public Boolean isAccurate;

        /**
         * <p>All keys in the query result.</p>
         */
        @NameInMap("keys")
        public java.util.List<String> keys;

        /**
         * <p>The number of entries returned. This parameter is returned if the SQL statement does not contain a LIMIT clause.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("limited")
        public Integer limited;

        /**
         * <p>The query mode. Valid values:
         * 0: Normal query, which includes SQL queries.
         * 1: Phrase query.
         * 2: SCAN query.
         * 3: SCAN SQL query.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("mode")
        public Integer mode;

        /**
         * <p>The information about the phrase query.</p>
         */
        @NameInMap("phraseQueryInfo")
        public GetLogsV2ResponseBodyMetaPhraseQueryInfo phraseQueryInfo;

        /**
         * <p>The volume of logs processed in the query, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("processedBytes")
        public Long processedBytes;

        /**
         * <p>The number of rows processed in the query.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("processedRows")
        public Long processedRows;

        /**
         * <p>The progress of the query. Valid values:</p>
         * <ul>
         * <li><p>Complete: The query is complete, and the returned result is complete.</p>
         * </li>
         * <li><p>Incomplete: The query is complete, but the returned result is incomplete. You must send the request again to obtain the complete result.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Complete</p>
         */
        @NameInMap("progress")
        public String progress;

        /**
         * <p>The volume of data scanned in the scan query, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("scanBytes")
        public Long scanBytes;

        /**
         * <p>The type of observable data.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("telementryType")
        public String telementryType;

        /**
         * <p>All terms in the query statement.</p>
         */
        @NameInMap("terms")
        public java.util.List<java.util.Map<String, ?>> terms;

        /**
         * <p>The part of the query statement that precedes the pipe character (|).</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
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

        public GetLogsV2ResponseBodyMeta setColumnTypes(java.util.List<String> columnTypes) {
            this.columnTypes = columnTypes;
            return this;
        }
        public java.util.List<String> getColumnTypes() {
            return this.columnTypes;
        }

        public GetLogsV2ResponseBodyMeta setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetLogsV2ResponseBodyMeta setCpuCores(Integer cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        public GetLogsV2ResponseBodyMeta setCpuSec(Double cpuSec) {
            this.cpuSec = cpuSec;
            return this;
        }
        public Double getCpuSec() {
            return this.cpuSec;
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

        public GetLogsV2ResponseBodyMeta setHighlights(java.util.List<java.util.List<LogContent>> highlights) {
            this.highlights = highlights;
            return this;
        }
        public java.util.List<java.util.List<LogContent>> getHighlights() {
            return this.highlights;
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

        public GetLogsV2ResponseBodyMeta setLimited(Integer limited) {
            this.limited = limited;
            return this;
        }
        public Integer getLimited() {
            return this.limited;
        }

        public GetLogsV2ResponseBodyMeta setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public GetLogsV2ResponseBodyMeta setPhraseQueryInfo(GetLogsV2ResponseBodyMetaPhraseQueryInfo phraseQueryInfo) {
            this.phraseQueryInfo = phraseQueryInfo;
            return this;
        }
        public GetLogsV2ResponseBodyMetaPhraseQueryInfo getPhraseQueryInfo() {
            return this.phraseQueryInfo;
        }

        public GetLogsV2ResponseBodyMeta setProcessedBytes(Long processedBytes) {
            this.processedBytes = processedBytes;
            return this;
        }
        public Long getProcessedBytes() {
            return this.processedBytes;
        }

        public GetLogsV2ResponseBodyMeta setProcessedRows(Long processedRows) {
            this.processedRows = processedRows;
            return this;
        }
        public Long getProcessedRows() {
            return this.processedRows;
        }

        public GetLogsV2ResponseBodyMeta setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetLogsV2ResponseBodyMeta setScanBytes(Long scanBytes) {
            this.scanBytes = scanBytes;
            return this;
        }
        public Long getScanBytes() {
            return this.scanBytes;
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
