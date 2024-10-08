// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRiskCheckResultResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The check items.</p>
     */
    @NameInMap("List")
    public java.util.List<DescribeRiskCheckResultResponseBodyList> list;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AD271C07-4ACE-413D-AA9B-F14FD3B7717F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
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
         * <ul>
         * <li><strong>bestPractice</strong>: description</li>
         * <li><strong>influence</strong>: risk</li>
         * <li><strong>suggestion</strong>: solution</li>
         * <li><strong>helpResource</strong>: reference</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>bestPractice</p>
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
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AffectedCount")
        public Integer affectedCount;

        /**
         * <p>The timestamp when the last check was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1639429164000</p>
         */
        @NameInMap("CheckTime")
        public Long checkTime;

        /**
         * <p>The ID of the check item. For more information about the check item, see the check item table in the &quot;Response parameters&quot; section of this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ItemId")
        public Long itemId;

        /**
         * <p>The time when the next check will be performed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RemainingTime")
        public Integer remainingTime;

        /**
         * <p>Indicates whether the risks that are detected based on the check item can be fixed. Valid values:</p>
         * <ul>
         * <li><strong>enabled</strong>: yes</li>
         * <li><strong>disabled</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disabled</p>
         */
        @NameInMap("RepairStatus")
        public String repairStatus;

        /**
         * <p>The type of the affected assets.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
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
         * <ul>
         * <li><strong>high</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>low</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("RiskLevel")
        public String riskLevel;

        /**
         * <p>The sequence number in the check results. The check items are sorted based on the sequence number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Sort")
        public Integer sort;

        /**
         * <p>Indicates whether the check item is supported by the edition of Security Center that you purchase. Valid values:</p>
         * <ul>
         * <li><strong>enabled</strong>: yes</li>
         * <li><strong>disable</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("StartStatus")
        public String startStatus;

        /**
         * <p>The status of the check results. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong></li>
         * <li><strong>failed</strong></li>
         * <li><strong>running</strong></li>
         * <li><strong>waiting</strong></li>
         * <li><strong>ignored</strong></li>
         * <li><strong>falsePositive</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the check task.</p>
         * 
         * <strong>example:</strong>
         * <p>15384933</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>The name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS - Whitelist Configuration</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The type of the check item. Valid values:</p>
         * <ul>
         * <li>Identity authentication and permissions</li>
         * <li>Network access control</li>
         * <li>Log audit</li>
         * <li>Data security</li>
         * <li>Monitoring and alerting</li>
         * <li>Basic security protection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Log audit</p>
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
