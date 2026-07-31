// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetAutoOpsTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>81500666-d7f5-4143-8329-0223cc738105</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the O&amp;M task.</p>
     */
    @NameInMap("Task")
    public GetAutoOpsTaskResponseBodyTask task;

    public static GetAutoOpsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoOpsTaskResponseBody self = new GetAutoOpsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoOpsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoOpsTaskResponseBody setTask(GetAutoOpsTaskResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public GetAutoOpsTaskResponseBodyTask getTask() {
        return this.task;
    }

    public static class GetAutoOpsTaskResponseBodyTask extends TeaModel {
        /**
         * <p>The time when the approval of the O&amp;M task was completed. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1669965908</p>
         */
        @NameInMap("AllowedOverTime")
        public Long allowedOverTime;

        /**
         * <p>The remarks of the O&amp;M task.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The name of the O&amp;M task.</p>
         * 
         * <strong>example:</strong>
         * <p>taskname</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The execution plan of the O&amp;M task.</p>
         * <ul>
         * <li><p><strong>ExecAt</strong>: If the value of ScheduleType is Manual, this parameter is not meaningful. If the value of ScheduleType is FixTime, this parameter indicates the scheduled execution time in seconds as a UNIX timestamp. If the value of ScheduleType is CycleInterval, this parameter indicates the first execution time in seconds as a UNIX timestamp.</p>
         * </li>
         * <li><p><strong>PeriodNum</strong>: If the value of ScheduleType is Manual or FixTime, this parameter is not meaningful. If the value of ScheduleType is CycleInterval, this parameter indicates the interval for periodic execution.</p>
         * </li>
         * <li><p><strong>PeriodUnit</strong>: If the value of ScheduleType is Manual or FixTime, this parameter is not meaningful. If the value of ScheduleType is CycleInterval, this parameter indicates the unit of the periodic execution interval. Valid values: hour and day.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ExecAt&quot;:0,&quot;PeriodNum&quot;:0,&quot;PeriodUnit&quot;:&quot;&quot;}</p>
         */
        @NameInMap("ScheduleTimeInfo")
        public String scheduleTimeInfo;

        /**
         * <p>The scheduling type of the task.</p>
         * <ul>
         * <li><strong>FixTime</strong>: scheduled execution.</li>
         * <li><strong>CycleInterval</strong>: periodic execution.</li>
         * <li><strong>Manual</strong>: manual execution triggered by the user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FixTime</p>
         */
        @NameInMap("ScheduleType")
        public String scheduleType;

        /**
         * <p>The content of the script to be executed by the O&amp;M task. The value is Base64-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p>bHM=</p>
         */
        @NameInMap("Script")
        public String script;

        /**
         * <p>The ID of the script associated with the O&amp;M task. This parameter is returned only when ScriptType is set to SpecificScript.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ScriptId")
        public Long scriptId;

        /**
         * <p>The name of the script associated with the O&amp;M task.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("ScriptName")
        public String scriptName;

        /**
         * <p>The script type of the O&amp;M task.</p>
         * <ul>
         * <li><p><strong>HandInput</strong>: manually entered script.</p>
         * </li>
         * <li><p><strong>SpecificScript</strong>: associated existing script.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HandInput</p>
         */
        @NameInMap("ScriptType")
        public String scriptType;

        /**
         * <p>The ID of the O&amp;M task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The status of the O&amp;M task.</p>
         * <ul>
         * <li><strong>PendingApproval</strong>: pending approval.</li>
         * <li><strong>Rejected</strong>: rejected.</li>
         * <li><strong>Cancelled</strong>: cancelled.</li>
         * <li><strong>PendingExecution</strong>: approved and waiting for execution.</li>
         * <li><strong>PrepareRun</strong>: preparing to execute.</li>
         * <li><strong>Running</strong>: executing.</li>
         * <li><strong>Completed</strong>: execution completed.</li>
         * <li><strong>Failed</strong>: execution failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PendingApproval</p>
         */
        @NameInMap("TaskState")
        public String taskState;

        public static GetAutoOpsTaskResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            GetAutoOpsTaskResponseBodyTask self = new GetAutoOpsTaskResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public GetAutoOpsTaskResponseBodyTask setAllowedOverTime(Long allowedOverTime) {
            this.allowedOverTime = allowedOverTime;
            return this;
        }
        public Long getAllowedOverTime() {
            return this.allowedOverTime;
        }

        public GetAutoOpsTaskResponseBodyTask setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetAutoOpsTaskResponseBodyTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetAutoOpsTaskResponseBodyTask setScheduleTimeInfo(String scheduleTimeInfo) {
            this.scheduleTimeInfo = scheduleTimeInfo;
            return this;
        }
        public String getScheduleTimeInfo() {
            return this.scheduleTimeInfo;
        }

        public GetAutoOpsTaskResponseBodyTask setScheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public String getScheduleType() {
            return this.scheduleType;
        }

        public GetAutoOpsTaskResponseBodyTask setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public GetAutoOpsTaskResponseBodyTask setScriptId(Long scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public Long getScriptId() {
            return this.scriptId;
        }

        public GetAutoOpsTaskResponseBodyTask setScriptName(String scriptName) {
            this.scriptName = scriptName;
            return this;
        }
        public String getScriptName() {
            return this.scriptName;
        }

        public GetAutoOpsTaskResponseBodyTask setScriptType(String scriptType) {
            this.scriptType = scriptType;
            return this;
        }
        public String getScriptType() {
            return this.scriptType;
        }

        public GetAutoOpsTaskResponseBodyTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetAutoOpsTaskResponseBodyTask setTaskState(String taskState) {
            this.taskState = taskState;
            return this;
        }
        public String getTaskState() {
            return this.taskState;
        }

    }

}
