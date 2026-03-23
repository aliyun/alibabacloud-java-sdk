// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeParameterTimedScheduleTaskResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A807C95D-410C-5BB5-96C0-C6E09F2C3D36</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>List of scan jobs.</p>
     */
    @NameInMap("TaskList")
    public java.util.List<DescribeParameterTimedScheduleTaskResponseBodyTaskList> taskList;

    public static DescribeParameterTimedScheduleTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterTimedScheduleTaskResponseBody self = new DescribeParameterTimedScheduleTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterTimedScheduleTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParameterTimedScheduleTaskResponseBody setTaskList(java.util.List<DescribeParameterTimedScheduleTaskResponseBodyTaskList> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<DescribeParameterTimedScheduleTaskResponseBodyTaskList> getTaskList() {
        return this.taskList;
    }

    public static class DescribeParameterTimedScheduleTaskResponseBodyTaskList extends TeaModel {
        /**
         * <p>Instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze2za3is7baay****</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <p>Modified parameter settings.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;auto_increment_increment&quot;:&quot;1000&quot;,&quot;back_log&quot;:&quot;99&quot;}</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <p>Status. Valid values:</p>
         * <ul>
         * <li><strong>PENDING</strong>: Pending execution.</li>
         * <li><strong>EXECUTING</strong>: Executing.</li>
         * <li><strong>COMPLETED</strong>: Completed.</li>
         * <li><strong>EXECUTING</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PENDING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Effective period for the parameter modification.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-06T09:24:00Z</p>
         */
        @NameInMap("SwitchTime")
        public String switchTime;

        /**
         * <p>Scheduled task ID for parameter modification.</p>
         * 
         * <strong>example:</strong>
         * <p>27056921</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeParameterTimedScheduleTaskResponseBodyTaskList build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterTimedScheduleTaskResponseBodyTaskList self = new DescribeParameterTimedScheduleTaskResponseBodyTaskList();
            return TeaModel.build(map, self);
        }

        public DescribeParameterTimedScheduleTaskResponseBodyTaskList setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeParameterTimedScheduleTaskResponseBodyTaskList setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public DescribeParameterTimedScheduleTaskResponseBodyTaskList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeParameterTimedScheduleTaskResponseBodyTaskList setSwitchTime(String switchTime) {
            this.switchTime = switchTime;
            return this;
        }
        public String getSwitchTime() {
            return this.switchTime;
        }

        public DescribeParameterTimedScheduleTaskResponseBodyTaskList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
