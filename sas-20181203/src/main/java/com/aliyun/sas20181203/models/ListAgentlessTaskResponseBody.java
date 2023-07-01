// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessTaskResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<ListAgentlessTaskResponseBodyList> list;

    @NameInMap("PageInfo")
    public ListAgentlessTaskResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static ListAgentlessTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessTaskResponseBody self = new ListAgentlessTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentlessTaskResponseBody setList(java.util.List<ListAgentlessTaskResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListAgentlessTaskResponseBodyList> getList() {
        return this.list;
    }

    public ListAgentlessTaskResponseBody setPageInfo(ListAgentlessTaskResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListAgentlessTaskResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListAgentlessTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAgentlessTaskResponseBodyList extends TeaModel {
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

        @NameInMap("Result")
        public String result;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TargetName")
        public String targetName;

        @NameInMap("TargetType")
        public Integer targetType;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("Uuid")
        public String uuid;

        public static ListAgentlessTaskResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentlessTaskResponseBodyList self = new ListAgentlessTaskResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListAgentlessTaskResponseBodyList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListAgentlessTaskResponseBodyList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListAgentlessTaskResponseBodyList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListAgentlessTaskResponseBodyList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListAgentlessTaskResponseBodyList setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ListAgentlessTaskResponseBodyList setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public ListAgentlessTaskResponseBodyList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListAgentlessTaskResponseBodyList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAgentlessTaskResponseBodyList setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListAgentlessTaskResponseBodyList setTargetType(Integer targetType) {
            this.targetType = targetType;
            return this;
        }
        public Integer getTargetType() {
            return this.targetType;
        }

        public ListAgentlessTaskResponseBodyList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListAgentlessTaskResponseBodyList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListAgentlessTaskResponseBodyList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListAgentlessTaskResponseBodyPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAgentlessTaskResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAgentlessTaskResponseBodyPageInfo self = new ListAgentlessTaskResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListAgentlessTaskResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListAgentlessTaskResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAgentlessTaskResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
