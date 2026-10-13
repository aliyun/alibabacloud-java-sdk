// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QueryPenetrationTestListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryPenetrationTestListResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>99D93ED4-D462-5FC5-8518-9BC1C49C7B6C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryPenetrationTestListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPenetrationTestListResponseBody self = new QueryPenetrationTestListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPenetrationTestListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPenetrationTestListResponseBody setData(QueryPenetrationTestListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPenetrationTestListResponseBodyData getData() {
        return this.data;
    }

    public QueryPenetrationTestListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryPenetrationTestListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPenetrationTestListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPenetrationTestListResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1788873796000</p>
         */
        @NameInMap("ApplyTime")
        public Long applyTime;

        /**
         * <strong>example:</strong>
         * <p>EIP</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <strong>example:</strong>
         * <p>710864062</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>10.0.158.58</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <strong>example:</strong>
         * <p>early_end</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1788873796000</p>
         */
        @NameInMap("TestEndDate")
        public Long testEndDate;

        /**
         * <strong>example:</strong>
         * <p>1788873796000</p>
         */
        @NameInMap("TestStartDate")
        public Long testStartDate;

        public static QueryPenetrationTestListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            QueryPenetrationTestListResponseBodyDataList self = new QueryPenetrationTestListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public QueryPenetrationTestListResponseBodyDataList setApplyTime(Long applyTime) {
            this.applyTime = applyTime;
            return this;
        }
        public Long getApplyTime() {
            return this.applyTime;
        }

        public QueryPenetrationTestListResponseBodyDataList setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public QueryPenetrationTestListResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryPenetrationTestListResponseBodyDataList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public QueryPenetrationTestListResponseBodyDataList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryPenetrationTestListResponseBodyDataList setTestEndDate(Long testEndDate) {
            this.testEndDate = testEndDate;
            return this;
        }
        public Long getTestEndDate() {
            return this.testEndDate;
        }

        public QueryPenetrationTestListResponseBodyDataList setTestStartDate(Long testStartDate) {
            this.testStartDate = testStartDate;
            return this;
        }
        public Long getTestStartDate() {
            return this.testStartDate;
        }

    }

    public static class QueryPenetrationTestListResponseBodyDataPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryPenetrationTestListResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryPenetrationTestListResponseBodyDataPageInfo self = new QueryPenetrationTestListResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public QueryPenetrationTestListResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryPenetrationTestListResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryPenetrationTestListResponseBodyDataPageInfo setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class QueryPenetrationTestListResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<QueryPenetrationTestListResponseBodyDataList> list;

        @NameInMap("PageInfo")
        public QueryPenetrationTestListResponseBodyDataPageInfo pageInfo;

        public static QueryPenetrationTestListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPenetrationTestListResponseBodyData self = new QueryPenetrationTestListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPenetrationTestListResponseBodyData setList(java.util.List<QueryPenetrationTestListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryPenetrationTestListResponseBodyDataList> getList() {
            return this.list;
        }

        public QueryPenetrationTestListResponseBodyData setPageInfo(QueryPenetrationTestListResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public QueryPenetrationTestListResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

}
