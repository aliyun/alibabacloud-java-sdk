// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSyncAssetTaskListResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeSyncAssetTaskListResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The IDC scan tasks.</p>
     */
    @NameInMap("TaskRecords")
    public java.util.List<DescribeSyncAssetTaskListResponseBodyTaskRecords> taskRecords;

    public static DescribeSyncAssetTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncAssetTaskListResponseBody self = new DescribeSyncAssetTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSyncAssetTaskListResponseBody setPageInfo(DescribeSyncAssetTaskListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeSyncAssetTaskListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeSyncAssetTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSyncAssetTaskListResponseBody setTaskRecords(java.util.List<DescribeSyncAssetTaskListResponseBodyTaskRecords> taskRecords) {
        this.taskRecords = taskRecords;
        return this;
    }
    public java.util.List<DescribeSyncAssetTaskListResponseBodyTaskRecords> getTaskRecords() {
        return this.taskRecords;
    }

    public static class DescribeSyncAssetTaskListResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of IDC scan tasks on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of IDC scan tasks per page. Default value: 20. If you leave this parameter empty, 20 IDC scan tasks are returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of IDC scan tasks returned.</p>
         * 
         * <strong>example:</strong>
         * <p>110</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeSyncAssetTaskListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncAssetTaskListResponseBodyPageInfo self = new DescribeSyncAssetTaskListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeSyncAssetTaskListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeSyncAssetTaskListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeSyncAssetTaskListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeSyncAssetTaskListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeSyncAssetTaskListResponseBodyTaskRecords extends TeaModel {
        /**
         * <p>The number of assets that are detected by the task.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AssetCount")
        public Integer assetCount;

        /**
         * <p>The CIDR blocks that are used for scanning. Multiple CIDR blocks are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1/24,1.1.1.1/24</p>
         */
        @NameInMap("IpSegments")
        public String ipSegments;

        /**
         * <p>The progress of the task, in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProcessRate")
        public Integer processRate;

        /**
         * <p>The ID of the root task.</p>
         * 
         * <strong>example:</strong>
         * <p>73c392f9c505129a257472a3f911d65d</p>
         */
        @NameInMap("RootTaskId")
        public String rootTaskId;

        /**
         * <p>The timestamp when the task ended.</p>
         * 
         * <strong>example:</strong>
         * <p>1653965680000</p>
         */
        @NameInMap("TaskEndTime")
        public Long taskEndTime;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>IDC_PROBE_SCAN-1.1.1..124-lse_ubuntu_test1</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The timestamp when the task started. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1633746651715</p>
         */
        @NameInMap("TaskStartTime")
        public Long taskStartTime;

        /**
         * <p>The status of the IDC scan task. Valid Values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The task is not started.</li>
         * <li><strong>START</strong>: The task is started.</li>
         * <li><strong>MESSAGE_SEND</strong>: The command is sent.</li>
         * <li><strong>SUCCESS</strong>: The task is complete.</li>
         * <li><strong>FAIL</strong>: The task failed.</li>
         * <li><strong>TIMEOUT</strong>: The task timed out.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The type of the task. The value is fixed as <strong>IDC_PROBE_SCAN</strong>, which indicates an IDC scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>IDC_PROBE_SCAN</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static DescribeSyncAssetTaskListResponseBodyTaskRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeSyncAssetTaskListResponseBodyTaskRecords self = new DescribeSyncAssetTaskListResponseBodyTaskRecords();
            return TeaModel.build(map, self);
        }

        public DescribeSyncAssetTaskListResponseBodyTaskRecords setAssetCount(Integer assetCount) {
            this.assetCount = assetCount;
            return this;
        }
        public Integer getAssetCount() {
            return this.assetCount;
        }

        public DescribeSyncAssetTaskListResponseBodyTaskRecords setIpSegments(String ipSegments) {
            this.ipSegments = ipSegments;
            return this;
        }
        public String getIpSegments() {
            return this.ipSegments;
        }

        public DescribeSyncAssetTaskListResponseBodyTaskRecords setProcessRate(Integer processRate) {
            this.processRate = processRate;
            return this;
        }
        public Integer getProcessRate() {
            return this.processRate;
        }

        public DescribeSyncAssetTaskListResponseBodyTaskRecords setRootTaskId(String rootTaskId) {
            this.rootTaskId = rootTaskId;
            return this;
        }
        public String getRootTaskId() {
            return this.rootTaskId;
        }

        public DescribeSyncAssetTaskListResponseBodyTaskRecords setTaskEndTime(Long taskEndTime) {
            this.taskEndTime = taskEndTime;
            return this;
        }
        public Long getTaskEndTime() {
            return this.taskEndTime;
        }

        public DescribeSyncAssetTaskListResponseBodyTaskRecords setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeSyncAssetTaskListResponseBodyTaskRecords setTaskStartTime(Long taskStartTime) {
            this.taskStartTime = taskStartTime;
            return this;
        }
        public Long getTaskStartTime() {
            return this.taskStartTime;
        }

        public DescribeSyncAssetTaskListResponseBodyTaskRecords setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeSyncAssetTaskListResponseBodyTaskRecords setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
