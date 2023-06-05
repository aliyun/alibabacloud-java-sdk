// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogsV2ResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<java.util.Map<String, String>> data;

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
        @NameInMap("aggQuery")
        public String aggQuery;

        @NameInMap("count")
        public Integer count;

        @NameInMap("elapsedMillisecond")
        public Long elapsedMillisecond;

        @NameInMap("hasSQL")
        public Boolean hasSQL;

        @NameInMap("isAccurate")
        public Boolean isAccurate;

        @NameInMap("keys")
        public java.util.List<String> keys;

        @NameInMap("processedBytes")
        public Long processedBytes;

        @NameInMap("processedRows")
        public Integer processedRows;

        @NameInMap("progress")
        public String progress;

        @NameInMap("telementryType")
        public String telementryType;

        @NameInMap("terms")
        public java.util.List<java.util.Map<String, ?>> terms;

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
