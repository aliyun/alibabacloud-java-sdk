// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListVirusScanTaskResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<ListVirusScanTaskResponseBodyList> list;

    @NameInMap("PageInfo")
    public ListVirusScanTaskResponseBodyPageInfo pageInfo;

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
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("ScanPath")
        public java.util.List<String> scanPath;

        @NameInMap("ScanType")
        public String scanType;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

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
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
