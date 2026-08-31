// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<java.util.Map<String, String>> data;

    @NameInMap("meta")
    public GetLogsResponseBodyMeta meta;

    public static GetLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogsResponseBody self = new GetLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogsResponseBody setData(java.util.List<java.util.Map<String, String>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getData() {
        return this.data;
    }

    public GetLogsResponseBody setMeta(GetLogsResponseBodyMeta meta) {
        this.meta = meta;
        return this;
    }
    public GetLogsResponseBodyMeta getMeta() {
        return this.meta;
    }

    public static class GetLogsResponseBodyMetaPhraseQueryInfo extends TeaModel {
        @NameInMap("beginOffset")
        public Long beginOffset;

        @NameInMap("endOffset")
        public Long endOffset;

        @NameInMap("endTime")
        public Long endTime;

        @NameInMap("scanAll")
        public Boolean scanAll;

        public static GetLogsResponseBodyMetaPhraseQueryInfo build(java.util.Map<String, ?> map) throws Exception {
            GetLogsResponseBodyMetaPhraseQueryInfo self = new GetLogsResponseBodyMetaPhraseQueryInfo();
            return TeaModel.build(map, self);
        }

        public GetLogsResponseBodyMetaPhraseQueryInfo setBeginOffset(Long beginOffset) {
            this.beginOffset = beginOffset;
            return this;
        }
        public Long getBeginOffset() {
            return this.beginOffset;
        }

        public GetLogsResponseBodyMetaPhraseQueryInfo setEndOffset(Long endOffset) {
            this.endOffset = endOffset;
            return this;
        }
        public Long getEndOffset() {
            return this.endOffset;
        }

        public GetLogsResponseBodyMetaPhraseQueryInfo setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetLogsResponseBodyMetaPhraseQueryInfo setScanAll(Boolean scanAll) {
            this.scanAll = scanAll;
            return this;
        }
        public Boolean getScanAll() {
            return this.scanAll;
        }

    }

    public static class GetLogsResponseBodyMeta extends TeaModel {
        @NameInMap("aggQuery")
        public String aggQuery;

        @NameInMap("columnTypes")
        public java.util.List<String> columnTypes;

        @NameInMap("count")
        public Integer count;

        @NameInMap("cpuCores")
        public Integer cpuCores;

        @NameInMap("cpuSec")
        public Double cpuSec;

        @NameInMap("elapsedMillisecond")
        public Long elapsedMillisecond;

        @NameInMap("hasSQL")
        public Boolean hasSQL;

        @NameInMap("highlights")
        public java.util.List<java.util.Map<String, ?>> highlights;

        @NameInMap("isAccurate")
        public Boolean isAccurate;

        @NameInMap("keys")
        public java.util.List<String> keys;

        @NameInMap("limited")
        public Integer limited;

        @NameInMap("mode")
        public Integer mode;

        @NameInMap("phraseQueryInfo")
        public GetLogsResponseBodyMetaPhraseQueryInfo phraseQueryInfo;

        @NameInMap("processedBytes")
        public Long processedBytes;

        @NameInMap("processedRows")
        public Long processedRows;

        @NameInMap("progress")
        public String progress;

        @NameInMap("scanBytes")
        public Long scanBytes;

        @NameInMap("telementryType")
        public String telementryType;

        @NameInMap("terms")
        public java.util.List<java.util.Map<String, ?>> terms;

        @NameInMap("whereQuery")
        public String whereQuery;

        public static GetLogsResponseBodyMeta build(java.util.Map<String, ?> map) throws Exception {
            GetLogsResponseBodyMeta self = new GetLogsResponseBodyMeta();
            return TeaModel.build(map, self);
        }

        public GetLogsResponseBodyMeta setAggQuery(String aggQuery) {
            this.aggQuery = aggQuery;
            return this;
        }
        public String getAggQuery() {
            return this.aggQuery;
        }

        public GetLogsResponseBodyMeta setColumnTypes(java.util.List<String> columnTypes) {
            this.columnTypes = columnTypes;
            return this;
        }
        public java.util.List<String> getColumnTypes() {
            return this.columnTypes;
        }

        public GetLogsResponseBodyMeta setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetLogsResponseBodyMeta setCpuCores(Integer cpuCores) {
            this.cpuCores = cpuCores;
            return this;
        }
        public Integer getCpuCores() {
            return this.cpuCores;
        }

        public GetLogsResponseBodyMeta setCpuSec(Double cpuSec) {
            this.cpuSec = cpuSec;
            return this;
        }
        public Double getCpuSec() {
            return this.cpuSec;
        }

        public GetLogsResponseBodyMeta setElapsedMillisecond(Long elapsedMillisecond) {
            this.elapsedMillisecond = elapsedMillisecond;
            return this;
        }
        public Long getElapsedMillisecond() {
            return this.elapsedMillisecond;
        }

        public GetLogsResponseBodyMeta setHasSQL(Boolean hasSQL) {
            this.hasSQL = hasSQL;
            return this;
        }
        public Boolean getHasSQL() {
            return this.hasSQL;
        }

        public GetLogsResponseBodyMeta setHighlights(java.util.List<java.util.Map<String, ?>> highlights) {
            this.highlights = highlights;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getHighlights() {
            return this.highlights;
        }

        public GetLogsResponseBodyMeta setIsAccurate(Boolean isAccurate) {
            this.isAccurate = isAccurate;
            return this;
        }
        public Boolean getIsAccurate() {
            return this.isAccurate;
        }

        public GetLogsResponseBodyMeta setKeys(java.util.List<String> keys) {
            this.keys = keys;
            return this;
        }
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public GetLogsResponseBodyMeta setLimited(Integer limited) {
            this.limited = limited;
            return this;
        }
        public Integer getLimited() {
            return this.limited;
        }

        public GetLogsResponseBodyMeta setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
        }

        public GetLogsResponseBodyMeta setPhraseQueryInfo(GetLogsResponseBodyMetaPhraseQueryInfo phraseQueryInfo) {
            this.phraseQueryInfo = phraseQueryInfo;
            return this;
        }
        public GetLogsResponseBodyMetaPhraseQueryInfo getPhraseQueryInfo() {
            return this.phraseQueryInfo;
        }

        public GetLogsResponseBodyMeta setProcessedBytes(Long processedBytes) {
            this.processedBytes = processedBytes;
            return this;
        }
        public Long getProcessedBytes() {
            return this.processedBytes;
        }

        public GetLogsResponseBodyMeta setProcessedRows(Long processedRows) {
            this.processedRows = processedRows;
            return this;
        }
        public Long getProcessedRows() {
            return this.processedRows;
        }

        public GetLogsResponseBodyMeta setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public GetLogsResponseBodyMeta setScanBytes(Long scanBytes) {
            this.scanBytes = scanBytes;
            return this;
        }
        public Long getScanBytes() {
            return this.scanBytes;
        }

        public GetLogsResponseBodyMeta setTelementryType(String telementryType) {
            this.telementryType = telementryType;
            return this;
        }
        public String getTelementryType() {
            return this.telementryType;
        }

        public GetLogsResponseBodyMeta setTerms(java.util.List<java.util.Map<String, ?>> terms) {
            this.terms = terms;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getTerms() {
            return this.terms;
        }

        public GetLogsResponseBodyMeta setWhereQuery(String whereQuery) {
            this.whereQuery = whereQuery;
            return this;
        }
        public String getWhereQuery() {
            return this.whereQuery;
        }

    }

}
