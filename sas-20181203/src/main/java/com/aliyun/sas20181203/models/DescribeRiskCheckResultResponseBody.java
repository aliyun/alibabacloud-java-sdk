// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskCheckResultResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>An array that consists of the check items.</p>
     */
    @NameInMap("List")
    public java.util.List<DescribeRiskCheckResultResponseBodyList> list;

    /**
     * <p>The total number of pages returned.</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <p>The number of entries returned per page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRiskCheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskCheckResultResponseBody self = new DescribeRiskCheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskCheckResultResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeRiskCheckResultResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeRiskCheckResultResponseBody setList(java.util.List<DescribeRiskCheckResultResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeRiskCheckResultResponseBodyList> getList() {
        return this.list;
    }

    public DescribeRiskCheckResultResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public DescribeRiskCheckResultResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRiskCheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRiskCheckResultResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRiskCheckResultResponseBodyListRiskItemResources extends TeaModel {
        /**
         * <p>The details about the check results.</p>
         */
        @NameInMap("ContentResource")
        public java.util.Map<String, ?> contentResource;

        /**
         * <p>The title in the details. Valid values:</p>
         * <br>
         * <p>*   **bestPractice**: description</p>
         * <p>*   **influence**: risk</p>
         * <p>*   **suggestion**: solution</p>
         * <p>*   **helpResource**: reference</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        public static DescribeRiskCheckResultResponseBodyListRiskItemResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskCheckResultResponseBodyListRiskItemResources self = new DescribeRiskCheckResultResponseBodyListRiskItemResources();
            return TeaModel.build(map, self);
        }

        public DescribeRiskCheckResultResponseBodyListRiskItemResources setContentResource(java.util.Map<String, ?> contentResource) {
            this.contentResource = contentResource;
            return this;
        }
        public java.util.Map<String, ?> getContentResource() {
            return this.contentResource;
        }

        public DescribeRiskCheckResultResponseBodyListRiskItemResources setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

    }

    public static class DescribeRiskCheckResultResponseBodyList extends TeaModel {
        /**
         * <p>The number of affected assets.</p>
         */
        @NameInMap("AffectedCount")
        public Integer affectedCount;

        /**
         * <p>The timestamp when the last check was performed. Unit: milliseconds.</p>
         */
        @NameInMap("CheckTime")
        public Long checkTime;

        /**
         * <p>The ID of the check item. For more information about the check item, see the check item table in the "Response parameters" section of this topic.</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <p>The time when the next check will be performed.</p>
         */
        @NameInMap("RemainingTime")
        public Integer remainingTime;

        /**
         * <p>Indicates whether the risks that are detected based on the check item can be fixed. Valid values:</p>
         * <br>
         * <p>*   **enabled**: yes</p>
         * <p>*   **disabled**: no</p>
         */
        @NameInMap("RepairStatus")
        public String repairStatus;

        /**
         * <p>The type of the affected assets.</p>
         */
        @NameInMap("RiskAssertType")
        public String riskAssertType;

        /**
         * <p>An array that consists of the details about the check item.</p>
         */
        @NameInMap("RiskItemResources")
        public java.util.List<DescribeRiskCheckResultResponseBodyListRiskItemResources> riskItemResources;

        /**
         * <p>The risk level of the check item. Valid values:</p>
         * <br>
         * <p>*   **high**</p>
         * <p>*   **medium**</p>
         * <p>*   **low**</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The sequence number in the check results. The check items are sorted based on the sequence number.</p>
         */
        @NameInMap("Sort")
        public Integer sort;

        /**
         * <p>Indicates whether the check item is supported by the edition of Security Center that you purchase. Valid values:</p>
         * <br>
         * <p>*   **enabled**: yes</p>
         * <p>*   **disable**: no</p>
         */
        @NameInMap("StartStatus")
        public String startStatus;

        /**
         * <p>The status of the check results. Valid values:</p>
         * <br>
         * <p>*   **pass**</p>
         * <p>*   **failed**</p>
         * <p>*   **running**</p>
         * <p>*   **waiting**</p>
         * <p>*   **ignored**</p>
         * <p>*   **falsePositive**</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the check task.</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>The name of the check item.</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The type of the check item. Valid values:</p>
         * <br>
         * <p>*   Identity authentication and permissions</p>
         * <p>*   Network access control</p>
         * <p>*   Log audit</p>
         * <p>*   Data security</p>
         * <p>*   Monitoring and alerting</p>
         * <p>*   Basic security protection</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeRiskCheckResultResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskCheckResultResponseBodyList self = new DescribeRiskCheckResultResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeRiskCheckResultResponseBodyList setAffectedCount(Integer affectedCount) {
            this.affectedCount = affectedCount;
            return this;
        }
        public Integer getAffectedCount() {
            return this.affectedCount;
        }

        public DescribeRiskCheckResultResponseBodyList setCheckTime(Long checkTime) {
            this.checkTime = checkTime;
            return this;
        }
        public Long getCheckTime() {
            return this.checkTime;
        }

        public DescribeRiskCheckResultResponseBodyList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public DescribeRiskCheckResultResponseBodyList setRemainingTime(Integer remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        public DescribeRiskCheckResultResponseBodyList setRepairStatus(String repairStatus) {
            this.repairStatus = repairStatus;
            return this;
        }
        public String getRepairStatus() {
            return this.repairStatus;
        }

        public DescribeRiskCheckResultResponseBodyList setRiskAssertType(String riskAssertType) {
            this.riskAssertType = riskAssertType;
            return this;
        }
        public String getRiskAssertType() {
            return this.riskAssertType;
        }

        public DescribeRiskCheckResultResponseBodyList setRiskItemResources(java.util.List<DescribeRiskCheckResultResponseBodyListRiskItemResources> riskItemResources) {
            this.riskItemResources = riskItemResources;
            return this;
        }
        public java.util.List<DescribeRiskCheckResultResponseBodyListRiskItemResources> getRiskItemResources() {
            return this.riskItemResources;
        }

        public DescribeRiskCheckResultResponseBodyList setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeRiskCheckResultResponseBodyList setSort(Integer sort) {
            this.sort = sort;
            return this;
        }
        public Integer getSort() {
            return this.sort;
        }

        public DescribeRiskCheckResultResponseBodyList setStartStatus(String startStatus) {
            this.startStatus = startStatus;
            return this;
        }
        public String getStartStatus() {
            return this.startStatus;
        }

        public DescribeRiskCheckResultResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRiskCheckResultResponseBodyList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public DescribeRiskCheckResultResponseBodyList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeRiskCheckResultResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
