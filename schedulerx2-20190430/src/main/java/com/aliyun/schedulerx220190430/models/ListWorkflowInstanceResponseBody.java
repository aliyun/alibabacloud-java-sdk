// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ListWorkflowInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListWorkflowInstanceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListWorkflowInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkflowInstanceResponseBody self = new ListWorkflowInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkflowInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListWorkflowInstanceResponseBody setData(ListWorkflowInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListWorkflowInstanceResponseBodyData getData() {
        return this.data;
    }

    public ListWorkflowInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListWorkflowInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkflowInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListWorkflowInstanceResponseBodyDataWfInstanceInfos extends TeaModel {
        @NameInMap("DataTime")
        public String dataTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("ScheduleTime")
        public String scheduleTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("WfInstanceId")
        public Long wfInstanceId;

        @NameInMap("WorkflowId")
        public Long workflowId;

        public static ListWorkflowInstanceResponseBodyDataWfInstanceInfos build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowInstanceResponseBodyDataWfInstanceInfos self = new ListWorkflowInstanceResponseBodyDataWfInstanceInfos();
            return TeaModel.build(map, self);
        }

        public ListWorkflowInstanceResponseBodyDataWfInstanceInfos setDataTime(String dataTime) {
            this.dataTime = dataTime;
            return this;
        }
        public String getDataTime() {
            return this.dataTime;
        }

        public ListWorkflowInstanceResponseBodyDataWfInstanceInfos setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListWorkflowInstanceResponseBodyDataWfInstanceInfos setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public ListWorkflowInstanceResponseBodyDataWfInstanceInfos setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListWorkflowInstanceResponseBodyDataWfInstanceInfos setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListWorkflowInstanceResponseBodyDataWfInstanceInfos setWfInstanceId(Long wfInstanceId) {
            this.wfInstanceId = wfInstanceId;
            return this;
        }
        public Long getWfInstanceId() {
            return this.wfInstanceId;
        }

        public ListWorkflowInstanceResponseBodyDataWfInstanceInfos setWorkflowId(Long workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public Long getWorkflowId() {
            return this.workflowId;
        }

    }

    public static class ListWorkflowInstanceResponseBodyData extends TeaModel {
        @NameInMap("WfInstanceInfos")
        public java.util.List<ListWorkflowInstanceResponseBodyDataWfInstanceInfos> wfInstanceInfos;

        public static ListWorkflowInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkflowInstanceResponseBodyData self = new ListWorkflowInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkflowInstanceResponseBodyData setWfInstanceInfos(java.util.List<ListWorkflowInstanceResponseBodyDataWfInstanceInfos> wfInstanceInfos) {
            this.wfInstanceInfos = wfInstanceInfos;
            return this;
        }
        public java.util.List<ListWorkflowInstanceResponseBodyDataWfInstanceInfos> getWfInstanceInfos() {
            return this.wfInstanceInfos;
        }

    }

}
