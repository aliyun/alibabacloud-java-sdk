// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataMaskingTasksResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeDataMaskingTasksResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDataMaskingTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataMaskingTasksResponseBody self = new DescribeDataMaskingTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataMaskingTasksResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataMaskingTasksResponseBody setItems(java.util.List<DescribeDataMaskingTasksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDataMaskingTasksResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDataMaskingTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataMaskingTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataMaskingTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataMaskingTasksResponseBodyItems extends TeaModel {
        @NameInMap("DstPath")
        public String dstPath;

        @NameInMap("DstType")
        public Integer dstType;

        @NameInMap("DstTypeCode")
        public String dstTypeCode;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("HasUnfinishProcess")
        public Boolean hasUnfinishProcess;

        @NameInMap("Id")
        public Long id;

        @NameInMap("OriginalTable")
        public Boolean originalTable;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("RunCount")
        public Integer runCount;

        @NameInMap("SrcPath")
        public String srcPath;

        @NameInMap("SrcType")
        public Integer srcType;

        @NameInMap("SrcTypeCode")
        public String srcTypeCode;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TriggerType")
        public Integer triggerType;

        public static DescribeDataMaskingTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataMaskingTasksResponseBodyItems self = new DescribeDataMaskingTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataMaskingTasksResponseBodyItems setDstPath(String dstPath) {
            this.dstPath = dstPath;
            return this;
        }
        public String getDstPath() {
            return this.dstPath;
        }

        public DescribeDataMaskingTasksResponseBodyItems setDstType(Integer dstType) {
            this.dstType = dstType;
            return this;
        }
        public Integer getDstType() {
            return this.dstType;
        }

        public DescribeDataMaskingTasksResponseBodyItems setDstTypeCode(String dstTypeCode) {
            this.dstTypeCode = dstTypeCode;
            return this;
        }
        public String getDstTypeCode() {
            return this.dstTypeCode;
        }

        public DescribeDataMaskingTasksResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDataMaskingTasksResponseBodyItems setHasUnfinishProcess(Boolean hasUnfinishProcess) {
            this.hasUnfinishProcess = hasUnfinishProcess;
            return this;
        }
        public Boolean getHasUnfinishProcess() {
            return this.hasUnfinishProcess;
        }

        public DescribeDataMaskingTasksResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDataMaskingTasksResponseBodyItems setOriginalTable(Boolean originalTable) {
            this.originalTable = originalTable;
            return this;
        }
        public Boolean getOriginalTable() {
            return this.originalTable;
        }

        public DescribeDataMaskingTasksResponseBodyItems setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public DescribeDataMaskingTasksResponseBodyItems setRunCount(Integer runCount) {
            this.runCount = runCount;
            return this;
        }
        public Integer getRunCount() {
            return this.runCount;
        }

        public DescribeDataMaskingTasksResponseBodyItems setSrcPath(String srcPath) {
            this.srcPath = srcPath;
            return this;
        }
        public String getSrcPath() {
            return this.srcPath;
        }

        public DescribeDataMaskingTasksResponseBodyItems setSrcType(Integer srcType) {
            this.srcType = srcType;
            return this;
        }
        public Integer getSrcType() {
            return this.srcType;
        }

        public DescribeDataMaskingTasksResponseBodyItems setSrcTypeCode(String srcTypeCode) {
            this.srcTypeCode = srcTypeCode;
            return this;
        }
        public String getSrcTypeCode() {
            return this.srcTypeCode;
        }

        public DescribeDataMaskingTasksResponseBodyItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeDataMaskingTasksResponseBodyItems setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeDataMaskingTasksResponseBodyItems setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeDataMaskingTasksResponseBodyItems setTriggerType(Integer triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public Integer getTriggerType() {
            return this.triggerType;
        }

    }

}
