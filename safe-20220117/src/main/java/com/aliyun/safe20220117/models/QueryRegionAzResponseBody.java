// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryRegionAzResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryRegionAzResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryRegionAzResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRegionAzResponseBody self = new QueryRegionAzResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRegionAzResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryRegionAzResponseBody setData(QueryRegionAzResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRegionAzResponseBodyData getData() {
        return this.data;
    }

    public QueryRegionAzResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRegionAzResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRegionAzResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRegionAzResponseBodyDataDataInfo extends TeaModel {
        @NameInMap("AzList")
        public java.util.List<String> azList;

        @NameInMap("RegionCode")
        public String regionCode;

        @NameInMap("RegionName")
        public String regionName;

        public static QueryRegionAzResponseBodyDataDataInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryRegionAzResponseBodyDataDataInfo self = new QueryRegionAzResponseBodyDataDataInfo();
            return TeaModel.build(map, self);
        }

        public QueryRegionAzResponseBodyDataDataInfo setAzList(java.util.List<String> azList) {
            this.azList = azList;
            return this;
        }
        public java.util.List<String> getAzList() {
            return this.azList;
        }

        public QueryRegionAzResponseBodyDataDataInfo setRegionCode(String regionCode) {
            this.regionCode = regionCode;
            return this;
        }
        public String getRegionCode() {
            return this.regionCode;
        }

        public QueryRegionAzResponseBodyDataDataInfo setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

    public static class QueryRegionAzResponseBodyDataPagination extends TeaModel {
        @NameInMap("Limit")
        public Integer limit;

        @NameInMap("Page")
        public Integer page;

        public static QueryRegionAzResponseBodyDataPagination build(java.util.Map<String, ?> map) throws Exception {
            QueryRegionAzResponseBodyDataPagination self = new QueryRegionAzResponseBodyDataPagination();
            return TeaModel.build(map, self);
        }

        public QueryRegionAzResponseBodyDataPagination setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public QueryRegionAzResponseBodyDataPagination setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

    }

    public static class QueryRegionAzResponseBodyData extends TeaModel {
        @NameInMap("DataInfo")
        public java.util.List<QueryRegionAzResponseBodyDataDataInfo> dataInfo;

        @NameInMap("Pagination")
        public QueryRegionAzResponseBodyDataPagination pagination;

        @NameInMap("Total")
        public Long total;

        public static QueryRegionAzResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRegionAzResponseBodyData self = new QueryRegionAzResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRegionAzResponseBodyData setDataInfo(java.util.List<QueryRegionAzResponseBodyDataDataInfo> dataInfo) {
            this.dataInfo = dataInfo;
            return this;
        }
        public java.util.List<QueryRegionAzResponseBodyDataDataInfo> getDataInfo() {
            return this.dataInfo;
        }

        public QueryRegionAzResponseBodyData setPagination(QueryRegionAzResponseBodyDataPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public QueryRegionAzResponseBodyDataPagination getPagination() {
            return this.pagination;
        }

        public QueryRegionAzResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
