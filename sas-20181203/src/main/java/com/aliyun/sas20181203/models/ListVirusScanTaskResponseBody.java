// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVirusScanTaskResponseBody extends TeaModel {
    /**
     * <p>The returned virus scan tasks.</p>
     */
    @NameInMap("List")
    public java.util.List<ListVirusScanTaskResponseBodyList> list;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListVirusScanTaskResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVirusScanTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanTaskResponseBody self = new ListVirusScanTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirusScanTaskResponseBody setList(java.util.List<ListVirusScanTaskResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListVirusScanTaskResponseBodyList> getList() {
        return this.list;
    }

    public ListVirusScanTaskResponseBody setPageInfo(ListVirusScanTaskResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListVirusScanTaskResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListVirusScanTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVirusScanTaskResponseBodyList extends TeaModel {
        /**
         * <p>The timestamp when the virus scan task ended. Unit: milliseconds.</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The name of the server.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The progress of the task in percentage.</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The information about the file that is scanned.</p>
         */
        @NameInMap("ScanPath")
        public java.util.List<String> scanPath;

        /**
         * <p>The type of the virus scan task. Valid values:</p>
         * <br>
         * <p>*   **system**: automatic scan task</p>
         * <p>*   **user**: custom scan task</p>
         */
        @NameInMap("ScanType")
        public String scanType;

        /**
         * <p>The timestamp when the virus scan task started. Unit: milliseconds.</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the virus scan task. Valid values:</p>
         * <br>
         * <p>*   **1**: running</p>
         * <p>*   **2**: complete</p>
         * <p>*   **3**: failed</p>
         * <p>*   **4**: timed out</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the virus scan task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the virus scan task.</p>
         * <br>
         * <p>*   The value is fixed as **VIRUS_VUL_SCHEDULE_SCAN**, which indicates a virus scan task.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The UUID of the server.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListVirusScanTaskResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanTaskResponseBodyList self = new ListVirusScanTaskResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListVirusScanTaskResponseBodyList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListVirusScanTaskResponseBodyList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListVirusScanTaskResponseBodyList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListVirusScanTaskResponseBodyList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListVirusScanTaskResponseBodyList setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ListVirusScanTaskResponseBodyList setScanPath(java.util.List<String> scanPath) {
            this.scanPath = scanPath;
            return this;
        }
        public java.util.List<String> getScanPath() {
            return this.scanPath;
        }

        public ListVirusScanTaskResponseBodyList setScanType(String scanType) {
            this.scanType = scanType;
            return this;
        }
        public String getScanType() {
            return this.scanType;
        }

        public ListVirusScanTaskResponseBodyList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListVirusScanTaskResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListVirusScanTaskResponseBodyList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListVirusScanTaskResponseBodyList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListVirusScanTaskResponseBodyList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListVirusScanTaskResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The page number.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListVirusScanTaskResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanTaskResponseBodyPageInfo self = new ListVirusScanTaskResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListVirusScanTaskResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListVirusScanTaskResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListVirusScanTaskResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
