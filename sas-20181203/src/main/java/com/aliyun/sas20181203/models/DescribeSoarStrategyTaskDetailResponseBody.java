// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarStrategyTaskDetailResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FBBEB173-1F43-505F-A876-C03ECDF6CE4C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the task.</p>
     */
    @NameInMap("TaskDetail")
    public DescribeSoarStrategyTaskDetailResponseBodyTaskDetail taskDetail;

    public static DescribeSoarStrategyTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarStrategyTaskDetailResponseBody self = new DescribeSoarStrategyTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSoarStrategyTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSoarStrategyTaskDetailResponseBody setTaskDetail(DescribeSoarStrategyTaskDetailResponseBodyTaskDetail taskDetail) {
        this.taskDetail = taskDetail;
        return this;
    }
    public DescribeSoarStrategyTaskDetailResponseBodyTaskDetail getTaskDetail() {
        return this.taskDetail;
    }

    public static class DescribeSoarStrategyTaskDetailResponseBodyTaskDetail extends TeaModel {
        /**
         * <p>The operational log information of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;resultContent&quot;: &quot;{\&quot;failedNum\&quot;:0,\&quot;totalNum\&quot;:1,\&quot;successNum\&quot;:1}&quot;,
         * &quot;resultStatus&quot;: 0,
         * &quot;status&quot;: 2
         * }</p>
         */
        @NameInMap("LogInfo")
        public String logInfo;

        /**
         * <p>The parameters of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;name&quot;: &quot;vulList&quot;,
         *         &quot;associationProperty&quot;: &quot;sasAllVul&quot;,
         *         &quot;value&quot;: [
         *             {
         *                 &quot;regionId&quot;: &quot;cn-hangzhou&quot;,
         *                 &quot;instanceId&quot;: &quot;i-bp10i3dtyq7x4<strong><strong>5e&quot;,
         *                 &quot;instanceName&quot;: &quot;xxx&quot;,
         *                 &quot;vulId&quot;: 1222,
         *                 &quot;vulName&quot;: &quot;centos:7:cesa-2024:1249&quot;,
         *                 &quot;vulAliasName&quot;: &quot;CESA-2024:1249&quot;,
         *                 &quot;vulTag&quot;: &quot;oval&quot;,
         *                 &quot;vulUuid&quot;: &quot;3c5eb76a-df89-</strong></strong>-85ef-67562cdc2344&quot;,
         *                 &quot;vulType&quot;: &quot;cve&quot;,
         *                 &quot;vulModifyTs&quot;: 1721324258000
         *             }
         *         ]
         *     },
         *     {
         *         &quot;name&quot;: &quot;snapshotConfig&quot;,
         *         &quot;associationProperty&quot;: &quot;snapshotConfig&quot;,
         *         &quot;value&quot;: {
         *             &quot;ttl&quot;: 1
         *         }
         *     },
         *     {
         *         &quot;name&quot;: &quot;notifyConfig&quot;,
         *         &quot;associationProperty&quot;: &quot;notifyConfig&quot;,
         *         &quot;value&quot;: {
         *             &quot;ding&quot;: [
         *                 {
         *                     &quot;value&quot;: 2195,
         *                     &quot;label&quot;: &quot;test&quot;
         *                 }
         *             ]
         *         }
         *     }
         * ]</p>
         */
        @NameInMap("Params")
        public String params;

        /**
         * <p>The process information of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;edges&quot;: [
         *         {
         *             &quot;level&quot;: 0,
         *             &quot;removeFlag&quot;: 0,
         *             &quot;source&quot;: 1,
         *             &quot;target&quot;: 8
         *         }
         *     ],
         *     &quot;nodes&quot;: [
         *         {
         *             &quot;actionId&quot;: &quot;Action_014s73k&quot;,
         *             &quot;iconUrl&quot;: &quot;<a href="https://img.alicdn.com/tfs/TB1T*****jSZLeXXb9kVXa-12-14.svg">https://img.alicdn.com/tfs/TB1T*****jSZLeXXb9kVXa-12-14.svg</a>&quot;,
         *             &quot;id&quot;: 1,
         *             &quot;label&quot;: &quot;describeDisks&quot;,
         *             &quot;nodeName&quot;: &quot;DescribeDisks&quot;,
         *             &quot;status&quot;: 0,
         *             &quot;type&quot;: &quot;openAPI&quot;
         *         }
         *     ]
         * }</p>
         */
        @NameInMap("ProcessInfo")
        public String processInfo;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>task-1</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        public static DescribeSoarStrategyTaskDetailResponseBodyTaskDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeSoarStrategyTaskDetailResponseBodyTaskDetail self = new DescribeSoarStrategyTaskDetailResponseBodyTaskDetail();
            return TeaModel.build(map, self);
        }

        public DescribeSoarStrategyTaskDetailResponseBodyTaskDetail setLogInfo(String logInfo) {
            this.logInfo = logInfo;
            return this;
        }
        public String getLogInfo() {
            return this.logInfo;
        }

        public DescribeSoarStrategyTaskDetailResponseBodyTaskDetail setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public DescribeSoarStrategyTaskDetailResponseBodyTaskDetail setProcessInfo(String processInfo) {
            this.processInfo = processInfo;
            return this;
        }
        public String getProcessInfo() {
            return this.processInfo;
        }

        public DescribeSoarStrategyTaskDetailResponseBodyTaskDetail setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
