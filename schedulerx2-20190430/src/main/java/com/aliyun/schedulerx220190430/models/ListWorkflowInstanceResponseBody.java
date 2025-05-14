// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ListWorkflowInstanceResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about workflow instances.</p>
     */
    @NameInMap("Data")
    public ListWorkflowInstanceResponseBodyData data;

    /**
     * <p>The returned error message.</p>
     * 
     * <strong>example:</strong>
     * <p>workflowId=xxx is not existed</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>39090022-1F3B-4797-8518-6B61095F1AF0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The data timestamp of the workflow instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-03 18:00:00</p>
         */
        @NameInMap("DataTime")
        public String dataTime;

        /**
         * <p>The time when the workflow instance stopped running.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-03 18:00:21</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The time when the workflow instance was scheduled to run.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-03 18:00:00</p>
         */
        @NameInMap("ScheduleTime")
        public String scheduleTime;

        /**
         * <p>The time when the workflow instance started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-03 18:00:01</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The state of the workflow instance. Valid values:</p>
         * <ul>
         * <li>1: pending</li>
         * <li>2: preparing</li>
         * <li>3: running</li>
         * <li>4: successful</li>
         * <li>5: failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The workflow instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("WfInstanceId")
        public Long wfInstanceId;

        /**
         * <p>The workflow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
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
        /**
         * <p>The workflow instances.</p>
         */
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
