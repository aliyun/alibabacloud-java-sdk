// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetGpuClusterListAlarmRecordResponseBody extends TeaModel {
    /**
     * <p>The response code. Valid values: Success and Sysom.ServerError.</p>
     * 
     * <strong>example:</strong>
     * <p>Success or Sysom.ServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of alert data.</p>
     */
    @NameInMap("data")
    public java.util.List<GetGpuClusterListAlarmRecordResponseBodyData> data;

    /**
     * <p>The error message returned when the code is not Success.</p>
     * 
     * <strong>example:</strong>
     * <p>server error</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>real request ID</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of returned records.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public String total;

    public static GetGpuClusterListAlarmRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGpuClusterListAlarmRecordResponseBody self = new GetGpuClusterListAlarmRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGpuClusterListAlarmRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGpuClusterListAlarmRecordResponseBody setData(java.util.List<GetGpuClusterListAlarmRecordResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetGpuClusterListAlarmRecordResponseBodyData> getData() {
        return this.data;
    }

    public GetGpuClusterListAlarmRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGpuClusterListAlarmRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGpuClusterListAlarmRecordResponseBody setTotal(String total) {
        this.total = total;
        return this;
    }
    public String getTotal() {
        return this.total;
    }

    public static class GetGpuClusterListAlarmRecordResponseBodyData extends TeaModel {
        /**
         * <p>The cluster where the alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster1</p>
         */
        @NameInMap("alarmCluster")
        public String alarmCluster;

        /**
         * <p>The extended information of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         * error_node_gpu, 
         * error_pod,<br>task_pod_list, 
         * error_type, 
         * kernel,<br>}</p>
         */
        @NameInMap("alarmExtInfo")
        public Object alarmExtInfo;

        /**
         * <p>The unique ID of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>746d13f8-9662-4441-b76b-a8ed8d485195</p>
         */
        @NameInMap("alarmId")
        public String alarmId;

        /**
         * <p>The alerting event log.</p>
         * 
         * <strong>example:</strong>
         * <p>cuda OOM：xxxxx</p>
         */
        @NameInMap("alarmLog")
        public String alarmLog;

        /**
         * <p>The ID of the task where the anomaly occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>task job id</p>
         */
        @NameInMap("alarmTask")
        public String alarmTask;

        /**
         * <p>The date and time when the alert is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-08-22 18:16:25</p>
         */
        @NameInMap("alarmTime")
        public String alarmTime;

        /**
         * <p>The topology snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>topology data，e.g.
         *       &quot;alarmTopology&quot;: {
         *         &quot;nodes&quot;: [
         *           {
         *             &quot;gpu_list&quot;: [
         *               {
         *                 &quot;values&quot;: {
         *                   &quot;Basic&quot;: [
         *                     {
         *                       &quot;value&quot;: &quot;1&quot;,
         *                       &quot;key&quot;: &quot;Gpu Number\n&quot;
         *                     }
         *                   ],
         *                   &quot;Metric&quot;: [
         *                     {
         *                       &quot;value&quot;: &quot;50&quot;,
         *                       &quot;key&quot;: &quot;gpu_util(%)\n&quot;
         *                     }
         *                   ],
         *                   &quot;Exception&quot;: [
         *                     {
         *                       &quot;value&quot;: &quot;NCCL HANG&quot;,
         *                       &quot;key&quot;: &quot;error0&quot;
         *                     }
         *                   ]
         *                 },
         *                 &quot;name&quot;: &quot;GPU1&quot;,
         *                 &quot;style&quot;: {
         *                   &quot;fill&quot;: &quot;#e94242\n&quot;,
         *                   &quot;opacity&quot;: &quot;0.1&quot;
         *                 },
         *                 &quot;id&quot;: &quot;6cc37fbc&quot;
         *               }
         *             ],
         *             &quot;values&quot;: {
         *               &quot;Basic&quot;: [
         *                 {
         *                   &quot;value&quot;: &quot;i-xxxxxx&quot;,
         *                   &quot;key&quot;: &quot;instance&quot;
         *                 }
         *               ],
         *               &quot;Metric&quot;: [
         *                 {
         *                   &quot;value&quot;: &quot;value of metrics 1&quot;,
         *                   &quot;key&quot;: &quot;name of metric 1&quot;
         *                 }
         *               ],
         *               &quot;Exception&quot;: [
         *                 {
         *                   &quot;value&quot;: &quot;NCCL HANG&quot;,
         *                   &quot;key&quot;: &quot;error0&quot;
         *                 }
         *               ]
         *             },
         *             &quot;name&quot;: &quot;i-xxxxxx\n&quot;,
         *             &quot;style&quot;: {
         *               &quot;fillOpacity&quot;: &quot;0.5&quot;,
         *               &quot;fill&quot;: &quot;#e94242\n&quot;
         *             },
         *             &quot;id&quot;: &quot;975fbcb0&quot;
         *           }
         *         ],
         *         &quot;edges&quot;: [
         *           {
         *             &quot;src_id&quot;: &quot;00534a88&quot;,
         *             &quot;values&quot;: {
         *               &quot;Basic&quot;: [
         *                 {
         *                   &quot;value&quot;: &quot;v2.22.3\n&quot;,
         *                   &quot;key&quot;: &quot;NCCL Version\n&quot;
         *                 }
         *               ],
         *               &quot;Metric&quot;: [
         *                 {
         *                   &quot;value&quot;: &quot;10000&quot;,
         *                   &quot;key&quot;: &quot;Recv Msg Count&quot;
         *                 }
         *               ],
         *               &quot;Exception&quot;: [
         *                 {
         *                   &quot;value&quot;: &quot;NCCL HANG&quot;,
         *                   &quot;key&quot;: &quot;error0&quot;
         *                 }
         *               ]
         *             },
         *             &quot;dst_id&quot;: &quot;260525e9&quot;,
         *             &quot;style&quot;: {
         *               &quot;opacity&quot;: &quot;0.1&quot;,
         *               &quot;lineWidth&quot;: &quot;1&quot;,
         *               &quot;selectedStyle&quot;: &quot;\&quot;{\\\&quot;opacity\\\&quot;: 1, \\\&quot;lineWidth\\\&quot;: 1}\&quot;\n&quot;,
         *               &quot;stroke&quot;: &quot;#e94242&quot;
         *             },
         *             &quot;type&quot;: &quot;GPU&quot;
         *           }
         *         ]
         *       },</p>
         */
        @NameInMap("alarmTopology")
        public Object alarmTopology;

        /**
         * <p>The alerting type.</p>
         * 
         * <strong>example:</strong>
         * <p>cuda OOM</p>
         */
        @NameInMap("alarmType")
        public String alarmType;

        /**
         * <p>The status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>running、blocking、restart、exited、failed</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The UUID of the cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1234123412352311</p>
         */
        @NameInMap("uid")
        public String uid;

        public static GetGpuClusterListAlarmRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGpuClusterListAlarmRecordResponseBodyData self = new GetGpuClusterListAlarmRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGpuClusterListAlarmRecordResponseBodyData setAlarmCluster(String alarmCluster) {
            this.alarmCluster = alarmCluster;
            return this;
        }
        public String getAlarmCluster() {
            return this.alarmCluster;
        }

        public GetGpuClusterListAlarmRecordResponseBodyData setAlarmExtInfo(Object alarmExtInfo) {
            this.alarmExtInfo = alarmExtInfo;
            return this;
        }
        public Object getAlarmExtInfo() {
            return this.alarmExtInfo;
        }

        public GetGpuClusterListAlarmRecordResponseBodyData setAlarmId(String alarmId) {
            this.alarmId = alarmId;
            return this;
        }
        public String getAlarmId() {
            return this.alarmId;
        }

        public GetGpuClusterListAlarmRecordResponseBodyData setAlarmLog(String alarmLog) {
            this.alarmLog = alarmLog;
            return this;
        }
        public String getAlarmLog() {
            return this.alarmLog;
        }

        public GetGpuClusterListAlarmRecordResponseBodyData setAlarmTask(String alarmTask) {
            this.alarmTask = alarmTask;
            return this;
        }
        public String getAlarmTask() {
            return this.alarmTask;
        }

        public GetGpuClusterListAlarmRecordResponseBodyData setAlarmTime(String alarmTime) {
            this.alarmTime = alarmTime;
            return this;
        }
        public String getAlarmTime() {
            return this.alarmTime;
        }

        public GetGpuClusterListAlarmRecordResponseBodyData setAlarmTopology(Object alarmTopology) {
            this.alarmTopology = alarmTopology;
            return this;
        }
        public Object getAlarmTopology() {
            return this.alarmTopology;
        }

        public GetGpuClusterListAlarmRecordResponseBodyData setAlarmType(String alarmType) {
            this.alarmType = alarmType;
            return this;
        }
        public String getAlarmType() {
            return this.alarmType;
        }

        public GetGpuClusterListAlarmRecordResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetGpuClusterListAlarmRecordResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
