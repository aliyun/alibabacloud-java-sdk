// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeUpgradeMajorVersionTasksResponseBody extends TeaModel {
    /**
     * <p>The tasks for major engine version upgrades.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeUpgradeMajorVersionTasksResponseBodyItems> items;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>152E0C6D-B9C3-4468-9F2C-FEF9D9E8417B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The time when the system collects the statistics.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>After</strong>: The system collects the statistics after a switchover.</li>
         * <li><strong>Before</strong>: The system collects the statistics before a switchover.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>After</p>
         */
        @NameInMap("CollectStatMode")
        public String collectStatMode;

        /**
         * <p>The details of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-10-27 15:03:05 --- do upgrade precheck on slave succcess.\n2021-10-27 15:03:11 --- begin to upgrade major version, source instance will locked in readonly mode.\n2021-10-27 15:03:21 --- upgrade master success.\n2021-10-27 15:06:10 --- exchange source and target instance dns success.\n</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <p>The end time of the task.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614237779000</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The status of the task.</p>
         * <ul>
         * <li><strong>Success</strong>: The task is successful.</li>
         * <li><strong>Failed</strong>: The task failed.</li>
         * <li><strong>Running</strong>: The task is in the phase in which data is being migrated to a new instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The ID of the original instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp1i3kkq7321****</p>
         */
        @NameInMap("SourceInsName")
        public String sourceInsName;

        /**
         * <p>The major engine version of the original instance.</p>
         * 
         * <strong>example:</strong>
         * <p>11.0</p>
         */
        @NameInMap("SourceMajorVersion")
        public String sourceMajorVersion;

        /**
         * <p>The start time of the task.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614236007000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time at which your workloads are switched over from the original instance to the new instance.</p>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614237539000</p>
         */
        @NameInMap("SwitchTime")
        public String switchTime;

        /**
         * <p>The ID of the new instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pgm-bp1c0v6d8092****</p>
         */
        @NameInMap("TargetInsName")
        public String targetInsName;

        /**
         * <p>The major engine version of the new instance. Valid values:</p>
         * <ul>
         * <li><strong>10.0</strong></li>
         * <li><strong>11.0</strong></li>
         * <li><strong>12.0</strong></li>
         * <li><strong>13.0</strong></li>
         * <li><strong>14.0</strong></li>
         * <li><strong>15.0</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12.0</p>
         */
        @NameInMap("TargetMajorVersion")
        public String targetMajorVersion;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>342900000</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        /**
         * <p>The upgrade mode.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>clone</strong>: The system does not migrate data to the new instance and does not switch your workloads over to the new instance.</li>
         * <li><strong>switch</strong>: The system migrates data to the new instance and switches your workloads over to the new instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>switch</p>
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
