// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QuerySlotsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySlotsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySlotsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySlotsResponseBody self = new QuerySlotsResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySlotsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySlotsResponseBody setData(QuerySlotsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySlotsResponseBodyData getData() {
        return this.data;
    }

    public QuerySlotsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QuerySlotsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySlotsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySlotsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySlotsResponseBodyDataResultData extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("CategoryId")
        public Integer categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("OwnStatus")
        public Integer ownStatus;

        @NameInMap("Source")
        public Integer source;

        @NameInMap("SourceName")
        public String sourceName;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("TypeName")
        public String typeName;

        public static QuerySlotsResponseBodyDataResultData build(java.util.Map<String, ?> map) throws Exception {
            QuerySlotsResponseBodyDataResultData self = new QuerySlotsResponseBodyDataResultData();
            return TeaModel.build(map, self);
        }

        public QuerySlotsResponseBodyDataResultData setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public QuerySlotsResponseBodyDataResultData setCategoryId(Integer categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Integer getCategoryId() {
            return this.categoryId;
        }

        public QuerySlotsResponseBodyDataResultData setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public QuerySlotsResponseBodyDataResultData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QuerySlotsResponseBodyDataResultData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public QuerySlotsResponseBodyDataResultData setOwnStatus(Integer ownStatus) {
            this.ownStatus = ownStatus;
            return this;
        }
        public Integer getOwnStatus() {
            return this.ownStatus;
        }

        public QuerySlotsResponseBodyDataResultData setSource(Integer source) {
            this.source = source;
            return this;
        }
        public Integer getSource() {
            return this.source;
        }

        public QuerySlotsResponseBodyDataResultData setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public QuerySlotsResponseBodyDataResultData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QuerySlotsResponseBodyDataResultData setTypeName(String typeName) {
            this.typeName = typeName;
            return this;
        }
        public String getTypeName() {
            return this.typeName;
        }

    }

    public static class QuerySlotsResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("ResultData")
        public java.util.List<QuerySlotsResponseBodyDataResultData> resultData;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static QuerySlotsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySlotsResponseBodyData self = new QuerySlotsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySlotsResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QuerySlotsResponseBodyData setResultData(java.util.List<QuerySlotsResponseBodyDataResultData> resultData) {
            this.resultData = resultData;
            return this;
        }
        public java.util.List<QuerySlotsResponseBodyDataResultData> getResultData() {
            return this.resultData;
        }

        public QuerySlotsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
