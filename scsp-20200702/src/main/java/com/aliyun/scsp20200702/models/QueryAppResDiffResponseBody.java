// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryAppResDiffResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // 数据
    @NameInMap("Data")
    public QueryAppResDiffResponseBodyData data;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    // 总数
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
        // 键, 和表头key对应
        @NameInMap("Key")
        public String key;

        // 内容
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
        // 过滤后前值
        @NameInMap("BaseFilteredValue")
        public String baseFilteredValue;

        // 基线值
        @NameInMap("BaseValue")
        public String baseValue;

        // 过滤后当前值
        @NameInMap("FilteredValue")
        public String filteredValue;

        // id
        @NameInMap("Id")
        public String id;

        // 应用配置
        @NameInMap("Res")
        public DAppRes res;

        // 差异行
        @NameInMap("Row")
        public java.util.List<QueryAppResDiffResponseBodyDataDataRow> row;

        // 差异类型
        @NameInMap("Type")
        public DPair type;

        // 当前值
        @NameInMap("Value")
        public String value;

        // 处理状态
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
        // 键
        @NameInMap("Key")
        public String key;

        // 标题
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
        // diff列表
        @NameInMap("Data")
        public java.util.List<QueryAppResDiffResponseBodyDataData> data;

        // 应用配置差异表头
        @NameInMap("Head")
        public java.util.List<QueryAppResDiffResponseBodyDataHead> head;

        // 资源数量
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
