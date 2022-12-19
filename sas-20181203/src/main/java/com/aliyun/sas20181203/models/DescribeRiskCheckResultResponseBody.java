// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskCheckResultResponseBody extends TeaModel {
    // The number of entries returned on the current page.
    @NameInMap("Count")
    public Integer count;

    // The page number of the returned page.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // An array that consists of the check items.
    @NameInMap("List")
    public java.util.List<DescribeRiskCheckResultResponseBodyList> list;

    // The total number of pages returned.
    @NameInMap("PageCount")
    public Integer pageCount;

    // The number of entries returned per page. Default value: **20**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries returned.
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
        // The details about the check result.
        @NameInMap("ContentResource")
        public java.util.Map<String, ?> contentResource;

        // The title in the details. Valid values:
        // 
        // *   **bestPractice**: description
        // *   **influence**: risk
        // *   **suggestion**: solution
        // *   **helpResource**: reference
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
        // The number of affected assets.
        @NameInMap("AffectedCount")
        public Integer affectedCount;

        // The timestamp when the last check was performed. Unit: milliseconds.
        @NameInMap("CheckTime")
        public Long checkTime;

        // The ID of the check item. For more information about the description of the check item ID, see the check item table in the "Response parameters" section of this topic.
        @NameInMap("ItemId")
        public Long itemId;

        // The time when the next check will be performed.
        @NameInMap("RemainingTime")
        public Integer remainingTime;

        // Indicates whether the risks that are detected for the check item can be fixed. Valid values:
        // 
        // *   **enabled**: yes
        // *   **disabled**: no
        @NameInMap("RepairStatus")
        public String repairStatus;

        // The type of the affected assets.
        @NameInMap("RiskAssertType")
        public String riskAssertType;

        // An array that consists of the details about the check item.
        @NameInMap("RiskItemResources")
        public java.util.List<DescribeRiskCheckResultResponseBodyListRiskItemResources> riskItemResources;

        // The risk level of the check item. Valid values:
        // 
        // *   **high**
        // *   **medium**
        // *   **low**
        @NameInMap("RiskLevel")
        public String riskLevel;

        // The sequence number of the check result. The check items are sorted based on the sequence number.
        @NameInMap("Sort")
        public Integer sort;

        // Indicates whether the check item is supported by the cloud service. Valid values:
        // 
        // *   **enabled**: The check item is supported by the cloud service.
        // *   **disable**: The check item is not supported by the cloud service.
        @NameInMap("StartStatus")
        public String startStatus;

        // The status of the check result. Valid values:
        // 
        // *   **pass**
        // *   **failed**
        // *   **running**
        // *   **waiting**
        // *   **ignored**
        // *   **falsePositive**
        @NameInMap("Status")
        public String status;

        // The ID of the check task.
        @NameInMap("TaskId")
        public Long taskId;

        // The name of the check item.
        @NameInMap("Title")
        public String title;

        // The type of the check item. Valid values:
        // 
        // *   Identity authentication and permissions
        // *   Network access control
        // *   Log audit
        // *   Data security
        // *   Monitoring and alerting
        // *   Basic security protection
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
