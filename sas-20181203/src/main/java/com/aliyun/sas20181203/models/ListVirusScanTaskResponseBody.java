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
     * 
     * <strong>example:</strong>
     * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB3936FA7</p>
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
         * 
         * <strong>example:</strong>
         * <p>1662343860051</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The name of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>sql-test-0****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>8.210.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>172.25.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The progress of the task in percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>62</p>
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
         * <ul>
         * <li><strong>system</strong>: automatic scan task</li>
         * <li><strong>user</strong>: custom scan task</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("ScanType")
        public String scanType;

        /**
         * <p>The timestamp when the virus scan task started. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1651290987000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The status of the virus scan task. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: running</li>
         * <li><strong>2</strong>: complete</li>
         * <li><strong>3</strong>: failed</li>
         * <li><strong>4</strong>: timed out</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the virus scan task.</p>
         * 
         * <strong>example:</strong>
         * <p>2e75557bfa570381f5c516cad9b6xxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the virus scan task.</p>
         * <ul>
         * <li>The value is fixed as <strong>VIRUS_VUL_SCHEDULE_SCAN</strong>, which indicates a virus scan task.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VIRUS_VUL_SCHEDULE_SCAN</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>49e25e0f-bb51-4a5a-a1b3-13a4ddaa****</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>224</p>
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
