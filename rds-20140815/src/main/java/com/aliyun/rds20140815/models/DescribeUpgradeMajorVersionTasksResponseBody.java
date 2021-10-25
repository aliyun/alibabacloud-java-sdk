// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeUpgradeMajorVersionTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("Items")
    public java.util.List<DescribeUpgradeMajorVersionTasksResponseBodyItems> items;

    public static DescribeUpgradeMajorVersionTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpgradeMajorVersionTasksResponseBody self = new DescribeUpgradeMajorVersionTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUpgradeMajorVersionTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUpgradeMajorVersionTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUpgradeMajorVersionTasksResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeUpgradeMajorVersionTasksResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeUpgradeMajorVersionTasksResponseBody setItems(java.util.List<DescribeUpgradeMajorVersionTasksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeUpgradeMajorVersionTasksResponseBodyItems> getItems() {
        return this.items;
    }

    public static class DescribeUpgradeMajorVersionTasksResponseBodyItems extends TeaModel {
        @NameInMap("TargetMajorVersion")
        public String targetMajorVersion;

        @NameInMap("Result")
        public String result;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("SourceMajorVersion")
        public String sourceMajorVersion;

        @NameInMap("UpgradeMode")
        public String upgradeMode;

        @NameInMap("CollectStatMode")
        public String collectStatMode;

        @NameInMap("SourceInsName")
        public Integer sourceInsName;

        @NameInMap("TaskId")
        public Integer taskId;

        @NameInMap("TargetInsName")
        public Integer targetInsName;

        @NameInMap("SwitchTime")
        public String switchTime;

        @NameInMap("Detail")
        public String detail;

        public static DescribeUpgradeMajorVersionTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpgradeMajorVersionTasksResponseBodyItems self = new DescribeUpgradeMajorVersionTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setTargetMajorVersion(String targetMajorVersion) {
            this.targetMajorVersion = targetMajorVersion;
            return this;
        }
        public String getTargetMajorVersion() {
            return this.targetMajorVersion;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setSourceMajorVersion(String sourceMajorVersion) {
            this.sourceMajorVersion = sourceMajorVersion;
            return this;
        }
        public String getSourceMajorVersion() {
            return this.sourceMajorVersion;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setUpgradeMode(String upgradeMode) {
            this.upgradeMode = upgradeMode;
            return this;
        }
        public String getUpgradeMode() {
            return this.upgradeMode;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setCollectStatMode(String collectStatMode) {
            this.collectStatMode = collectStatMode;
            return this;
        }
        public String getCollectStatMode() {
            return this.collectStatMode;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setSourceInsName(Integer sourceInsName) {
            this.sourceInsName = sourceInsName;
            return this;
        }
        public Integer getSourceInsName() {
            return this.sourceInsName;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setTargetInsName(Integer targetInsName) {
            this.targetInsName = targetInsName;
            return this;
        }
        public Integer getTargetInsName() {
            return this.targetInsName;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setSwitchTime(String switchTime) {
            this.switchTime = switchTime;
            return this;
        }
        public String getSwitchTime() {
            return this.switchTime;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

    }

}
