// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListFileProtectEventResponseBody extends TeaModel {
    @NameInMap("EventList")
    public java.util.List<ListFileProtectEventResponseBodyEventList> eventList;

    @NameInMap("PageInfo")
    public ListFileProtectEventResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFileProtectEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFileProtectEventResponseBody self = new ListFileProtectEventResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFileProtectEventResponseBody setEventList(java.util.List<ListFileProtectEventResponseBodyEventList> eventList) {
        this.eventList = eventList;
        return this;
    }
    public java.util.List<ListFileProtectEventResponseBodyEventList> getEventList() {
        return this.eventList;
    }

    public ListFileProtectEventResponseBody setPageInfo(ListFileProtectEventResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListFileProtectEventResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListFileProtectEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFileProtectEventResponseBodyEventList extends TeaModel {
        @NameInMap("AlertLevel")
        public Integer alertLevel;

        @NameInMap("CmdLine")
        public String cmdLine;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("HandleTime")
        public Long handleTime;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("LatestTime")
        public Long latestTime;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("ProcPath")
        public String procPath;

        @NameInMap("ProcPermission")
        public String procPermission;

        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Uuid")
        public String uuid;

        public static ListFileProtectEventResponseBodyEventList build(java.util.Map<String, ?> map) throws Exception {
            ListFileProtectEventResponseBodyEventList self = new ListFileProtectEventResponseBodyEventList();
            return TeaModel.build(map, self);
        }

        public ListFileProtectEventResponseBodyEventList setAlertLevel(Integer alertLevel) {
            this.alertLevel = alertLevel;
            return this;
        }
        public Integer getAlertLevel() {
            return this.alertLevel;
        }

        public ListFileProtectEventResponseBodyEventList setCmdLine(String cmdLine) {
            this.cmdLine = cmdLine;
            return this;
        }
        public String getCmdLine() {
            return this.cmdLine;
        }

        public ListFileProtectEventResponseBodyEventList setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListFileProtectEventResponseBodyEventList setHandleTime(Long handleTime) {
            this.handleTime = handleTime;
            return this;
        }
        public Long getHandleTime() {
            return this.handleTime;
        }

        public ListFileProtectEventResponseBodyEventList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListFileProtectEventResponseBodyEventList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListFileProtectEventResponseBodyEventList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListFileProtectEventResponseBodyEventList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListFileProtectEventResponseBodyEventList setLatestTime(Long latestTime) {
            this.latestTime = latestTime;
            return this;
        }
        public Long getLatestTime() {
            return this.latestTime;
        }

        public ListFileProtectEventResponseBodyEventList setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public ListFileProtectEventResponseBodyEventList setProcPath(String procPath) {
            this.procPath = procPath;
            return this;
        }
        public String getProcPath() {
            return this.procPath;
        }

        public ListFileProtectEventResponseBodyEventList setProcPermission(String procPermission) {
            this.procPermission = procPermission;
            return this;
        }
        public String getProcPermission() {
            return this.procPermission;
        }

        public ListFileProtectEventResponseBodyEventList setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public ListFileProtectEventResponseBodyEventList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListFileProtectEventResponseBodyEventList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListFileProtectEventResponseBodyEventList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListFileProtectEventResponseBodyEventList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListFileProtectEventResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFileProtectEventResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListFileProtectEventResponseBodyPageInfo self = new ListFileProtectEventResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListFileProtectEventResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListFileProtectEventResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListFileProtectEventResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
