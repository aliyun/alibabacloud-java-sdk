// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeSearchTablesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeSearchTablesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DescribeSearchTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSearchTablesResponseBody self = new DescribeSearchTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSearchTablesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSearchTablesResponseBody setData(DescribeSearchTablesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSearchTablesResponseBodyData getData() {
        return this.data;
    }

    public DescribeSearchTablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSearchTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSearchTablesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeSearchTablesResponseBodyDataRecords extends TeaModel {
        @NameInMap("AlgorithmId")
        public String algorithmId;

        @NameInMap("SearchTableId")
        public String searchTableId;

        @NameInMap("SearchTableName")
        public String searchTableName;

        @NameInMap("TargetType")
        public String targetType;

        public static DescribeSearchTablesResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeSearchTablesResponseBodyDataRecords self = new DescribeSearchTablesResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public DescribeSearchTablesResponseBodyDataRecords setAlgorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }
        public String getAlgorithmId() {
            return this.algorithmId;
        }

        public DescribeSearchTablesResponseBodyDataRecords setSearchTableId(String searchTableId) {
            this.searchTableId = searchTableId;
            return this;
        }
        public String getSearchTableId() {
            return this.searchTableId;
        }

        public DescribeSearchTablesResponseBodyDataRecords setSearchTableName(String searchTableName) {
            this.searchTableName = searchTableName;
            return this;
        }
        public String getSearchTableName() {
            return this.searchTableName;
        }

        public DescribeSearchTablesResponseBodyDataRecords setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class DescribeSearchTablesResponseBodyData extends TeaModel {
        @NameInMap("PageNumbei")
        public Long pageNumbei;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Records")
        public java.util.List<DescribeSearchTablesResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeSearchTablesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSearchTablesResponseBodyData self = new DescribeSearchTablesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSearchTablesResponseBodyData setPageNumbei(Long pageNumbei) {
            this.pageNumbei = pageNumbei;
            return this;
        }
        public Long getPageNumbei() {
            return this.pageNumbei;
        }

        public DescribeSearchTablesResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeSearchTablesResponseBodyData setRecords(java.util.List<DescribeSearchTablesResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<DescribeSearchTablesResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public DescribeSearchTablesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
