// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeUpgradeMajorVersionTasksResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the information about the tasks that are returned.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeUpgradeMajorVersionTasksResponseBodyItems> items;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     */
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
        /**
         * <p>The time at which ApsaraDB RDS collects the statistics of the new RDS instance.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   **After**: ApsaraDB RDS collects the statistics of the new instance after a switchover.</p>
         * <p>*   **Before**: ApsaraDB RDS collects the statistics of the new instance before a switchover.</p>
         */
        @NameInMap("CollectStatMode")
        public String collectStatMode;

        /**
         * <p>The details of the task.</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The time at which the task ended.</p>
         * <br>
         * <p>The value of this parameter is a timestamp that follows the UNIX time format. Unit: milliseconds.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The status of the task.</p>
         * <br>
         * <p>*   **Success**: The task is successful.</p>
         * <p>*   **Failed**: The task failed.</p>
         * <p>*   **Running**: The task is in the phase in which data is being migrated to a new instance.</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The ID of the original instance.</p>
         */
        @NameInMap("SourceInsName")
        public String sourceInsName;

        /**
         * <p>The major engine version of the original instance.</p>
         */
        @NameInMap("SourceMajorVersion")
        public String sourceMajorVersion;

        /**
         * <p>The time at which the task started.</p>
         * <br>
         * <p>The value of this parameter is a timestamp that follows the UNIX time format. Unit: milliseconds.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time at which your workloads are switched over from the original instance to the new instance.</p>
         * <br>
         * <p>The value of this parameter is a timestamp that follows the UNIX time format. Unit: milliseconds.</p>
         */
        @NameInMap("SwitchTime")
        public String switchTime;

        /**
         * <p>The ID of the new instance.</p>
         */
        @NameInMap("TargetInsName")
        public String targetInsName;

        /**
         * <p>The major engine version of the new instance. Valid values:</p>
         * <br>
         * <p>*   **10.0**</p>
         * <p>*   **11.0**</p>
         * <p>*   **12.0**</p>
         * <p>*   **13.0**</p>
         */
        @NameInMap("TargetMajorVersion")
        public String targetMajorVersion;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        /**
         * <p>Indicates whether ApsaraDB RDS migrates data to the new instance and switches your workloads over to the new instance.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   **clone**: ApsaraDB RDS does not migrate data to the new instance and does not switch your workloads over to the new instance.</p>
         * <p>*   **switch**: ApsaraDB RDS migrates data to the new instance and switches your workloads over to the new instance.</p>
         */
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
