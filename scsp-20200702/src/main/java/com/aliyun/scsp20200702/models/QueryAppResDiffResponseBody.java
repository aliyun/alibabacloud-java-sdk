// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryAppResDiffResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAppResDiffResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryAppResDiffResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAppResDiffResponseBody self = new QueryAppResDiffResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAppResDiffResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAppResDiffResponseBody setData(QueryAppResDiffResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAppResDiffResponseBodyData getData() {
        return this.data;
    }

    public QueryAppResDiffResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryAppResDiffResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAppResDiffResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAppResDiffResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAppResDiffResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryAppResDiffResponseBodyDataDataRow extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryAppResDiffResponseBodyDataDataRow build(java.util.Map<String, ?> map) throws Exception {
            QueryAppResDiffResponseBodyDataDataRow self = new QueryAppResDiffResponseBodyDataDataRow();
            return TeaModel.build(map, self);
        }

        public QueryAppResDiffResponseBodyDataDataRow setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryAppResDiffResponseBodyDataDataRow setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryAppResDiffResponseBodyDataData extends TeaModel {
        @NameInMap("BaseFilteredValue")
        public String baseFilteredValue;

        @NameInMap("BaseValue")
        public String baseValue;

        @NameInMap("FilteredValue")
        public String filteredValue;

        @NameInMap("Id")
        public String id;

        @NameInMap("Res")
        public DAppRes res;

        @NameInMap("Row")
        public java.util.List<QueryAppResDiffResponseBodyDataDataRow> row;

        @NameInMap("Type")
        public DPair type;

        @NameInMap("Value")
        public String value;

        @NameInMap("status")
        public DPair status;

        public static QueryAppResDiffResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            QueryAppResDiffResponseBodyDataData self = new QueryAppResDiffResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public QueryAppResDiffResponseBodyDataData setBaseFilteredValue(String baseFilteredValue) {
            this.baseFilteredValue = baseFilteredValue;
            return this;
        }
        public String getBaseFilteredValue() {
            return this.baseFilteredValue;
        }

        public QueryAppResDiffResponseBodyDataData setBaseValue(String baseValue) {
            this.baseValue = baseValue;
            return this;
        }
        public String getBaseValue() {
            return this.baseValue;
        }

        public QueryAppResDiffResponseBodyDataData setFilteredValue(String filteredValue) {
            this.filteredValue = filteredValue;
            return this;
        }
        public String getFilteredValue() {
            return this.filteredValue;
        }

        public QueryAppResDiffResponseBodyDataData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAppResDiffResponseBodyDataData setRes(DAppRes res) {
            this.res = res;
            return this;
        }
        public DAppRes getRes() {
            return this.res;
        }

        public QueryAppResDiffResponseBodyDataData setRow(java.util.List<QueryAppResDiffResponseBodyDataDataRow> row) {
            this.row = row;
            return this;
        }
        public java.util.List<QueryAppResDiffResponseBodyDataDataRow> getRow() {
            return this.row;
        }

        public QueryAppResDiffResponseBodyDataData setType(DPair type) {
            this.type = type;
            return this;
        }
        public DPair getType() {
            return this.type;
        }

        public QueryAppResDiffResponseBodyDataData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public QueryAppResDiffResponseBodyDataData setStatus(DPair status) {
            this.status = status;
            return this;
        }
        public DPair getStatus() {
            return this.status;
        }

    }

    public static class QueryAppResDiffResponseBodyDataHead extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Title")
        public String title;

        public static QueryAppResDiffResponseBodyDataHead build(java.util.Map<String, ?> map) throws Exception {
            QueryAppResDiffResponseBodyDataHead self = new QueryAppResDiffResponseBodyDataHead();
            return TeaModel.build(map, self);
        }

        public QueryAppResDiffResponseBodyDataHead setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryAppResDiffResponseBodyDataHead setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class QueryAppResDiffResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<QueryAppResDiffResponseBodyDataData> data;

        @NameInMap("Head")
        public java.util.List<QueryAppResDiffResponseBodyDataHead> head;

        @NameInMap("ResCount")
        public DAppResCount resCount;

        public static QueryAppResDiffResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAppResDiffResponseBodyData self = new QueryAppResDiffResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAppResDiffResponseBodyData setData(java.util.List<QueryAppResDiffResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryAppResDiffResponseBodyDataData> getData() {
            return this.data;
        }

        public QueryAppResDiffResponseBodyData setHead(java.util.List<QueryAppResDiffResponseBodyDataHead> head) {
            this.head = head;
            return this;
        }
        public java.util.List<QueryAppResDiffResponseBodyDataHead> getHead() {
            return this.head;
        }

        public QueryAppResDiffResponseBodyData setResCount(DAppResCount resCount) {
            this.resCount = resCount;
            return this;
        }
        public DAppResCount getResCount() {
            return this.resCount;
        }

    }

}
