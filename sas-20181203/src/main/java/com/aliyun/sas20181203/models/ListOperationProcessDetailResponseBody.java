// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListOperationProcessDetailResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public ListOperationProcessDetailResponseBodyPageInfo pageInfo;

    @NameInMap("ProcessDetails")
    public java.util.List<ListOperationProcessDetailResponseBodyProcessDetails> processDetails;

    /**
     * <strong>example:</strong>
     * <p>CE500770-42D3-442E-9DDD-156E0F9F3***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListOperationProcessDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationProcessDetailResponseBody self = new ListOperationProcessDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationProcessDetailResponseBody setPageInfo(ListOperationProcessDetailResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListOperationProcessDetailResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListOperationProcessDetailResponseBody setProcessDetails(java.util.List<ListOperationProcessDetailResponseBodyProcessDetails> processDetails) {
        this.processDetails = processDetails;
        return this;
    }
    public java.util.List<ListOperationProcessDetailResponseBodyProcessDetails> getProcessDetails() {
        return this.processDetails;
    }

    public ListOperationProcessDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListOperationProcessDetailResponseBodyPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListOperationProcessDetailResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOperationProcessDetailResponseBodyPageInfo self = new ListOperationProcessDetailResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListOperationProcessDetailResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListOperationProcessDetailResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListOperationProcessDetailResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListOperationProcessDetailResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListOperationProcessDetailResponseBodyProcessDetailsChecks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>133</p>
         */
        @NameInMap("CheckId")
        public Long checkId;

        @NameInMap("CheckShowName")
        public String checkShowName;

        public static ListOperationProcessDetailResponseBodyProcessDetailsChecks build(java.util.Map<String, ?> map) throws Exception {
            ListOperationProcessDetailResponseBodyProcessDetailsChecks self = new ListOperationProcessDetailResponseBodyProcessDetailsChecks();
            return TeaModel.build(map, self);
        }

        public ListOperationProcessDetailResponseBodyProcessDetailsChecks setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public ListOperationProcessDetailResponseBodyProcessDetailsChecks setCheckShowName(String checkShowName) {
            this.checkShowName = checkShowName;
            return this;
        }
        public String getCheckShowName() {
            return this.checkShowName;
        }

    }

    public static class ListOperationProcessDetailResponseBodyProcessDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AssetSubType")
        public Integer assetSubType;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("AssetType")
        public Integer assetType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AssetVendor")
        public Integer assetVendor;

        @NameInMap("Checks")
        public java.util.List<ListOperationProcessDetailResponseBodyProcessDetailsChecks> checks;

        /**
         * <strong>example:</strong>
         * <p>1706544199000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>fb4bcd41-a916-46bc-ab1a-65fd383be***</p>
         */
        @NameInMap("DetailTaskId")
        public String detailTaskId;

        /**
         * <strong>example:</strong>
         * <p>1706544199000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>1730335622000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StatusCode")
        public Integer statusCode;

        /**
         * <strong>example:</strong>
         * <p>v34578b8-e567-47ec-2345-3e5b077ca***</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ListOperationProcessDetailResponseBodyProcessDetails build(java.util.Map<String, ?> map) throws Exception {
            ListOperationProcessDetailResponseBodyProcessDetails self = new ListOperationProcessDetailResponseBodyProcessDetails();
            return TeaModel.build(map, self);
        }

        public ListOperationProcessDetailResponseBodyProcessDetails setAssetSubType(Integer assetSubType) {
            this.assetSubType = assetSubType;
            return this;
        }
        public Integer getAssetSubType() {
            return this.assetSubType;
        }

        public ListOperationProcessDetailResponseBodyProcessDetails setAssetType(Integer assetType) {
            this.assetType = assetType;
            return this;
        }
        public Integer getAssetType() {
            return this.assetType;
        }

        public ListOperationProcessDetailResponseBodyProcessDetails setAssetVendor(Integer assetVendor) {
            this.assetVendor = assetVendor;
            return this;
        }
        public Integer getAssetVendor() {
            return this.assetVendor;
        }

        public ListOperationProcessDetailResponseBodyProcessDetails setChecks(java.util.List<ListOperationProcessDetailResponseBodyProcessDetailsChecks> checks) {
            this.checks = checks;
            return this;
        }
        public java.util.List<ListOperationProcessDetailResponseBodyProcessDetailsChecks> getChecks() {
            return this.checks;
        }

        public ListOperationProcessDetailResponseBodyProcessDetails setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListOperationProcessDetailResponseBodyProcessDetails setDetailTaskId(String detailTaskId) {
            this.detailTaskId = detailTaskId;
            return this;
        }
        public String getDetailTaskId() {
            return this.detailTaskId;
        }

        public ListOperationProcessDetailResponseBodyProcessDetails setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListOperationProcessDetailResponseBodyProcessDetails setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListOperationProcessDetailResponseBodyProcessDetails setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Integer getStatusCode() {
            return this.statusCode;
        }

        public ListOperationProcessDetailResponseBodyProcessDetails setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
