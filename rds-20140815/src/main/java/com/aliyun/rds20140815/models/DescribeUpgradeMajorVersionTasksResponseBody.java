// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeUpgradeMajorVersionTasksResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeUpgradeMajorVersionTasksResponseBodyItems> items;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeUpgradeMajorVersionTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUpgradeMajorVersionTasksResponseBody self = new DescribeUpgradeMajorVersionTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUpgradeMajorVersionTasksResponseBody setItems(java.util.List<DescribeUpgradeMajorVersionTasksResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeUpgradeMajorVersionTasksResponseBodyItems> getItems() {
        return this.items;
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

    public DescribeUpgradeMajorVersionTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUpgradeMajorVersionTasksResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeUpgradeMajorVersionTasksResponseBodyItems extends TeaModel {
        @NameInMap("CollectStatMode")
        public String collectStatMode;

        @NameInMap("Detail")
        public String detail;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Result")
        public String result;

        @NameInMap("SourceInsName")
        public String sourceInsName;

        @NameInMap("SourceMajorVersion")
        public String sourceMajorVersion;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("SwitchTime")
        public String switchTime;

        @NameInMap("TargetInsName")
        public String targetInsName;

        @NameInMap("TargetMajorVersion")
        public String targetMajorVersion;

        @NameInMap("TaskId")
        public Integer taskId;

        @NameInMap("UpgradeMode")
        public String upgradeMode;

        public static DescribeUpgradeMajorVersionTasksResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeUpgradeMajorVersionTasksResponseBodyItems self = new DescribeUpgradeMajorVersionTasksResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setCollectStatMode(String collectStatMode) {
            this.collectStatMode = collectStatMode;
            return this;
        }
        public String getCollectStatMode() {
            return this.collectStatMode;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setSourceInsName(String sourceInsName) {
            this.sourceInsName = sourceInsName;
            return this;
        }
        public String getSourceInsName() {
            return this.sourceInsName;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setSourceMajorVersion(String sourceMajorVersion) {
            this.sourceMajorVersion = sourceMajorVersion;
            return this;
        }
        public String getSourceMajorVersion() {
            return this.sourceMajorVersion;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setSwitchTime(String switchTime) {
            this.switchTime = switchTime;
            return this;
        }
        public String getSwitchTime() {
            return this.switchTime;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setTargetInsName(String targetInsName) {
            this.targetInsName = targetInsName;
            return this;
        }
        public String getTargetInsName() {
            return this.targetInsName;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setTargetMajorVersion(String targetMajorVersion) {
            this.targetMajorVersion = targetMajorVersion;
            return this;
        }
        public String getTargetMajorVersion() {
            return this.targetMajorVersion;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

        public DescribeUpgradeMajorVersionTasksResponseBodyItems setUpgradeMode(String upgradeMode) {
            this.upgradeMode = upgradeMode;
            return this;
        }
        public String getUpgradeMode() {
            return this.upgradeMode;
        }

    }

}
