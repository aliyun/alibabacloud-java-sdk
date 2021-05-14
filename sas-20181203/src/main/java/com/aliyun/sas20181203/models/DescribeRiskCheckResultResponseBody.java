// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskCheckResultResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("List")
    public java.util.List<DescribeRiskCheckResultResponseBodyList> list;

    public static DescribeRiskCheckResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskCheckResultResponseBody self = new DescribeRiskCheckResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskCheckResultResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeRiskCheckResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRiskCheckResultResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRiskCheckResultResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeRiskCheckResultResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public DescribeRiskCheckResultResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeRiskCheckResultResponseBody setList(java.util.List<DescribeRiskCheckResultResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeRiskCheckResultResponseBodyList> getList() {
        return this.list;
    }

    public static class DescribeRiskCheckResultResponseBodyListRiskItemResources extends TeaModel {
        @NameInMap("ContentResource")
        public String contentResource;

        @NameInMap("ResourceName")
        public String resourceName;

        public static DescribeRiskCheckResultResponseBodyListRiskItemResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskCheckResultResponseBodyListRiskItemResources self = new DescribeRiskCheckResultResponseBodyListRiskItemResources();
            return TeaModel.build(map, self);
        }

        public DescribeRiskCheckResultResponseBodyListRiskItemResources setContentResource(String contentResource) {
            this.contentResource = contentResource;
            return this;
        }
        public String getContentResource() {
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
        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Sort")
        public Integer sort;

        @NameInMap("RepairStatus")
        public String repairStatus;

        @NameInMap("RemainingTime")
        public Integer remainingTime;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("StartStatus")
        public String startStatus;

        @NameInMap("AffectedCount")
        public Integer affectedCount;

        @NameInMap("RiskAssertType")
        public String riskAssertType;

        @NameInMap("Title")
        public String title;

        @NameInMap("TaskId")
        public Long taskId;

        @NameInMap("CheckTime")
        public Long checkTime;

        @NameInMap("RiskItemResources")
        public java.util.List<DescribeRiskCheckResultResponseBodyListRiskItemResources> riskItemResources;

        public static DescribeRiskCheckResultResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskCheckResultResponseBodyList self = new DescribeRiskCheckResultResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeRiskCheckResultResponseBodyList setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public DescribeRiskCheckResultResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRiskCheckResultResponseBodyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeRiskCheckResultResponseBodyList setSort(Integer sort) {
            this.sort = sort;
            return this;
        }
        public Integer getSort() {
            return this.sort;
        }

        public DescribeRiskCheckResultResponseBodyList setRepairStatus(String repairStatus) {
            this.repairStatus = repairStatus;
            return this;
        }
        public String getRepairStatus() {
            return this.repairStatus;
        }

        public DescribeRiskCheckResultResponseBodyList setRemainingTime(Integer remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        public DescribeRiskCheckResultResponseBodyList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public DescribeRiskCheckResultResponseBodyList setStartStatus(String startStatus) {
            this.startStatus = startStatus;
            return this;
        }
        public String getStartStatus() {
            return this.startStatus;
        }

        public DescribeRiskCheckResultResponseBodyList setAffectedCount(Integer affectedCount) {
            this.affectedCount = affectedCount;
            return this;
        }
        public Integer getAffectedCount() {
            return this.affectedCount;
        }

        public DescribeRiskCheckResultResponseBodyList setRiskAssertType(String riskAssertType) {
            this.riskAssertType = riskAssertType;
            return this;
        }
        public String getRiskAssertType() {
            return this.riskAssertType;
        }

        public DescribeRiskCheckResultResponseBodyList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public DescribeRiskCheckResultResponseBodyList setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public DescribeRiskCheckResultResponseBodyList setCheckTime(Long checkTime) {
            this.checkTime = checkTime;
            return this;
        }
        public Long getCheckTime() {
            return this.checkTime;
        }

        public DescribeRiskCheckResultResponseBodyList setRiskItemResources(java.util.List<DescribeRiskCheckResultResponseBodyListRiskItemResources> riskItemResources) {
            this.riskItemResources = riskItemResources;
            return this;
        }
        public java.util.List<DescribeRiskCheckResultResponseBodyListRiskItemResources> getRiskItemResources() {
            return this.riskItemResources;
        }

    }

}
