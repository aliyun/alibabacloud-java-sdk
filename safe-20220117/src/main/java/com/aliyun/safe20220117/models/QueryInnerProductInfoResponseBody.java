// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryInnerProductInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryInnerProductInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryInnerProductInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerProductInfoResponseBody self = new QueryInnerProductInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInnerProductInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryInnerProductInfoResponseBody setData(QueryInnerProductInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryInnerProductInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryInnerProductInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInnerProductInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInnerProductInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryInnerProductInfoResponseBodyDataDataInfo extends TeaModel {
        @NameInMap("InnerProductCode")
        public String innerProductCode;

        @NameInMap("InnerProductName")
        public String innerProductName;

        @NameInMap("ProductCode")
        public String productCode;

        @NameInMap("ProductName")
        public String productName;

        public static QueryInnerProductInfoResponseBodyDataDataInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryInnerProductInfoResponseBodyDataDataInfo self = new QueryInnerProductInfoResponseBodyDataDataInfo();
            return TeaModel.build(map, self);
        }

        public QueryInnerProductInfoResponseBodyDataDataInfo setInnerProductCode(String innerProductCode) {
            this.innerProductCode = innerProductCode;
            return this;
        }
        public String getInnerProductCode() {
            return this.innerProductCode;
        }

        public QueryInnerProductInfoResponseBodyDataDataInfo setInnerProductName(String innerProductName) {
            this.innerProductName = innerProductName;
            return this;
        }
        public String getInnerProductName() {
            return this.innerProductName;
        }

        public QueryInnerProductInfoResponseBodyDataDataInfo setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public QueryInnerProductInfoResponseBodyDataDataInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

    }

    public static class QueryInnerProductInfoResponseBodyDataPagination extends TeaModel {
        @NameInMap("Limit")
        public Integer limit;

        @NameInMap("Page")
        public Integer page;

        public static QueryInnerProductInfoResponseBodyDataPagination build(java.util.Map<String, ?> map) throws Exception {
            QueryInnerProductInfoResponseBodyDataPagination self = new QueryInnerProductInfoResponseBodyDataPagination();
            return TeaModel.build(map, self);
        }

        public QueryInnerProductInfoResponseBodyDataPagination setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public QueryInnerProductInfoResponseBodyDataPagination setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

    }

    public static class QueryInnerProductInfoResponseBodyData extends TeaModel {
        @NameInMap("DataInfo")
        public java.util.List<QueryInnerProductInfoResponseBodyDataDataInfo> dataInfo;

        @NameInMap("Pagination")
        public QueryInnerProductInfoResponseBodyDataPagination pagination;

        @NameInMap("Total")
        public Long total;

        public static QueryInnerProductInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryInnerProductInfoResponseBodyData self = new QueryInnerProductInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryInnerProductInfoResponseBodyData setDataInfo(java.util.List<QueryInnerProductInfoResponseBodyDataDataInfo> dataInfo) {
            this.dataInfo = dataInfo;
            return this;
        }
        public java.util.List<QueryInnerProductInfoResponseBodyDataDataInfo> getDataInfo() {
            return this.dataInfo;
        }

        public QueryInnerProductInfoResponseBodyData setPagination(QueryInnerProductInfoResponseBodyDataPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public QueryInnerProductInfoResponseBodyDataPagination getPagination() {
            return this.pagination;
        }

        public QueryInnerProductInfoResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
